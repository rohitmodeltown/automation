package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SessionContext {
	
	private superContext supercontext;
	private String bankCode;
	private String channel;
	private String externalBatchNumber ;
	private String externalReferenceNo;
	private String externalSystemAuditTrailNumber ;
	private String localDateTimeText ;
	private String originalReferenceNo ;
	private String overridenWarnings ;
	private String postingDateText ;
	private String serviceCode;
	private String sessionTicket ;
	private String transactionBranch;
	private String userId;
	private String userReferenceNumber ;
	private String valueDateText ;
	
	@XmlElement(name="SuperContext")
	public superContext getSupercontext() {
		return supercontext;
	}
	
	public void setSupercontext(superContext supercontext) {
		this.supercontext = supercontext;
	}
	@XmlElement(name="BankCode")
	public String getBankCode() {
		return bankCode;
	}
	
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	@XmlElement(name="Channel")
	public String getChannel() {
		return channel;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}
	@XmlElement(name="ExternalBatchNumber")
	public String getExternalBatchNumber() {
		return externalBatchNumber;
	}
	
	public void setExternalBatchNumber(String externalBatchNumber) {
		this.externalBatchNumber = externalBatchNumber;
	}
	@XmlElement(name="ExternalReferenceNo")
	public String getExternalReferenceNo() {
		return externalReferenceNo;
	}
	
	public void setExternalReferenceNo(String externalReferenceNo) {
		this.externalReferenceNo = externalReferenceNo;
	}
	@XmlElement(name="ExternalSystemAuditTrailNumber")
	public String getExternalSystemAuditTrailNumber() {
		return externalSystemAuditTrailNumber;
	}
	
	public void setExternalSystemAuditTrailNumber(String externalSystemAuditTrailNumber) {
		this.externalSystemAuditTrailNumber = externalSystemAuditTrailNumber;
	}
	@XmlElement(name="LocalDateTimeText")
	public String getLocalDateTimeText() {
		return localDateTimeText;
	}
	
	public void setLocalDateTimeText(String localDateTimeText) {
		this.localDateTimeText = localDateTimeText;
	}
	@XmlElement(name="OriginalReferenceNo")
	public String getOriginalReferenceNo() {
		return originalReferenceNo;
	}
	
	public void setOriginalReferenceNo(String originalReferenceNo) {
		this.originalReferenceNo = originalReferenceNo;
	}
	@XmlElement(name="OverridenWarnings")
	public String getOverridenWarnings() {
		return overridenWarnings;
	}
	
	public void setOverridenWarnings(String overridenWarnings) {
		this.overridenWarnings = overridenWarnings;
	}
	@XmlElement(name="PostingDateText")
	public String getPostingDateText() {
		return postingDateText;
	}
	
	public void setPostingDateText(String postingDateText) {
		this.postingDateText = postingDateText;
	}
	@XmlElement(name="ServiceCode")
	public String getServiceCode() {
		return serviceCode;
	}
	
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	@XmlElement(name="ServiceTicket")
	public String getSessionTicket() {
		return sessionTicket;
	}
	
	public void setSessionTicket(String sessionTicket) {
		this.sessionTicket = sessionTicket;
	}
	@XmlElement(name="TransactionBranch")
	public String getTransactionBranch() {
		return transactionBranch;
	}
	
	public void setTransactionBranch(String transactionBranch) {
		this.transactionBranch = transactionBranch;
	}
	@XmlElement(name="UserId")
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@XmlElement(name="UserReferenceNumber")
	public String getUserReferenceNumber() {
		return userReferenceNumber;
	}
	
	public void setUserReferenceNumber(String userReferenceNumber) {
		this.userReferenceNumber = userReferenceNumber;
	}
	@XmlElement(name="ValueDateText")
	public String getValueDateText() {
		return valueDateText;
	}
	
	public void setValueDateText(String valueDateText) {
		this.valueDateText = valueDateText;
	}
	@Override
	public String toString() {
		return "SessionContext [supercontext=" + getSupercontext() + ", bankCode=" + getBankCode() + ", channel=" + getChannel()
				+ ", externalBatchNumber=" + getExternalBatchNumber() + ", externalReferenceNo=" + getExternalReferenceNo()
				+ ", externalSystemAuditTrailNumber=" + getExternalSystemAuditTrailNumber() + ", localDateTimeText="
				+ getLocalDateTimeText() + ", originalReferenceNo=" + getOriginalReferenceNo() + ", overridenWarnings="
				+ getOverridenWarnings() + ", postingDateText=" + getPostingDateText() + ", serviceCode=" + getServiceCode()
				+ ", sessionTicket=" + getSessionTicket() + ", transactionBranch=" + getTransactionBranch() + ", userId=" + getUserId()
				+ ", userReferenceNumber=" + getUserReferenceNumber() + ", valueDateText=" + getValueDateText() + "]";
	}
	
	
	

}
