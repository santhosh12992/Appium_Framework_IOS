package automationFramework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class settings 
{
	public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME	, "XCUITest");
	capabilities.setCapability("platformName","iOS");
	capabilities.setCapability("deviceName","iPhone 6 Plus");
	capabilities.setCapability("platformVersion", "9.3");
	capabilities.setCapability("app", "/Users/santhoshkumar/Documents/workspace/Fontli_IOS/AUT/Fontli.app");
	AppiumDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(MobileBy.AccessibilityId("OK")).click();
	driver.findElement(MobileBy.AccessibilityId("LOGIN")).click();
	
	}
}

