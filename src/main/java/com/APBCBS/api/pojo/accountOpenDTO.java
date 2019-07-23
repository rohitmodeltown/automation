package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class accountOpenDTO {
	
	private String branchCode;
	private String productType;
	private String flgRestrictAcct;
	private String productCode;
	private String minorAcctStatus;
	private String flgJointHolder;
	private String acctCurrency;
	private String accountTitle;
	
	@XmlElement(name="branchCode")
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	@XmlElement(name="productType")
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	@XmlElement(name="flgRestrictAcct")
	public String getFlgRestrictAcct() {
		return flgRestrictAcct;
	}
	public void setFlgRestrictAcct(String flgRestrictAcct) {
		this.flgRestrictAcct = flgRestrictAcct;
	}
	@XmlElement(name="productCode")
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	@XmlElement(name="minorAcctStatus")
	public String getMinorAcctStatus() {
		return minorAcctStatus;
	}
	public void setMinorAcctStatus(String minorAcctStatus) {
		this.minorAcctStatus = minorAcctStatus;
	}
	@XmlElement(name="flgJointHolder")
	public String getFlgJointHolder() {
		return flgJointHolder;
	}
	public void setFlgJointHolder(String flgJointHolder) {
		this.flgJointHolder = flgJointHolder;
	}
	@XmlElement(name="acctCurrency")
	public String getAcctCurrency() {
		return acctCurrency;
	}
	public void setAcctCurrency(String acctCurrency) {
		this.acctCurrency = acctCurrency;
	}
	@XmlElement(name="accountTitle")
	public String getAccountTitle() {
		return accountTitle;
	}
	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}
	@Override
	public String toString() {
		return "accountOpenDTO [branchCode=" + getBranchCode() + ", productType=" + getProductType() + ", flgRestrictAcct="
				+ getFlgRestrictAcct() + ", productCode=" + getProductCode() + ", minorAcctStatus=" + getMinorAcctStatus()
				+ ", flgJointHolder=" + getFlgJointHolder() + ", acctCurrency=" + getAcctCurrency() + ", accountTitle="
				+ getAccountTitle() + "]";
	}
	
	
	

}
