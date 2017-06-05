package appModules;

import bussiness_Flows.Login_Out;
import bussiness_Flows.User_Creation;
import Utilities.EventWrapper;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import pageObjects.Login_Screen;
import pageObjects.ProfileTab_Screen;
import pageObjects.Profile_Settings;


public class NewUserRegistration_Action {
	
	public static void Execute(AppiumDriver driver) throws Exception 
	
	{

		// Create a New User
		User new_User = User_Creation.NewUserCreation(driver);
		
		ExcelUtils.setCellData(new_User.username, 4, 1);
		ExcelUtils.setCellData(new_User.password, 4, 2);
		ExcelUtils.setCellData("Pass", 4, 7);
		//Setting up the newly created user as credentials for all other test cases
		ExcelUtils.setCellData(new_User.username, 3, 1);
		ExcelUtils.setCellData(new_User.password, 3, 2);
		ExcelUtils.setCellData("Pass", 11, 7);
		
		//LOGOUT
		Login_Out.Logout(driver);
		
	}

}
