package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Post_Screen 
{
	
	public static String likeCount_XPATH(AppiumDriver driver) 
	{
		String likeCount_XPATH = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]";
		return likeCount_XPATH;
	}
	
	public static String likeButton_XPATH(AppiumDriver driver) 
	{
		String likeButton_XPATH = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]";
		return likeButton_XPATH;
	}
	
	public static String commentCount_XPATH(AppiumDriver driver) 
	{
		String likeCount_XPATH = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[4]";
		return likeCount_XPATH;
	}
	
	public static String commentButton_XPATH(AppiumDriver driver) 
	{
		String likeButton_XPATH = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[3]";
		return likeButton_XPATH;
	}
		
}
