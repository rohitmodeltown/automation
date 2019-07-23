package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class scmTypeAdditionalDTO {
	
	private String localDistrict;
	private String permanentDistrict;
	private String parentType;
	private String parentID;
	private String shopname;
	private String shopDisplayname;
	private ScmShopAddress ScmShopAddress;
	private String shopDistrict;
	private String shoplat;
	private String shoplang;
	private String zonename;
	private String gstnumber;
	private String tannumber;
	private String gstCategory;
	private String taxnumber;
	private String businessregno;
	private String legalstatus;
	private String jurisdiction;
	private String referenceno;
	private String servicetaxcode;
	private String settlemenfrequency;
	private String settlementaccountname;
	private String settlementaccounttype;
	private String settlementaccountno;
	private String settlementifsc;
	private String formid;
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
	private String language;
	private String circle;
	private String authorisedSignatorySalutation;
	private String authorisedSignatoryFirstName;
	private String authorisedSignatorySecondName;
	private String authorisedSignatoryLastName;
	private String authorisedSignatoryDOB;
	private String settlementMode;
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
	
	
	
	@XmlElement(name="parentType")
	public String getParentType() {
		return parentType;
	}
	public void setParentType(String parentType) {
		this.parentType = parentType;
	}
	@XmlElement(name="ScmShopAddress")
	public ScmShopAddress getScmShopAddress() {
		return ScmShopAddress;
	}
	public void setScmShopAddress(ScmShopAddress scmShopAddress) {
		this.ScmShopAddress = scmShopAddress;
	}
	@XmlElement(name="gstCategory")
	public String getGstCategory() {
		return gstCategory;
	}
	public void setGstCategory(String gstCategory) {
		this.gstCategory = gstCategory;
	}
	@XmlElement(name="language")
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@XmlElement(name="settlementMode")
	public String getSettlementMode() {
		return settlementMode;
	}
	public void setSettlementMode(String settlementMode) {
		this.settlementMode = settlementMode;
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
	
	@XmlElement(name="parentID")
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
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
	@XmlElement(name="formid")
	public String getFormid() {
		return formid;
	}
	public void setFormid(String formid) {
		this.formid = formid;
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
	
	@XmlElement(name="circle")
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
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
