package pageObjects;

// Objects in Login screen are defined as Strings

public class Login_Screen {

	public static String signupButton_ID() 
	{
		String signupButton_ID = "SIGNUP";
		return signupButton_ID;
	}
	
	public static String loginButton_ID() 
	{
		String loginButton_ID = "LOGIN";
		return loginButton_ID;
	}
	
    //CONFIGURING ELEMENTS FOR FACEBOOK LOGIN
	public static String fbButton_ID() 
	{
		String fbButton_ID = "FACEBOOK";
		return fbButton_ID;
	}

	public static String fbContinue_ID() 
	{
		String fbContinue_ID = "Continue";
		return fbContinue_ID;
	}
	
	
	public static String fbuserName_XPATH() 
	
	{
		String fbuserName = "//*[@type='XCUIElementTypeTextField'][@value='Email address or phone number']";
		return fbuserName;
	}
	
	public static String fbpassWord_XPATH() 
	{	
		
		String fbpassWord = "//*[@type='XCUIElementTypeSecureTextField'][@value='Facebook password']";
	    return fbpassWord;
	}

	

	// CONFIGURING ELEMENTS FOR TWITTER LOGIN
	
	public static String twButton() 
	{
		String twButton = "Connect with Twitter";
		return twButton;
	}
	
	public static String twuserName() 
	{
		String twuserName = "//android.widget.EditText[@index='0']";
		return twuserName;
	}
	
	public static String twpassWord() 
	{
		String twpassWord = "//android.view.View[@index='3']//child::android.widget.EditText";
		return twpassWord;
	}

	public static String twloginButton() 
	{
		String fbloginButton = "//android.widget.Button[@index='0']";
		return fbloginButton;
	}

	public static String twloginCancel() 
	{
		String twloginCancel = "//android.widget.Button[@index='1']";
		return twloginCancel;
	}
	
	// CONFIGURING ELEMENTS FOR EMAIL LOGIN
	
	public static String fontliuserName_XPATH() 
	{
		String fontliuserName_XPATH = "//XCUIElementTypeTextField[@value='Username/Email']";
		return fontliuserName_XPATH;
	}
	
	public static String fontlipassWord_XPATH() 
	{
		String fontlipassWord_XPATH = "//XCUIElementTypeSecureTextField[@value='Password']";
		return fontlipassWord_XPATH;
	}
	
	public static String fontliloginButton_XPATH() 
	{
		String fontliloginButton_XPATH = "//XCUIElementTypeButton[@name='SIGN IN']";
		return fontliloginButton_XPATH;
	}
}
