package com.APBCBS.api.TestCases;

import java.util.Hashtable;

import javax.xml.bind.JAXBException;

import org.testng.annotations.Test;

import com.APBCBS.api.ApiClasses.A526API;
import com.APBCBS.api.Setup.RestAssuredSetUp;
import com.APBCBS.api.TestUtils.DataProviderClass;

public class VerifyA526Response extends RestAssuredSetUp {
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA526Response_0(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Regression Test");
		testLog.get().info("Verifying A527 Sucess Response");
		
		
		A526API.postRequestWithValidData(data);
		
		//Assert.fail();
		
	}

}
