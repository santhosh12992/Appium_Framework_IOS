package appModules;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.EventWrapper;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.Screenshots;
import bussiness_Flows.Discover;
import bussiness_Flows.Login_Out;
import bussiness_Flows.Profile;
import io.appium.java_client.AppiumDriver;
import pageObjects.Home_Screen;
import pageObjects.Profile_Settings;
import pageObjects.DiscoverTab_Screen;

public class DiscovertabFollowVerify_Action 
{
public static void Execute(AppiumDriver driver) throws Exception 
	
	{

		// GETTING USERNAME AND PASSWORD FROM EXCEL
		String sUserName = ExcelUtils.getCellData(3, 1);
		Log.info("Username from Excel sheet is "+sUserName);
		String sPassword = ExcelUtils.getCellData(3, 2);
		Log.info("Password from Excel sheet is "+sPassword);
			
		//LOGIN TO APPLICATION
		Login_Out.LoginMail(driver, sUserName, sPassword);
		int initialFollowingCount = Profile.getFollowingCount(driver);
		String categoryFollowed = Discover.followCategory(driver);
	    int followCountAfterFollow = Profile.getFollowingCount(driver);
	    Assert.assertEquals(initialFollowingCount+1, followCountAfterFollow);
	   
		
		//NAVIGATE TO COLLECTION TAB TO UN-FOLLOW THE PREVIOSULY FOLLOWING POST
		Discover.unfollowCategory(driver, categoryFollowed);
		int followCountAfterUnfollow = Profile.getFollowingCount(driver);
		Assert.assertEquals(followCountAfterFollow-1,followCountAfterUnfollow);
        Login_Out.Logout(driver);
		
		
	}


}
