package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class smsDetails {
	
	private String fromSMSFlag;
	private String fromSMSAddition;
	
	@XmlElement(name="fromSMSFlag")
	public String getFromSMSFlag() {
		return fromSMSFlag;
	}
	public void setFromSMSFlag(String fromSMSFlag) {
		this.fromSMSFlag = fromSMSFlag;
	}
	@XmlElement(name="fromSMSAddition")
	public String getFromSMSAddition() {
		return fromSMSAddition;
	}
	public void setFromSMSAddition(String fromSMSAddition) {
		this.fromSMSAddition = fromSMSAddition;
	}
	@Override
	public String toString() {
		return "smsDetails [fromSMSFlag=" + getFromSMSFlag() + ", fromSMSAddition=" + getFromSMSAddition() + "]";
	}
	
	

	
}
