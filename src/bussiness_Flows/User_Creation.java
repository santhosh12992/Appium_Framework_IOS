package bussiness_Flows;

import java.util.Set;

import org.openqa.selenium.By;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import Utilities.EventWrapper;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import pageObjects.Home_Screen;
import pageObjects.Login_Screen;
import pageObjects.NewUserRegistration_screen;
import pageObjects.NewsFeed_Screen;

public class User_Creation {
	
	/**
	 * Creates a new user and returns an User object
	 * @param driver - Pass Appium driver
	 * @return - Returns new user object
	 * @throws Exception - Exception for wait
	 */
	public static User NewUserCreation(AppiumDriver driver) throws Exception
	{	
		EventWrapper.click(driver, MobileBy.AccessibilityId(Login_Screen.signupButton_ID()));
		String userName = "auto"+(int)(Math.random()*Integer.MAX_VALUE);
		String emailID = "fontli_"+userName+"@imaginea.com";
		String password = userName;
		EventWrapper.sendKeys(driver, By.xpath(NewUserRegistration_screen.userName_XPATH()), userName);
		EventWrapper.sendKeys(driver, By.xpath(NewUserRegistration_screen.userMailID_XPATH()), emailID);
		EventWrapper.sendKeys(driver, By.xpath(NewUserRegistration_screen.userPassword_XPATH()), password);
		driver.hideKeyboard();
		Log.info("Keyboard is hidden expicitly by the user");	
		EventWrapper.click(driver, MobileBy.xpath(NewUserRegistration_screen.signupButton_XPATH()));
		
		//EventWrapper.waitUntil(driver,By.xpath(NewsFeed_Screen.feedUserName_XPATH()));
		String usernames = driver.findElement(By.xpath(NewsFeed_Screen.feedUserName_XPATH())).getAttribute("name").toString();
		Log.info("User has been Signed Up successfully "+userName+" and able to see the "+usernames+" post in HOME page" );
	    Screen scr = new Screen();
	    Pattern image = new Pattern("/Users/santhoshkumar/Desktop/home");
	    scr.click(image);
		return new User(userName,password);
	}

}
