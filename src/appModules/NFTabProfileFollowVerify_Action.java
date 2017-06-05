package appModules;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import Utilities.EventWrapper;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.Screenshots;
import Utilities.User;
import bussiness_Flows.Login_Out;
import bussiness_Flows.Newsfeed_Reusable;
import bussiness_Flows.Profile;
import bussiness_Flows.Search;
import bussiness_Flows.User_Creation;
import io.appium.java_client.AppiumDriver;
import pageObjects.SOSTab_Screen;
import pageObjects.Home_Screen;
import pageObjects.Profile_Settings;

public class NFTabProfileFollowVerify_Action 
{
	/*
	 * Create a new user
	 * Take the following count and follow that user
	 * Take the count and verify
	 * Unfollow the followed user and take the following count
	 * verify the count
	 */
public static void Execute(AppiumDriver driver) throws Exception 
	
	{
       
		//Creating a new user
		User new_User = User_Creation.NewUserCreation(driver);
		//System.out.println(driver.getPageSource());
		Login_Out.Logout(driver);
		
		// GETTING USERNAME AND PASSWORD FROM EXCEL
		String sUserName = ExcelUtils.getCellData(3, 1);
		Log.info("Username from Excel sheet is "+sUserName);
		String sPassword = ExcelUtils.getCellData(3, 2);
		Log.info("Password from Excel sheet is "+sPassword);
			
		//LOGIN TO THE APPLICATION
		Login_Out.LoginMail(driver, sUserName, sPassword);
		
		//NAVIGATING TO PROFILE TAB TO RECORD TO FOLLOWING COUNT.
		int initialFollowingCount = Profile.getFollowingCount(driver);
		Log.info("Following count before following a user - "+initialFollowingCount);
	
		
		//Following that user
		Newsfeed_Reusable.followUser(driver, new_User.username);
		
		//NAVIGATING TO PROFILE TAB TO RECORD TO FOLLOWING COUNT.
		int currentFollowingCount = Profile.getFollowingCount(driver); 
		Log.info("Following count after following a user - "+currentFollowingCount);
		
		assertEquals(initialFollowingCount+1, currentFollowingCount);
		
		//unFollowing that user
		Newsfeed_Reusable.unfollowUser(driver, new_User.username);
		
		//NAVIGATING TO PROFILE TAB TO RECORD TO FOLLOWING COUNT.
		int finalFollowingCount = Profile.getFollowingCount(driver);
		Log.info("Following count after unfollowing a user - "+finalFollowingCount);
		assertEquals(currentFollowingCount-1, finalFollowingCount);
	
		//NAVIGATING TO PROFILE TAB AND CLICK ON LOGOUT 	
		Login_Out.Logout(driver);
		
	}

}
