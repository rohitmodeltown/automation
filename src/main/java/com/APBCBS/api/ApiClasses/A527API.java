package com.APBCBS.api.ApiClasses;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import javax.xml.bind.JAXBException;

import org.testng.Assert;

import com.APBCBS.api.TestUtils.CreateXMLFile;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class A527API {
	
	public static void postRequestWithValidData(Hashtable<String, String> data) throws JAXBException
	{
		CreateXMLFile createXMLObj = new CreateXMLFile();
		String reqBody = createXMLObj.createXML(data);
		Response response =given().contentType(ContentType.XML).body(reqBody).post(data.get("endpoint"));
				//then().extract().response();
		
		String respStr = response.body().asString();
		
		respStr = response.body().print();
		
		XmlPath xmlPath = new XmlPath(respStr);
		
		String errorcode =xmlPath.get("Response.TransactionStatus.ErrorCode").toString();
		System.out.println("ErrorCode : " +errorcode);
		
		
		Assert.assertEquals(errorcode, data.get("expectedErrorCode"));
		
		
	}

}
