package com.APBCBS.api.TestCases;

import java.util.Hashtable;

import javax.xml.bind.JAXBException;

import org.testng.annotations.Test;

import com.APBCBS.api.ApiClasses.A002API;
import com.APBCBS.api.Setup.RestAssuredSetUp;
import com.APBCBS.api.TestUtils.DataProviderClass;

public class VerifyA002Response extends RestAssuredSetUp {
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA002Response_0(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying A002 Response");
		
		A002API.postRequestWithValidData(data);
	}

}
