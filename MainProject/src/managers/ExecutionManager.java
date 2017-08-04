package managers;

import java.io.File;
import java.util.List;

import poli.mestrado.parser.bpmn2use.ParserBPMNHelper;
import poli.mestrado.parser.bpmn2use.graph.Edge;
import poli.mestrado.parser.bpmn2use.graph.Graph;
import poli.mestrado.parser.bpmn2use.graph.GraphHelper;
import poli.mestrado.parser.bpmn2use.graph.Vertice;
import poli.mestrado.parser.bpmn2use.tag.AbstractCondition;
import poli.mestrado.parser.bpmn2use.tag.PosCondition;
import poli.mestrado.parser.bpmn2use.tag.PreCondition;
import poli.mestrado.parser.bpmn2use.tag.ProcessTag;
import poli.mestrado.parser.bpmn2use.tag.event.EndEvent;
import poli.mestrado.parser.bpmn2use.tag.event.StartEvent;
import poli.mestrado.parser.bpmn2use.tag.gateway.AbstractGatewayElement;
import poli.mestrado.parser.bpmn2use.tag.gateway.ExclusiveGateway;
import poli.mestrado.parser.bpmn2use.tag.gateway.ParallelGateway;
import poli.mestrado.parser.bpmn2use.tag.task.AbstractTaskElement;
import poli.mestrado.parser.uml2use.UmlFileManager;
import poli.mestrado.parser.util.Constants;
/* $Id$
 *******************************************************************************
 * Copyright (c) 2014 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rafael
 *******************************************************************************
 */
import poli.mestrado.parser.util.Utility;




public class ExecutionManager {

    private static ExecutionManager instance = null;
    private static int token;
    private List<List<Vertice>> pahts;
    private Graph graph;
    private ProcessTag process;
    private List<Vertice> currentPath;
    private static boolean canExecute = true;
    private static int executionErroCode = Constants.ERRO_EXECUTION_UNKNOW;
    private int executionType = Constants.UNKNOW_EXECUTION; 
    private int delay;
  
    
    private Vertice currentVertice = null;

    @SuppressWarnings("unchecked")
	public ExecutionManager(){
    	process = ParserBPMNHelper.getInstance().parserBpmn2Assl();
		graph = GraphHelper.getInstance().generateGraph(process);
		pahts = GraphHelper.getInstance().generatePaths();
    }
    
    public void startManualExecution(String pathName){
    	canExecute = true;
    	while(!UseProcessManager.getInstance().isAlive());
    	
    	if(pathName.equalsIgnoreCase(Constants.ALL_PATHS_NAMES)){
			System.out.println("Futura implementação!");
		}else{
			Integer pathIndex = new Integer(pathName.substring(pathName.lastIndexOf("-")+1, pathName.length()));
			System.out.println("-------Executando: "+pathName+"-------");
			currentPath = pahts.get(pathIndex-1);
			printSelectPath();
			
		}
    }
    public void startAutomaticExecution(String pathName, int delay){
    	this.delay = delay;
    	while(!UseProcessManager.getInstance().isAlive());
    	
    	if(pathName.equalsIgnoreCase(Constants.ALL_PATHS_NAMES)){
			for(int j = 1; j <= pahts.size(); j++){
				canExecute = true;
				if(!canExecute){
					break;
				}
				System.out.println("-------Executando: Caminho"+j+"--------");
    			currentPath = pahts.get(j-1);
    			
    			printSelectPath();
    			System.out.println("-----------------------------------------------");
    			for (int i = 0; i < currentPath.size(); i++) {
    				if(!canExecute){
    					break;
    				}
    				executeNextStep();
				}
    			System.out.println("-------Fim da execução: Caminho"+j+"--------");
    			System.out.println("Ir para o proximo caminho?");
    			while(!canExecute);
    			UseProcessManager.getInstance().sendCommand(Constants.USE_SHELL_CMD_RESET, null);
    			
			}
		}else{
			Integer pathIndex = new Integer(pathName.substring(pathName.lastIndexOf("-")+1, pathName.length()));
			System.out.println("-------Executando: "+pathName+"-------");
			currentPath = pahts.get(pathIndex-1);
			printSelectPath();
			canExecute = true;
			for (int i = 0; i < currentPath.size(); i++) {
				if(!canExecute){
					break;
				}
				executeNextStep();
			}
			System.out.println("-------Fim da execução: "+pathName+"-------");
//			UseProcessManager.getInstance().sendCommand(Constants.USE_SHELL_CMD_RESET);
		}
    }
    
   

   

    public String[] getPathName(){
    	String[] names = new String[pahts.size()];
//    	names[0] = Constants.ALL_PATHS_NAMES;
    	for (int i = 0; i < pahts.size(); i++) {
    		names[i] = "Caminho-"+(i+1);
    	}
    	return names;
    }
    
    private void printSelectPath(){
    	
    	for(int i = 0; i<currentPath.size(); i++){
			Vertice vertice = currentPath.get(i);
			if(vertice.getVeriticeElement() instanceof StartEvent){
				System.out.println("Start Event");
			}else if(vertice.getVeriticeElement() instanceof AbstractTaskElement){
				AbstractTaskElement currentTask = ((AbstractTaskElement) vertice.getVeriticeElement());
				System.out.println("TASK: "+currentTask.getName());
			}else if(vertice.getVeriticeElement() instanceof ExclusiveGateway && ((AbstractGatewayElement) vertice.getVeriticeElement()).getKindGateway() == Constants.GATEWAY_FORK){
				List<Edge> arestas = GraphHelper.getInstance().getAllEdgeLinkedToVertice(vertice, Constants.SOURCE_VERTICE);
				for (Edge edge : arestas) {
					if(edge.getTargetVertice().equals(currentPath.get(i+1))){
							System.out.println("Gateway execlusivo fork. \n\tCondição:"+edge.getUseShellComand());
					}
				}
			}else if(vertice.getVeriticeElement() instanceof ExclusiveGateway && ((AbstractGatewayElement) vertice.getVeriticeElement()).getKindGateway() == Constants.GATEWAY_JOIN){
				System.out.println("Gateway execlusivo join");
			}else if(vertice.getVeriticeElement() instanceof ParallelGateway){
				if(((AbstractGatewayElement) vertice.getVeriticeElement()).getKindGateway() == Constants.GATEWAY_FORK){
					System.out.println("Gateway paralelo fork");
				}else if(((AbstractGatewayElement) vertice.getVeriticeElement()).getKindGateway() == Constants.GATEWAY_JOIN){
					System.out.println("Gateway paralelo join");
				}
			}
			else if(vertice.getVeriticeElement() instanceof EndEvent){
				System.out.println("End Event");
			}
		}
    	System.out.println("---------------------------------------");
    }
    
    public void executeNextStep(){
    	if(!canExecute){
    		System.out.println("A execução foi parada.");
    		return;
    	}
    	currentVertice = currentPath.get(token);
    	System.out.println("_____________________________________________");
    	if(currentVertice.getVeriticeElement() instanceof StartEvent){
    		System.out.println("Start Evente");
		}else if(currentVertice.getVeriticeElement() instanceof AbstractTaskElement){
			AbstractTaskElement currentTask = ((AbstractTaskElement) currentVertice.getVeriticeElement());
			System.out.println("Tarefa: "+currentTask.getName());
			for (AbstractCondition condition : currentTask.getPrePostConditionList()) {
				if(condition instanceof PreCondition && !(condition.getName().isEmpty() || condition.getName().equals("")) ){
					System.out.println("Precondição: "+condition.getName());
				}else if(condition instanceof PosCondition && !(condition.getName().isEmpty() || condition.getName().equals("")) ){
					System.out.println("Poscondição: "+condition.getName());
				}
				String conditionExpStr = condition.getConditionExpression();
				conditionExpStr = conditionExpStr.replace("\n", "");
				String[] USER_CMDS = conditionExpStr.split(";");
				for (String USERcmd : USER_CMDS) {
					
					System.out.println(" Executando o comando: "+USERcmd);
					String USEcmd = Utility.convertUserCMD2ShellUseCMD(USERcmd);
					
					if(USEcmd.contains(";")){
						String[] USEsubcmds = USEcmd.split(";");
						for (String subcmd : USEsubcmds) {
							if(Constants.VERBOSE_SHELL_USE_CMDS){
								ThreadPrintSendCmd tpsc = new ThreadPrintSendCmd(subcmd);
								tpsc.start();
							}
							UseProcessManager.getInstance().sendCommand(subcmd,"Erro na tarefa: "+currentTask.getName()+
									" ao executar o comando "+subcmd+".");
							synchronized (this) {
								try {
									Thread.sleep(Constants.DELAY_BETEWEEN_USE_CMDS);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
						}
					}else{
						if(Constants.VERBOSE_SHELL_USE_CMDS){
//							System.out.println("Comando USE: "+USEcmd);
							ThreadPrintSendCmd tpsc = new ThreadPrintSendCmd(USEcmd);
							tpsc.start();
						}
						
						UseProcessManager.getInstance().sendCommand(USEcmd, "Erro na tarefa: "+currentTask.getName()+
								" ao executar o sub comando "+USEcmd+".");
//						synchronized (this) {
//							try {
//								this.wait(Constants.DELAY_BETEWEEN_USE_CMDS);
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//						}
					}
				}
				
			}
		}else if(currentVertice.getVeriticeElement() instanceof ExclusiveGateway && ((AbstractGatewayElement) currentVertice.getVeriticeElement()).getKindGateway() == Constants.GATEWAY_FORK){
			List<Edge> arestas = GraphHelper.getInstance().getAllEdgeLinkedToVertice(currentVertice, Constants.SOURCE_VERTICE);
			for (Edge aresta : arestas) {
				if(aresta.getTargetVertice().equals(currentPath.get(token+1))){
					System.out.println("Testando a condição do Exclusive Gateway: "+currentVertice.getVeriticeElement().getName());
					System.out.println(aresta.getUseShellComand());
					UseProcessManager.getInstance().sendCommand(aresta.getUseShellComand(), "Favor avaliar o estados dos objetos via screenshot e a modelagem de processo de negócio e conceitual.");
				}
			}
		}else if(currentVertice.getVeriticeElement() instanceof ParallelGateway){
			if(((AbstractGatewayElement) currentVertice.getVeriticeElement()).getKindGateway() == Constants.GATEWAY_FORK){
				System.out.println("Gateway paralelo fork");
			}else if(((AbstractGatewayElement) currentVertice.getVeriticeElement()).getKindGateway() == Constants.GATEWAY_JOIN){
				System.out.println("Gateway paralelo join");
			}
		}else if(currentVertice.getVeriticeElement() instanceof EndEvent){
			token = 0;
			canExecute = false;
			System.out.println("End Evente");
			System.out.println("-------FIM DA EXECUÇÃO-------");
			
		}else{
			System.out.println("Executando: "+currentVertice.getVeriticeElement().getName());
		}
    	token++;
    }
    
    
    public static void stopExecution(boolean useResetCmd){
    	if(!canExecute){
    		System.out.println("A execução já parada.");
    	}else{
    		System.out.println("Parando execução...");
    		canExecute = false;
    		token = 0;
    		if(useResetCmd){
    			UseProcessManager.getInstance().sendCommand(Constants.USE_SHELL_CMD_RESET, "Problemas ao resetar o USE.");
    		}
    	}
    }
    
    public static void pauseExecution(){
    	if(!canExecute){
    		System.out.println("A execução já pausada.");
    	}else{
    		System.out.println("Pausando execução...");
    		canExecute = false;
    	}
    }
    
    public static boolean isCanExecute() {
		return canExecute;
	}

	public static void setCanExecute(boolean canExecute) {
		ExecutionManager.canExecute = canExecute;
	}



	class ThreadPrintSendCmd extends Thread { 
		private String sendCmd;
    	
    	public ThreadPrintSendCmd(String sendCmd){
			this.sendCmd = sendCmd;
		}
		@Override public void run(){ 
			synchronized (this) {
				System.out.println("Comando USE: "+sendCmd);
			}
		}
}

}
