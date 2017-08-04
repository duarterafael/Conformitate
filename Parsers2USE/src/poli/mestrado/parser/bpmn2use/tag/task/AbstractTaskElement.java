package poli.mestrado.parser.bpmn2use.tag.task;


import java.util.ArrayList;
import java.util.List;

import poli.mestrado.parser.bpmn2use.TagTransformerAsslCommand;
import poli.mestrado.parser.bpmn2use.tag.AbstractBaseElement;
import poli.mestrado.parser.bpmn2use.tag.AbstractCondition;
import poli.mestrado.parser.bpmn2use.tag.PosCondition;
import poli.mestrado.parser.bpmn2use.tag.PreCondition;
import poli.mestrado.parser.bpmn2use.tag.dataObject.DataObject;
import poli.mestrado.parser.util.Constants;

public abstract class AbstractTaskElement extends AbstractBaseElement {

	public static final String COMPLETIONQUANTITY_ATTRIBUTE = "completionQuantity";
	public static final String ISFORCOMPENSATION_ATTRIBUTE = "isForCompensation";
	public static final String STARTQUANTITY_ATTRIBUTE = "startQuantity";

	private Integer completionQuantity;
	private Boolean isForCompensation;
	private Integer startQuantity;
	private List<AbstractCondition> prePostConditionList;
	private List<DataObject> dataInputList;
	private List<DataObject> dataOutList;



	public AbstractTaskElement(String id, String name,
			Integer completionQuantity, Boolean isForCompensation,
			Integer startQuantity,
			List<AbstractCondition> prePostConditionList,
			List<DataObject> dataInputList, List<DataObject> dataOutList) {
		super(id, name);
		this.completionQuantity = completionQuantity;
		this.isForCompensation = isForCompensation;
		this.startQuantity = startQuantity;
		this.prePostConditionList = prePostConditionList;
		this.dataInputList = dataInputList;
		this.dataOutList = dataOutList;
	}

	public int getCompletionQuantity() {
		return completionQuantity;
	}

	public Boolean getIsForCompensation() {
		return isForCompensation;
	}

	public int getStartQuantity() {
		return startQuantity;
	}

	public String getAsslCall(){
		return "AsslCall "+super.getName().replace(" ", "_")+"();";
	}

	public String getDataInputs(){
		String param = "";

		if(dataInputList != null && !dataInputList.isEmpty()){
			for (DataObject dtInput : dataInputList) {
				param += dtInput.toString()+" ,";
			}
		}

		return param;
	}

	public String getDataOutputs(){
		String varArgs = "";

		if(dataOutList != null && !dataOutList.isEmpty()){
			for (DataObject dtOut : dataOutList) {
				varArgs += dtOut.toString()+" ,";
			}
		}


		return varArgs;
	}
	


	public String getAsslComan(){
		String preConditonListStr = "";
		String postConditionListStr = "";

		
		for (int i = 0; i < prePostConditionList.size(); i++) {
			if(prePostConditionList.get(i) instanceof PreCondition){
				if(Constants.asslScriptWhithLog){
					preConditonListStr += "\n\t-------Pre condition name: "+prePostConditionList.get(i).getName()+"-------------\n";
				}
				for (String asslComand : TagTransformerAsslCommand.conditionExpression2AsslCommand(prePostConditionList.get(i).getConditionExpression())) {
					preConditonListStr += "\t\t"+asslComand.replace("\n", "").trim()+"\n";
				}
			}else if(prePostConditionList.get(i) instanceof PosCondition){
				if(Constants.asslScriptWhithLog){
					postConditionListStr += "\n\t-------Pos condition name: "+prePostConditionList.get(i).getName()+"-------------\n";
				}
				for (String asslComand : TagTransformerAsslCommand.conditionExpression2AsslCommand(prePostConditionList.get(i).getConditionExpression())) {
					postConditionListStr += "\t\t"+asslComand.replace("\n", "").trim()+"\n";
				}
			}
		}
		if(Constants.asslScriptWhithLog){
			if(!preConditonListStr.equals("")){
				preConditonListStr = "\n\n---------------BEGIN Pre condtion List---------------"+preConditonListStr+"\n---------------END Pre condtion List---------------\n";
			}else{
				preConditonListStr += "\n\n---------------Pre condtion List is empty---------------";
			}
			if(!postConditionListStr.equals("")){
				postConditionListStr = "\n\n---------------BEGIN Pos condtion List---------------"+postConditionListStr+"\n---------------END Pos condtion List---------------\n";
			}else{
				preConditonListStr += "\n\n---------------Pos condtion List is empty---------------";
			}
		}
	
		

		String str = "";
		if(Constants.asslScriptWhithLog){
			str += "\n------BEGIN TASK id: "+super.getId()+" Name: "+super.getName()+" ---------";
		}
		str+=preConditonListStr;
		str+=postConditionListStr;

		if(Constants.asslScriptWhithLog){
			str+= "\n------------END TASK id: "+super.getId()+" Name: "+super.getName()+" ---------";
		}
		return str;
	}



	@Override
	public String toString() {


		String preConditonListStr = "\n\n---------------Pre condtion List BEGIN---------------";
		String postConditionListStr = "\n\n---------------Pos condtion List BEGIN---------------";

		if(prePostConditionList != null && !prePostConditionList.isEmpty()){	
			for (int i = 0; i < prePostConditionList.size(); i++) {
				if(prePostConditionList.get(i) instanceof PreCondition){
					preConditonListStr += "\n\t-------Pre condition name: "+prePostConditionList.get(i).getName()+"-------------\n";
					for (String asslComand : TagTransformerAsslCommand.conditionExpression2AsslCommand(prePostConditionList.get(i).getConditionExpression())) {
						preConditonListStr += "\t\t"+asslComand.replace("\n", "").trim()+"\n";
					}
				}else if(prePostConditionList.get(i) instanceof PosCondition){
					postConditionListStr += "\n\t-------Pos condition name: "+prePostConditionList.get(i).getName()+"-------------\n";
					for (String asslComand : TagTransformerAsslCommand.conditionExpression2AsslCommand(prePostConditionList.get(i).getConditionExpression())) {
						postConditionListStr += "\t\t"+asslComand.replace("\n", "").trim()+"\n";
					}
				}
			}

		}

		preConditonListStr +=  "\n---------------Pre condtion List END---------------\n";
		postConditionListStr += "\n---------------Pos condtion List END---------------\n";


		String param = "(";

		if(dataInputList != null && !dataInputList.isEmpty()){
			for (DataObject dtInput : dataInputList) {
				param += dtInput.toString()+" ,";
			}
		}
		if(param.endsWith(",")){
			param = param.substring(0, param.lastIndexOf(",")-1);
		}
		param += ")";

		String varArgs = "";

		if(dataOutList != null && !dataOutList.isEmpty()){
			varArgs += "var ";
			for (DataObject dtOut : dataOutList) {
				varArgs += dtOut.toString()+" ,";
			}
		}
		if(varArgs.endsWith(",")){
			varArgs = varArgs.substring(0, varArgs.lastIndexOf(",")-1);
			varArgs += ";";
		}

		String str = "";

		str += "--- id: "+super.getId()+" Name: "+super.getName()+" ---------";
		str += "\nprocedure "+super.getName().replace(" ", "_")+param;
		str += "\n"+varArgs;
		str += "\nbegin";

		str+=preConditonListStr;
		str+=postConditionListStr;

		str += "\nend;";
		//		====================================================================================================
		//		str += super.toString()+" completionQuantity = "+completionQuantity+" isForCompensation = "+isForCompensation+" startQuantity = "+startQuantity+"";
		//		if(dataInputList != null && !dataInputList.isEmpty()){
		//			str += "\n------------------------Data input objetcts--------------\n";
		//			for (DataObject dtInput : dataInputList) {
		//				str += "\n\t"+dtInput.toString();
		//			}
		//		}else{
		//			str += "\n------------------------Data input objetcts>>>>IS EMPTY--------------\n";
		//		}
		//
		//		if(dataOutList != null && !dataOutList.isEmpty()){
		//			str += "\n------------------------Data out objetcts--------------\n";
		//			for (DataObject dtOutput : dataOutList) {
		//				str += "\n\t"+dtOutput.toString();
		//			}
		//		}else{
		//			str += "\n------------------------Data out objetcts>>>>IS EMPTY--------------\n";
		//
		//		}
		//		if(prePostConditionList != null && !prePostConditionList.isEmpty()){	
		//			str += "\n------------------------Pre Post Condition--------------\n";
		//			for (int i = 0; i < prePostConditionList.size(); i++) {
		//				str += "\n\t"+prePostConditionList.get(i).toString();
		//			}
		//		}else{
		//			str += "\n------------------------Pre Post Condition IS EMPTY--------------\n";
		//		}
		//		str += "\n----------------------------END TASK---------------------------";

		return str;		
	}

	public List<DataObject> getDataInputList() {
		return dataInputList;
	}


	public List<DataObject> getDataOutList() {
		return dataOutList;
	}

	public List<AbstractCondition> getPrePostConditionList() {
		return prePostConditionList;
	}

	public void setPrePostConditionList(List<AbstractCondition> prePostConditionList) {
		this.prePostConditionList = prePostConditionList;
	}
	
	



}
