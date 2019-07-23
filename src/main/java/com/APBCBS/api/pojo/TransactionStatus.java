 package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class TransactionStatus {
	
	private ExtendedReply extReply;
	private String ErrorCode;
	private String ExternalReferenceNo;
	private String IsOverriden;
	private String IsServiceChargeApplied;
	private String Memo;
	private String ReplyCode;
	private String ReplyText;
	private String SpReturnValue;
	
	@XmlElement
	public ExtendedReply getExtReply() {
		return extReply;
	}
	
	public void setExtReply(ExtendedReply extReply) {
		this.extReply = extReply;
	}
	@XmlElement
	public String getErrorCode() {
		return ErrorCode;
	}
	
	public void setErrorCode(String errorCode) {
		ErrorCode = errorCode;
	}
	@XmlElement
	public String getExternalReferenceNo() {
		return ExternalReferenceNo;
	}
	
	public void setExternalReferenceNo(String externalReferenceNo) {
		ExternalReferenceNo = externalReferenceNo;
	}
	@XmlElement
	public String getIsOverriden() {
		return IsOverriden;
	}
	
	public void setIsOverriden(String isOverriden) {
		IsOverriden = isOverriden;
	}
	@XmlElement
	public String getIsServiceChargeApplied() {
		return IsServiceChargeApplied;
	}
	
	public void setIsServiceChargeApplied(String isServiceChargeApplied) {
		IsServiceChargeApplied = isServiceChargeApplied;
	}
	@XmlElement
	public String getMemo() {
		return Memo;
	}
	
	public void setMemo(String memo) {
		Memo = memo;
	}
	@XmlElement
	public String getReplyCode() {
		return ReplyCode;
	}
	
	public void setReplyCode(String replyCode) {
		ReplyCode = replyCode;
	}
	@XmlElement
	public String getReplyText() {
		return ReplyText;
	}
	
	public void setReplyText(String replyText) {
		ReplyText = replyText;
	}
	@XmlElement
	public String getSpReturnValue() {
		return SpReturnValue;
	}
	
	public void setSpReturnValue(String spReturnValue) {
		SpReturnValue = spReturnValue;
	}
	@Override
	public String toString() {
		return "TransactionStatus [extReply=" + getExtReply() + ", ErrorCode=" + getErrorCode() + ", ExternalReferenceNo="
				+ getExternalReferenceNo() + ", IsOverriden=" + getIsOverriden() + ", IsServiceChargeApplied="
				+ getIsServiceChargeApplied() + ", Memo=" + getMemo() + ", ReplyCode=" + getReplyCode() + ", ReplyText=" + getReplyText()
				+ ", SpReturnValue=" + getSpReturnValue() + "]";
	}
	
	

}
