package com.APBCBS.api.ApiClasses;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import javax.xml.bind.JAXBException;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.w3c.dom.NodeList;

import com.APBCBS.api.TestUtils.CreateXMLFile;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class A014API {
	
	public static void postRequestWithValidData(Hashtable<String, String> data) throws JAXBException
	{
		CreateXMLFile createXMLObj = new CreateXMLFile();
		String reqBody = createXMLObj.createXML(data);
		Response response =given().contentType(ContentType.XML).body(reqBody).post(data.get("endpoint"));
				//then().extract().response();
		
		String respStr = response.body().asString();
		
		int occurance = StringUtils.countMatches(respStr, "<ErrorCode>");
		
		System.out.println("count is: "+occurance);
		
		respStr = response.body().print();
		
		XmlPath xmlPath = new XmlPath(respStr);
		
		
		for(int i =0; i<occurance;i++)
		{	
			String errorcode =xmlPath.get("Response/TransactionStatus/ErrorCode").toString();
			System.out.println("ErrorCode : " +errorcode);
			
		}
		
		//String errorcode =xmlPath.get("Response.TransactionStatus.ErrorCode").toString();

		//System.out.println("ErrorCode : " +errorcode);
		
		
		//Assert.assertEquals(errorcode, data.get("expectedErrorCode"));
		
		
	}


}
