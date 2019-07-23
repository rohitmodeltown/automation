package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AirtelExtSupplyChainHierarchyCheckRequestDTO {
	
	private String fromCustomerID;
	private String toCustomerID;
	
	@XmlElement(name="fromCustomerID")
	public String getFromCustomerID() {
		return fromCustomerID;
	}
	public void setFromCustomerID(String fromCustomerID) {
		this.fromCustomerID = fromCustomerID;
	}
	@XmlElement(name="toCustomerID")
	public String getToCustomerID() {
		return toCustomerID;
	}
	public void setToCustomerID(String toCustomerID) {
		this.toCustomerID = toCustomerID;
	}
	
	

}
