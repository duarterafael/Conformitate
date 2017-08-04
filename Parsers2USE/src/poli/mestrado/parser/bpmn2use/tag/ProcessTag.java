package poli.mestrado.parser.bpmn2use.tag;

import java.io.Serializable;
import java.util.LinkedList;

import poli.mestrado.parser.bpmn2use.tag.event.StartEvent;
import poli.mestrado.parser.bpmn2use.tag.sequenceFlow.SequenceFlowTag;


@SuppressWarnings("serial")
public class ProcessTag implements Serializable{
	public static final String TAG_NAME = "process";
	private String id;
	private LinkedList<SequenceFlowTag> sequenceFlowList;
	private LinkedList<AbstractBaseElement> abstractBaseElementList;
	
	
	public ProcessTag(String id,   LinkedList<AbstractBaseElement> abstractBaseElement, LinkedList<SequenceFlowTag> sequenceFlowList){
		this.id = id;
		this.sequenceFlowList = new LinkedList<SequenceFlowTag>();
		this.sequenceFlowList.addAll(sequenceFlowList);
		this.abstractBaseElementList = new LinkedList<AbstractBaseElement>();
		this.abstractBaseElementList.addAll(abstractBaseElement);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		String str = "";
		
		if(abstractBaseElementList != null){
			for (AbstractBaseElement abstractBaseElement : abstractBaseElementList) {
				str += abstractBaseElement.toString()+"\n";
			}
		}
		if(sequenceFlowList != null){
			for (SequenceFlowTag sequenceFlowTag : sequenceFlowList) {
				str += sequenceFlowTag.toString()+"\n"; 
			}
		}
		
		return "PRocess ID = "+id+"\n"+str;
	}

	public LinkedList<SequenceFlowTag> getSequenceFlowList() {
		return sequenceFlowList;
	}

	public LinkedList<AbstractBaseElement> getAbstractBaseElementList() {
		return abstractBaseElementList;
	}
	
	
}
