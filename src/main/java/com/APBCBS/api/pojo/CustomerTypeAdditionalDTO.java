package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerTypeAdditionalDTO {
	
	private String lastModifiedByNatlCode;
	private String lastModifedBySegment;
	private String category;
	private String fatherHusbandName;
	private String localDistrict;
	private String permanentDistrict;
	private String activationDateTime;
	private String onboardChannel;
	private String upgradeChannel;
	private String poiType;
	private String poiNumber;
	private String poiIssuingAuthority;
	private String poiDateOfIssue;
	private String poiDateOfExpiry;
	private String poiPlaceOfIssue;
	private String poaType;
	private String poaNumber;
	private String poaIssuingAuthority;
	private String poaDateOfIssue;
	private String poaDateOfExpiry;
	private String poaPlaceOfIssue;
	private String cspNationalIdentificationCode;
	private String cspCustomerSegment;
	private String amountFirstCashIn;
	private String OnboardedByEntityId;
	private String regStatus;
	private String flgInsurance;
	private String cardType;
	private String riskProfile;
	private String panAckNumber;
	private String incomeAgriculture;
	private String incomeNonAgriculture;
	private String annualIncome;
	private String panStatus;
	private String upiStatus;
	private String ndsStatus;
	private String mobilityUserType;
	private String circle;
	private String sourceOfFunds;
	private String politicallyExposedPerson;
	private String flgKYC;
	private String emailStatus;
	private String eSign;
	private String panFirstName;
	private String panSecondName;
	private String panLastName;
	private String custImeiNo;
	private String settlementaccountname;
	private String settlementaccountno;
	private String settlementifsc;
	private String endChannel;
	private String customFields1;
	private String customFields2;
	private String customFields3;
	private String customFields4;
	private String customFields5;
	private String customFields6;
	private String customFields7;
	private String customFields8;
	private String customFields9;
	private String customFields10;
	private String customFields11;
	private String customFields12;
	private String customFields13;
	private String customFields14;
	private String customFields15;
	
	@XmlElement(name="lastModifiedByNatlCode")
	public String getLastModifiedByNatlCode() {
		return lastModifiedByNatlCode;
	}
	public void setLastModifiedByNatlCode(String lastModifiedByNatlCode) {
		this.lastModifiedByNatlCode = lastModifiedByNatlCode;
	}
	@XmlElement(name="lastModifedBySegment")
	public String getLastModifedBySegment() {
		return lastModifedBySegment;
	}
	public void setLastModifedBySegment(String lastModifedBySegment) {
		this.lastModifedBySegment = lastModifedBySegment;
	}
	@XmlElement(name="category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@XmlElement(name="fatherHusbandName")
	public String getFatherHusbandName() {
		return fatherHusbandName;
	}
	public void setFatherHusbandName(String fatherHusbandName) {
		this.fatherHusbandName = fatherHusbandName;
	}
	@XmlElement(name="localDistrict")
	public String getLocalDistrict() {
		return localDistrict;
	}
	public void setLocalDistrict(String localDistrict) {
		this.localDistrict = localDistrict;
	}
	@XmlElement(name="permanentDistrict")
	public String getPermanentDistrict() {
		return permanentDistrict;
	}
	public void setPermanentDistrict(String permanentDistrict) {
		this.permanentDistrict = permanentDistrict;
	}
	@XmlElement(name="activationDateTime")
	public String getActivationDateTime() {
		return activationDateTime;
	}
	public void setActivationDateTime(String activationDateTime) {
		this.activationDateTime = activationDateTime;
	}
	@XmlElement(name="onboardChannel")
	public String getOnboardChannel() {
		return onboardChannel;
	}
	public void setOnboardChannel(String onboardChannel) {
		this.onboardChannel = onboardChannel;
	}
	@XmlElement(name="upgradeChannel")
	public String getUpgradeChannel() {
		return upgradeChannel;
	}
	public void setUpgradeChannel(String upgradeChannel) {
		this.upgradeChannel = upgradeChannel;
	}
	@XmlElement(name="poiType")
	public String getPoiType() {
		return poiType;
	}
	public void setPoiType(String poiType) {
		this.poiType = poiType;
	}
	@XmlElement(name="poiNumber")
	public String getPoiNumber() {
		return poiNumber;
	}
	public void setPoiNumber(String poiNumber) {
		this.poiNumber = poiNumber;
	}
	@XmlElement(name="poiIssuingAuthority")
	public String getPoiIssuingAuthority() {
		return poiIssuingAuthority;
	}
	public void setPoiIssuingAuthority(String poiIssuingAuthority) {
		this.poiIssuingAuthority = poiIssuingAuthority;
	}
	@XmlElement(name="poiPlaceOfIssue")
	public String getPoiDateOfIssue() {
		return poiDateOfIssue;
	}
	public void setPoiDateOfIssue(String poiDateOfIssue) {
		this.poiDateOfIssue = poiDateOfIssue;
	}
	@XmlElement(name="poiPlaceOfIssue")
	public String getPoiDateOfExpiry() {
		return poiDateOfExpiry;
	}
	public void setPoiDateOfExpiry(String poiDateOfExpiry) {
		this.poiDateOfExpiry = poiDateOfExpiry;
	}
	@XmlElement(name="poiPlaceOfIssue")
	public String getPoiPlaceOfIssue() {
		return poiPlaceOfIssue;
	}
	public void setPoiPlaceOfIssue(String poiPlaceOfIssue) {
		this.poiPlaceOfIssue = poiPlaceOfIssue;
	}
	@XmlElement(name="poaType")
	public String getPoaType() {
		return poaType;
	}
	public void setPoaType(String poaType) {
		this.poaType = poaType;
	}
	@XmlElement(name="poaNumber")
	public String getPoaNumber() {
		return poaNumber;
	}
	public void setPoaNumber(String poaNumber) {
		this.poaNumber = poaNumber;
	}
	@XmlElement(name="poaIssuingAuthority")
	public String getPoaIssuingAuthority() {
		return poaIssuingAuthority;
	}
	public void setPoaIssuingAuthority(String poaIssuingAuthority) {
		this.poaIssuingAuthority = poaIssuingAuthority;
	}
	@XmlElement(name="poaDateOfIssue")
	public String getPoaDateOfIssue() {
		return poaDateOfIssue;
	}
	public void setPoaDateOfIssue(String poaDateOfIssue) {
		this.poaDateOfIssue = poaDateOfIssue;
	}
	@XmlElement(name="poaDateOfExpiry")
	public String getPoaDateOfExpiry() {
		return poaDateOfExpiry;
	}
	public void setPoaDateOfExpiry(String poaDateOfExpiry) {
		this.poaDateOfExpiry = poaDateOfExpiry;
	}
	@XmlElement(name="poaPlaceOfIssue")
	public String getPoaPlaceOfIssue() {
		return poaPlaceOfIssue;
	}
	public void setPoaPlaceOfIssue(String poaPlaceOfIssue) {
		this.poaPlaceOfIssue = poaPlaceOfIssue;
	}
	@XmlElement(name="cspNationalIdentificationCode")
	public String getCspNationalIdentificationCode() {
		return cspNationalIdentificationCode;
	}
	public void setCspNationalIdentificationCode(String cspNationalIdentificationCode) {
		this.cspNationalIdentificationCode = cspNationalIdentificationCode;
	}
	@XmlElement(name="cspCustomerSegment")
	public String getCspCustomerSegment() {
		return cspCustomerSegment;
	}
	public void setCspCustomerSegment(String cspCustomerSegment) {
		this.cspCustomerSegment = cspCustomerSegment;
	}
	@XmlElement(name="amountFirstCashIn")
	public String getAmountFirstCashIn() {
		return amountFirstCashIn;
	}
	public void setAmountFirstCashIn(String amountFirstCashIn) {
		this.amountFirstCashIn = amountFirstCashIn;
	}
	@XmlElement(name="OnboardedByEntityId")
	public String getOnboardedByEntityId() {
		return OnboardedByEntityId;
	}
	public void setOnboardedByEntityId(String onboardedByEntityId) {
		OnboardedByEntityId = onboardedByEntityId;
	}
	@XmlElement(name="regStatus")
	public String getRegStatus() {
		return regStatus;
	}
	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}
	@XmlElement(name="flgInsurance")
	public String getFlgInsurance() {
		return flgInsurance;
	}
	public void setFlgInsurance(String flgInsurance) {
		this.flgInsurance = flgInsurance;
	}
	@XmlElement(name="cardType")
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@XmlElement(name="riskProfile")
	public String getRiskProfile() {
		return riskProfile;
	}
	public void setRiskProfile(String riskProfile) {
		this.riskProfile = riskProfile;
	}
	@XmlElement(name="panAckNumber")
	public String getPanAckNumber() {
		return panAckNumber;
	}
	public void setPanAckNumber(String panAckNumber) {
		this.panAckNumber = panAckNumber;
	}
	@XmlElement(name="incomeAgriculture")
	public String getIncomeAgriculture() {
		return incomeAgriculture;
	}
	public void setIncomeAgriculture(String incomeAgriculture) {
		this.incomeAgriculture = incomeAgriculture;
	}
	@XmlElement(name="incomeNonAgriculture")
	public String getIncomeNonAgriculture() {
		return incomeNonAgriculture;
	}
	public void setIncomeNonAgriculture(String incomeNonAgriculture) {
		this.incomeNonAgriculture = incomeNonAgriculture;
	}
	@XmlElement(name="annualIncome")
	public String getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}
	@XmlElement(name="panStatus")
	public String getPanStatus() {
		return panStatus;
	}
	public void setPanStatus(String panStatus) {
		this.panStatus = panStatus;
	}
	@XmlElement(name="upiStatus")
	public String getUpiStatus() {
		return upiStatus;
	}
	public void setUpiStatus(String upiStatus) {
		this.upiStatus = upiStatus;
	}
	@XmlElement(name="ndsStatus")
	public String getNdsStatus() {
		return ndsStatus;
	}
	public void setNdsStatus(String ndsStatus) {
		this.ndsStatus = ndsStatus;
	}
	@XmlElement(name="mobilityUserType")
	public String getMobilityUserType() {
		return mobilityUserType;
	}
	public void setMobilityUserType(String mobilityUserType) {
		this.mobilityUserType = mobilityUserType;
	}
	@XmlElement(name="circle")
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	@XmlElement(name="sourceOfFunds")
	public String getSourceOfFunds() {
		return sourceOfFunds;
	}
	public void setSourceOfFunds(String sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}
	@XmlElement(name="politicallyExposedPerson")
	public String getPoliticallyExposedPerson() {
		return politicallyExposedPerson;
	}
	public void setPoliticallyExposedPerson(String politicallyExposedPerson) {
		this.politicallyExposedPerson = politicallyExposedPerson;
	}
	@XmlElement(name="flgKYC")
	public String getFlgKYC() {
		return flgKYC;
	}
	public void setFlgKYC(String flgKYC) {
		this.flgKYC = flgKYC;
	}
	@XmlElement(name="emailStatus")
	public String getEmailStatus() {
		return emailStatus;
	}
	public void setEmailStatus(String emailStatus) {
		this.emailStatus = emailStatus;
	}
	@XmlElement(name="eSign")
	public String geteSign() {
		return eSign;
	}
	public void seteSign(String eSign) {
		this.eSign = eSign;
	}
	@XmlElement(name="panFirstName")
	public String getPanFirstName() {
		return panFirstName;
	}
	public void setPanFirstName(String panFirstName) {
		this.panFirstName = panFirstName;
	}
	@XmlElement(name="panSecondName")
	public String getPanSecondName() {
		return panSecondName;
	}
	public void setPanSecondName(String panSecondName) {
		this.panSecondName = panSecondName;
	}
	@XmlElement(name="panLastName")
	public String getPanLastName() {
		return panLastName;
	}
	public void setPanLastName(String panLastName) {
		this.panLastName = panLastName;
	}
	@XmlElement(name="custImeiNo")
	public String getCustImeiNo() {
		return custImeiNo;
	}
	public void setCustImeiNo(String custImeiNo) {
		this.custImeiNo = custImeiNo;
	}
	@XmlElement(name="settlementaccountname")
	public String getSettlementaccountname() {
		return settlementaccountname;
	}
	public void setSettlementaccountname(String settlementaccountname) {
		this.settlementaccountname = settlementaccountname;
	}
	@XmlElement(name="settlementaccountno")
	public String getSettlementaccountno() {
		return settlementaccountno;
	}
	public void setSettlementaccountno(String settlementaccountno) {
		this.settlementaccountno = settlementaccountno;
	}
	@XmlElement(name="settlementifsc")
	public String getSettlementifsc() {
		return settlementifsc;
	}
	public void setSettlementifsc(String settlementifsc) {
		this.settlementifsc = settlementifsc;
	}
	@XmlElement(name="endChannel")
	public String getEndChannel() {
		return endChannel;
	}
	public void setEndChannel(String endChannel) {
		this.endChannel = endChannel;
	}
	@XmlElement(name="customFields1")
	public String getCustomFields1() {
		return customFields1;
	}
	public void setCustomFields1(String customFields1) {
		this.customFields1 = customFields1;
	}
	@XmlElement(name="customFields2")
	public String getCustomFields2() {
		return customFields2;
	}
	public void setCustomFields2(String customFields2) {
		this.customFields2 = customFields2;
	}
	@XmlElement(name="customFields3")
	public String getCustomFields3() {
		return customFields3;
	}
	public void setCustomFields3(String customFields3) {
		this.customFields3 = customFields3;
	}
	@XmlElement(name="customFields4")
	public String getCustomFields4() {
		return customFields4;
	}
	public void setCustomFields4(String customFields4) {
		this.customFields4 = customFields4;
	}
	@XmlElement(name="customFields5")
	public String getCustomFields5() {
		return customFields5;
	}
	public void setCustomFields5(String customFields5) {
		this.customFields5 = customFields5;
	}
	@XmlElement(name="customFields6")
	public String getCustomFields6() {
		return customFields6;
	}
	public void setCustomFields6(String customFields6) {
		this.customFields6 = customFields6;
	}
	@XmlElement(name="customFields7")
	public String getCustomFields7() {
		return customFields7;
	}
	public void setCustomFields7(String customFields7) {
		this.customFields7 = customFields7;
	}
	@XmlElement(name="customFields8")
	public String getCustomFields8() {
		return customFields8;
	}
	public void setCustomFields8(String customFields8) {
		this.customFields8 = customFields8;
	}
	@XmlElement(name="customFields9")
	public String getCustomFields9() {
		return customFields9;
	}
	public void setCustomFields9(String customFields9) {
		this.customFields9 = customFields9;
	}
	@XmlElement(name="customFields10")
	public String getCustomFields10() {
		return customFields10;
	}
	public void setCustomFields10(String customFields10) {
		this.customFields10 = customFields10;
	}
	@XmlElement(name="customFields11")
	public String getCustomFields11() {
		return customFields11;
	}
	public void setCustomFields11(String customFields11) {
		this.customFields11 = customFields11;
	}
	@XmlElement(name="customFields12")
	public String getCustomFields12() {
		return customFields12;
	}
	public void setCustomFields12(String customFields12) {
		this.customFields12 = customFields12;
	}
	@XmlElement(name="customFields13")
	public String getCustomFields13() {
		return customFields13;
	}
	public void setCustomFields13(String customFields13) {
		this.customFields13 = customFields13;
	}
	@XmlElement(name="customFields14")
	public String getCustomFields14() {
		return customFields14;
	}
	public void setCustomFields14(String customFields14) {
		this.customFields14 = customFields14;
	}
	@XmlElement(name="customFields15")
	public String getCustomFields15() {
		return customFields15;
	}
	public void setCustomFields15(String customFields15) {
		this.customFields15 = customFields15;
	}
	
	

}
