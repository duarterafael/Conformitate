package managers;
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



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import poli.mestrado.parser.util.Constants;

public class UseProcessManager {

	private static UseProcessManager instance = null;
	private Process process;
	private OutputStream stdin;
	private InputStream stderr;
	private InputStream stdout;
	private BufferedReader reader;
	private BufferedReader error;
	private BufferedWriter writer;
	private String command;
	private File useFile = new File(Constants.EXPORT_FOLDER+"/"+Constants.CLASS_DIAGRAM_USE_FILE_NAME);
	private File usePath = new File(Constants.USE_PROGRAMM);
	private String erroMsg = null;





	private UseProcessManager(){
		try {
			process = Runtime.getRuntime().exec("\""+usePath.getAbsolutePath()+ "\" \""+useFile.getAbsolutePath()+"\"");

			stdin = process.getOutputStream ();
			stderr = process.getErrorStream ();
			stdout = process.getInputStream ();

			reader = new BufferedReader (new InputStreamReader(stdout));
			error = new BufferedReader (new InputStreamReader(stderr));
			writer = new BufferedWriter(new OutputStreamWriter(stdin));

			receive();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static UseProcessManager getInstance(){
		if(instance == null){
			instance = new UseProcessManager();
		}
		return instance;
	}

	public void sendCommand(String cmd, String erroMsg){
		this.erroMsg = erroMsg;
		this.command = cmd;
		//        Thread T=new Thread(new Runnable() {
		//
		//            @Override
		//            public void run() {

		try {
			command += "\n";
			writer.write(command);
			writer.flush();
		} catch (IOException e) {
			process.destroyForcibly();
			process = null;
			System.out.println("A ferramenta USE foi fechada!");
			instance = null;
			getInstance();
		}


		//            }
		//        } );
		//        T.start();
		receive();
	}


	private void useReturn(String useReturnMsg){
		boolean hasErro = false;
		
		if(useReturnMsg.contains("-> true : Boolean")){
			System.out.println ("A condição foi atendida.");
		}else if(useReturnMsg.contains("USE version 4.0.0-323, Copyright (C) 1999-2014 University of Bremen")){
			System.out.println(useReturnMsg);
		}else if(useReturnMsg.contains("WARNING: Could not open") || useReturnMsg.contains("java.util.prefs.WindowsPreferences <init>")){
			//    		 System.out.println("Abrindo a ferramenta USE.");
		}else if(useReturnMsg.contains("An object with name") && useReturnMsg.contains("already exists")){
			String variableName = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: Já existe um objeto com o nome "+variableName+".");
			hasErro = true;
		}
		else if(useReturnMsg.contains("-> false : Boolean")){
			System.err.println("ERRO: A condição não foi atendida!");
			if(erroMsg != null){
				System.err.println(erroMsg);
			}
			hasErro = true;
		}else if(useReturnMsg.contains("Undefined variable")){
			String variableName = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: O objeto "+variableName+" não existe.");
			hasErro = true;
		}else if(useReturnMsg.contains("Undefined operation")){
			String operation = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: Operação indefinido. "+operation+".");
			hasErro = true;
		}else if(useReturnMsg.contains("Undefined variable")){
			String variableName = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: A variavel "+variableName+"não existe.");
			hasErro = true;
		}else if(useReturnMsg.contains("no viable alternative at input 'create'")){
			System.err.println("Erro: Não foi declarado a variavel ou a classe que deseja-se criar");
			hasErro = true;
		}else if(useReturnMsg.contains("Expected type name, found")){
			String typeName = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: O tipo "+typeName+" não existe.");
			hasErro = true;
		}else if(useReturnMsg.contains("missing EOF at")){
			String typeName = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: Problemas no comando próximo a "+typeName+".");
			hasErro = true;
		}else if(useReturnMsg.contains("Variable") && useReturnMsg.contains("in expression") && useReturnMsg.contains("is undefined")){
			String variableName = useReturnMsg.substring(useReturnMsg.indexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: O objeto com nome"+variableName+" não foi definido.");
			hasErro = true;
		}else if(useReturnMsg.contains("Class") && useReturnMsg.contains("does not have an attribute")){
			String className = useReturnMsg .substring(useReturnMsg.indexOf("`")+1, useReturnMsg.indexOf("'"));
			String attName = useReturnMsg.substring(useReturnMsg.lastIndexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: A classe "+className+" não possui o atributo "+attName);
			hasErro = true;
		}else if(useReturnMsg.contains("Unknown command")){
			String unknownCmd = useReturnMsg.substring(useReturnMsg.indexOf("`"), useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: Comando desconhecido "+unknownCmd);
			hasErro = true;
		}else if(useReturnMsg.contains("Type mismatch in assignment expression. Expected type")){
			String expectedType = useReturnMsg .substring(useReturnMsg.indexOf("`")+1, useReturnMsg.indexOf("'"));
			String foundType = useReturnMsg.substring(useReturnMsg.lastIndexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: O tipo esperado era "+expectedType+", porem o tipo encontrado foi "+foundType+".");
			hasErro = true;
		}else if(useReturnMsg.contains("no viable alternative at input 'delete'")){
			System.err.println("Erro: Não foi declarado o objeto que deseja-se deletar");
			hasErro = true;
		}else if(useReturnMsg.contains("Cannot instantiate association class") && useReturnMsg.contains("without participants")){
			String className = useReturnMsg .substring(useReturnMsg.indexOf("`")+1, useReturnMsg.indexOf("'"));
			System.err.println("Erro: A classe associativa "+className+" não pode ser criada sem seus participantes");
			hasErro = true;
		}else if(useReturnMsg.contains("Participant") && useReturnMsg.contains("of association class") &&  useReturnMsg.contains("must be of type")){
			String ParticipantNumber = useReturnMsg .substring(useReturnMsg.indexOf("Participant ")+"Participant ".length(), useReturnMsg.indexOf(" of "));
			String ParticipantName = "";
			if(ParticipantNumber.equals("1")){
				ParticipantName = "primeiro";
			}else if(ParticipantNumber.equals("2")){
				ParticipantName = "segundo";
			}else if(ParticipantNumber.equals("3")){
				ParticipantName = "terceiro";
			}else if(ParticipantNumber.equals("4")){
				ParticipantName = "Quarto";
			}else{
				ParticipantName = ParticipantNumber;
			}
			String associationClassName = useReturnMsg .substring(useReturnMsg.indexOf("`")+1, useReturnMsg.indexOf("'"));
			String rightType = useReturnMsg .substring(useReturnMsg.indexOf("must be of type `")+"must be of type `".length(), useReturnMsg.indexOf("', but "));
			String variableName = useReturnMsg .substring(useReturnMsg.indexOf(", but `")+", but `".length(), useReturnMsg.indexOf("' is of type"));

			String wrongType = useReturnMsg.substring(useReturnMsg.lastIndexOf("`")+1, useReturnMsg.lastIndexOf("'"));
			System.err.println("Erro: O "+ParticipantName+" participante da classe associativa "+associationClassName+" deve ser do tipo "+
					rightType+", entretanto "+variableName+" é do tipo "+wrongType);
			hasErro = true;
		}else if(useReturnMsg.contains("Cannot insert two linkobjects of the same type between one set of objects")){
			System.err.println("Não é possível criar duas associações entre objetos do mesmo tipo.");
			hasErro = true;
		}
		else{
			System.err.println("Output desconhecido: "+useReturnMsg);
			hasErro = true;
		}
		
		if(hasErro){
			ExecutionManager.stopExecution(false);
		}
	}



	public void receive(){
		Thread T=new Thread(new Runnable() {
			String line;
			@Override
			public void run() {
				try {
					while ((line = reader.readLine ()) != null) {
						useReturn(line);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		} );
		T.start();

		receiveError();
	}

	public void receiveError(){
		Thread T=new Thread(new Runnable() {
			String line;
			@Override
			public void run() {
				try {
					while ((line = error.readLine ()) != null) {
						useReturn(line);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		} );
		T.start();
	}

	public void openMoldel(){
		if(process.isAlive()){
			sendCommand("reset",null);
			sendCommand("open \""+useFile.getAbsolutePath()+"\"",null);
		}else{
			System.out.println("use foi fechado2");
			process.destroyForcibly();
			process = null;
			instance = null;
			getInstance();
		}
	}

	public boolean isAlive(){
		return process.isAlive();
	}

}
