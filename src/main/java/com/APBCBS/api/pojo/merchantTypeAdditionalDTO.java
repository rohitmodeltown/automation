package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class merchantTypeAdditionalDTO {
	
	private String category;
	private String localDistrict;
	private String permanentDistrict;
	private String merchantgroupid;
	private String parentID;
	private String permissiblechildlevels;
	private String merchanttradevalue1;
	private String merchanttradevalue2;
	private String merchanttradevalue3;
	private String merchanttradevalue4;
	private String merchanttradevalue5;
	private String merchanttradevalue6;
	private String additionalmobilecom1;
	private String additionalemailcom1;
	private String additionalmobilecom2;
	private String additionalemailcom2;
	private String additionalmobilecom3;
	private String additionalemailcom3;
	private String additionalmobilecom4;
	private String additionalemailcom4;
	private String additionalmobilecom5;
	private String additionalemailcom5;
	private String agentID;
	private String riskProfile;
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
	private MerchantShopaddress MerchantShopaddress;
	private String shopDistrict;
	private String shoplat;
	private String shoplang;
	private String zonename;
	private String gstnumber;
	private String tannumber;
	private String tinnumber;
	private String taxnumber;
	private String businessregno;
	private String legalstatus;
	private String jurisdiction;
	private String referenceno;
	private String servicetaxcode;
	private String settlemenfrequency;
	private String noOfSettleAccountPermissible;
	private String settlementaccountname;
	private String settlementaccounttype;
	private String settlmentaccountbranchaddress;
	private String settlementaccountno;
	private String settlementifsc;
	//private String nextsettlmentdate;
	private String msfprinciple;
	private String qrstring;
	private String formid;
	private String upiStatus;
	private String shopname;
	private String shopDisplayname;
	private String isCreateChild;
	private String isSettlementPermissible;
	private String isChildSettlementSetPermissible;
	private String isTransactionPermissible;
	private String isChildTransactionViewPermissible;
	private String isDeleteChild;
	private String isProcessRefund;
	private String sendTransactionComToSelf;
	private String transactionComAlertTypeSelf;
	private String sendTransactionComToOthers;
	private String transactionComAlertTypeOthers;
	private String isTdsApplicable;
	private String tdsPercentValue;
	private String isRevenueSharing;
	private String revenuePercentValue;
	private String isServiceChargeSharing;
	private String scPercentValue;
	private String authorisedSignatorySalutation;
	private String authorisedSignatoryFirstName;
	private String authorisedSignatorySecondName;
	private String authorisedSignatoryLastName;
	private String authorisedSignatoryDOB;
	private String flagB2B;
	private String gdsApplicable;
	private String circle;
	private String nextsettlementdate; 
	private String lastsettlementdate;
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
	
	/*---A049 API-----*/
	private String gstSharingApplicable;
	private String gstSharingPercentage;
	private String flagSettlementAcctChangeCounter;
	
	@XmlElement(name="category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	@XmlElement(name="merchantgroupid")
	public String getMerchantgroupid() {
		return merchantgroupid;
	}
	public void setMerchantgroupid(String merchantgroupid) {
		this.merchantgroupid = merchantgroupid;
	}
	@XmlElement(name="parentID")
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	@XmlElement(name="permissiblechildlevels")
	public String getPermissiblechildlevels() {
		return permissiblechildlevels;
	}
	public void setPermissiblechildlevels(String permissiblechildlevels) {
		this.permissiblechildlevels = permissiblechildlevels;
	}
	@XmlElement(name="merchanttradevalue1")
	public String getMerchanttradevalue1() {
		return merchanttradevalue1;
	}
	public void setMerchanttradevalue1(String merchanttradevalue1) {
		this.merchanttradevalue1 = merchanttradevalue1;
	}
	@XmlElement(name="merchanttradevalue2")
	public String getMerchanttradevalue2() {
		return merchanttradevalue2;
	}
	public void setMerchanttradevalue2(String merchanttradevalue2) {
		this.merchanttradevalue2 = merchanttradevalue2;
	}
	@XmlElement(name="merchanttradevalue3")
	public String getMerchanttradevalue3() {
		return merchanttradevalue3;
	}
	public void setMerchanttradevalue3(String merchanttradevalue3) {
		this.merchanttradevalue3 = merchanttradevalue3;
	}
	@XmlElement(name="merchanttradevalue4")
	public String getMerchanttradevalue4() {
		return merchanttradevalue4;
	}
	public void setMerchanttradevalue4(String merchanttradevalue4) {
		this.merchanttradevalue4 = merchanttradevalue4;
	}
	@XmlElement(name="merchanttradevalue5")
	public String getMerchanttradevalue5() {
		return merchanttradevalue5;
	}
	public void setMerchanttradevalue5(String merchanttradevalue5) {
		this.merchanttradevalue5 = merchanttradevalue5;
	}
	@XmlElement(name="merchanttradevalue6")
	public String getMerchanttradevalue6() {
		return merchanttradevalue6;
	}
	public void setMerchanttradevalue6(String merchanttradevalue6) {
		this.merchanttradevalue6 = merchanttradevalue6;
	}
	@XmlElement(name="additionalmobilecom1")
	public String getAdditionalmobilecom1() {
		return additionalmobilecom1;
	}
	public void setAdditionalmobilecom1(String additionalmobilecom1) {
		this.additionalmobilecom1 = additionalmobilecom1;
	}
	@XmlElement(name="additionalemailcom1")
	public String getAdditionalemailcom1() {
		return additionalemailcom1;
	}
	public void setAdditionalemailcom1(String additionalemailcom1) {
		this.additionalemailcom1 = additionalemailcom1;
	}
	@XmlElement(name="additionalmobilecom2")
	public String getAdditionalmobilecom2() {
		return additionalmobilecom2;
	}
	public void setAdditionalmobilecom2(String additionalmobilecom2) {
		this.additionalmobilecom2 = additionalmobilecom2;
	}
	@XmlElement(name="additionalemailcom2")
	public String getAdditionalemailcom2() {
		return additionalemailcom2;
	}
	public void setAdditionalemailcom2(String additionalemailcom2) {
		this.additionalemailcom2 = additionalemailcom2;
	}
	@XmlElement(name="additionalmobilecom3")
	public String getAdditionalmobilecom3() {
		return additionalmobilecom3;
	}
	public void setAdditionalmobilecom3(String additionalmobilecom3) {
		this.additionalmobilecom3 = additionalmobilecom3;
	}
	@XmlElement(name="additionalemailcom3")
	public String getAdditionalemailcom3() {
		return additionalemailcom3;
	}
	public void setAdditionalemailcom3(String additionalemailcom3) {
		this.additionalemailcom3 = additionalemailcom3;
	}
	@XmlElement(name="additionalmobilecom4")
	public String getAdditionalmobilecom4() {
		return additionalmobilecom4;
	}
	public void setAdditionalmobilecom4(String additionalmobilecom4) {
		this.additionalmobilecom4 = additionalmobilecom4;
	}
	@XmlElement(name="additionalemailcom4")
	public String getAdditionalemailcom4() {
		return additionalemailcom4;
	}
	public void setAdditionalemailcom4(String additionalemailcom4) {
		this.additionalemailcom4 = additionalemailcom4;
	}
	@XmlElement(name="additionalmobilecom5")
	public String getAdditionalmobilecom5() {
		return additionalmobilecom5;
	}
	public void setAdditionalmobilecom5(String additionalmobilecom5) {
		this.additionalmobilecom5 = additionalmobilecom5;
	}
	@XmlElement(name="additionalemailcom5")
	public String getAdditionalemailcom5() {
		return additionalemailcom5;
	}
	public void setAdditionalemailcom5(String additionalemailcom5) {
		this.additionalemailcom5 = additionalemailcom5;
	}
	@XmlElement(name="agentID")
	public String getAgentID() {
		return agentID;
	}
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	@XmlElement(name="riskProfile")
	public String getRiskProfile() {
		return riskProfile;
	}
	public void setRiskProfile(String riskProfile) {
		this.riskProfile = riskProfile;
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
	@XmlElement(name="poiDateOfIssue")
	public String getPoiDateOfIssue() {
		return poiDateOfIssue;
	}
	public void setPoiDateOfIssue(String poiDateOfIssue) {
		this.poiDateOfIssue = poiDateOfIssue;
	}
	@XmlElement(name="poiDateOfExpiry")
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
	@XmlElement(name="MerchantShopaddress")
	public MerchantShopaddress getMerchantShopaddress() {
		return MerchantShopaddress;
	}
	public void setMerchantShopaddress(MerchantShopaddress merchantShopaddress) {
		this.MerchantShopaddress = merchantShopaddress;
	}
	@XmlElement(name="shopDistrict")
	public String getShopDistrict() {
		return shopDistrict;
	}
	public void setShopDistrict(String shopDistrict) {
		this.shopDistrict = shopDistrict;
	}
	@XmlElement(name="shoplat")
	public String getShoplat() {
		return shoplat;
	}
	public void setShoplat(String shoplat) {
		this.shoplat = shoplat;
	}
	@XmlElement(name="shoplang")
	public String getShoplang() {
		return shoplang;
	}
	public void setShoplang(String shoplang) {
		this.shoplang = shoplang;
	}
	@XmlElement(name="zonename")
	public String getZonename() {
		return zonename;
	}
	public void setZonename(String zonename) {
		this.zonename = zonename;
	}
	@XmlElement(name="gstnumber")
	public String getGstnumber() {
		return gstnumber;
	}
	public void setGstnumber(String gstnumber) {
		this.gstnumber = gstnumber;
	}
	@XmlElement(name="tannumber")
	public String getTannumber() {
		return tannumber;
	}
	public void setTannumber(String tannumber) {
		this.tannumber = tannumber;
	}
	@XmlElement(name="tinnumber")
	public String getTinnumber() {
		return tinnumber;
	}
	public void setTinnumber(String tinnumber) {
		this.tinnumber = tinnumber;
	}
	@XmlElement(name="taxnumber")
	public String getTaxnumber() {
		return taxnumber;
	}
	public void setTaxnumber(String taxnumber) {
		this.taxnumber = taxnumber;
	}
	@XmlElement(name="businessregno")
	public String getBusinessregno() {
		return businessregno;
	}
	public void setBusinessregno(String businessregno) {
		this.businessregno = businessregno;
	}
	@XmlElement(name="legalstatus")
	public String getLegalstatus() {
		return legalstatus;
	}
	public void setLegalstatus(String legalstatus) {
		this.legalstatus = legalstatus;
	}
	@XmlElement(name="jurisdiction")
	public String getJurisdiction() {
		return jurisdiction;
	}
	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}
	@XmlElement(name="referenceno")
	public String getReferenceno() {
		return referenceno;
	}
	public void setReferenceno(String referenceno) {
		this.referenceno = referenceno;
	}
	@XmlElement(name="servicetaxcode")
	public String getServicetaxcode() {
		return servicetaxcode;
	}
	public void setServicetaxcode(String servicetaxcode) {
		this.servicetaxcode = servicetaxcode;
	}
	@XmlElement(name="settlemenfrequency")
	public String getSettlemenfrequency() {
		return settlemenfrequency;
	}
	public void setSettlemenfrequency(String settlemenfrequency) {
		this.settlemenfrequency = settlemenfrequency;
	}
	@XmlElement(name="noOfSettleAccountPermissible")
	public String getNoOfSettleAccountPermissible() {
		return noOfSettleAccountPermissible;
	}
	public void setNoOfSettleAccountPermissible(String noOfSettleAccountPermissible) {
		this.noOfSettleAccountPermissible = noOfSettleAccountPermissible;
	}
	@XmlElement(name="settlementaccountname")
	public String getSettlementaccountname() {
		return settlementaccountname;
	}
	public void setSettlementaccountname(String settlementaccountname) {
		this.settlementaccountname = settlementaccountname;
	}
	@XmlElement(name="settlementaccounttype")
	public String getSettlementaccounttype() {
		return settlementaccounttype;
	}
	public void setSettlementaccounttype(String settlementaccounttype) {
		this.settlementaccounttype = settlementaccounttype;
	}
	@XmlElement(name="settlmentaccountbranchaddress")
	public String getSettlmentaccountbranchaddress() {
		return settlmentaccountbranchaddress;
	}
	public void setSettlmentaccountbranchaddress(String settlmentaccountbranchaddress) {
		this.settlmentaccountbranchaddress = settlmentaccountbranchaddress;
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
/*	@XmlElement(name="nextsettlmentdate")
	public String getNextsettlmentdate() {
		return nextsettlmentdate;
	}
	public void setNextsettlmentdate(String nextsettlmentdate) {
		this.nextsettlmentdate = nextsettlmentdate;
	}*/
	@XmlElement(name="msfprinciple")
	public String getMsfprinciple() {
		return msfprinciple;
	}
	public void setMsfprinciple(String msfprinciple) {
		this.msfprinciple = msfprinciple;
	}
	@XmlElement(name="qrstring")
	public String getQrstring() {
		return qrstring;
	}
	public void setQrstring(String qrstring) {
		this.qrstring = qrstring;
	}
	@XmlElement(name="formid")
	public String getFormid() {
		return formid;
	}
	public void setFormid(String formid) {
		this.formid = formid;
	}
	@XmlElement(name="upiStatus")
	public String getUpiStatus() {
		return upiStatus;
	}
	public void setUpiStatus(String upiStatus) {
		this.upiStatus = upiStatus;
	}
	@XmlElement(name="shopname")
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	@XmlElement(name="shopDisplayname")
	public String getShopDisplayname() {
		return shopDisplayname;
	}
	public void setShopDisplayname(String shopDisplayname) {
		this.shopDisplayname = shopDisplayname;
	}
	@XmlElement(name="isCreateChild")
	public String getIsCreateChild() {
		return isCreateChild;
	}
	public void setIsCreateChild(String isCreateChild) {
		this.isCreateChild = isCreateChild;
	}
	@XmlElement(name="isSettlementPermissible")
	public String getIsSettlementPermissible() {
		return isSettlementPermissible;
	}
	public void setIsSettlementPermissible(String isSettlementPermissible) {
		this.isSettlementPermissible = isSettlementPermissible;
	}
	@XmlElement(name="isChildSettlementSetPermissible")
	public String getIsChildSettlementSetPermissible() {
		return isChildSettlementSetPermissible;
	}
	public void setIsChildSettlementSetPermissible(String isChildSettlementSetPermissible) {
		this.isChildSettlementSetPermissible = isChildSettlementSetPermissible;
	}
	@XmlElement(name="isTransactionPermissible")
	public String getIsTransactionPermissible() {
		return isTransactionPermissible;
	}
	public void setIsTransactionPermissible(String isTransactionPermissible) {
		this.isTransactionPermissible = isTransactionPermissible;
	}
	@XmlElement(name="isChildTransactionViewPermissible")
	public String getIsChildTransactionViewPermissible() {
		return isChildTransactionViewPermissible;
	}
	public void setIsChildTransactionViewPermissible(String isChildTransactionViewPermissible) {
		this.isChildTransactionViewPermissible = isChildTransactionViewPermissible;
	}
	@XmlElement(name="isDeleteChild")
	public String getIsDeleteChild() {
		return isDeleteChild;
	}
	public void setIsDeleteChild(String isDeleteChild) {
		this.isDeleteChild = isDeleteChild;
	}
	@XmlElement(name="isProcessRefund")
	public String getIsProcessRefund() {
		return isProcessRefund;
	}
	public void setIsProcessRefund(String isProcessRefund) {
		this.isProcessRefund = isProcessRefund;
	}
	@XmlElement(name="sendTransactionComToSelf")
	public String getSendTransactionComToSelf() {
		return sendTransactionComToSelf;
	}
	public void setSendTransactionComToSelf(String sendTransactionComToSelf) {
		this.sendTransactionComToSelf = sendTransactionComToSelf;
	}
	@XmlElement(name="transactionComAlertTypeSelf")
	public String getTransactionComAlertTypeSelf() {
		return transactionComAlertTypeSelf;
	}
	public void setTransactionComAlertTypeSelf(String transactionComAlertTypeSelf) {
		this.transactionComAlertTypeSelf = transactionComAlertTypeSelf;
	}
	@XmlElement(name="sendTransactionComToOthers")
	public String getSendTransactionComToOthers() {
		return sendTransactionComToOthers;
	}
	public void setSendTransactionComToOthers(String sendTransactionComToOthers) {
		this.sendTransactionComToOthers = sendTransactionComToOthers;
	}
	@XmlElement(name="transactionComAlertTypeOthers")
	public String getTransactionComAlertTypeOthers() {
		return transactionComAlertTypeOthers;
	}
	public void setTransactionComAlertTypeOthers(String transactionComAlertTypeOthers) {
		this.transactionComAlertTypeOthers = transactionComAlertTypeOthers;
	}
	@XmlElement(name="isTdsApplicable")
	public String getIsTdsApplicable() {
		return isTdsApplicable;
	}
	public void setIsTdsApplicable(String isTdsApplicable) {
		this.isTdsApplicable = isTdsApplicable;
	}
	@XmlElement(name="tdsPercentValue")
	public String getTdsPercentValue() {
		return tdsPercentValue;
	}
	public void setTdsPercentValue(String tdsPercentValue) {
		this.tdsPercentValue = tdsPercentValue;
	}
	@XmlElement(name="isRevenueSharing")
	public String getIsRevenueSharing() {
		return isRevenueSharing;
	}
	public void setIsRevenueSharing(String isRevenueSharing) {
		this.isRevenueSharing = isRevenueSharing;
	}
	@XmlElement(name="revenuePercentValue")
	public String getRevenuePercentValue() {
		return revenuePercentValue;
	}
	public void setRevenuePercentValue(String revenuePercentValue) {
		this.revenuePercentValue = revenuePercentValue;
	}
	@XmlElement(name="isServiceChargeSharing")
	public String getIsServiceChargeSharing() {
		return isServiceChargeSharing;
	}
	public void setIsServiceChargeSharing(String isServiceChargeSharing) {
		this.isServiceChargeSharing = isServiceChargeSharing;
	}
	@XmlElement(name="scPercentValue")
	public String getScPercentValue() {
		return scPercentValue;
	}
	public void setScPercentValue(String scPercentValue) {
		this.scPercentValue = scPercentValue;
	}
	@XmlElement(name="authorisedSignatorySalutation")
	public String getAuthorisedSignatorySalutation() {
		return authorisedSignatorySalutation;
	}
	public void setAuthorisedSignatorySalutation(String authorisedSignatorySalutation) {
		this.authorisedSignatorySalutation = authorisedSignatorySalutation;
	}
	@XmlElement(name="authorisedSignatoryFirstName")
	public String getAuthorisedSignatoryFirstName() {
		return authorisedSignatoryFirstName;
	}
	public void setAuthorisedSignatoryFirstName(String authorisedSignatoryFirstName) {
		this.authorisedSignatoryFirstName = authorisedSignatoryFirstName;
	}
	@XmlElement(name="authorisedSignatorySecondName")
	public String getAuthorisedSignatorySecondName() {
		return authorisedSignatorySecondName;
	}
	public void setAuthorisedSignatorySecondName(String authorisedSignatorySecondName) {
		this.authorisedSignatorySecondName = authorisedSignatorySecondName;
	}
	@XmlElement(name="authorisedSignatoryLastName")
	public String getAuthorisedSignatoryLastName() {
		return authorisedSignatoryLastName;
	}
	public void setAuthorisedSignatoryLastName(String authorisedSignatoryLastName) {
		this.authorisedSignatoryLastName = authorisedSignatoryLastName;
	}
	@XmlElement(name="authorisedSignatoryDOB")
	public String getAuthorisedSignatoryDOB() {
		return authorisedSignatoryDOB;
	}
	public void setAuthorisedSignatoryDOB(String authorisedSignatoryDOB) {
		this.authorisedSignatoryDOB = authorisedSignatoryDOB;
	}
	@XmlElement(name="flagB2B")
	public String getFlagB2B() {
		return flagB2B;
	}
	public void setFlagB2B(String flagB2B) {
		this.flagB2B = flagB2B;
	}
	@XmlElement(name="gdsApplicable")
	public String getGdsApplicable() {
		return gdsApplicable;
	}
	public void setGdsApplicable(String gdsApplicable) {
		this.gdsApplicable = gdsApplicable;
	}
	@XmlElement(name="circle")
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	@XmlElement(name="nextsettlementdate")
	public String getNextsettlementdate() {
		return nextsettlementdate;
	}
	public void setNextsettlementdate(String nextsettlementdate) {
		this.nextsettlementdate = nextsettlementdate;
	}
	@XmlElement(name="lastsettlementdate")
	public String getLastsettlementdate() {
		return lastsettlementdate;
	}
	public void setLastsettlementdate(String lastsettlementdate) {
		this.lastsettlementdate = lastsettlementdate;
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
	
	@XmlElement(name="gstSharingApplicable")
	public String getGstSharingApplicable() {
		return gstSharingApplicable;
	}
	public void setGstSharingApplicable(String gstSharingApplicable) {
		this.gstSharingApplicable = gstSharingApplicable;
	}
	@XmlElement(name="gstSharingPercentage")
	public String getGstSharingPercentage() {
		return gstSharingPercentage;
	}
	public void setGstSharingPercentage(String gstSharingPercentage) {
		this.gstSharingPercentage = gstSharingPercentage;
	}
	@XmlElement(name="flagSettlementAcctChangeCounter")
	public String getFlagSettlementAcctChangeCounter() {
		return flagSettlementAcctChangeCounter;
	}
	public void setFlagSettlementAcctChangeCounter(String flagSettlementAcctChangeCounter) {
		this.flagSettlementAcctChangeCounter = flagSettlementAcctChangeCounter;
	}
	
}
