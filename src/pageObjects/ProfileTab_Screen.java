package pageObjects;

public class ProfileTab_Screen 
{	
	public static String followersTab_ID() 
	{
		String followersTab_ID = "Followers";
		return followersTab_ID;
	}
	
	public static String followingTab_ID() 
	{
		return "Followings";
	}
	
	public static String followingItems_XPATH() 
	{
		return "//XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell";
	}
	
	public static String settings_ID() 
	{
		String settings_ID = "icon settings";
		return settings_ID;
	}
	
	public static String imgPost_XPATH() 
	{
		return "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]";
	}
	
	public static String idRecentPosts() 
	{
		String idRecentPosts = "com.imaginea.fontli:id/recentTextView";
		return idRecentPosts;
	}
	
	public static String idPopularPosts() 
	{
		String idPopularPosts = "com.imaginea.fontli:id/popularTextView";
		return idPopularPosts;
	}
	
	public static String idMoreOptions() 
	{
		String idMoreOptions = "com.imaginea.fontli:id/moreIcon";
		return idMoreOptions;
	}

	public static String nameOptionShare() 
	{
		String nameOptionShare = "Share";
		return nameOptionShare;
	}

	public static String nameOptionDelete() 
	{
		String nameOptionDelete = "Delete";
		return nameOptionDelete;
	}

	public static String nameOptionAddtoSOS() 
	{
		String nameOptionAddtoSOS = "Add to SOS";
		return nameOptionAddtoSOS;
	}

	public static String nameOptionAddtoCollection() 
	{
		String nameOptionAddtoCollection = "Add to Collection";
		return nameOptionAddtoCollection;
	}
	
	public static String idfeedUsername() 
	{
		String idfeedUsername = "com.imaginea.fontli:id/feed_user_name";
		return idfeedUsername;
	}
	
	
	public static String settingsButton() 
	{
		String settingsButton = "com.imaginea.fontli:id/img_settings";
		return settingsButton;
	}

}
