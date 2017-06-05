package pageObjects;

public class NewUserRegistration_screen {
	
	//user name 
	public static String userName_XPATH()
	{
		return "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField";
	}
	
	//user mail id
	public static String userMailID_XPATH(){
		String userMailID_XPATH="//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeTextField";
		return userMailID_XPATH;
	}
	
	//user password change
	public static String userPassword_XPATH(){
		String userPassword_XPATH="//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeSecureTextField";
		return userPassword_XPATH;
	}
	
	public static String signupButton_XPATH(){
		String signup_XPATH="//XCUIElementTypeOther/XCUIElementTypeButton[1][@name='SIGN UP']";
		return signup_XPATH;
	}
	
	
	//alrerady registered user chec box
	public static String loginCheckboxButton(){
		String loginCheckboxButton="com.imaginea.fontli:id/login_check_box";
		return loginCheckboxButton;
	}
	
	//register button
	public static String registerButton(){
		String registerButton="com.imaginea.fontli:id/email_sign_in_button";
		return registerButton;
	}
	
	//terms and conditions text
	public static String termsconditions(){
		String termsconditions="com.imaginea.fontli:id/txt_terms_conditions";
		return termsconditions;
	}

}
