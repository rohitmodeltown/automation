package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CorporateCustomerDTO {
	
	private String businessCode;
	private CorporateLocaladdress corporateLocaladdress;
	private CorporatePermanentaddress corporatePermanentaddress;
	private String countryOfResidence;
	private String customerMobilePhone;
	private String emailId;
	private String nationality;
	private String nationalIdentificationCode;
	private CorporateName corporateName; 
	private String dateOfBirthOrRegistration;
	private String signatureType;
	private String phone;
	private String origin;
	private String language;
	private String homeBranchCode;
	
	
	@XmlElement(name="businessCode")
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	@XmlElement(name="BeneficiaryID")
	public CorporateLocaladdress getCorporateLocaladdress() {
		return corporateLocaladdress;
	}
	public void setCorporateLocaladdress(CorporateLocaladdress corporateLocaladdress) {
		this.corporateLocaladdress = corporateLocaladdress;
	}
	@XmlElement(name="CorporatePermanentaddress")
	public CorporatePermanentaddress getCorporatePermanentaddress() {
		return corporatePermanentaddress;
	}
	public void setCorporatePermanentaddress(CorporatePermanentaddress corporatePermanentaddress) {
		this.corporatePermanentaddress = corporatePermanentaddress;
	}
	@XmlElement(name="countryOfResidence")
	public String getCountryOfResidence() {
		return countryOfResidence;
	}
	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}
	@XmlElement(name="customerMobilePhone")
	public String getCustomerMobilePhone() {
		return customerMobilePhone;
	}
	public void setCustomerMobilePhone(String customerMobilePhone) {
		this.customerMobilePhone = customerMobilePhone;
	}
	@XmlElement(name="emailId")
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@XmlElement(name="nationality")
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@XmlElement(name="nationalIdentificationCode")
	public String getNationalIdentificationCode() {
		return nationalIdentificationCode;
	}
	public void setNationalIdentificationCode(String nationalIdentificationCode) {
		this.nationalIdentificationCode = nationalIdentificationCode;
	}
	@XmlElement(name="CorporateName")
	public CorporateName getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(CorporateName corporateName) {
		this.corporateName = corporateName;
	}
	@XmlElement(name="dateOfBirthOrRegistration")
	public String getDateOfBirthOrRegistration() {
		return dateOfBirthOrRegistration;
	}
	public void setDateOfBirthOrRegistration(String dateOfBirthOrRegistration) {
		this.dateOfBirthOrRegistration = dateOfBirthOrRegistration;
	}
	@XmlElement(name="signatureType")
	public String getSignatureType() {
		return signatureType;
	}
	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}
	@XmlElement(name="phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@XmlElement(name="origin")
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@XmlElement(name="language")
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@XmlElement(name="homeBranchCode")
	public String getHomeBranchCode() {
		return homeBranchCode;
	}
	public void setHomeBranchCode(String homeBranchCode) {
		this.homeBranchCode = homeBranchCode;
	}
	
	

}
