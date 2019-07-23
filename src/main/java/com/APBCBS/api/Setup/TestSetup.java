package com.APBCBS.api.Setup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.APBCBS.api.TestUtils.ExcelReader;
import com.APBCBS.api.TestUtils.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;

//import groovyjarjarantlr.debug.ParserTokenEvent;

public class TestSetup {
	
	//private static String inputJsonFilelocation;
	public  static ExcelReader excel = new ExcelReader("./src/test/resources/testdata/TestData.xlsx");
	public static Properties config = new Properties();
	public static ExtentReports extent;
	public static ThreadLocal<ExtentTest> parentTest= new ThreadLocal<ExtentTest>();
	public static ThreadLocal<ExtentTest> testLog = new ThreadLocal<ExtentTest>();
	
	public Map<String, ExtentTest> map = new HashMap<String, ExtentTest>();
	
	public static Properties configProperty;
	
	public static String propertyFilepath ="./src/test/resources/propertiesFiles/config.properties";
	
	@BeforeSuite
	public void setUp()
	{
		try {
			FileInputStream fi = new FileInputStream(new File(propertyFilepath));
			
			configProperty = new Properties();
			
			try {
				configProperty.load(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//setWorkingDirectory (System.getProperty("user.dir"));
		extent = ExtentManager.GetExtent();		
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		String className = getClass().getName();
		className = className.substring(className.lastIndexOf(".")+1);
		ExtentTest parent = extent.createTest(className);
		parentTest.set(parent);
		
	}
	
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		/*ExtentTest child = parentTest.get().createNode(method.getName());
		testLog.set(child);
		testLog.get().log(Status.INFO, "Execution of "+method.getName()+ " started");*/
				
	}
	
	@AfterMethod
	public void afterMethod()
	{
		extent.flush();
	}
	
	@AfterSuite
	public void afterSuite()
	{
		
	}
	
	public void assertStatusCode(int statusCode, String expectedStatusCode)
	{
		String expectedcode = expectedStatusCode.split(".")[0];
		Assert.assertEquals(Integer.toString(statusCode), expectedcode);
	}
	
	public String getExpStatusCode(String expectedcode) 
	{
		return expectedcode.substring(0, expectedcode.indexOf('.'));
		
	}
	
	public void assignAuthor(String authorName)
	{
		testLog.get().assignAuthor(authorName);
	}
	
	public void assignCategory(String category)
	{
		testLog.get().assignCategory(category);
	}
	
	
}
