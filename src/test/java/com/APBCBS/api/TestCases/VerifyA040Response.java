package com.APBCBS.api.TestCases;

import java.util.Hashtable;

import javax.xml.bind.JAXBException;

import org.testng.annotations.Test;

import com.APBCBS.api.ApiClasses.A040API;
import com.APBCBS.api.Setup.RestAssuredSetUp;
import com.APBCBS.api.TestUtils.DataProviderClass;

public class VerifyA040Response extends RestAssuredSetUp {
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA040Response_0(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying A040 Response");
		
		A040API.postRequestWithValidData(data);
	}

}
