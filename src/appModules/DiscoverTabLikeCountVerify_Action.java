package appModules;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import Utilities.EventWrapper;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.Screenshots;
import bussiness_Flows.Discover;
import bussiness_Flows.Login_Out;
import io.appium.java_client.AppiumDriver;
import pageObjects.DiscoverTab_Screen;
import pageObjects.Home_Screen;


public class DiscoverTabLikeCountVerify_Action 
{
	public static void Execute(AppiumDriver driver) throws Exception 
	
	{

		// GETTING USERNAME AND PASSWORD FROM EXCEL
		String sUserName = ExcelUtils.getCellData(3, 1);
		Log.info("Username from Excel sheet is "+sUserName);
		String sPassword = ExcelUtils.getCellData(3, 2);
		Log.info("Password from Excel sheet is "+sPassword);
		
    	Login_Out.LoginMail(driver, sUserName, sPassword);
		
		// NAVIGATING TO THE COLLECTION CATEGORY - TYPEFACES		
		Discover.navigate_Category(driver);
		//Swiping up the post
		EventWrapper.swipeUp(driver);
		Discover.likeAndUnlike(driver);
		
		
		//NAVIGATING TO PROFILE TAB AND CLICK ON LOGOUT 
		Login_Out.Logout(driver);
		
	}

}
