package poli.mestrado.parser.bpmn2use.tag.task;

import java.util.List;

import poli.mestrado.parser.bpmn2use.tag.AbstractCondition;
import poli.mestrado.parser.bpmn2use.tag.dataObject.DataObject;

public class ReceiveTask extends AbstractTaskElement {

	public static final String TAG_NAME = "receiveTask";

	public ReceiveTask(String id, String name, Integer completionQuantity,
			Boolean isForCompensation, Integer startQuantity,
			List<AbstractCondition> prePostConditionList,
			List<DataObject> dataInputList, List<DataObject> dataOutList) {
		super(id, name, completionQuantity, isForCompensation, startQuantity,
				prePostConditionList, dataInputList, dataOutList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "--------Type:  = "+TAG_NAME +" "+super.toString();
	}
}
