package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AirtelExtAddModifyNomineeRequestDTO {
	
	private String nomineeId;
	private String accountNumber;
	private CustomerAccountNomineeDTO cus_acc_Nominee;
	
	@XmlElement(name="nomineeId")
	public String getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(String nomineeId) {
		this.nomineeId = nomineeId;
	}
	@XmlElement(name="accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	@XmlElement(name="CustomerAccountNomineeDTO")
	public CustomerAccountNomineeDTO getCus_acc_Nominee() {
		return cus_acc_Nominee;
	}
	public void setCus_acc_Nominee(CustomerAccountNomineeDTO cus_acc_Nominee) {
		this.cus_acc_Nominee = cus_acc_Nominee;
	}
	
	

}
