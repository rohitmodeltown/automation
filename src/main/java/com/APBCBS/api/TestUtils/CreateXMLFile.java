package com.APBCBS.api.TestUtils;

import java.io.File;
import java.io.StringWriter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.APBCBS.api.ApiClasses.A031API;
import com.APBCBS.api.Setup.RestAssuredSetUp;
import com.APBCBS.api.Setup.TestSetup;
import com.APBCBS.api.pojo.AirtelExtAddModifyNomineeRequestDTO;
import com.APBCBS.api.pojo.AirtelExtSupplyChainHierarchyCheckRequestDTO;
import com.APBCBS.api.pojo.CorporateCustomerDTO;
import com.APBCBS.api.pojo.CorporateLocaladdress;
import com.APBCBS.api.pojo.CorporateName;
import com.APBCBS.api.pojo.CorporatePermanentaddress;
import com.APBCBS.api.pojo.CustomerAccountNomineeDTO;
import com.APBCBS.api.pojo.CustomerDataRequestDTO;
import com.APBCBS.api.pojo.CustomerTypeAdditionalDTO;
import com.APBCBS.api.pojo.IndividualCustomerDTO;
import com.APBCBS.api.pojo.IndividualLocaladdress;
import com.APBCBS.api.pojo.IndividualName;
import com.APBCBS.api.pojo.IndividualPermanentaddress;
import com.APBCBS.api.pojo.MerchantShopaddress;
import com.APBCBS.api.pojo.ScmShopAddress;
import com.APBCBS.api.pojo.SessionContext;
import com.APBCBS.api.pojo.accountNomineeDTO;
import com.APBCBS.api.pojo.accountOpenDTO;
import com.APBCBS.api.pojo.input;
import com.APBCBS.api.pojo.merchantTypeAdditionalDTO;
import com.APBCBS.api.pojo.scmTypeAdditionalDTO;
import com.APBCBS.api.pojo.smsDetails;
import com.APBCBS.api.pojo.superContext;

public class CreateXMLFile extends TestSetup {
	
	
	public String createXML(Hashtable<String, String> map) throws JAXBException
	{
		
		input apiObj= new input();
		SessionContext sContext = new SessionContext();
		superContext supContext = new superContext();
		IndividualCustomerDTO individualCustomerDTO = new IndividualCustomerDTO();
		IndividualLocaladdress individualLocaladdress = new IndividualLocaladdress();
		IndividualPermanentaddress individualPermanentaddress = new IndividualPermanentaddress();
		IndividualName individualName = new IndividualName();
		merchantTypeAdditionalDTO mTypeAdditionalDTO = new merchantTypeAdditionalDTO();
		MerchantShopaddress merchantShopaddress = new MerchantShopaddress();
		accountOpenDTO aOpenDTO = new accountOpenDTO();
		smsDetails sDetails = new smsDetails();
		CustomerTypeAdditionalDTO ctaDTO = new CustomerTypeAdditionalDTO();
		accountNomineeDTO aNDTO = new accountNomineeDTO();
		scmTypeAdditionalDTO scm = new scmTypeAdditionalDTO();
		ScmShopAddress scms = new ScmShopAddress();
		CorporateCustomerDTO ccd = new CorporateCustomerDTO();
		CorporateLocaladdress ccl = new CorporateLocaladdress();
		CorporatePermanentaddress ccp = new CorporatePermanentaddress();
		CorporateName cn = new CorporateName();
		AirtelExtSupplyChainHierarchyCheckRequestDTO airtel = new AirtelExtSupplyChainHierarchyCheckRequestDTO();
		CustomerDataRequestDTO cdr = new CustomerDataRequestDTO();
		RestAssuredSetUp RAS = new RestAssuredSetUp();
		A031API a031 = new A031API();
		AirtelExtAddModifyNomineeRequestDTO modifyNominee = new AirtelExtAddModifyNomineeRequestDTO();
		CustomerAccountNomineeDTO cus_acc_Nom = new CustomerAccountNomineeDTO();
		DBConnectionUtil dbconn= new DBConnectionUtil();
		
		
		
		Set keys = map.keySet();
        Iterator itr = keys.iterator();
 
        String key;
        String value;
        while(itr.hasNext())
        {
            key = (String)itr.next();
            value = (String)map.get(key);
            //System.out.println(key + " - "+ value);
            if(key.equals("BankCode"))
            {
            	
            	sContext.setBankCode(value);
            	apiObj.setSessionContext(sContext);
            }else if(key.equals("Channel"))
            {
            	sContext.setChannel(value);
            }else if(key.equals("ExternalReferenceNo"))
            {
            	sContext.setExternalReferenceNo(RAS.generateRandomNumber());
            }else if(key.equals("ServiceCode"))
            {
            	sContext.setServiceCode(value);
            }else if(key.equals("TransactionBranch"))
            {
            	sContext.setTransactionBranch(value);
            }else if(key.equals("UserId"))
            {
            	sContext.setUserId(value);
            }else if(key.equals("ExternalBatchNumber"))
            {
            	sContext.setExternalBatchNumber(value);
            }else if(key.equals("ExternalSystemAuditTrailNumber"))
            {
            	sContext.setExternalSystemAuditTrailNumber(value);
            }else if(key.equals("LocalDateTimeText"))
            {
            	sContext.setLocalDateTimeText(value);
            }else if(key.equals("sOriginalReferenceNo"))
            {
            	sContext.setOriginalReferenceNo(value);
            }else if(key.equals("OverridenWarnings"))
            {
            	sContext.setOverridenWarnings(value);
            }else if(key.equals("PostingDateText"))
            {
            	sContext.setPostingDateText(value);
            }else if(key.equals("SessionTicket"))
            {
            	sContext.setSessionTicket(value);
            }else if(key.equals("UserReferenceNumber"))
            {
            	sContext.setUserReferenceNumber(value);
            }else if(key.equals("ValueDateText"))
            {
            	sContext.setValueDateText(value);
            }else if(key.equals("AccountID"))
            {
            	apiObj.setAccountID(value);
            }else if(key.equals("AccountStatusOption"))
            { 
            	apiObj.setAccountStatusOption(value);
            }else if(key.equals("ReasonCode"))
            {
            	apiObj.setReasonCode(value);
            }else if(key.equals("CustNationalIdentificationCode"))
            {
            	apiObj.setCustNationalIdentificationCode(value);
            }else if(key.equals("ProductCode"))
            {
            	apiObj.setProductCode(value);
            }else if(key.equals("CustomerSegment"))
            {
            	apiObj.setCustomerSegment(value);
            }else if(key.equals("PrimaryPassword"))
            {
            	supContext.setPrimaryPassword(value);
            	sContext.setSupercontext(supContext);
            }else if(key.equals("SupUserId"))
            {
            	supContext.setUserId(value);
            	//sContext.setSupercontext(supContext);
            }else if(key.equals("CustomerType"))
            {
            	apiObj.setCustomerType(value);
            }else if(key.equals("CustomerID"))
            {
            	apiObj.setCustomerID(value);
            }else if(key.equals("CustomerNationalIdentificationCode"))
            {
            	apiObj.setCustomerNationalIdentificationCode(value);
            }else if(key.equals("transactionType"))
            {
            	apiObj.setTransactionType(value);
            }else if(key.equals("fromAccount"))
            {
            	apiObj.setFromAccount(value);;
            }else if(key.equals("fromCustNationalIdentificationCode"))
            {
            	apiObj.setFromCustNationalIdentificationCode(value);
            }else if(key.equals("fromCustomerSegment"))
            {
            	apiObj.setFromCustomerSegment(value);
            }else if(key.equals("FromProductCode"))
            {
            	apiObj.setFromProductCode(value);
            }else if(key.equals("txnCCY"))
            {
            	apiObj.setTxnCCY(value);
            }else if(key.equals("toAccount"))
            {
            	apiObj.setToAccount(value);
            }else if(key.equals("toCustNationalIdentificationCode"))
            {
            	apiObj.setToCustNationalIdentificationCode(value);
            }else if(key.equals("toCustomerSegment"))
            {
            	apiObj.setToCustomerSegment(value);
            }else if(key.equals("ToProductCode"))
            {
            	apiObj.setToProductCode(value);
            }else if(key.equals("txnAmount"))
            {
            	apiObj.setTxnAmount(value);
            }else if(key.equals("DrNarrative"))
            {
            	apiObj.setDrNarrative(value);
            }else if(key.equals("CrNarrative"))
            {
            	apiObj.setCrNarrative(value);
            }else if(key.equals("FromSMSFlag"))
            {
            	apiObj.setFromSMSFlag(value);
            }else if(key.equals("FromSMSAddition"))
            {
            	apiObj.setFromSMSAddition(value);
            }else if(key.equals("ToSMSFlag"))
            {
            	apiObj.setToSMSFlag(value);
            }else if(key.equals("ToSMSAddition"))
            {
            	apiObj.setToSMSAddition(value);
            }else if(key.equals("onBehalfNationalIdentificationCode"))
            {
            	apiObj.setOnBehalfNationalIdentificationCode(value);
            }else if(key.equals("onBehalfCustomerName"))
            {
            	apiObj.setOnBehalfCustomerName(value);
            }else if(key.equals("differentialChargingParam1"))
            {
            	apiObj.setDifferentialChargingParam1(value);
            }else if(key.equals("differentialChargingParam2"))
            {
            	apiObj.setDifferentialChargingParam2(value);
            }else if(key.equals("differentialChargingParam3"))
            {
            	apiObj.setDifferentialChargingParam3(value);
            }else if(key.equals("AddtionalField1"))
            {
            	apiObj.setAddtionalField1(value);
            }else if(key.equals("AddtionalField2"))
            {
            	apiObj.setAddtionalField2(value);
            }else if(key.equals("OriginalReferenceNo"))
            {
            	apiObj.setOriginalReferenceNo(value);
            }else if(key.equals("MisClass"))/*A046 API*/
            {
            	apiObj.setMisClass(value);
            }else if(key.equals("MisCode"))
            {
            	apiObj.setMisCode(value);
            }else if(key.equals("CustomerClass"))
            {
            	apiObj.setCustomerClass(value);
            }else if(key.equals("IndividualDTOsex"))
            {
            	individualCustomerDTO.setSex(value);
            	apiObj.setIndividualCustomerDTO(individualCustomerDTO);
            }else if(key.equals("IndividualDTOmaritalStatus"))
            {
            	individualCustomerDTO.setMaritalStatus(value);
            }else if(key.equals("IndividualDTOprofessionCode"))
            {
            	individualCustomerDTO.setProfessionCode(value);
            }else if(key.equals("IndividualDTOisStaff"))
            {
            	individualCustomerDTO.setIsStaff(value);
            }else if(key.equals("IndividualDTOemployeeId"))
            {
            	individualCustomerDTO.setEmployeeId(value);
            }else if(key.equals("IndividualDTOcustomerEducation"))
            {
            	individualCustomerDTO.setCustomerEducation(value);
            }else if(key.equals("IndividualDTOmotherMaidenName"))
            {
            	individualCustomerDTO.setMotherMaidenName(value);
            }else if(key.equals("IndividualDTOLocalAddCity"))
            {
            	individualLocaladdress.setCity(value);
            	individualCustomerDTO.setIndividualLocaladdress(individualLocaladdress);
            }else if(key.equals("IndividualDTOLocalAddCountry"))
            {
            	individualLocaladdress.setCountry(value);
            }else if(key.equals("IndividualDTOLocalAddLine1"))
            {
            	individualLocaladdress.setLine1(value);
            }else if(key.equals("IndividualDTOLocalAddLine2"))
            {
            	individualLocaladdress.setLine2(value);
            }else if(key.equals("IndividualDTOLocalAddLine3"))
            {
            	individualLocaladdress.setLine3(value);
            }else if(key.equals("IndividualDTOLocalAddLine4"))
            {
            	individualLocaladdress.setLine4(value);
            }else if(key.equals("IndividualDTOLocalAddState"))
            {
            	individualLocaladdress.setState(value);
            }else if(key.equals("IndividualDTOLocalAddZip"))
            {
            	individualLocaladdress.setZip(value);
            }else if(key.equals("IndividualDTOPermanentAddCity"))
            {
            	individualPermanentaddress.setCity(value);
            	individualCustomerDTO.setIndividualPermanentaddress(individualPermanentaddress);
            }else if(key.equals("IndividualDTOPermanentAddCountry"))
            {
            	individualPermanentaddress.setCountry(value);
            }else if(key.equals("IndividualDTOPermanentAddLine1"))
            {
            	individualPermanentaddress.setLine1(value);
            }else if(key.equals("IndividualDTOPermanentAddLine2"))
            {
            	individualPermanentaddress.setLine2(value);
            }else if(key.equals("IndividualDTOPermanentAddLine3"))
            {
            	individualPermanentaddress.setLine3(value);
            }else if(key.equals("IndividualDTOPermanentAddLine4"))
            {
            	individualPermanentaddress.setLine4(value);
            }else if(key.equals("IndividualDTOPermanentAddState"))
            {
            	individualPermanentaddress.setState(value);;
            }else if(key.equals("IndividualDTOPermanentAddZip"))
            {
            	individualPermanentaddress.setZip(value);;
            }else if(key.equals("IndividualDTOcountryOfResidence"))
            {
            	individualCustomerDTO.setCountryOfResidence(value);
            }else if(key.equals("IndividualDTOcustomerMobilePhone"))
            {
            	individualCustomerDTO.setCustomerMobilePhone(RAS.generateRandomNumber());
            }else if(key.equals("IndividualDTOcustomeremailId"))
            {
            	individualCustomerDTO.setEmailId(value);
            }else if(key.equals("IndividualDTOnationality"))
            {
            	individualCustomerDTO.setNationality(value);
            }else if(key.equals("IndividualDTOnationalIdentificationCode"))
            {
            	individualCustomerDTO.setNationalIdentificationCode(RAS.generateRandomNumber());
            }else if(key.equals("IndividualDTOnationalIdentificationCodeOld"))
            {
            	individualCustomerDTO.setNationalIdentificationCodeOld(value);
            }else if(key.equals("IndividualDTOaadhaarNo"))
            {
            	individualCustomerDTO.setAadhaarNo(value);
            }else if(key.equals("IndividualDTOaadhaarUpdateDate"))
            {
            	individualCustomerDTO.setAadhaarUpdateDate(value);
            }else if(key.equals("IndividualDTOaadhaarLinkedAccount"))
            {
            	individualCustomerDTO.setAadhaarLinkedAccount(value);
            }else if(key.equals("IndividualDTOpanNo"))
            {
            	individualCustomerDTO.setPanNo(RAS.panNumber());
            }else if(key.equals("IndividualDTOicType"))
            {
            	individualCustomerDTO.setIcType(value);
            }else if(key.equals("IndividualDTOcustomerType"))
            {
            	individualCustomerDTO.setCustomerType(value);
            }else if(key.equals("IndividualDTOIndivisualNamePrefix"))
            {
            	individualName.setPrefix(value);
            	individualCustomerDTO.setIndividualName(individualName);
            }else if(key.equals("IndividualDTOIndivisualNameFirstName"))
            {
            	individualName.setFirstName(value);
            }else if(key.equals("IndividualDTOIndivisualNameMidName"))
            {
            	individualName.setMidName(value);
            }else if(key.equals("IndividualDTOIndivisualNameLastName"))
            {
            	individualName.setLastName(value);
            }else if(key.equals("IndividualDTOIndivisualNameShortName"))
            {
            	individualName.setShortName(value);
            }else if(key.equals("IndividualDTOdateOfBirthOrRegistration"))
            {
            	individualCustomerDTO.setDateOfBirthOrRegistration(value);
            }else if(key.equals("IndividualDTOsignatureType"))
            {
            	individualCustomerDTO.setSignatureType(value);
            }else if(key.equals("IndividualDTOphone"))
            {
            	individualCustomerDTO.setPhone(value);
            }else if(key.equals("IndividualDTOorigin"))
            {
            	individualCustomerDTO.setOrigin(value);
            }else if(key.equals("IndividualDTOlanguage"))
            {
            	individualCustomerDTO.setLanguage(value);
            }else if(key.equals("IndividualDTOhomeBranchCode"))
            {
            	individualCustomerDTO.setHomeBranchCode(value);
            }else if(key.equals("IndividualDTOcifType"))
            {
            	individualCustomerDTO.setCifType(value);
            }else if(key.equals("mercahntTypeDTOcategory"))
            {
            	mTypeAdditionalDTO.setCategory(value);
            	apiObj.setMerchantTypeAdditionalDTO(mTypeAdditionalDTO);
            }else if(key.equals("mercahntTypeDTOlocalDistrict"))
            {
            	mTypeAdditionalDTO.setLocalDistrict(value);
            }else if(key.equals("mercahntTypeDTOpermanentDistrict"))
            {
            	mTypeAdditionalDTO.setPermanentDistrict(value);
            }else if(key.equals("mercahntTypeDTOmerchantgroupid"))
            {
            	mTypeAdditionalDTO.setMerchantgroupid(value);
            }else if(key.equals("mercahntTypeDTOparentID"))
            {
            	mTypeAdditionalDTO.setParentID(value);
            }else if(key.equals("mercahntTypeDTOpermissiblechildlevels"))
            {
            	mTypeAdditionalDTO.setPermissiblechildlevels(value);
            }else if(key.equals("mercahntTypeDTOmerchanttradevalue1"))
            {
            	mTypeAdditionalDTO.setMerchanttradevalue1(value);
            }else if(key.equals("mercahntTypeDTOmerchanttradevalue2"))
            {
            	mTypeAdditionalDTO.setMerchanttradevalue2(value);
            }else if(key.equals("mercahntTypeDTOmerchanttradevalue3"))
            {
            	mTypeAdditionalDTO.setMerchanttradevalue3(value);
            }else if(key.equals("mercahntTypeDTOmerchanttradevalue4"))
            {
            	mTypeAdditionalDTO.setMerchanttradevalue4(value);
            }else if(key.equals("mercahntTypeDTOmerchanttradevalue5"))
            {
            	mTypeAdditionalDTO.setMerchanttradevalue5(value);
            }else if(key.equals("mercahntTypeDTOmerchanttradevalue6"))
            {
            	mTypeAdditionalDTO.setMerchanttradevalue6(value);
            }else if(key.equals("mercahntTypeDTOadditionalmobilecom1"))
            {
            	mTypeAdditionalDTO.setAdditionalmobilecom1(value);
            }else if(key.equals("mercahntTypeDTOadditionalemailcom1"))
            {
            	mTypeAdditionalDTO.setAdditionalemailcom1(value);
            }else if(key.equals("mercahntTypeDTOadditionalmobilecom2"))
            {
            	mTypeAdditionalDTO.setAdditionalmobilecom2(value);
            }else if(key.equals("mercahntTypeDTOadditionalemailcom2"))
            {
            	mTypeAdditionalDTO.setAdditionalemailcom2(value);
            }else if(key.equals("mercahntTypeDTOadditionalmobilecom3"))
            {
            	mTypeAdditionalDTO.setAdditionalmobilecom3(value);
            }else if(key.equals("mercahntTypeDTOadditionalemailcom3"))
            {
            	mTypeAdditionalDTO.setAdditionalemailcom3(value);
            }else if(key.equals("mercahntTypeDTOadditionalmobilecom4"))
            {
            	mTypeAdditionalDTO.setAdditionalmobilecom4(value);
            }else if(key.equals("mercahntTypeDTOadditionalemailcom4"))
            {
            	mTypeAdditionalDTO.setAdditionalemailcom4(value);
            }else if(key.equals("mercahntTypeDTOadditionalmobilecom5"))
            {
            	mTypeAdditionalDTO.setAdditionalmobilecom5(value);
            }else if(key.equals("mercahntTypeDTOadditionalemailcom5"))
            {
            	mTypeAdditionalDTO.setAdditionalemailcom5(value);
            }else if(key.equals("mercahntTypeDTOagentID"))
            {
            	mTypeAdditionalDTO.setAgentID(value);
            }else if(key.equals("mercahntTypeDTOriskProfile"))
            {
            	mTypeAdditionalDTO.setRiskProfile(value);
            }else if(key.equals("mercahntTypeDTOactivationDateTime"))
            {
            	mTypeAdditionalDTO.setActivationDateTime(value);
            }else if(key.equals("mercahntTypeDTOonboardChannel"))
            {
            	mTypeAdditionalDTO.setOnboardChannel(value);
            }else if(key.equals("mercahntTypeDTOupgradeChannel"))
            {
            	mTypeAdditionalDTO.setUpgradeChannel(value);
            }else if(key.equals("mercahntTypeDTOpoiType"))
            {
            	mTypeAdditionalDTO.setPoiType(value);
            }else if(key.equals("mercahntTypeDTOpoiNumber"))
            {
            	mTypeAdditionalDTO.setPoiNumber(value);
            }else if(key.equals("mercahntTypeDTOpoiIssuingAuthority"))
            {
            	mTypeAdditionalDTO.setPoiIssuingAuthority(value);
            }else if(key.equals("mercahntTypeDTOpoiDateOfIssue"))
            {
            	mTypeAdditionalDTO.setPoiDateOfIssue(value);
            }else if(key.equals("mercahntTypeDTOpoiDateOfExpiry"))
            {
            	mTypeAdditionalDTO.setPoiDateOfExpiry(value);;
            }else if(key.equals("mercahntTypeDTOpoiPlaceOfIssue"))
            {
            	mTypeAdditionalDTO.setPoiPlaceOfIssue(value);
            }else if(key.equals("mercahntTypeDTOpoaType"))
            {
            	mTypeAdditionalDTO.setPoaType(value);
            }else if(key.equals("mercahntTypeDTOpoaNumber"))
            {
            	mTypeAdditionalDTO.setPoaNumber(value);
            }else if(key.equals("mercahntTypeDTOpoaIssuingAuthority"))
            {
            	mTypeAdditionalDTO.setPoaIssuingAuthority(value);
            }else if(key.equals("mercahntTypeDTOpoaDateOfIssue"))
            {
            	mTypeAdditionalDTO.setPoaDateOfIssue(value);
            }else if(key.equals("mercahntTypeDTOpoaDateOfExpiry"))
            {
            	mTypeAdditionalDTO.setPoaDateOfExpiry(value);
            }else if(key.equals("mercahntTypeDTOpoaPlaceOfIssue"))
            {
            	mTypeAdditionalDTO.setPoaPlaceOfIssue(value);
            }else if(key.equals("mercahntTypeDTOShopAddCity"))
            {
            	merchantShopaddress.setCity(value);
            	mTypeAdditionalDTO.setMerchantShopaddress(merchantShopaddress);
            }else if(key.equals("mercahntTypeDTOShopAddCountry"))
            {
            	merchantShopaddress.setCountry(value);
            }else if(key.equals("mercahntTypeDTOShopAddLine1"))
            {
            	merchantShopaddress.setLine1(value);
            }else if(key.equals("mercahntTypeDTOShopAddLine2"))
            {
            	merchantShopaddress.setLine2(value);
            }else if(key.equals("mercahntTypeDTOShopAddLine3"))
            {
            	merchantShopaddress.setLine3(value);
            }else if(key.equals("mercahntTypeDTOShopAddLine4"))
            {
            	merchantShopaddress.setLine4(value);
            }else if(key.equals("mercahntTypeDTOShopAddState"))
            {
            	merchantShopaddress.setState(value);
            }else if(key.equals("mercahntTypeDTOShopAddZip"))
            {
            	merchantShopaddress.setZip(value);
            }else if(key.equals("mercahntTypeDTOshopDistrict"))
            {
            	mTypeAdditionalDTO.setShopDistrict(value);
            }else if(key.equals("mercahntTypeDTOshoplat"))
            {
            	mTypeAdditionalDTO.setShoplat(value);
            }else if(key.equals("mercahntTypeDTOshoplang"))
            {
            	mTypeAdditionalDTO.setShoplang(value);
            }else if(key.equals("mercahntTypeDTOzonename"))
            {
            	mTypeAdditionalDTO.setZonename(value);
            }else if(key.equals("mercahntTypeDTOgstnumber"))
            {
            	mTypeAdditionalDTO.setGstnumber(value);
            }else if(key.equals("mercahntTypeDTOtannumber"))
            {
            	mTypeAdditionalDTO.setTannumber(value);
            }else if(key.equals("mercahntTypeDTOtinnumber"))
            {
            	mTypeAdditionalDTO.setTinnumber(value);
            }else if(key.equals("mercahntTypeDTOtaxnumber"))
            {
            	mTypeAdditionalDTO.setTaxnumber(value);
            }else if(key.equals("mercahntTypeDTObusinessregno"))
            {
            	mTypeAdditionalDTO.setBusinessregno(value);
            }else if(key.equals("mercahntTypeDTOparentID"))
            {
            	mTypeAdditionalDTO.setParentID(value);
            }else if(key.equals("mercahntTypeDTOlegalstatus"))
            {
            	mTypeAdditionalDTO.setLegalstatus(value);
            }else if(key.equals("mercahntTypeDTOjurisdiction"))
            {
            	mTypeAdditionalDTO.setJurisdiction(value);
            }else if(key.equals("mercahntTypeDTOreferenceno"))
            {
            	mTypeAdditionalDTO.setReferenceno(value);
            }else if(key.equals("mercahntTypeDTOservicetaxcode"))
            {
            	mTypeAdditionalDTO.setServicetaxcode(value);
            }else if(key.equals("mercahntTypeDTOsettlemenfrequency"))
            {
            	mTypeAdditionalDTO.setSettlemenfrequency(value);
            }else if(key.equals("mercahntTypeDTOnoOfSettleAccountPermissible"))
            {
            	mTypeAdditionalDTO.setNoOfSettleAccountPermissible(value);
            }else if(key.equals("mercahntTypeDTOsettlementaccountname"))
            {
            	mTypeAdditionalDTO.setSettlementaccountname(value);
            }else if(key.equals("mercahntTypeDTOsettlementaccounttype"))
            {
            	mTypeAdditionalDTO.setSettlementaccounttype(value);
            }else if(key.equals("mercahntTypeDTOsettlmentaccountbranchaddress"))
            {
            	mTypeAdditionalDTO.setSettlmentaccountbranchaddress(value);
            }else if(key.equals("mercahntTypeDTOsettlementaccountno"))
            {
            	mTypeAdditionalDTO.setSettlementaccountno(value);
            }else if(key.equals("mercahntTypeDTOsettlementifsc"))
            {
            	mTypeAdditionalDTO.setSettlementifsc(value);
            }else if(key.equals("mercahntTypeDTOmsfprinciple"))
            {
            	mTypeAdditionalDTO.setMsfprinciple(value);
            }else if(key.equals("mercahntTypeDTOqrstring"))
            {
            	mTypeAdditionalDTO.setQrstring(value);
            }else if(key.equals("mercahntTypeDTOformid"))
            {
            	mTypeAdditionalDTO.setFormid(value);
            }else if(key.equals("mercahntTypeDTOupiStatus"))
            {
            	mTypeAdditionalDTO.setUpiStatus(value);
            }else if(key.equals("mercahntTypeDTOshopname"))
            {
            	mTypeAdditionalDTO.setShopname(value);
            }else if(key.equals("mercahntTypeDTOshopDisplayname"))
            {
            	mTypeAdditionalDTO.setShopDisplayname(value);
            }else if(key.equals("mercahntTypeDTOisCreateChild"))
            {
            	mTypeAdditionalDTO.setIsCreateChild(value);
            }else if(key.equals("mercahntTypeDTOisSettlementPermissible"))
            {
            	mTypeAdditionalDTO.setIsSettlementPermissible(value);
            }else if(key.equals("mercahntTypeDTOisChildSettlementSetPermissible"))
            {
            	mTypeAdditionalDTO.setIsChildSettlementSetPermissible(value);
            }else if(key.equals("mercahntTypeDTOisTransactionPermissible"))
            {
            	mTypeAdditionalDTO.setIsTransactionPermissible(value);
            }else if(key.equals("mercahntTypeDTOisChildTransactionViewPermissible"))
            {
            	mTypeAdditionalDTO.setIsChildTransactionViewPermissible(value);
            }else if(key.equals("mercahntTypeDTOisDeleteChild"))
            {
            	mTypeAdditionalDTO.setIsDeleteChild(value);
            }else if(key.equals("mercahntTypeDTOisProcessRefund"))
            {
            	mTypeAdditionalDTO.setIsProcessRefund(value);
            }else if(key.equals("mercahntTypeDTOsendTransactionComToSelf"))
            {
            	mTypeAdditionalDTO.setSendTransactionComToSelf(value);
            }else if(key.equals("mercahntTypeDTOtransactionComAlertTypeSelf"))
            {
            	mTypeAdditionalDTO.setTransactionComAlertTypeSelf(value);
            }else if(key.equals("mercahntTypeDTOsendTransactionComToOthers"))
            {
            	mTypeAdditionalDTO.setSendTransactionComToOthers(value);
            }else if(key.equals("mercahntTypeDTOtransactionComAlertTypeOthers"))
            {
            	mTypeAdditionalDTO.setTransactionComAlertTypeOthers(value);
            }else if(key.equals("mercahntTypeDTOisTdsApplicable"))
            {
            	mTypeAdditionalDTO.setIsTdsApplicable(value);
            }else if(key.equals("mercahntTypeDTOtdsPercentValue"))
            {
            	mTypeAdditionalDTO.setTdsPercentValue(value);
            }else if(key.equals("mercahntTypeDTOisRevenueSharing"))
            {
            	mTypeAdditionalDTO.setIsRevenueSharing(value);
            }else if(key.equals("mercahntTypeDTOrevenuePercentValue"))
            {
            	mTypeAdditionalDTO.setRevenuePercentValue(value);
            }else if(key.equals("mercahntTypeDTOisServiceChargeSharing"))
            {
            	mTypeAdditionalDTO.setIsServiceChargeSharing(value);
            }else if(key.equals("mercahntTypeDTOscPercentValue"))
            {
            	mTypeAdditionalDTO.setScPercentValue(value);
            }else if(key.equals("mercahntTypeDTOauthorisedSignatorySalutation"))
            {
            	mTypeAdditionalDTO.setAuthorisedSignatorySalutation(value);
            }else if(key.equals("mercahntTypeDTOauthorisedSignatoryFirstName"))
            {
            	mTypeAdditionalDTO.setAuthorisedSignatoryFirstName(value);
            }else if(key.equals("mercahntTypeDTOauthorisedSignatorySecondName"))
            {
            	mTypeAdditionalDTO.setAuthorisedSignatorySecondName(value);
            }else if(key.equals("mercahntTypeDTOauthorisedSignatoryLastName"))
            {
            	mTypeAdditionalDTO.setAuthorisedSignatoryLastName(value);
            }else if(key.equals("mercahntTypeDTOauthorisedSignatoryDOB"))
            {
            	mTypeAdditionalDTO.setAuthorisedSignatoryDOB(value);
            }else if(key.equals("mercahntTypeDTOflagB2B"))
            {
            	mTypeAdditionalDTO.setFlagB2B(value);
            }else if(key.equals("mercahntTypeDTOgdsApplicable"))
            {
            	mTypeAdditionalDTO.setGdsApplicable(value);
            }else if(key.equals("mercahntTypeDTOcircle"))
            {
            	mTypeAdditionalDTO.setCircle(value);
            }else if(key.equals("mercahntTypeDTOnextsettlementdate"))
            {
            	mTypeAdditionalDTO.setNextsettlementdate(value);
            }else if(key.equals("mercahntTypeDTOlastsettlementdate"))
            {
            	mTypeAdditionalDTO.setLastsettlementdate(value);
            }else if(key.equals("mercahntTypeDTOcustomFields1"))
            {
            	mTypeAdditionalDTO.setCustomFields1(value);
            }else if(key.equals("mercahntTypeDTOcustomFields2"))
            {
            	mTypeAdditionalDTO.setCustomFields2(value);
            }else if(key.equals("mercahntTypeDTOcustomFields3"))
            {
            	mTypeAdditionalDTO.setCustomFields3(value);
            }else if(key.equals("mercahntTypeDTOcustomFields4"))
            {
            	mTypeAdditionalDTO.setCustomFields4(value);
            }else if(key.equals("mercahntTypeDTOcustomFields5"))
            {
            	mTypeAdditionalDTO.setCustomFields6(value);
            }else if(key.equals("mercahntTypeDTOcustomFields6"))
            {
            	mTypeAdditionalDTO.setCustomFields6(value);
            }else if(key.equals("mercahntTypeDTOcustomFields7"))
            {
            	mTypeAdditionalDTO.setCustomFields7(value);
            }else if(key.equals("mercahntTypeDTOcustomFields8"))
            {
            	mTypeAdditionalDTO.setCustomFields8(value);
            }else if(key.equals("mercahntTypeDTOcustomFields9"))
            {
            	mTypeAdditionalDTO.setCustomFields9(value);
            }else if(key.equals("mercahntTypeDTOcustomFields10"))
            {
            	mTypeAdditionalDTO.setCustomFields10(value);
            }else if(key.equals("mercahntTypeDTOcustomFields11"))
            {
            	mTypeAdditionalDTO.setCustomFields11(value);
            }else if(key.equals("mercahntTypeDTOcustomFields12"))
            {
            	mTypeAdditionalDTO.setCustomFields12(value);
            }else if(key.equals("mercahntTypeDTOcustomFields13"))
            {
            	mTypeAdditionalDTO.setCustomFields13(value);
            }else if(key.equals("mercahntTypeDTOcustomFields14"))
            {
            	mTypeAdditionalDTO.setCustomFields14(value);
            }else if(key.equals("mercahntTypeDTOcustomFields15"))
            {
            	mTypeAdditionalDTO.setCustomFields15(value);
            }else if(key.equals("accountOpenDTObranchCode"))
            {
            	aOpenDTO.setBranchCode(value);
            	apiObj.setAccountOpenDTO(aOpenDTO);
            }else if(key.equals("accountOpenDTOproductType"))
            {
            	aOpenDTO.setProductType(value);
            }else if(key.equals("accountOpenDTOflgRestrictAcct"))
            {
            	aOpenDTO.setFlgRestrictAcct(value);
            }else if(key.equals("accountOpenDTOproductCode"))
            {
            	aOpenDTO.setProductCode(value);
            }else if(key.equals("accountOpenDTOminorAcctStatus"))
            {
            	aOpenDTO.setMinorAcctStatus(value);
            }else if(key.equals("accountOpenDTOflgJointHolder"))
            {
            	aOpenDTO.setFlgJointHolder(value);
            }else if(key.equals("accountOpenDTOacctCurrency"))
            {
            	aOpenDTO.setAcctCurrency(value);
            }else if(key.equals("accountOpenDTOaccountTitle"))
            {
            	aOpenDTO.setAccountTitle(value);
            }else if(key.equals("smsDetailsfromSMSFlag"))
            {
            	sDetails.setFromSMSFlag(value);
            	apiObj.setSmsDetails(sDetails);
            }else if(key.equals("mercahntTypeDTOgstSharingApplicable"))
            {
            	mTypeAdditionalDTO.setGstSharingApplicable(value);
            }else if(key.equals("mercahntTypeDTOgstSharingPercentage"))
            {
            	mTypeAdditionalDTO.setGstSharingPercentage(value);
            }else if(key.equals("mercahntTypeDTOflagSettlementAcctChangeCounter"))
            {
            	mTypeAdditionalDTO.setFlagSettlementAcctChangeCounter(value);
            }else if(key.equals("smsDetailsfromSMSAddition"))
            {
            	sDetails.setFromSMSAddition(value);
            }else if(key.equals("HoldNumber"))
            {
            	apiObj.setHoldNumber(value);
            }else if(key.equals("ExpiryDate"))
            {
            	apiObj.setExpiryDate(value);
            }else if(key.equals("EarMarkType"))
            {
            	apiObj.setEarMarkType(value);
            }else if(key.equals("HoldAmount"))
            {
            	apiObj.setHoldAmount(value);
            }else if(key.equals("RefundTransactionReferenceNumber"))            	
            {             	
            	apiObj.setRefundTransactionReferenceNumber(value);
            }else if(key.equals("FlagFullOrPartial"))
            {
            	apiObj.setFlagFullOrPartial(value);
            }else if(key.equals("FlagScReversal"))
            {
            	apiObj.setFlagScReversal(value);
            }else if(key.equals("transferMode"))
            {
            	apiObj.setTransferMode(value);
            }else if(key.equals("fromGLCode"))
            {
            	apiObj.setFromGLCode(value);
            }else if(key.equals("fromBranchCode"))
            {
            	apiObj.setFromBranchCode(value);
            }else if(key.equals("toGLCode"))
            {
            	apiObj.setToGLCode(value);
            }else if(key.equals("toBranchCode"))
            {
            	apiObj.setToBranchCode(value);
            }else if(key.equals("AccountNo"))
            {
            	apiObj.setAccountNo(value);
            }else if(key.equals("Narrative"))
            {
            	apiObj.setNarrative(value);
            }else if(key.equals("TxnAction"))
            {
            	apiObj.setTxnAction(value);
            }else if(key.equals("fromDate"))
            {
            	apiObj.setFromDate(value);
            }else if(key.equals("toDate"))
            {
            	apiObj.setToDate(value);
            }else if(key.equals("EarmarkType_006"))
            {
            	apiObj.setEarmarkType(value);
            }else if(key.equals("CustomerTypeDTOcategory"))
            {
            	ctaDTO.setCategory(value);
            	apiObj.setCustomerTypeAdditionalDTO(ctaDTO);
            }else if(key.equals("CustomerTypeDTOfatherHusbandName"))
            {
            	ctaDTO.setFatherHusbandName(value);
            }else if(key.equals("CustomerTypeDTOlocalDistrict"))
            {
            	ctaDTO.setLocalDistrict(value);
            }else if(key.equals("CustomerTypeDTOpermanentDistrict"))
            {
            	ctaDTO.setPermanentDistrict(value);
            }else if(key.equals("CustomerTypeDTOactivationDateTime"))
            {
            	ctaDTO.setActivationDateTime(value);
            }else if(key.equals("CustomerTypeDTOonboardChannel"))
            {
            	ctaDTO.setOnboardChannel(value);
            }else if(key.equals("CustomerTypeDTOupgradeChannel"))
            {
            	ctaDTO.setUpgradeChannel(value);
            }else if(key.equals("CustomerTypeDTOpoiType"))
            {
            	ctaDTO.setPoiType(value);
            }else if(key.equals("CustomerTypeDTOpoiNumber"))
            {
            	ctaDTO.setPoiNumber(value);
            }else if(key.equals("CustomerTypeDTOpoiIssuingAuthority"))
            {
            	ctaDTO.setPoiIssuingAuthority(value);
            }else if(key.equals("CustomerTypeDTOpoiDateOfIssue"))
            {
            	ctaDTO.setPoiDateOfIssue(value);
            }else if(key.equals("CustomerTypeDTOpoiDateOfExpiry"))
            {
            	ctaDTO.setPoiDateOfExpiry(value);
            }else if(key.equals("CustomerTypeDTOpoiPlaceOfIssue"))
            {
            	ctaDTO.setPoiPlaceOfIssue(value);
            }else if(key.equals("CustomerTypeDTOpoaType"))
            {
            	ctaDTO.setPoaType(value);;
            }else if(key.equals("CustomerTypeDTOpoaNumber"))
            {
            	ctaDTO.setPoaNumber(value);
            }else if(key.equals("CustomerTypeDTOpoaIssuingAuthority"))
            {
            	ctaDTO.setPoaIssuingAuthority(value);
            }else if(key.equals("CustomerTypeDTOpoaDateOfIssue"))
            {
            	ctaDTO.setPoaDateOfIssue(value);
            }else if(key.equals("CustomerTypeDTOpoaDateOfExpiry"))
            {
            	ctaDTO.setPoaDateOfExpiry(value);
            }else if(key.equals("CustomerTypeDTOpoaPlaceOfIssue"))
            {
            	ctaDTO.setPoaPlaceOfIssue(value);
            }else if(key.equals("CustomerTypeDTOcspNationalIdentificationCode"))
            {
            	ctaDTO.setCspNationalIdentificationCode(value);
            }else if(key.equals("CustomerTypeDTOcspCustomerSegment"))
            {
            	ctaDTO.setCspCustomerSegment(value);
            }else if(key.equals("CustomerTypeDTOamountFirstCashIn"))
            {
            	ctaDTO.setAmountFirstCashIn(value);
            }else if(key.equals("CustomerTypeDTOOnboardedByEntityId"))
            {
            	ctaDTO.setOnboardedByEntityId(value);
            }else if(key.equals("CustomerTypeDTOregStatus"))
            {
            	ctaDTO.setRegStatus(value);
            }else if(key.equals("CustomerTypeDTOflgInsurance"))
            {
            	ctaDTO.setFlgInsurance(value);
            }else if(key.equals("CustomerTypeDTOcardType"))
            {
            	ctaDTO.setCardType(value);
            }else if(key.equals("CustomerTypeDTOriskProfile"))
            {
            	ctaDTO.setRiskProfile(value);
            }else if(key.equals("CustomerTypeDTOpanAckNumber"))
            {
            	ctaDTO.setPanAckNumber(value);
            }else if(key.equals("CustomerTypeDTOincomeAgriculture"))
            {
            	ctaDTO.setIncomeAgriculture(value);
            }else if(key.equals("CustomerTypeDTOincomeNonAgriculture"))
            {
            	ctaDTO.setIncomeNonAgriculture(value);
            }else if(key.equals("CustomerTypeDTOannualIncome"))
            {
            	ctaDTO.setAnnualIncome(value);
            }else if(key.equals("CustomerTypeDTOpanStatus"))
            {
            	ctaDTO.setPanStatus(value);
            }else if(key.equals("CustomerTypeDTOupiStatus"))
            {
            	ctaDTO.setUpiStatus(value);
            }else if(key.equals("CustomerTypeDTOndsStatus"))
            {
            	ctaDTO.setNdsStatus(value);
            }else if(key.equals("CustomerTypeDTOmobilityUserType"))
            {
            	ctaDTO.setMobilityUserType(value);
            }else if(key.equals("CustomerTypeDTOcircle"))
            {
            	ctaDTO.setCircle(value);
            }else if(key.equals("CustomerTypeDTOsourceOfFunds"))
            {
            	ctaDTO.setSourceOfFunds(value);
            }else if(key.equals("CustomerTypeDTOpoliticallyExposedPerson"))
            {
            	ctaDTO.setPoliticallyExposedPerson(value);
            }else if(key.equals("CustomerTypeDTOflgKYC"))
            {
            	ctaDTO.setFlgKYC(value);
            }else if(key.equals("CustomerTypeDTOemailStatus"))
            {
            	ctaDTO.setEmailStatus(value);
            }else if(key.equals("CustomerTypeDTOeSign"))
            {
            	ctaDTO.seteSign(value);
            }else if(key.equals("CustomerTypeDTOpanFirstName"))
            {
            	ctaDTO.setPanFirstName(value);
            }else if(key.equals("CustomerTypeDTOpanSecondName"))
            {
            	ctaDTO.setPanSecondName(value);
            }else if(key.equals("CustomerTypeDTOpanLastName"))
            {
            	ctaDTO.setPanLastName(value);
            }else if(key.equals("CustomerTypeDTOcustImeiNo"))
            {
            	ctaDTO.setCustImeiNo(value);
            }else if(key.equals("CustomerTypeDTOsettlementaccountname"))
            {
            	ctaDTO.setSettlementaccountname(value);
            }else if(key.equals("CustomerTypeDTOsettlementaccountno"))
            {
            	ctaDTO.setSettlementaccountno(value);
            }else if(key.equals("CustomerTypeDTOsettlementifsc"))
            {
            	ctaDTO.setSettlementifsc(value);
            }else if(key.equals("CustomerTypeDTOendChannel"))
            {
            	ctaDTO.setEndChannel(value);
            }else if(key.equals("CustomerTypeDTOcustomFields1"))
            {
            	ctaDTO.setCustomFields1(value);
            }else if(key.equals("CustomerTypeDTOcustomFields2"))
            {
            	ctaDTO.setCustomFields2(value);
            }else if(key.equals("CustomerTypeDTOcustomFields3"))
            {
            	ctaDTO.setCustomFields3(value);
            }else if(key.equals("CustomerTypeDTOcustomFields4"))
            {
            	ctaDTO.setCustomFields4(value);
            }else if(key.equals("CustomerTypeDTOcustomFields5"))
            {
            	ctaDTO.setCustomFields5(value);
            }else if(key.equals("CustomerTypeDTOcustomFields6"))
            {
            	ctaDTO.setCustomFields6(value);
            }else if(key.equals("CustomerTypeDTOcustomFields7"))
            {
            	ctaDTO.setCustomFields7(value);
            }else if(key.equals("CustomerTypeDTOcustomFields8"))
            {
            	ctaDTO.setCustomFields8(value);
            }else if(key.equals("CustomerTypeDTOcustomFields9"))
            {
            	ctaDTO.setCustomFields8(value);
            }else if(key.equals("CustomerTypeDTOcustomFields10"))
            {
            	ctaDTO.setCustomFields10(value);
            }else if(key.equals("CustomerTypeDTOcustomFields11"))
            {
            	ctaDTO.setCustomFields11(value);
            }else if(key.equals("CustomerTypeDTOcustomFields12"))
            {
            	ctaDTO.setCustomFields12(value);
            }else if(key.equals("CustomerTypeDTOcustomFields13"))
            {
            	ctaDTO.setCustomFields13(value);
            }else if(key.equals("CustomerTypeDTOcustomFields14"))
            {
            	ctaDTO.setCustomFields14(value);
            }else if(key.equals("CustomerTypeDTOcustomFields15"))
            {
            	ctaDTO.setCustomFields15(value);
            }else if(key.equals("accountNomineeDTOnomineeName"))
            {
            	aNDTO.setNomineeName(value);
            	apiObj.setAccountNomineeDTO(aNDTO);
            }else if(key.equals("accountNomineeDTOnomineedateOfBirth"))
            {
            	aNDTO.setNomineedateOfBirth(value);
            }else if(key.equals("accountNomineeDTOrelAcctHolder"))
            {
            	aNDTO.setRelAcctHolder(value);
            }else if(key.equals("accountNomineeDTOnomineeAddressLine1"))
            {
            	aNDTO.setNomineeAddressLine1(value);
            }else if(key.equals("accountNomineeDTOnomineeAddressLine2"))
            {
            	aNDTO.setNomineeAddressLine2(value);
            }else if(key.equals("accountNomineeDTOnomineeAddressLine3"))
            {
            	aNDTO.setNomineeAddressLine3(value);
            }else if(key.equals("accountNomineeDTOnomineeAddressLine4"))
            {
            	aNDTO.setNomineeAddressLine4(value);
            }else if(key.equals("accountNomineeDTOnomineeCity"))
            {
            	aNDTO.setNomineeCity(value);
            }else if(key.equals("accountNomineeDTOnomineeState"))
            {
            	aNDTO.setNomineeState(value);
            }else if(key.equals("accountNomineeDTOnomineeCountry"))
            {
            	aNDTO.setNomineeCountry(value);
            }else if(key.equals("accountNomineeDTOnomineeZip"))
            {
            	aNDTO.setNomineeZip(value);
            }else if(key.equals("accountNomineeDTOnomPhone"))
            {
            	aNDTO.setNomPhone(value);
            }else if(key.equals("accountNomineeDTOnomMobile"))
            {
            	aNDTO.setNomMobile(value);
            }else if(key.equals("accountNomineeDTOnomEmailId"))
            {
            	aNDTO.setNomEmailId(value);
            }else if(key.equals("accountNomineeDTOrelationGuardian"))
            {
            	aNDTO.setRelationGuardian(value);
            }else if(key.equals("accountNomineeDTOguardianDateofBirth"))
            {
            	aNDTO.setGuardianDateofBirth(value);
            }else if(key.equals("accountNomineeDTOguardianName"))
            {
            	aNDTO.setGuardianName(value);
            }else if(key.equals("accountNomineeDTOguardianAddressLine1"))
            {
            	aNDTO.setGuardianAddressLine1(value);
            }else if(key.equals("accountNomineeDTOguardianAddressLine2"))
            {
            	aNDTO.setGuardianAddressLine2(value);
            }else if(key.equals("accountNomineeDTOguardianAddressLine3"))
            {
            	aNDTO.setGuardianAddressLine3(value);
            }else if(key.equals("accountNomineeDTOguardianAddressLine4"))
            {
            	aNDTO.setGuardianAddressLine4(value);
            }else if(key.equals("accountNomineeDTOguardianCity"))
            {
            	aNDTO.setGuardianCity(value);
            }else if(key.equals("accountNomineeDTOguardianState"))
            {
            	aNDTO.setGuardianState(value);
            }else if(key.equals("accountNomineeDTOguardianCountry"))
            {
            	aNDTO.setGuardianCountry(value);
            }else if(key.equals("accountNomineeDTOguardianZip"))
            {
            	aNDTO.setGuardianZip(value);
            }else if(key.equals("accountNomineeDTOguardianPhone"))
            {
            	aNDTO.setGuardianPhone(value);
            }else if(key.equals("accountNomineeDTOguardianMobile"))
            {
            	aNDTO.setGuardianMobile(value);
            }else if(key.equals("accountNomineeDTOguardianEmailId"))
            {
            	aNDTO.setGuardianEmailId(value);
            }else if(key.equals("accountNomineeDTOsharePercentage"))
            {
            	aNDTO.setSharePercentage(value);
            }else if(key.equals("accountNomineeDTOshareAmount"))
            {
            	aNDTO.setShareAmount(value);
            }else if(key.equals("BranchCode"))
            {
            	apiObj.setBranchCode(value);
            }else if(key.equals("iUserId"))
            {
            	apiObj.setUserId(value);
            }else if(key.equals("PageSize"))
            {
            	apiObj.setPageSize(value);
            }else if(key.equals("PageNo"))
            {
            	apiObj.setPageNo(value);
            }else if(key.equals("StartDate"))
            {
            	apiObj.setStartDate(value);
            }else if(key.equals("EndDate"))
            {
            	apiObj.setEndDate(value);
            }else if(key.equals("FromAccount_004"))
            {
            	apiObj.setFromAccount(value);
            }else if(key.equals("NationalIdentificationCode"))
            {
            	apiObj.setNationalIdentificationCode(value);
            }else if(key.equals("AadharCardNo"))
            {
            	apiObj.setAadharCardNo(value);
            }else if(key.equals("EmailId"))
            {
            	apiObj.setEmailId(value);
            }else if(key.equals("PanNo"))
            {
            	apiObj.setPanNo(value);
            }else if(key.equals("RemitterProductCode"))
            {
            	apiObj.setRemitterProductCode(value);
            }else if(key.equals("RemitterMMID"))
            {
            	apiObj.setRemitterMMID(value);
            }else if(key.equals("AmtTxn"))
            {
            	apiObj.setAmtTxn(value);
            }else if(key.equals("BeneficiaryID"))
            {
            	apiObj.setBeneficiaryID(value);
            }else if(key.equals("BenefIFSCCode"))
            {
            	apiObj.setBenefIFSCCode(value);
            }else if(key.equals("BenefAcctNo"))
            {
            	apiObj.setBenefAcctNo(value);
            }else if(key.equals("RemitAcctType"))
            {
            	apiObj.setRemitAcctType(value);
            }else if(key.equals("CustomerNationaIdentificationCode"))
            {
            	apiObj.setCustomerNationaIdentificationCode(value);
            }else if(key.equals("scmTypeDTOlocalDistrict"))
            {
            	scm.setLocalDistrict(value);
            	apiObj.setScmTypeAdditionalDTO(scm);
            }else if(key.equals("scmTypeDTOpermanentDistrict"))
            {
            	scm.setPermanentDistrict(value);
            }else if(key.equals("scmTypeDTOparentID"))
            {
            	scm.setParentID(value);
            }else if(key.equals("scmTypeDTOparentType"))
            {
            	scm.setParentType(value);
            }else if(key.equals("scmTypeDTOshopname"))
            {
            	scm.setShopname(value);
            }else if(key.equals("scmTypeDTODisplayname"))
            {
            	scm.setShopDisplayname(value);
            }else if(key.equals("scmTypeDTOpoiType"))
            {
            	scm.setPoiType(value);
            }else if(key.equals("scmTypeDTOpoiNumber"))
            {
            	scm.setPoiNumber(value);
            }else if(key.equals("scmTypeDTOpoiIssuingAuthority"))
            {
            	scm.setPoiIssuingAuthority(value);
            }else if(key.equals("scmTypeDTOpoiDateOfIssue"))
            {
            	scm.setPoiDateOfIssue(value);
            }else if(key.equals("scmTypeDTOpoiDateOfExpiry"))
            {
            	scm.setPoiDateOfExpiry(value);
            }else if(key.equals("scmTypeDTOpoiPlaceOfIssue"))
            {
            	scm.setPoiPlaceOfIssue(value);
            }else if(key.equals("scmTypeDTOpoaType"))
            {
            	scm.setPoaType(value);
            }else if(key.equals("scmTypeDTOpoaNumber"))
            {
            	scm.setPoaNumber(value);
            }else if(key.equals("scmTypeDTOpoaIssuingAuthority"))
            {
            	scm.setPoaIssuingAuthority(value);
            }else if(key.equals("scmTypeDTOpoaDateOfIssue"))
            {
            	scm.setPoaDateOfIssue(value);
            }else if(key.equals("scmTypeDTOpoaDateOfExpiry"))
            {
            	scm.setPoaDateOfExpiry(value);
            }else if(key.equals("scmTypeDTOpoaPlaceOfIssue"))
            {
            	scm.setPoaPlaceOfIssue(value);
            }else if(key.equals("scmTypeDTOShopAddCity"))
            {
            	scms.setCity(value);
            	scm.setScmShopAddress(scms);
            }else if(key.equals("scmTypeDTOShopAddCountry"))
            {
            	scms.setCountry(value);
            }else if(key.equals("scmTypeDTOShopAddLine1"))
            {
            	scms.setLine1(value);
            }else if(key.equals("scmTypeDTOShopAddLine2"))
            {
            	scms.setLine2(value);
            }else if(key.equals("scmTypeDTOShopAddLine3"))
            {
            	scms.setLine3(value);
            }else if(key.equals("scmTypeDTOShopAddLine4"))
            {
            	scms.setLine4(value);
            }else if(key.equals("scmTypeDTOShopAddState"))
            {
            	scms.setState(value);
            }else if(key.equals("scmTypeDTOShopAddZip"))
            {
            	scms.setZip(value);
            }else if(key.equals("scmTypeDTOshopDistrict"))
            {
            	scm.setShopDistrict(value);
            }else if(key.equals("scmTypeDTOshoplat"))
            {
            	scm.setShoplat(value);
            }else if(key.equals("scmTypeDTOshoplang"))
            {
            	scm.setShoplang(value);
            }else if(key.equals("scmTypeDTOzonename"))
            {
            	scm.setZonename(value);
            }else if(key.equals("scmTypeDTOgstnumber"))
            {
            	scm.setGstnumber(value);
            }else if(key.equals("scmTypeDTOtannumber"))
            {
            	scm.setTannumber(value);
            }else if(key.equals("scmTypeDTOgstCategory"))
            {
            	scm.setGstCategory(value);
            }else if(key.equals("scmTypeDTOtaxnumber"))
            {
            	scm.setTaxnumber(value);
            }else if(key.equals("scmTypeDTObusinessregno"))
            {
            	scm.setBusinessregno(value);
            }else if(key.equals("scmTypeDTOlegalstatus"))
            {
            	scm.setLegalstatus(value);
            }else if(key.equals("scmTypeDTOjurisdiction"))
            {
            	scm.setJurisdiction(value);
            }else if(key.equals("scmTypeDTOreferenceno"))
            {
            	scm.setReferenceno(value);
            }else if(key.equals("scmTypeDTOservicetaxcode"))
            {
            	scm.setServicetaxcode(value);
            }else if(key.equals("scmTypeDTOsettlemenfrequency"))
            {
            	scm.setSettlemenfrequency(value);
            }else if(key.equals("scmTypeDTOsettlementaccountname"))
            {
            	scm.setSettlementaccountname(value);
            }else if(key.equals("scmTypeDTOsettlementaccounttype"))
            {
            	scm.setSettlementaccounttype(value);
            }else if(key.equals("scmTypeDTOsettlementaccountno"))
            {
            	scm.setSettlementaccountno(value);
            }else if(key.equals("scmTypeDTOsettlementifsc"))
            {
            	scm.setSettlementifsc(value);
            }else if(key.equals("scmTypeDTOformid"))
            {
            	scm.setFormid(value);
            }else if(key.equals("scmTypeDTOlanguage"))
            {
            	scm.setLanguage(value);
            }else if(key.equals("scmTypeDTOauthorisedSignatorySalutation"))
            {
            	scm.setAuthorisedSignatorySalutation(value);
            }else if(key.equals("scmTypeDTOauthorisedSignatoryFirstName"))
            {
            	scm.setAuthorisedSignatoryFirstName(value);
            }else if(key.equals("scmTypeDTOauthorisedSignatorySecondName"))
            {
            	scm.setAuthorisedSignatorySecondName(value);
            }else if(key.equals("scmTypeDTOauthorisedSignatoryLastName"))
            {
            	scm.setAuthorisedSignatoryLastName(value);
            }else if(key.equals("scmTypeDTOauthorisedSignatoryDOB"))
            {
            	scm.setAuthorisedSignatoryDOB(value);
            }else if(key.equals("scmTypeDTOcircle"))
            {
            	scm.setCircle(value);
            }else if(key.equals("scmTypeDTOsettlementMode"))
            {
            	scm.setSettlementMode(value);
            }else if(key.equals("scmTypeDTOcustomFields1"))
            {
            	scm.setCustomFields1(value);
            }else if(key.equals("scmTypeDTOcustomFields2"))
            {
            	scm.setCustomFields2(value);
            }else if(key.equals("scmTypeDTOcustomFields3"))
            {
            	scm.setCustomFields3(value);
            }else if(key.equals("scmTypeDTOcustomFields4"))
            {
            	scm.setCustomFields4(value);
            }else if(key.equals("scmTypeDTOcustomFields5"))
            {
            	scm.setCustomFields5(value);
            }else if(key.equals("scmTypeDTOcustomFields6"))
            {
            	scm.setCustomFields6(value);
            }else if(key.equals("scmTypeDTOcustomFields7"))
            {
            	scm.setCustomFields7(value);
            }else if(key.equals("scmTypeDTOcustomFields8"))
            {
            	scm.setCustomFields8(value);
            }else if(key.equals("scmTypeDTOcustomFields9"))
            {
            	scm.setCustomFields9(value);
            }else if(key.equals("scmTypeDTOcustomFields10"))
            {
            	scm.setCustomFields10(value);
            }else if(key.equals("scmTypeDTOcustomFields11"))
            {
            	scm.setCustomFields11(value);
            }else if(key.equals("scmTypeDTOcustomFields12"))
            {
            	scm.setCustomFields12(value);
            }else if(key.equals("scmTypeDTOcustomFields13"))
            {
            	scm.setCustomFields13(value);
            }else if(key.equals("scmTypeDTOcustomFields14"))
            {
            	scm.setCustomFields14(value);
            }else if(key.equals("scmTypeDTOcustomFields15"))
            {
            	scm.setCustomFields15(value);
            }else if(key.equals("CustomerTypeDTOlastModifiedByNatlCode"))
            {
            	ctaDTO.setLastModifiedByNatlCode(value);
            }else if(key.equals("CustomerTypeDTOlastModifedBySegment"))
            {
            	ctaDTO.setLastModifedBySegment(value);
            }else if(key.equals("CorporateCustomerDTObusinessCode"))
            {
            	ccd.setBusinessCode(value);
            	apiObj.setCorporateCustomerDTO(ccd);
            }else if(key.equals("CorporateCustomerDTOCorLocCity"))
            {
            	ccl.setCity(value);
            	ccd.setCorporateLocaladdress(ccl);
            }else if(key.equals("CorporateCustomerDTOCorLocCountry"))
            {
            	ccl.setCountry(value);
            }else if(key.equals("CorporateCustomerDTOCorLocLine1"))
            {
            	ccl.setLine1(value);
            }else if(key.equals("CorporateCustomerDTOCorLocLine2"))
            {
            	ccl.setLine2(value);
            }else if(key.equals("CorporateCustomerDTOCorLocLine3"))
            {
            	ccl.setLine3(value);
            }else if(key.equals("CorporateCustomerDTOCorLocLine4"))
            {
            	ccl.setLine4(value);
            }else if(key.equals("CorporateCustomerDTOCorLocState"))
            {
            	ccl.setState(value);
            }else if(key.equals("CorporateCustomerDTOCorLocState"))
            {
            	ccl.setZip(value);
            }else if(key.equals("CorporateCustomerDTOCorPerCity"))
            {
            	ccp.setCity(value);
            	ccd.setCorporatePermanentaddress(ccp);
            }else if(key.equals("CorporateCustomerDTOCorPerCountry"))
            {
            	ccp.setCountry(value);
            }else if(key.equals("CorporateCustomerDTOCorPerLine1"))
            {
            	ccp.setLine1(value);
            }else if(key.equals("CorporateCustomerDTOCorPerLine2"))
            {
            	ccp.setLine2(value);
            }else if(key.equals("CorporateCustomerDTOCorPerLine3"))
            {
            	ccp.setLine3(value);
            }else if(key.equals("CorporateCustomerDTOCorPerLine4"))
            {
            	ccp.setLine4(value);
            }else if(key.equals("CorporateCustomerDTOCorPerState"))
            {
            	ccp.setState(value);
            }else if(key.equals("CorporateCustomerDTOCorPerZip"))
            {
            	ccp.setZip(value);
            }else if(key.equals("CorporateCustomerDTOcountryOfResidence"))
            {
            	ccd.setCountryOfResidence(value);
            }else if(key.equals("CorporateCustomerDTOcustomerMobilePhone"))
            {
            	ccd.setCustomerMobilePhone(value);
            }else if(key.equals("CorporateCustomerDTOemailId"))
            {
            	ccd.setEmailId(value);
            }else if(key.equals("CorporateCustomerDTOnationality"))
            {
            	ccd.setNationality(value);
            }else if(key.equals("CorporateCustomerDTOnationalIdentificationCode"))
            {
            	ccd.setNationalIdentificationCode(value);
            }else if(key.equals("CorporateCustomerDTOCorporateNamePrefix"))
            {
            	cn.setPrefix(value);
            	ccd.setCorporateName(cn);
            }else if(key.equals("CorporateCustomerDTOCorporateNameFirstName"))
            {
            	cn.setFirstName(value);
            }else if(key.equals("CorporateCustomerDTOCorporateNameMidName"))
            {
            	cn.setMidName(value);
            }else if(key.equals("CorporateCustomerDTOCorporateNameLastName"))
            {
            	cn.setLastName(value);
            }else if(key.equals("CorporateCustomerDTOCorporateNameShortName"))
            {
            	cn.setShortName(value);
            }else if(key.equals("CorporateCustomerDTOdateOfBirthOrRegistration"))
            {
            	ccd.setDateOfBirthOrRegistration(value);
            }else if(key.equals("CorporateCustomerDTOsignatureType"))
            {
            	ccd.setSignatureType(value);
            }else if(key.equals("CorporateCustomerDTOphone"))
            {
            	ccd.setPhone(value);
            }else if(key.equals("CorporateCustomerDTOorigin"))
            {
            	ccd.setOrigin(value);
            }else if(key.equals("CorporateCustomerDTOlanguage"))
            {
            	ccd.setLanguage(value);
            }else if(key.equals("CorporateCustomerDTOhomeBranchCode"))
            {
            	ccd.setHomeBranchCode(value);
            }else if(key.equals("CodMsgType"))
            {
            	apiObj.setCodMsgType(value);
            }else if(key.equals("CustID"))
            {
            	apiObj.setCustID(value);
            }else if(key.equals("Remarks"))
            {
            	apiObj.setRemarks(value);
            }else if(key.equals("RemitterName"))
            {
            	apiObj.setRemitterName(value);
            }else if(key.equals("hierarchyDirection"))
            {
            	apiObj.setHierarchyDirection(value);
            }else if(key.equals("accountNumber"))
            {
            	apiObj.setAccountNumber(value);
            }else if(key.equals("TransactionAmount"))
            {
            	apiObj.setTransactionAmount(value);
            }else if(key.equals("BenefId"))
            {
            	apiObj.setBenefId(value);
            }else if(key.equals("BenefName"))
            {
            	apiObj.setBenefName(value);
            }else if(key.equals("BenefAcctNo"))
            {
            	apiObj.setBenefAcctNo(value);
            }else if(key.equals("BeneficiaryAccountType"))
            {
            	apiObj.setBeneficiaryAccountType(value);
            }else if(key.equals("BenefAddr1"))
            {
            	apiObj.setBenefAddr1(value);
            }else if(key.equals("BenefAddr2"))
            {
            	apiObj.setBenefAddr2(value);
            }else if(key.equals("BenefAddr3"))
            {
            	apiObj.setBenefAddr3(value);
            }else if(key.equals("MessageID"))
            {
            	apiObj.setMessageID(value);
            }else if(key.equals("NetworkID"))
            {
            	apiObj.setNetworkID(value);
            }else if(key.equals("CodIFSCSend"))
            {
            	apiObj.setCodIFSCSend(value);
            }else if(key.equals("CodIFSCBenef"))
            {
            	apiObj.setCodIFSCBenef(value);
            }else if(key.equals("HangeRate"))
            {
            	apiObj.setHangeRate(value);
            }else if(key.equals("ExternalID"))
            {
            	apiObj.setExternalID(value);
            }else if(key.equals("SendRecvInfo1"))
            {
            	apiObj.setSendRecvInfo1(value);
            }else if(key.equals("SendRecvInfo2"))
            {
            	apiObj.setSendRecvInfo2(value);
            }else if(key.equals("SendRecvInfo3"))
            {
            	apiObj.setSendRecvInfo3(value);
            }else if(key.equals("SendRecvInfo4"))
            {
            	apiObj.setSendRecvInfo4(value);
            }else if(key.equals("SendRecvInfo5"))
            {
            	apiObj.setSendRecvInfo5(value);
            }else if(key.equals("SendRecvInfo6"))
            {
            	apiObj.setSendRecvInfo6(value);
            }else if(key.equals("SendRecvInfo7"))
            {
            	apiObj.setSendRecvInfo7(value);
            }else if(key.equals("RemitOrg1"))
            {
            	apiObj.setRemitOrg1(value);
            }else if(key.equals("RemitOrg2"))
            {
            	apiObj.setRemitOrg2(value);
            }else if(key.equals("RemitOrg3"))
            {
            	apiObj.setRemitOrg3(value);
            }else if(key.equals("RemitOrg4"))
            {
            	apiObj.setRemitOrg4(value);
            }else if(key.equals("ExtUserId"))
            {
            	apiObj.setExtUserId(value);
            }else if(key.equals("SourceReferenceNo"))
            {
            	apiObj.setSourceReferenceNo(value);
            }else if(key.equals("BenefNREFlg"))
            {
            	apiObj.setBenefNREFlg(value);
            }else if(key.equals("ChequeNo"))
            {
            	apiObj.setChequeNo(value);
            }else if(key.equals("PyamentRemark1"))
            {
            	apiObj.setPyamentRemark1(value);
            }else if(key.equals("PyamentRemark2"))
            {
            	apiObj.setPyamentRemark2(value);
            }else if(key.equals("PyamentRemark3"))
            {
            	apiObj.setPyamentRemark3(value);
            }else if(key.equals("PyamentRemark4"))
            {
            	apiObj.setPyamentRemark4(value);
            }else if(key.equals("SenderInformation"))
            {
            	apiObj.setSenderInformation(value);
            }else if(key.equals("SendingCustomerEmailId"))
            {
            	apiObj.setSendingCustomerEmailId(value);
            }else if(key.equals("SendingCustomerMobileNo"))
            {
            	apiObj.setSendingCustomerMobileNo(value);
            }else if(key.equals("originalTransactionChannelId"))
            {
            	apiObj.setOriginalTransactionChannelId(value);
            }else if(key.equals("originalTransactionServiceCode"))
            {
            	apiObj.setOriginalTransactionServiceCode(value);
            }else if(key.equals("isSplit"))
            {
            	apiObj.setIsSplit(value);
            }else if(key.equals("CustChangeType"))
            {
            	apiObj.setCustChangeType(value);
            }else if(key.equals("EnrichCustomerId"))
            {
            	apiObj.setEnrichCustomerId(value);
            }else if(key.equals("CustomerTypeNew"))
            {
            	apiObj.setCustomerTypeNew(value);
            }else if(key.equals("CategoryNew"))
            {
            	apiObj.setCategoryNew(value);
            }else if(key.equals("CustNationalIdentificationCodeNew"))
            {
            	apiObj.setCustNationalIdentificationCodeNew(value);
            }else if(key.equals("fromCustomerID"))
            {
            	airtel.setFromCustomerID(value);
            	apiObj.setAirtelExtSupplyChainHierarchyCheckRequestDTO(airtel);
            }else if(key.equals("toCustomerID"))
            {
            	airtel.setToCustomerID(value);
            }else if(key.equals("CDRmobileNumber"))
            {
            	cdr.setMobileNumber(value);
            	apiObj.setCustomerDataRequestDTO(cdr);
            }else if(key.equals("CDRcustomerSegment"))
            {
            	cdr.setCustomerSegment(value);
            }else if(key.equals("CDRaccountNumber"))
            {
            	cdr.setAccountNumber(value);
            }else if(key.equals("CDRfirstName"))
            {
            	cdr.setFirstName(value);
            }else if(key.equals("CDRlastName"))
            {
            	cdr.setLastName(value);
            }else if(key.equals("AirModNomineenomineeId"))
            {
            	modifyNominee.setNomineeId(value);
            	apiObj.setModifyNominee(modifyNominee);
            }else if(key.equals("AirModNomineeaccountNumber"))
            {
            	modifyNominee.setAccountNumber(value);
            }else if(key.equals("CusAccNomDTOnomineeName"))
            {
            	cus_acc_Nom.setNomineeName(value);
            	modifyNominee.setCus_acc_Nominee(cus_acc_Nom);
            }else if(key.equals("CusAccNomDTOnomineedateOfBirth"))
            {
            	cus_acc_Nom.setNomineedateOfBirth(value);
            }else if(key.equals("CusAccNomDTOrelAcctHolder"))
            {
            	cus_acc_Nom.setRelAcctHolder(value);
            }else if(key.equals("CusAccNomDTOnomineeAddressLine1"))
            {
            	cus_acc_Nom.setNomineeAddressLine1(value);
            }else if(key.equals("CusAccNomDTOnomineeAddressLine2"))
            {
            	cus_acc_Nom.setNomineeAddressLine2(value);
            }else if(key.equals("CusAccNomDTOnomineeAddressLine3"))
            {
            	cus_acc_Nom.setNomineeAddressLine3(value);
            }else if(key.equals("CusAccNomDTOnomineeAddressLine4"))
            {
            	cus_acc_Nom.setNomineeAddressLine4(value);
            }else if(key.equals("CusAccNomDTOnomineeDistrict"))
            {
            	cus_acc_Nom.setNomineeDistrict(value);
            }else if(key.equals("CusAccNomDTOnomineeCity"))
            {
            	cus_acc_Nom.setNomineeCity(value);
            }else if(key.equals("CusAccNomDTOnomineeState"))
            {
            	cus_acc_Nom.setNomineeState(value);
            }else if(key.equals("CusAccNomDTOnomineeCountry"))
            {
            	cus_acc_Nom.setNomineeCountry(value);
            }else if(key.equals("CusAccNomDTOnomineeZip"))
            {
            	cus_acc_Nom.setNomineeZip(value);
            }else if(key.equals("CusAccNomDTOnomPhone"))
            {
            	cus_acc_Nom.setNomPhone(value);
            }else if(key.equals("CusAccNomDTOnomMobile"))
            {
            	cus_acc_Nom.setNomMobile(value);
            }else if(key.equals("CusAccNomDTOnomEmailId"))
            {
            	cus_acc_Nom.setNomEmailId(value);
            }else if(key.equals("CusAccNomDTOrelationGuardian"))
            {
            	cus_acc_Nom.setRelationGuardian(value);
            }else if(key.equals("CusAccNomDTOguardianName"))
            {
            	cus_acc_Nom.setGuardianName(value);
            }else if(key.equals("CusAccNomDTOguardianDateofBirth"))
            {
            	cus_acc_Nom.setGuardianDateofBirth(value);
            }else if(key.equals("CusAccNomDTOguardianAddressLine1"))
            {
            	cus_acc_Nom.setGuardianAddressLine1(value);
            }else if(key.equals("CusAccNomDTOguardianAddressLine2"))
            {
            	cus_acc_Nom.setGuardianAddressLine2(value);
            }else if(key.equals("CusAccNomDTOguardianAddressLine3"))
            {
            	cus_acc_Nom.setGuardianAddressLine3(value);
            }else if(key.equals("CusAccNomDTOguardianAddressLine4"))
            {
            	cus_acc_Nom.setGuardianAddressLine4(value);
            }else if(key.equals("CusAccNomDTOgurdianDistrict"))
            {
            	cus_acc_Nom.setGurdianDistrict(value);
            }else if(key.equals("CusAccNomDTOguardianCity"))
            {
            	cus_acc_Nom.setGuardianCity(value);
            }else if(key.equals("CusAccNomDTOguardianState"))
            {
            	cus_acc_Nom.setGuardianState(value);
            }else if(key.equals("CusAccNomDTOguardianCountry"))
            {
            	cus_acc_Nom.setGuardianCountry(value);
            }else if(key.equals("CusAccNomDTOguardianZip"))
            {
            	cus_acc_Nom.setGuardianZip(value);
            }else if(key.equals("CusAccNomDTOguardianPhone"))
            {
            	cus_acc_Nom.setGuardianPhone(value);
            }else if(key.equals("CusAccNomDTOguardianMobile"))
            {
            	cus_acc_Nom.setGuardianMobile(value);
            }else if(key.equals("CusAccNomDTOguardianEmailId"))
            {
            	cus_acc_Nom.setGuardianEmailId(value);
            }else if(key.equals("CusAccNomDTOsharePercentage"))
            {
            	cus_acc_Nom.setSharePercentage(value);
            }else if(key.equals("CusAccNomDTOshareAmount"))
            {
            	cus_acc_Nom.setShareAmount(value);
            }else if(key.equals("productType"))
            {
            	apiObj.setProductType(value);
            }else if(key.equals("minorAcctStatus"))
            {
            	apiObj.setMinorAcctStatus(value);
            }else if(key.equals("accountTitle"))
            {
            	apiObj.setAccountTitle(value);
            }else if(key.equals("flagUseExistingAccountNominee"))
            {
            	apiObj.setFlagUseExistingAccountNominee(value);
            }else if(key.equals("A023CustNationalIdentificationCode"))
            {          	
            	apiObj.setCustNationalIdentificationCode(dbconn.setUpConnection(configProperty.getProperty("dburl"), configProperty.getProperty("dbusername"), configProperty.getProperty("dbuserpwd")));            	
            }else if(key.equals("A025IndividualDTOnationalIdentificationCode"))
            {
            	individualCustomerDTO.setNationalIdentificationCode(dbconn.lkyA025(configProperty.getProperty("dburl"), configProperty.getProperty("dbusername"), configProperty.getProperty("dbuserpwd")));
            }else if(key.equals("A025IndividualDTOcustomerMobilePhone"))
            {
            	individualCustomerDTO.setNationalIdentificationCode(dbconn.lkyA025(configProperty.getProperty("dburl"), configProperty.getProperty("dbusername"), configProperty.getProperty("dbuserpwd")));
            }else if(key.equals("A025SBAIndividualDTOnationalIdentificationCode"))
            {
            	individualCustomerDTO.setNationalIdentificationCode(dbconn.fkyA025(configProperty.getProperty("dburl"), configProperty.getProperty("dbusername"), configProperty.getProperty("dbuserpwd")));
            }else if(key.equals("A025SBAIndividualDTOcustomerMobilePhone"))
            {
            	individualCustomerDTO.setNationalIdentificationCode(dbconn.fkyA025(configProperty.getProperty("dburl"), configProperty.getProperty("dbusername"), configProperty.getProperty("dbuserpwd")));
            }else if(key.equals("A025IndividualDTOaadhaarNo"))
            {
            	individualCustomerDTO.setAadhaarNo(RAS.aadharGeneration());
            }
        }
        
        File f = new File("D:\\file.xml");
		
		JAXBContext contxtObj = JAXBContext.newInstance(input.class);
		
		Marshaller marshallerObj = contxtObj.createMarshaller();
		
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
				
		StringWriter sw = new StringWriter();
		marshallerObj.marshal(apiObj, sw);
		String xmlString = sw.toString();
		
		System.out.println(xmlString);
		
		return xmlString;
		
	}

}
