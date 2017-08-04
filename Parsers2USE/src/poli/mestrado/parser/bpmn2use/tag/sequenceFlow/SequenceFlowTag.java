package poli.mestrado.parser.bpmn2use.tag.sequenceFlow;

import poli.mestrado.parser.bpmn2use.tag.AbstractBaseElement;

public class SequenceFlowTag {
	
	public static final String TAG_NAME = "sequenceFlow";
	public static final String ATTRIBUTE_TAG_SOURCE_REF = "sourceRef";
	public static final String ATTRIBUTE_TAG_TARGET_REF = "targetRef";
	public static final String 	CONDITIONEXPRESSION_TAG_NAME = "conditionExpression";
	
	private String id;
	private AbstractBaseElement sourceRef;
	private AbstractBaseElement targetRef;
	private String conditionExpression;
	
	public SequenceFlowTag(String id, AbstractBaseElement sourceRef, AbstractBaseElement targetRef, String conditionExpression) {
		super();
		this.id = id;
		this.sourceRef = sourceRef;
		this.targetRef = targetRef;
		this.conditionExpression = conditionExpression;
	}

	public String getId() {
		return id;
	}

	public AbstractBaseElement getSourceRef() {
		return sourceRef;
	}

	public AbstractBaseElement getTargetRef() {
		return targetRef;
	}
	
	public String getConditionExpression() {
		return conditionExpression;
	}

	
	@Override
	public String toString() {
		String str = conditionExpression == null? "": " conditionExpression = "+conditionExpression;
		return "ID = "+ id + " sourceRef = "+sourceRef.getId() + " targetRef =  " + targetRef.getId() +str ;
	}
	
	
	
	
	

}
