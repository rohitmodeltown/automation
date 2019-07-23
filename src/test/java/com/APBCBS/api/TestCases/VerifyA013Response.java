package com.APBCBS.api.TestCases;



import java.util.Hashtable;

import javax.xml.bind.JAXBException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APBCBS.api.ApiClasses.A013API;
import com.APBCBS.api.Setup.RestAssuredSetUp;
import com.APBCBS.api.TestUtils.DataProviderClass;

public class VerifyA013Response extends RestAssuredSetUp {
	
	
/*	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA013Response_93097(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying A013 Response");
		
		A013API.postRequestWithValidData(data);
		
	}*/
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA013Response_0(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Regression Test");
		testLog.get().info("Verifying A013 Sucess Response");
		
		
		A013API.postRequestWithValidData(data);
		
		//Assert.fail();
		
	}
	/*
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA013Response_80016(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Regression Test");
		testLog.get().info("Verifying A013 Sucess Response");
		
		
		A013API.postRequestWithValidData(data);
		
		//Assert.fail();
		
	}
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA013Response_3067(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Regression Test");
		testLog.get().info("Verifying A013 Sucess Response");
		
		
		A013API.postRequestWithValidData(data);
		
		//Assert.fail();
		
	}
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA013Response_3128(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Regression Test");
		testLog.get().info("Verifying A013 Sucess Response");
		
		
		A013API.postRequestWithValidData(data);
		
		//Assert.fail();
		
	}
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verifyA013Response_10011(Hashtable<String, String>data) throws JAXBException
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Regression Test");
		testLog.get().info("Verifying A013 Sucess Response");
		
		
		A013API.postRequestWithValidData(data);
		
		//Assert.fail();
		
	}*/

}
