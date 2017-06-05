package automationFramework;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObjects.Login_Screen;
import Utilities.*;
import appModules.*;


public class TestBase extends ExtentTestNGITestListener
{

	@BeforeTest
	public void beforeTest() throws Exception 
	{
		
		File app = new File(Constant.appPath, Constant.appName); 

		//CONFIGURING DEVICE CAPABILITIES
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "XCUITest");
		capabilities.setCapability("platformName",Constant.appPlatform);
		capabilities.setCapability("deviceName",Constant.device);
		capabilities.setCapability("platformVersion", Constant.version);
		capabilities.setCapability("app", app);
		
		//CONFIGURING LOG MACHANISM
		BasicConfigurator.configure();
		Logger OurLogger = LogManager.getLogger("OurLogger");

		//create a ConsoleAppender object 
		ConsoleAppender ConsoleAppender = new ConsoleAppender();
		ConsoleAppender.setLayout(new SimpleLayout());

		//Add the appender to our Logger Object. from now onwards all the logs will be directed
		//to file mentioned by FileAppender
		OurLogger.addAppender(ConsoleAppender);
		ConsoleAppender.activateOptions();

		driver = new IOSDriver(new URL("http://127.0.0.1:4724/wd/hub"), capabilities);
		EventWrapper.acceptPopUp(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		DOMConfigurator.configure("log4j.xml");  

		//CONFIGURING TEST DATA FETCHING MECHANISM
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		Log.info("Test Data is taken from the path"+Constant.Path_TestData+Constant.File_TestData);
	}
	
		
	@BeforeMethod
	public void resetApp()
	{
		driver.resetApp();
		EventWrapper.acceptPopUp(driver);
		Log.info("Base state is ready");
	}
		
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
