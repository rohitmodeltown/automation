package com.APBCBS.api.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class input {

	private SessionContext SessionContext;
	
	private String accountStatusOption;
	private String reasonCode;
	
	/*--------------A504 API----------------*/
	private AirtelExtSupplyChainHierarchyCheckRequestDTO AirtelExtSupplyChainHierarchyCheckRequestDTO;
	
	/*--------------A509 API----------------*/
	private CustomerDataRequestDTO customerDataRequestDTO;
	
	/*--------------A024 API----------------*/
	private String custChangeType;
	private String enrichCustomerId;
	private String customerTypeNew;
	private String categoryNew;
	private String custNationalIdentificationCodeNew;
	
	/*--------------A035 API----------------*/
	private String originalTransactionChannelId;
	private String originalTransactionServiceCode;
	private String isSplit;
	
	/*--------------A007, A035 API-----------------*/
	private String transactionAmount;
	private String benefId;
	private String benefName;
	private String beneficiaryAccountType;
	private String benefAddr1;
	private String benefAddr2;
	private String benefAddr3;
	private String messageID;
	private String networkID;
	private String codIFSCSend;
	private String codIFSCBenef;
	private String hangeRate;
	private String externalID;
	private String sendRecvInfo1;
	private String sendRecvInfo2;
	private String sendRecvInfo3;
	private String sendRecvInfo4;
	private String sendRecvInfo5;
	private String sendRecvInfo6;
	private String sendRecvInfo7;
	private String remitOrg1;
	private String remitOrg2;
	private String remitOrg3;
	private String remitOrg4;
	private String extUserId;
	private String sourceReferenceNo;
	private String benefNREFlg;
	private String chequeNo;
	private String PyamentRemark1;
	private String PyamentRemark2;
	private String PyamentRemark3;
	private String PyamentRemark4;
	private String senderInformation;
	private String sendingCustomerEmailId;
	private String sendingCustomerMobileNo;
	
	/*--------------A510, A528 API-----------------*/
	private String accountNumber;
	
	/*--------------A505 API-----------------*/
	private String hierarchyDirection;
	
	/*----------------A010 API---------------*/
	private String remitterName;
	private String remarks;
	private String custID;
	private String codMsgType;
	
	/*-----------A047, A048 API-------------*/
	private String customerNationaIdentificationCode;
	private scmTypeAdditionalDTO scmTypeAdditionalDTO;
	private CorporateCustomerDTO corporateCustomerDTO;
	
	/*---------------A022 API Variable*/
	private String nationalIdentificationCode;
	private String aadharCardNo;
	private String emailId;
	private String panNo;
	
	/*-------------A004, A007, A505, A510 API Variable-----------*/
	private String branchCode;
	private String userId;
	private String pageSize;
	private String pageNo;
	private String startDate;
	private String endDate;
	
	/*-------------A039, A040 API Variable-----------*/
	private String accountID;
	private String fromDate;
	private String toDate;
	
	/*----------A023 API-----------*/
	private String productType;
	private String minorAcctStatus;
	private String accountTitle;
	private String flagUseExistingAccountNominee;
	
	/*------------A002, A004, A006, A023, A039, A040, A526 API Variable-----------------*/	
	private String productCode;
	private String accountNo;
	
	/*------------------A006, A007 API Variable-------------*/
	
	private String narrative;
	private String txnAction;
	private String earmarkType;
	
	
	/*-------A002, A004, A007, A010, A023, A024, A039, A040, A050, A051, A505, A510, A527 API Variable---------------*/
	
	private String custNationalIdentificationCode;
	private String customerSegment;
	private String customerID;
	
	/*---A044, A046, A049, A528 API variable-----*/
	private String misClass;
	private String misCode;
	private String customerClass;
	private IndividualCustomerDTO IndividualCustomerDTO;
	private merchantTypeAdditionalDTO merchantTypeAdditionalDTO;
	private accountOpenDTO accountOpenDTO;
	private smsDetails smsDetails;
	private CustomerTypeAdditionalDTO CustomerTypeAdditionalDTO;
	private accountNomineeDTO accountNomineeDTO;
	
	/*-----A022, A023, A024, A047, A048, A049, A050, A051, A505, A510, A527 API Variable---------*/
	
	private String customerNationalIdentificationCode;
	private String customerType;
	
	/*----A004, A006, A007, A003, A010, A021, A031, A035, A036, A038, A052, A053, A054, A055 API Variable*/
	private String transactionType;
	private String fromAccount;
	private String fromCustNationalIdentificationCode;
	private String fromCustomerSegment;
	private String FromProductCode;
	private String txnCCY;
	private String toAccount;
	private String toCustNationalIdentificationCode;
	private String toCustomerSegment;
	private String toProductCode;
	private String txnAmount;
	private String drNarrative;
	private String crNarrative;
	private String fromSMSFlag;
	private String fromSMSAddition;
	private String toSMSFlag;
	private String toSMSAddition;
	private String onBehalfNationalIdentificationCode;
	private String onBehalfCustomerName;
	private String differentialChargingParam1;
	private String differentialChargingParam2;
	private String differentialChargingParam3;
	private String addtionalField1;
	private String addtionalField2;
	private String originalReferenceNo;
	
	/*------------A007, A010, A036------------*/
	
	private String remitterProductCode;
	private String remitterMMID;
	private String amtTxn;
	private String beneficiaryID;
	private String benefIFSCCode;
	private String benefAcctNo;
	private String remitAcctType;
	
	
	/*------------A031------------*/
	private String transferMode;
	private String fromGLCode;
	private String fromBranchCode;
	private String toGLCode;
	private String toBranchCode;

	/*------------A006, A054------------*/
	
	private String holdNumber;
	private String expiryDate;
	private String earMarkType;
	private String holdAmount;
	
	/*--------------------A021, A055-----------------*/
	
	private String refundTransactionReferenceNumber;
	private String flagFullOrPartial;
	private String flagScReversal;
	
	/*-------------------A526-----------------------*/
	private AirtelExtAddModifyNomineeRequestDTO modifyNominee;
	
	@XmlElement(name="AirtelExtAddModifyNomineeRequestDTO")
	public AirtelExtAddModifyNomineeRequestDTO getModifyNominee() {
		return modifyNominee;
	}



	public void setModifyNominee(AirtelExtAddModifyNomineeRequestDTO modifyNominee) {
		this.modifyNominee = modifyNominee;
	}



	@XmlElement(name="CustomerDataRequestDTO")
	public CustomerDataRequestDTO getCustomerDataRequestDTO() {
		return customerDataRequestDTO;
	}



	public void setCustomerDataRequestDTO(CustomerDataRequestDTO customerDataRequestDTO) {
		this.customerDataRequestDTO = customerDataRequestDTO;
	}



	@XmlElement(name="AirtelExtSupplyChainHierarchyCheckRequestDTO")
	public AirtelExtSupplyChainHierarchyCheckRequestDTO getAirtelExtSupplyChainHierarchyCheckRequestDTO() {
		return this.AirtelExtSupplyChainHierarchyCheckRequestDTO;
	}



	public void setAirtelExtSupplyChainHierarchyCheckRequestDTO(
			AirtelExtSupplyChainHierarchyCheckRequestDTO airtelExtSupplyChainHierarchyCheckRequestDTO) {
		AirtelExtSupplyChainHierarchyCheckRequestDTO = airtelExtSupplyChainHierarchyCheckRequestDTO;
	}



	@XmlElement(name="CustChangeType")
	public String getCustChangeType() {
		return custChangeType;
	}



	public void setCustChangeType(String custChangeType) {
		this.custChangeType = custChangeType;
	}


	@XmlElement(name="EnrichCustomerId")
	public String getEnrichCustomerId() {
		return enrichCustomerId;
	}



	public void setEnrichCustomerId(String enrichCustomerId) {
		this.enrichCustomerId = enrichCustomerId;
	}


	@XmlElement(name="CustomerTypeNew")
	public String getCustomerTypeNew() {
		return customerTypeNew;
	}



	public void setCustomerTypeNew(String customerTypeNew) {
		this.customerTypeNew = customerTypeNew;
	}


	@XmlElement(name="CategoryNew")
	public String getCategoryNew() {
		return categoryNew;
	}



	public void setCategoryNew(String categoryNew) {
		this.categoryNew = categoryNew;
	}


	@XmlElement(name="CustNationalIdentificationCodeNew")
	public String getCustNationalIdentificationCodeNew() {
		return custNationalIdentificationCodeNew;
	}



	public void setCustNationalIdentificationCodeNew(String custNationalIdentificationCodeNew) {
		this.custNationalIdentificationCodeNew = custNationalIdentificationCodeNew;
	}



	@XmlElement(name="originalTransactionChannelId")
	public String getOriginalTransactionChannelId() {
		return originalTransactionChannelId;
	}



	public void setOriginalTransactionChannelId(String originalTransactionChannelId) {
		this.originalTransactionChannelId = originalTransactionChannelId;
	}


	@XmlElement(name="originalTransactionServiceCode")
	public String getOriginalTransactionServiceCode() {
		return originalTransactionServiceCode;
	}



	public void setOriginalTransactionServiceCode(String originalTransactionServiceCode) {
		this.originalTransactionServiceCode = originalTransactionServiceCode;
	}


	@XmlElement(name="isSplit")
	public String getIsSplit() {
		return isSplit;
	}



	public void setIsSplit(String isSplit) {
		this.isSplit = isSplit;
	}



	@XmlElement(name="TransactionAmount")
	public String getTransactionAmount() {
		return transactionAmount;
	}



	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	@XmlElement(name="BenefId")
	public String getBenefId() {
		return benefId;
	}



	public void setBenefId(String benefId) {
		this.benefId = benefId;
	}


	@XmlElement(name="BenefName")
	public String getBenefName() {
		return benefName;
	}



	public void setBenefName(String benefName) {
		this.benefName = benefName;
	}


	@XmlElement(name="BeneficiaryAccountType")
	public String getBeneficiaryAccountType() {
		return beneficiaryAccountType;
	}



	public void setBeneficiaryAccountType(String beneficiaryAccountType) {
		this.beneficiaryAccountType = beneficiaryAccountType;
	}


	@XmlElement(name="BenefAddr1")
	public String getBenefAddr1() {
		return benefAddr1;
	}



	public void setBenefAddr1(String benefAddr1) {
		this.benefAddr1 = benefAddr1;
	}


	@XmlElement(name="BenefAddr2")
	public String getBenefAddr2() {
		return benefAddr2;
	}



	public void setBenefAddr2(String benefAddr2) {
		this.benefAddr2 = benefAddr2;
	}


	@XmlElement(name="BenefAddr3")
	public String getBenefAddr3() {
		return benefAddr3;
	}



	public void setBenefAddr3(String bnefAddr3) {
		this.benefAddr3 = bnefAddr3;
	}


	@XmlElement(name="MessageID")
	public String getMessageID() {
		return messageID;
	}



	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}


	@XmlElement(name="NetworkID")
	public String getNetworkID() {
		return networkID;
	}



	public void setNetworkID(String networkID) {
		this.networkID = networkID;
	}


	@XmlElement(name="CodIFSCSend")
	public String getCodIFSCSend() {
		return codIFSCSend;
	}



	public void setCodIFSCSend(String codIFSCSend) {
		this.codIFSCSend = codIFSCSend;
	}


	@XmlElement(name="CodIFSCBenef")
	public String getCodIFSCBenef() {
		return codIFSCBenef;
	}



	public void setCodIFSCBenef(String codIFSCBenef) {
		this.codIFSCBenef = codIFSCBenef;
	}


	@XmlElement(name="HangeRate")
	public String getHangeRate() {
		return hangeRate;
	}


	
	public void setHangeRate(String hangeRate) {
		this.hangeRate = hangeRate;
	}


	@XmlElement(name="ExternalID")
	public String getExternalID() {
		return externalID;
	}


	
	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}


	@XmlElement(name="SendRecvInfo1")
	public String getSendRecvInfo1() {
		return sendRecvInfo1;
	}



	public void setSendRecvInfo1(String sendRecvInfo1) {
		this.sendRecvInfo1 = sendRecvInfo1;
	}


	@XmlElement(name="SendRecvInfo2")
	public String getSendRecvInfo2() {
		return sendRecvInfo2;
	}



	public void setSendRecvInfo2(String sendRecvInfo2) {
		this.sendRecvInfo2 = sendRecvInfo2;
	}


	@XmlElement(name="SendRecvInfo3")
	public String getSendRecvInfo3() {
		return sendRecvInfo3;
	}



	public void setSendRecvInfo3(String sendRecvInfo3) {
		this.sendRecvInfo3 = sendRecvInfo3;
	}


	@XmlElement(name="SendRecvInfo4")
	public String getSendRecvInfo4() {
		return sendRecvInfo4;
	}



	public void setSendRecvInfo4(String sendRecvInfo4) {
		this.sendRecvInfo4 = sendRecvInfo4;
	}


	@XmlElement(name="SendRecvInfo5")
	public String getSendRecvInfo5() {
		return sendRecvInfo5;
	}



	public void setSendRecvInfo5(String sendRecvInfo5) {
		this.sendRecvInfo5 = sendRecvInfo5;
	}


	@XmlElement(name="SendRecvInfo6")
	public String getSendRecvInfo6() {
		return sendRecvInfo6;
	}



	public void setSendRecvInfo6(String sendRecvInfo6) {
		this.sendRecvInfo6 = sendRecvInfo6;
	}


	@XmlElement(name="SendRecvInfo7")
	public String getSendRecvInfo7() {
		return sendRecvInfo7;
	}



	public void setSendRecvInfo7(String sendRecvInfo7) {
		this.sendRecvInfo7 = sendRecvInfo7;
	}


	@XmlElement(name="RemitOrg1")
	public String getRemitOrg1() {
		return remitOrg1;
	}



	public void setRemitOrg1(String remitOrg1) {
		this.remitOrg1 = remitOrg1;
	}


	@XmlElement(name="RemitOrg2")
	public String getRemitOrg2() {
		return remitOrg2;
	}



	public void setRemitOrg2(String remitOrg2) {
		this.remitOrg2 = remitOrg2;
	}


	@XmlElement(name="RemitOrg3")
	public String getRemitOrg3() {
		return remitOrg3;
	}



	public void setRemitOrg3(String remitOrg3) {
		this.remitOrg3 = remitOrg3;
	}


	@XmlElement(name="RemitOrg4")
	public String getRemitOrg4() {
		return remitOrg4;
	}



	public void setRemitOrg4(String remitOrg4) {
		this.remitOrg4 = remitOrg4;
	}


	@XmlElement(name="ExtUserId")
	public String getExtUserId() {
		return extUserId;
	}



	public void setExtUserId(String extUserId) {
		this.extUserId = extUserId;
	}


	@XmlElement(name="SourceReferenceNo")
	public String getSourceReferenceNo() {
		return sourceReferenceNo;
	}



	public void setSourceReferenceNo(String sourceReferenceNo) {
		this.sourceReferenceNo = sourceReferenceNo;
	}


	@XmlElement(name="BenefNREFlg")
	public String getBenefNREFlg() {
		return benefNREFlg;
	}



	public void setBenefNREFlg(String benefNREFlg) {
		this.benefNREFlg = benefNREFlg;
	}


	@XmlElement(name="ChequeNo")
	public String getChequeNo() {
		return chequeNo;
	}



	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}


	@XmlElement(name="PyamentRemark1")
	public String getPyamentRemark1() {
		return PyamentRemark1;
	}



	public void setPyamentRemark1(String pyamentRemark1) {
		PyamentRemark1 = pyamentRemark1;
	}


	@XmlElement(name="PyamentRemark2")
	public String getPyamentRemark2() {
		return PyamentRemark2;
	}



	public void setPyamentRemark2(String pyamentRemark2) {
		PyamentRemark2 = pyamentRemark2;
	}


	@XmlElement(name="PyamentRemark3")
	public String getPyamentRemark3() {
		return PyamentRemark3;
	}



	public void setPyamentRemark3(String pyamentRemark3) {
		PyamentRemark3 = pyamentRemark3;
	}


	@XmlElement(name="PyamentRemark4")
	public String getPyamentRemark4() {
		return PyamentRemark4;
	}



	public void setPyamentRemark4(String pyamentRemark4) {
		PyamentRemark4 = pyamentRemark4;
	}


	@XmlElement(name="SenderInformation")
	public String getSenderInformation() {
		return senderInformation;
	}



	public void setSenderInformation(String senderInformation) {
		this.senderInformation = senderInformation;
	}


	@XmlElement(name="SendingCustomerEmailId")
	public String getSendingCustomerEmailId() {
		return sendingCustomerEmailId;
	}



	public void setSendingCustomerEmailId(String sendingCustomerEmailId) {
		this.sendingCustomerEmailId = sendingCustomerEmailId;
	}


	@XmlElement(name="SendingCustomerMobileNo")
	public String getSendingCustomerMobileNo() {
		return sendingCustomerMobileNo;
	}



	public void setSendingCustomerMobileNo(String sendingCustomerMobileNo) {
		this.sendingCustomerMobileNo = sendingCustomerMobileNo;
	}



	@XmlElement(name="accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	@XmlElement(name="hierarchyDirection")
	public String getHierarchyDirection() {
		return hierarchyDirection;
	}



	public void setHierarchyDirection(String hierarchyDirection) {
		this.hierarchyDirection = hierarchyDirection;
	}



	@XmlElement(name="RemitterName")
	public String getRemitterName() {
		return remitterName;
	}



	public void setRemitterName(String remitterName) {
		this.remitterName = remitterName;
	}


	@XmlElement(name="Remarks")
	public String getRemarks() {
		return remarks;
	}



	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	@XmlElement(name="CustID")
	public String getCustID() {
		return custID;
	}



	public void setCustID(String custID) {
		this.custID = custID;
	}


	@XmlElement(name="CodMsgType")
	public String getCodMsgType() {
		return codMsgType;
	}



	public void setCodMsgType(String codMsgType) {
		this.codMsgType = codMsgType;
	}



	@XmlElement(name="CorporateCustomerDTO")
	public CorporateCustomerDTO getCorporateCustomerDTO() {
		return corporateCustomerDTO;
	}



	public void setCorporateCustomerDTO(CorporateCustomerDTO corporateCustomerDTO) {
		this.corporateCustomerDTO = corporateCustomerDTO;
	}



	@XmlElement(name="CustomerNationaIdentificationCode")
	public String getCustomerNationaIdentificationCode() {
		return customerNationaIdentificationCode;
	}



	public void setCustomerNationaIdentificationCode(String customerNationaIdentificationCode) {
		this.customerNationaIdentificationCode = customerNationaIdentificationCode;
	}


	@XmlElement(name="scmTypeAdditionalDTO")
	public scmTypeAdditionalDTO getScmTypeAdditionalDTO() {
		return scmTypeAdditionalDTO;
	}



	public void setScmTypeAdditionalDTO(scmTypeAdditionalDTO scmTypeAdditionalDTO) {
		this.scmTypeAdditionalDTO = scmTypeAdditionalDTO;
	}



	@XmlElement(name="RemitterProductCode")
	public String getRemitterProductCode() {
		return remitterProductCode;
	}



	public void setRemitterProductCode(String remitterProductCode) {
		this.remitterProductCode = remitterProductCode;
	}


	@XmlElement(name="RemitterMMID")
	public String getRemitterMMID() {
		return remitterMMID;
	}



	public void setRemitterMMID(String remitterMMID) {
		this.remitterMMID = remitterMMID;
	}


	@XmlElement(name="AmtTxn")
	public String getAmtTxn() {
		return amtTxn;
	}



	public void setAmtTxn(String amtTxn) {
		this.amtTxn = amtTxn;
	}


	@XmlElement(name="BeneficiaryID")
	public String getBeneficiaryID() {
		return beneficiaryID;
	}



	public void setBeneficiaryID(String beneficiaryID) {
		this.beneficiaryID = beneficiaryID;
	}


	@XmlElement(name="BenefIFSCCode")
	public String getBenefIFSCCode() {
		return benefIFSCCode;
	}



	public void setBenefIFSCCode(String benefIFSCCode) {
		this.benefIFSCCode = benefIFSCCode;
	}


	@XmlElement(name="BenefAcctNo")
	public String getBenefAcctNo() {
		return benefAcctNo;
	}



	public void setBenefAcctNo(String benefAcctNo) {
		this.benefAcctNo = benefAcctNo;
	}


	@XmlElement(name="RemitAcctType")
	public String getRemitAcctType() {
		return remitAcctType;
	}



	public void setRemitAcctType(String remitAcctType) {
		this.remitAcctType = remitAcctType;
	}



	@XmlElement(name="NationalIdentificationCode")
	public String getNationalIdentificationCode() {
		return nationalIdentificationCode;
	}



	public void setNationalIdentificationCode(String nationalIdentificationCode) {
		this.nationalIdentificationCode = nationalIdentificationCode;
	}


	@XmlElement(name="AadharCardNo")
	public String getAadharCardNo() {
		return aadharCardNo;
	}



	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}


	@XmlElement(name="EmailId")
	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@XmlElement(name="PanNo")
	public String getPanNo() {
		return panNo;
	}



	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}



	@XmlElement(name="BranchCode")
	public String getBranchCode() {
		return branchCode;
	}



	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	@XmlElement(name="UserId")
	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}


	@XmlElement(name="PageSize")
	public String getPageSize() {
		return pageSize;
	}



	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}


	@XmlElement(name="PageNo")
	public String getPageNo() {
		return pageNo;
	}



	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}


	@XmlElement(name="StartDate")
	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	@XmlElement(name="EndDate")
	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	@XmlElement(name="CustomerTypeAdditionalDTO")
	public CustomerTypeAdditionalDTO getCustomerTypeAdditionalDTO() {
		return CustomerTypeAdditionalDTO;
	}



	public void setCustomerTypeAdditionalDTO(CustomerTypeAdditionalDTO customerTypeAdditionalDTO) {
		this.CustomerTypeAdditionalDTO = customerTypeAdditionalDTO;
	}


	@XmlElement(name="accountNomineeDTO")
	public accountNomineeDTO getAccountNomineeDTO() {
		return accountNomineeDTO;
	}



	public void setAccountNomineeDTO(accountNomineeDTO accountNomineeDTO) {
		this.accountNomineeDTO = accountNomineeDTO;
	}



	@XmlElement(name="EarmarkType")
	public String getEarmarkType() {
		return earmarkType;
	}



	public void setEarmarkType(String earmarkType) {
		this.earmarkType = earmarkType;
	}



	@XmlElement(name="fromDate")
	public String getFromDate() {
		return fromDate;
	}



	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}


	@XmlElement(name="toDate")
	public String getToDate() {
		return toDate;
	}



	public void setToDate(String toDate) {
		this.toDate = toDate;
	}



	@XmlElement(name="Narrative")
	public String getNarrative() {
		return narrative;
	}



	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}


	@XmlElement(name="TxnAction")
	public String getTxnAction() {
		return txnAction;
	}



	public void setTxnAction(String txnAction) {
		this.txnAction = txnAction;
	}



	@XmlElement(name="AccountNo")	
	public String getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}



	@XmlElement(name="transferMode")
	public String getTransferMode() {
		return transferMode;
	}



	public void setTransferMode(String transferMode) {
		this.transferMode = transferMode;
	}


	@XmlElement(name="fromGLCode")
	public String getFromGLCode() {
		return fromGLCode;
	}



	public void setFromGLCode(String fromGLCode) {
		this.fromGLCode = fromGLCode;
	}


	@XmlElement(name="fromBranchCode")
	public String getFromBranchCode() {
		return fromBranchCode;
	}



	public void setFromBranchCode(String fromBranchCode) {
		this.fromBranchCode = fromBranchCode;
	}


	@XmlElement(name="toGLCode")
	public String getToGLCode() {
		return toGLCode;
	}



	public void setToGLCode(String toGLCode) {
		this.toGLCode = toGLCode;
	}


	@XmlElement(name="toBranchCode")
	public String getToBranchCode() {
		return toBranchCode;
	}



	public void setToBranchCode(String toBranchCode) {
		this.toBranchCode = toBranchCode;
	}



	@XmlElement(name="RefundTransactionReferenceNumber")
	public String getRefundTransactionReferenceNumber() {
		return refundTransactionReferenceNumber;
	}



	public void setRefundTransactionReferenceNumber(String refundTransactionReferenceNumber) {
		this.refundTransactionReferenceNumber = refundTransactionReferenceNumber;
	}


	@XmlElement(name="FlagFullOrPartial")
	public String getFlagFullOrPartial() {
		return flagFullOrPartial;
	}



	public void setFlagFullOrPartial(String flagFullOrPartial) {
		this.flagFullOrPartial = flagFullOrPartial;
	}


	@XmlElement(name="FlagScReversal")
	public String getFlagScReversal() {
		return flagScReversal;
	}



	public void setFlagScReversal(String flagScReversal) {
		this.flagScReversal = flagScReversal;
	}



	@XmlElement(name="HoldNumber")
	public String getHoldNumber() {
		return holdNumber;
	}



	public void setHoldNumber(String holdNumber) {
		this.holdNumber = holdNumber;
	}


	@XmlElement(name="ExpiryDate")
	public String getExpiryDate() {
		return expiryDate;
	}



	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	@XmlElement(name="EarMarkType")
	public String getEarMarkType() {
		return earMarkType;
	}



	public void setEarMarkType(String earMarkType) {
		this.earMarkType = earMarkType;
	}


	@XmlElement(name="HoldAmount")
	public String getHoldAmount() {
		return holdAmount;
	}



	public void setHoldAmount(String holdAmount) {
		this.holdAmount = holdAmount;
	}



	@XmlElement(name="transactionType")
	public String getTransactionType() {
		return transactionType;
	}



	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	@XmlElement(name="fromAccount")
	public String getFromAccount() {
		return fromAccount;
	}



	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}


	@XmlElement(name="fromCustNationalIdentificationCode")
	public String getFromCustNationalIdentificationCode() {
		return fromCustNationalIdentificationCode;
	}



	public void setFromCustNationalIdentificationCode(String fromCustNationalIdentificationCode) {
		this.fromCustNationalIdentificationCode = fromCustNationalIdentificationCode;
	}


	@XmlElement(name="fromCustomerSegment")
	public String getFromCustomerSegment() {
		return fromCustomerSegment;
	}



	public void setFromCustomerSegment(String fromCustomerSegment) {
		this.fromCustomerSegment = fromCustomerSegment;
	}


	@XmlElement(name="FromProductCode")
	public String getFromProductCode() {
		return FromProductCode;
	}



	public void setFromProductCode(String fromProductCode) {
		FromProductCode = fromProductCode;
	}


	@XmlElement(name="txnCCY")
	public String getTxnCCY() {
		return txnCCY;
	}



	public void setTxnCCY(String txnCCY) {
		this.txnCCY = txnCCY;
	}


	@XmlElement(name="toAccount")
	public String getToAccount() {
		return toAccount;
	}



	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}


	@XmlElement(name="toCustNationalIdentificationCode")
	public String getToCustNationalIdentificationCode() {
		return toCustNationalIdentificationCode;
	}



	public void setToCustNationalIdentificationCode(String toCustNationalIdentificationCode) {
		this.toCustNationalIdentificationCode = toCustNationalIdentificationCode;
	}


	@XmlElement(name="toCustomerSegment")
	public String getToCustomerSegment() {
		return toCustomerSegment;
	}



	public void setToCustomerSegment(String toCustomerSegment) {
		this.toCustomerSegment = toCustomerSegment;
	}


	@XmlElement(name="ToProductCode")
	public String getToProductCode() {
		return toProductCode;
	}



	public void setToProductCode(String toProductCode) {
		this.toProductCode = toProductCode;
	}


	@XmlElement(name="txnAmount")
	public String getTxnAmount() {
		return txnAmount;
	}



	public void setTxnAmount(String txnAmount) {
		this.txnAmount = txnAmount;
	}


	@XmlElement(name="DrNarrative")
	public String getDrNarrative() {
		return drNarrative;
	}



	public void setDrNarrative(String drNarrative) {
		this.drNarrative = drNarrative;
	}


	@XmlElement(name="CrNarrative")
	public String getCrNarrative() {
		return crNarrative;
	}



	public void setCrNarrative(String crNarrative) {
		this.crNarrative = crNarrative;
	}


	@XmlElement(name="FromSMSFlag")
	public String getFromSMSFlag() {
		return fromSMSFlag;
	}



	public void setFromSMSFlag(String fromSMSFlag) {
		this.fromSMSFlag = fromSMSFlag;
	}


	@XmlElement(name="FromSMSAddition")
	public String getFromSMSAddition() {
		return fromSMSAddition;
	}



	public void setFromSMSAddition(String fromSMSAddition) {
		this.fromSMSAddition = fromSMSAddition;
	}


	@XmlElement(name="ToSMSFlag")
	public String getToSMSFlag() {
		return toSMSFlag;
	}



	public void setToSMSFlag(String toSMSFlag) {
		this.toSMSFlag = toSMSFlag;
	}


	@XmlElement(name="ToSMSAddition")
	public String getToSMSAddition() {
		return toSMSAddition;
	}



	public void setToSMSAddition(String toSMSAddition) {
		this.toSMSAddition = toSMSAddition;
	}


	@XmlElement(name="onBehalfNationalIdentificationCode")
	public String getOnBehalfNationalIdentificationCode() {
		return onBehalfNationalIdentificationCode;
	}



	public void setOnBehalfNationalIdentificationCode(String onBehalfNationalIdentificationCode) {
		this.onBehalfNationalIdentificationCode = onBehalfNationalIdentificationCode;
	}


	@XmlElement(name="onBehalfCustomerName")
	public String getOnBehalfCustomerName() {
		return onBehalfCustomerName;
	}



	public void setOnBehalfCustomerName(String onBehalfCustomerName) {
		this.onBehalfCustomerName = onBehalfCustomerName;
	}


	@XmlElement(name="differentialChargingParam1")
	public String getDifferentialChargingParam1() {
		return differentialChargingParam1;
	}



	public void setDifferentialChargingParam1(String differentialChargingParam1) {
		this.differentialChargingParam1 = differentialChargingParam1;
	}


	@XmlElement(name="differentialChargingParam2")
	public String getDifferentialChargingParam2() {
		return differentialChargingParam2;
	}



	public void setDifferentialChargingParam2(String differentialChargingParam2) {
		this.differentialChargingParam2 = differentialChargingParam2;
	}


	@XmlElement(name="differentialChargingParam3")
	public String getDifferentialChargingParam3() {
		return differentialChargingParam3;
	}



	public void setDifferentialChargingParam3(String differentialChargingParam3) {
		this.differentialChargingParam3 = differentialChargingParam3;
	}


	@XmlElement(name="AddtionalField1")
	public String getAddtionalField1() {
		return addtionalField1;
	}



	public void setAddtionalField1(String addtionalField1) {
		this.addtionalField1 = addtionalField1;
	}


	@XmlElement(name="AddtionalField2")
	public String getAddtionalField2() {
		return addtionalField2;
	}



	public void setAddtionalField2(String addtionalField2) {
		this.addtionalField2 = addtionalField2;
	}


	@XmlElement(name="OriginalReferenceNo")
	public String getOriginalReferenceNo() {
		return originalReferenceNo;
	}



	public void setOriginalReferenceNo(String originalReferenceNo) {
		this.originalReferenceNo = originalReferenceNo;
	}



	@XmlElement(name="CustomerNationalIdentificationCode")
	public String getCustomerNationalIdentificationCode() {
		return customerNationalIdentificationCode;
	}



	public void setCustomerNationalIdentificationCode(String customerNationalIdentificationCode) {
		this.customerNationalIdentificationCode = customerNationalIdentificationCode;
	}



	@XmlElement(name="CustomerType")
	public String getCustomerType() {
		return customerType;
	}



	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}


	@XmlElement(name="CustomerID")
	public String getCustomerID() {
		return customerID;
	}



	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}



	@XmlElement(name="SessionContext")
	public SessionContext getSessionContext() {
		return SessionContext;
	}



	public void setSessionContext(SessionContext SessionContext) {
		this.SessionContext = SessionContext;
	}



	@XmlElement(name="AccountID")
	public String getAccountID() {
		return accountID;
	}



	
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}



	@XmlElement(name="AccountStatusOption")
	public String getAccountStatusOption() {
		return accountStatusOption;
	}



	
	public void setAccountStatusOption(String accountStatusOption) {
		this.accountStatusOption = accountStatusOption;
	}



	@XmlElement(name="ReasonCode")
	public String getReasonCode() {
		return reasonCode;
	}



	
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}



	@XmlElement(name="CustNationalIdentificationCode")
	public String getCustNationalIdentificationCode() {
		return custNationalIdentificationCode;
	}



	
	public void setCustNationalIdentificationCode(String custNationalIdentificationCode) {
		this.custNationalIdentificationCode = custNationalIdentificationCode;
	}



	@XmlElement(name="ProductCode")
	public String getProductCode() {
		return productCode;
	}



	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}



	@XmlElement(name="CustomerSegment")
	public String getCustomerSegment() {
		return customerSegment;
	}



	
	public void setCustomerSegment(String customerSegment) {
		this.customerSegment = customerSegment;
	}


	@XmlElement(name="MisClass")
	public String getMisClass() {
		return misClass;
	}



	public void setMisClass(String misClass) {
		this.misClass = misClass;
	}


	@XmlElement(name="MisCode")
	public String getMisCode() {
		return misCode;
	}



	public void setMisCode(String misCode) {
		this.misCode = misCode;
	}


	@XmlElement(name="CustomerClass")
	public String getCustomerClass() {
		return customerClass;
	}



	public void setCustomerClass(String customerClass) {
		this.customerClass = customerClass;
	}


	@XmlElement(name="IndividualCustomerDTO")
	public IndividualCustomerDTO getIndividualCustomerDTO() {
		return IndividualCustomerDTO;
	}



	public void setIndividualCustomerDTO(IndividualCustomerDTO individualCustomerDTO) {
		this.IndividualCustomerDTO = individualCustomerDTO;
	}


	@XmlElement(name="merchantTypeAdditionalDTO")
	public merchantTypeAdditionalDTO getMerchantTypeAdditionalDTO() {
		return merchantTypeAdditionalDTO;
	}



	public void setMerchantTypeAdditionalDTO(merchantTypeAdditionalDTO merchantTypeAdditionalDTO) {
		this.merchantTypeAdditionalDTO = merchantTypeAdditionalDTO;
	}


	@XmlElement(name="accountOpenDTO")
	public accountOpenDTO getAccountOpenDTO() {
		return accountOpenDTO;
	}



	public void setAccountOpenDTO(accountOpenDTO accountOpenDTO) {
		this.accountOpenDTO = accountOpenDTO;
	}


	@XmlElement(name="smsDetails")
	public smsDetails getSmsDetails() {
		return smsDetails;
	}



	public void setSmsDetails(smsDetails smsDetails) {
		this.smsDetails = smsDetails;
	}


	@XmlElement(name="productType")
	public String getProductType() {
		return productType;
	}



	public void setProductType(String productType) {
		this.productType = productType;
	}


	@XmlElement(name="minorAcctStatus")
	public String getMinorAcctStatus() {
		return minorAcctStatus;
	}



	public void setMinorAcctStatus(String minorAcctStatus) {
		this.minorAcctStatus = minorAcctStatus;
	}


	@XmlElement(name="accountTitle")
	public String getAccountTitle() {
		return accountTitle;
	}



	public void setAccountTitle(String accountTitle) {
		this.accountTitle = accountTitle;
	}


	@XmlElement(name="flagUseExistingAccountNominee")
	public String getFlagUseExistingAccountNominee() {
		return flagUseExistingAccountNominee;
	}



	public void setFlagUseExistingAccountNominee(String flagUseExistingAccountNominee) {
		this.flagUseExistingAccountNominee = flagUseExistingAccountNominee;
	}
	
	
	

	


	/*@Override
	public String toString() {
		return "input [SessionContext=" + getSessionContext() + ", accountID=" + getAccountID() + ", accountStatusOption="
				+ getAccountStatusOption() + ", reasonCode=" + getReasonCode() + ", custNationalIdentificationCode="
				+ getCustNationalIdentificationCode() + ", productCode=" + getProductCode() + ", customerSegment="
				+ getCustomerSegment() + "]";
	}*/




	
	
	
	

}
