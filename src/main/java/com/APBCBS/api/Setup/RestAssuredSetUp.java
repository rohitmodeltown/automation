package com.APBCBS.api.Setup;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class RestAssuredSetUp extends TestSetup {
	
	@BeforeSuite(alwaysRun=true)
	public void configure()
	{
		/*------------SIT Environment-----------------*/
		RestAssured.baseURI = "http://10.56.110.186:8022/NBWebClient";
		
		
		/*------------Dev Environment-----------------*/
		/*RestAssured.baseURI="http://10.56.110.232:8022/NBWebClient";*/
		//RestAssured.basePath="";
		
		/*------------Pre-Prod Environment-----------------*/
		//RestAssured.baseURI="http://10.56.110.158:8022/NBWebClient";
		 
	}
	
	public String generateRandomNumber() {
        String number1 = Integer.toString(ThreadLocalRandom.current().nextInt(111111111, 999999999));
        String number = "9"+number1;
		//System.out.println("Random Integers: " + number);
        return number;
	}
	
	public String aadharGeneration()
	{
		String number1 = Integer.toString(ThreadLocalRandom.current().nextInt(111111111, 999999999));
		String number = "999"+number1;
		//System.out.println("Random Integers: " + number);
		return number;
	}
	
	public String panNumber()
	{
		
		String number1 = Integer.toString(ThreadLocalRandom.current().nextInt(1111, 9999));
		String number = "AWWPA"+number1+"G";
		return number;
	}
	
	
	public static String getsystemURL()
	{
		String hURL = System.getProperty("hostURL").trim();
		if(hURL == null) {
			hURL = "http://10.56.110.186:8022/NBWebClient";
		}
		return hURL;
	}

	

}
