package appModules;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;

import Utilities.EventWrapper;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.Screenshots;
import bussiness_Flows.Login_Out;
import bussiness_Flows.Post_Reusable;
import io.appium.java_client.AppiumDriver;
import pageObjects.SOSTab_Screen;
import pageObjects.Home_Screen;
import pageObjects.NewsFeed_Screen;


public class NFTabProfileCommentsCountVerify_Action 
{
public static void Execute(AppiumDriver driver) throws Exception 
	
	{

		// GETTING USERNAME AND PASSWORD FROM EXCEL
		String sUserName = ExcelUtils.getCellData(3, 1);
		Log.info("Username from Excel sheet is "+sUserName);
		String sPassword = ExcelUtils.getCellData(3, 2);
		Log.info("Password from Excel sheet is "+sPassword);
		
		//LOGIN TO THE APPLICATION
		Login_Out.LoginMail(driver, sUserName, sPassword);
				
		EventWrapper.click(driver, By.xpath(NewsFeed_Screen.imgPost_XPATH()));

	
		Post_Reusable.comment(driver,"GOOD DAY");
		//NAVIGATING TO PROFILE TAB AND CLICK ON LOGOUT 
		Login_Out.Logout(driver);
		
	}

}
