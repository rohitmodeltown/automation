package com.APBCBS.api.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
	
	public Response() {}
	
	public Response(List<TransactionStatus> transactionStatus)
	{
		this.transactionStatus=transactionStatus;
	}
	
	private List<TransactionStatus> transactionStatus;
	
	@XmlElement
	public List<TransactionStatus> getTransactionStatus() {
		return transactionStatus;
	}
	
	
	public void setTransactionStatus(List<TransactionStatus> transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@Override
	public String toString() {
		return "Reponse [TransactionStatus=" + getTransactionStatus() + "]";
	}
	
	

}
