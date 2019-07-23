package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerAccountNomineeDTO {
	
	private String nomineeName;
	private String nomineedateOfBirth;
	private String relAcctHolder;
	private String nomineeAddressLine1;
	private String nomineeAddressLine2;
	private String nomineeAddressLine3;
	private String nomineeAddressLine4;
	private String nomineeDistrict;
	private String nomineeCity;
	private String nomineeState;
	private String nomineeCountry;
	private String nomineeZip;
	private String nomPhone;
	private String nomMobile;
	private String nomEmailId;
	private String relationGuardian;
	private String guardianName;
	private String guardianDateofBirth;
	private String guardianAddressLine1;
	private String guardianAddressLine2;
	private String guardianAddressLine3;
	private String guardianAddressLine4;
	private String gurdianDistrict;
	private String guardianCity;
	private String guardianState;
	private String guardianCountry;
	private String guardianZip;
	private String guardianPhone;
	private String guardianMobile;
	private String guardianEmailId;
	private String sharePercentage;
	private String shareAmount;
	
	@XmlElement(name="nomineeName")
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	@XmlElement(name="nomineedateOfBirth")
	public String getNomineedateOfBirth() {
		return nomineedateOfBirth;
	}
	public void setNomineedateOfBirth(String nomineedateOfBirth) {
		this.nomineedateOfBirth = nomineedateOfBirth;
	}
	@XmlElement(name="relAcctHolder")
	public String getRelAcctHolder() {
		return relAcctHolder;
	}
	public void setRelAcctHolder(String relAcctHolder) {
		this.relAcctHolder = relAcctHolder;
	}
	@XmlElement(name="nomineeAddressLine1")
	public String getNomineeAddressLine1() {
		return nomineeAddressLine1;
	}
	public void setNomineeAddressLine1(String nomineeAddressLine1) {
		this.nomineeAddressLine1 = nomineeAddressLine1;
	}
	@XmlElement(name="nomineeAddressLine2")
	public String getNomineeAddressLine2() {
		return nomineeAddressLine2;
	}
	public void setNomineeAddressLine2(String nomineeAddressLine2) {
		this.nomineeAddressLine2 = nomineeAddressLine2;
	}
	@XmlElement(name="nomineeAddressLine3")
	public String getNomineeAddressLine3() {
		return nomineeAddressLine3;
	}
	public void setNomineeAddressLine3(String nomineeAddressLine3) {
		this.nomineeAddressLine3 = nomineeAddressLine3;
	}
	@XmlElement(name="nomineeAddressLine4")
	public String getNomineeAddressLine4() {
		return nomineeAddressLine4;
	}
	public void setNomineeAddressLine4(String nomineeAddressLine4) {
		this.nomineeAddressLine4 = nomineeAddressLine4;
	}
	@XmlElement(name="nomineeDistrict")
	public String getNomineeDistrict() {
		return nomineeDistrict;
	}
	public void setNomineeDistrict(String nomineeDistrict) {
		this.nomineeDistrict = nomineeDistrict;
	}
	@XmlElement(name="nomineeCity")
	public String getNomineeCity() {
		return nomineeCity;
	}
	public void setNomineeCity(String nomineeCity) {
		this.nomineeCity = nomineeCity;
	}
	@XmlElement(name="nomineeState")
	public String getNomineeState() {
		return nomineeState;
	}
	public void setNomineeState(String nomineeState) {
		this.nomineeState = nomineeState;
	}
	@XmlElement(name="nomineeCountry")
	public String getNomineeCountry() {
		return nomineeCountry;
	}
	public void setNomineeCountry(String nomineeCountry) {
		this.nomineeCountry = nomineeCountry;
	}
	@XmlElement(name="nomineeZip")
	public String getNomineeZip() {
		return nomineeZip;
	}
	public void setNomineeZip(String nomineeZip) {
		this.nomineeZip = nomineeZip;
	}
	@XmlElement(name="nomPhone")
	public String getNomPhone() {
		return nomPhone;
	}
	public void setNomPhone(String nomPhone) {
		this.nomPhone = nomPhone;
	}
	@XmlElement(name="nomMobile")
	public String getNomMobile() {
		return nomMobile;
	}
	public void setNomMobile(String nomMobile) {
		this.nomMobile = nomMobile;
	}
	@XmlElement(name="nomEmailId")
	public String getNomEmailId() {
		return nomEmailId;
	}
	public void setNomEmailId(String nomEmailId) {
		this.nomEmailId = nomEmailId;
	}
	@XmlElement(name="relationGuardian")
	public String getRelationGuardian() {
		return relationGuardian;
	}
	public void setRelationGuardian(String relationGuardian) {
		this.relationGuardian = relationGuardian;
	}
	@XmlElement(name="guardianName")
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	@XmlElement(name="guardianDateofBirth")
	public String getGuardianDateofBirth() {
		return guardianDateofBirth;
	}
	public void setGuardianDateofBirth(String guardianDateofBirth) {
		this.guardianDateofBirth = guardianDateofBirth;
	}
	@XmlElement(name="guardianAddressLine1")
	public String getGuardianAddressLine1() {
		return guardianAddressLine1;
	}
	public void setGuardianAddressLine1(String guardianAddressLine1) {
		this.guardianAddressLine1 = guardianAddressLine1;
	}
	@XmlElement(name="guardianAddressLine2")
	public String getGuardianAddressLine2() {
		return guardianAddressLine2;
	}
	public void setGuardianAddressLine2(String guardianAddressLine2) {
		this.guardianAddressLine2 = guardianAddressLine2;
	}
	@XmlElement(name="guardianAddressLine3")
	public String getGuardianAddressLine3() {
		return guardianAddressLine3;
	}
	public void setGuardianAddressLine3(String guardianAddressLine3) {
		this.guardianAddressLine3 = guardianAddressLine3;
	}
	@XmlElement(name="guardianAddressLine4")
	public String getGuardianAddressLine4() {
		return guardianAddressLine4;
	}
	public void setGuardianAddressLine4(String guardianAddressLine4) {
		this.guardianAddressLine4 = guardianAddressLine4;
	}
	@XmlElement(name="gurdianDistrict")
	public String getGurdianDistrict() {
		return gurdianDistrict;
	}
	public void setGurdianDistrict(String gurdianDistrict) {
		this.gurdianDistrict = gurdianDistrict;
	}
	@XmlElement(name="guardianCity")
	public String getGuardianCity() {
		return guardianCity;
	}
	public void setGuardianCity(String guardianCity) {
		this.guardianCity = guardianCity;
	}
	@XmlElement(name="guardianState")
	public String getGuardianState() {
		return guardianState;
	}
	public void setGuardianState(String guardianState) {
		this.guardianState = guardianState;
	}
	@XmlElement(name="guardianCountry")
	public String getGuardianCountry() {
		return guardianCountry;
	}
	public void setGuardianCountry(String guardianCountry) {
		this.guardianCountry = guardianCountry;
	}
	@XmlElement(name="guardianZip")
	public String getGuardianZip() {
		return guardianZip;
	}
	public void setGuardianZip(String guardianZip) {
		this.guardianZip = guardianZip;
	}
	@XmlElement(name="guardianPhone")
	public String getGuardianPhone() {
		return guardianPhone;
	}
	public void setGuardianPhone(String guardianPhone) {
		this.guardianPhone = guardianPhone;
	}
	@XmlElement(name="guardianMobile")
	public String getGuardianMobile() {
		return guardianMobile;
	}
	public void setGuardianMobile(String guardianMobile) {
		this.guardianMobile = guardianMobile;
	}
	@XmlElement(name="guardianEmailId")
	public String getGuardianEmailId() {
		return guardianEmailId;
	}
	public void setGuardianEmailId(String guardianEmailId) {
		this.guardianEmailId = guardianEmailId;
	}
	@XmlElement(name="sharePercentage")
	public String getSharePercentage() {
		return sharePercentage;
	}
	public void setSharePercentage(String sharePercentage) {
		this.sharePercentage = sharePercentage;
	}
	@XmlElement(name="shareAmount")
	public String getShareAmount() {
		return shareAmount;
	}
	public void setShareAmount(String shareAmount) {
		this.shareAmount = shareAmount;
	}
	
	
	
	

}
