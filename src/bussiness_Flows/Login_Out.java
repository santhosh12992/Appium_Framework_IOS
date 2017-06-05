package bussiness_Flows;

import org.openqa.selenium.By;

import Utilities.EventWrapper;
import Utilities.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import pageObjects.Home_Screen;
import pageObjects.Login_Screen;
import pageObjects.Message_Prompts;
import pageObjects.NewsFeed_Screen;
import pageObjects.ProfileTab_Screen;
import pageObjects.Profile_Settings;

public class Login_Out {
	
	/**
	 * Logs in to Fontli using Fontli Credentails FROM Login Page TO Home Page loaded
	 * @param driver - Pass Appium Driver
	 * @param username - Pass Fontli Username
	 * @param Password - Pass Fontli Password
	 * @throws Exception - Exception for wait
	 */
	
	public static void LoginMail(AppiumDriver driver, String username, String Password) throws Exception 
	{
		EventWrapper.click(driver, MobileBy.AccessibilityId(Login_Screen.loginButton_ID()));
		EventWrapper.sendKeys(driver, By.xpath(Login_Screen.fontliuserName_XPATH()),username);
		EventWrapper.sendKeys(driver, By.xpath(Login_Screen.fontlipassWord_XPATH()), Password);
		driver.hideKeyboard();
		Log.info("Keyboard is hidden expicitly by the user");
		//EventWrapper.wait(driver, 2000);
		EventWrapper.click(driver, MobileBy.xpath(Login_Screen.fontliloginButton_XPATH()));
		//EventWrapper.waitUntil(driver,By.xpath(NewsFeed_Screen.feedUserName_XPATH()));
		String usernames = driver.findElement(By.xpath(NewsFeed_Screen.feedUserName_XPATH())).getAttribute("name").toString();
		Log.info("User has been logged in successfully with Fontli Credentials - "+username+" and able to see the "+usernames+" post in HOME page" );
	}
	
	/**
	 * Logs in to Fontli using facebook Credentails FROM Login Page TO Home Page loaded
	 * @param driver - Appium Driver
	 * @param username - Facebook Username
	 * @param Password - Facebook Password
	 */
	
	public static void LoginFb(AppiumDriver driver, String username, String Password) 
	{
		EventWrapper.click(driver, MobileBy.AccessibilityId(Login_Screen.loginButton_ID()));
		EventWrapper.click(driver, MobileBy.AccessibilityId(Login_Screen.fbButton_ID()));
		EventWrapper.sendKeys(driver, By.xpath(Login_Screen.fbuserName_XPATH()), username);
		EventWrapper.sendKeys(driver, By.xpath(Login_Screen.fbpassWord_XPATH()), Password);
		driver.hideKeyboard();
		Log.info("Keyboard is hidden expicitly by the user");	
		EventWrapper.click(driver, MobileBy.AccessibilityId("Log In"));
		EventWrapper.click(driver, MobileBy.AccessibilityId(Login_Screen.fbContinue_ID()));
		EventWrapper.waitUntil(driver,By.xpath(NewsFeed_Screen.feedUserName_XPATH()));
		
		Log.info("User has been logged in successfully with FB credentials- "+username );
	}
	
	/**
	 * Logs in to Fontli using Twitter Credentails FROM Login Page TO Home Page loaded
	 * @param driver - Appium Driver
	 * @param username - Facebook Username
	 * @param Password - Facebook Password
	 */
	
	public static void LoginTwtr(AppiumDriver driver, String username, String Password)
	{
		EventWrapper.click(driver, MobileBy.AccessibilityId(Login_Screen.loginButton_ID()));
		EventWrapper.click(driver, MobileBy.AccessibilityId("TWITTER"));
		EventWrapper.sendKeys(driver, MobileBy.AccessibilityId("Username or email"), username);
		EventWrapper.sendKeys(driver, MobileBy.AccessibilityId("Password"), Password);
		driver.hideKeyboard();
		EventWrapper.click(driver, MobileBy.AccessibilityId("Sign In"));
		Log.info("Keyboard is hidden expicitly by the user");	
		EventWrapper.waitUntil(driver,By.xpath(NewsFeed_Screen.feedUserName_XPATH()));
		
		Log.info("User has been logged in successfully with Twitter credentials- "+username );
	}
	
	/**
	 * Logs Out from the Fontli FROM home page TO logout page
	 * @param driver - Pass the Appium Driver
	 * @throws Exception - Exception for wait
	 */
	
	public static void Logout(AppiumDriver driver) throws Exception 
	{
		EventWrapper.click(driver, By.xpath(Home_Screen.homeTab_XPATH()));	
		EventWrapper.click(driver, MobileBy.AccessibilityId("more icon"));
		EventWrapper.click(driver, MobileBy.AccessibilityId("Logout"));
		EventWrapper.acceptPopUp(driver);
		EventWrapper.waitUntil(driver,MobileBy.AccessibilityId(Login_Screen.loginButton_ID()));
		
		Log.info("User has been logged out successfully ");
     }

}
