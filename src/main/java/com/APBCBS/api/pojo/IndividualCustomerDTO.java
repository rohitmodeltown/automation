package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IndividualCustomerDTO {
	
	private String sex;
	private String maritalStatus;
	private String professionCode;
	private String isStaff;
	private String employeeId;
	private String customerEducation;
	private String motherMaidenName;
	private IndividualLocaladdress IndividualLocaladdress;
	private IndividualPermanentaddress IndividualPermanentaddress;
	private String countryOfResidence;
	private String customerMobilePhone;
	private String emailId;
	private String nationality;
	private String nationalIdentificationCode;
	private String nationalIdentificationCodeOld;
	private String aadhaarNo;
	private String aadhaarUpdateDate;
	private String aadhaarLinkedAccount;
	private String panNo;
	private String icType;
	private String customerType;
	private IndividualName IndividualName;
	private String dateOfBirthOrRegistration;
	private String signatureType;
	private String phone;
	private String origin;
	private String language;
	private String homeBranchCode;
	private String cifType;
	
	@XmlElement(name="sex")
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@XmlElement(name="maritalStatus")
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	@XmlElement(name="professionCode")
	public String getProfessionCode() {
		return professionCode;
	}
	public void setProfessionCode(String professionCode) {
		this.professionCode = professionCode;
	}
	@XmlElement(name="isStaff")
	public String getIsStaff() {
		return isStaff;
	}
	public void setIsStaff(String isStaff) {
		this.isStaff = isStaff;
	}
	@XmlElement(name="employeeId")
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@XmlElement(name="customerEducation")
	public String getCustomerEducation() {
		return customerEducation;
	}
	public void setCustomerEducation(String customerEducation) {
		this.customerEducation = customerEducation;
	}
	@XmlElement(name="motherMaidenName")
	public String getMotherMaidenName() {
		return motherMaidenName;
	}
	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}
	@XmlElement(name="IndividualLocaladdress")
	public IndividualLocaladdress getIndividualLocaladdress() {
		return IndividualLocaladdress;
	}
	public void setIndividualLocaladdress(IndividualLocaladdress individualLocaladdress) {
		IndividualLocaladdress = individualLocaladdress;
	}
	@XmlElement(name="IndividualPermanentaddress")
	public IndividualPermanentaddress getIndividualPermanentaddress() {
		return IndividualPermanentaddress;
	}
	public void setIndividualPermanentaddress(IndividualPermanentaddress individualPermanentaddress) {
		IndividualPermanentaddress = individualPermanentaddress;
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
	@XmlElement(name="nationalIdentificationCodeOld")
	public String getNationalIdentificationCodeOld() {
		return nationalIdentificationCodeOld;
	}
	public void setNationalIdentificationCodeOld(String nationalIdentificationCodeOld) {
		this.nationalIdentificationCodeOld = nationalIdentificationCodeOld;
	}
	@XmlElement(name="aadhaarNo")
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	@XmlElement(name="aadhaarUpdateDate")
	public String getAadhaarUpdateDate() {
		return aadhaarUpdateDate;
	}
	public void setAadhaarUpdateDate(String aadhaarUpdateDate) {
		this.aadhaarUpdateDate = aadhaarUpdateDate;
	}
	@XmlElement(name="aadhaarLinkedAccount")
	public String getAadhaarLinkedAccount() {
		return aadhaarLinkedAccount;
	}
	public void setAadhaarLinkedAccount(String aadhaarLinkedAccount) {
		this.aadhaarLinkedAccount = aadhaarLinkedAccount;
	}
	@XmlElement(name="panNo")
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	@XmlElement(name="icType")
	public String getIcType() {
		return icType;
	}
	public void setIcType(String icType) {
		this.icType = icType;
	}
	@XmlElement(name="customerType")
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	@XmlElement(name="IndividualName")
	public IndividualName getIndividualName() {
		return IndividualName;
	}
	public void setIndividualName(IndividualName individualName) {
		this.IndividualName = individualName;
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
	@XmlElement(name="cifType")
	public String getCifType() {
		return cifType;
	}
	public void setCifType(String cifType) {
		this.cifType = cifType;
	}
	@Override
	public String toString() {
		return "IndividualCustomerDTO [sex=" + getSex() + ", maritalStatus=" + getMaritalStatus() + ", professionCode="
				+ getProfessionCode() + ", isStaff=" + getIsStaff() + ", employeeId=" + getEmailId() + ", customerEducation="
				+ getCustomerEducation() + ", motherMaidenName=" + getMotherMaidenName() + ", IndividualLocaladdress="
				+ getIndividualLocaladdress() + ", IndividualPermanentaddress=" + getIndividualPermanentaddress()
				+ ", countryOfResidence=" + getCountryOfResidence() + ", customerMobilePhone=" + getCustomerMobilePhone()
				+ ", emailId=" + getEmailId() + ", nationality=" + getNationality() + ", nationalIdentificationCode="
				+ getNationalIdentificationCode() + ", nationalIdentificationCodeOld=" + getNationalIdentificationCodeOld()
				+ ", aadhaarNo=" + getAadhaarNo() + ", aadhaarUpdateDate=" + getAadhaarUpdateDate() + ", aadhaarLinkedAccount="
				+ getAadhaarLinkedAccount() + ", panNo=" + getPanNo() + ", icType=" + getIcType() + ", customerType=" + getCustomerType()
				+ ", IndividualName=" + getIndividualName() + ", dateOfBirthOrRegistration=" + getDateOfBirthOrRegistration()
				+ ", signatureType=" + getSignatureType() + ", phone=" + getPhone() + ", origin=" + getOrigin() + ", language="
				+ getLanguage()+ ", homeBranchCode=" + getHomeBranchCode() + ", cifType=" + getCifType() + "]";
	}
	
	
	
	
}
