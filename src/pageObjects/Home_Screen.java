package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Home_Screen 
{
	
	//ALL THE ELEMENTS IN THE HOME SCREEN
	
	public static String profileTab_XPATH() 
	{
		String profileTab_XPATH = "//XCUIElementTypeTabBar[1]/XCUIElementTypeButton[3]";
		return profileTab_XPATH;
	}
	
	public static String discoverTab_XPATH(AppiumDriver driver) 
	{
		String discoverTab_XPATH = "//XCUIElementTypeTabBar[@enabled='true']/XCUIElementTypeButton[2]";
		return discoverTab_XPATH;
	}
	
	public static String homeTab_XPATH() 
	{
		String homeTab_XPATH = "//XCUIElementTypeTabBar[1]/XCUIElementTypeButton[1]";
		return homeTab_XPATH;
	}
	
	
	
	
	
	
	
	
	
	
}
