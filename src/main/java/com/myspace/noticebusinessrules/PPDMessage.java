package com.myspace.noticebusinessrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PPDMessage implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String currentKeyCode;
	private java.lang.String eventType;
	private java.lang.String priorKeyCode;

	private java.lang.Boolean currentConditionalInd;

	public PPDMessage() {
	}

	public java.lang.String getCurrentKeyCode() {
		return this.currentKeyCode;
	}

	public void setCurrentKeyCode(java.lang.String currentKeyCode) {
		this.currentKeyCode = currentKeyCode;
	}

	public java.lang.String getEventType() {
		return this.eventType;
	}

	public void setEventType(java.lang.String eventType) {
		this.eventType = eventType;
	}

	public java.lang.String getPriorKeyCode() {
		return this.priorKeyCode;
	}

	public void setPriorKeyCode(java.lang.String priorKeyCode) {
		this.priorKeyCode = priorKeyCode;
	}

	public java.lang.Boolean getCurrentConditionalInd() {
		return this.currentConditionalInd;
	}

	public void setCurrentConditionalInd(java.lang.Boolean currentConditionalInd) {
		this.currentConditionalInd = currentConditionalInd;
	}

	public PPDMessage(java.lang.String currentKeyCode,
			java.lang.String eventType, java.lang.String priorKeyCode,
			java.lang.Boolean currentConditionalInd) {
		this.currentKeyCode = currentKeyCode;
		this.eventType = eventType;
		this.priorKeyCode = priorKeyCode;
		this.currentConditionalInd = currentConditionalInd;
	}

}