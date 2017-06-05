package pageObjects;

public class NewsFeed_Screen {


	//post Feed like check box
	public static String feedLikeCheckBox(){
		String feedLikeCheckBox= "com.imaginea.fontli:id/feedLikeCheckBox";
		return feedLikeCheckBox;
	}

	//post feed likes count
	public static String feedLikesCount(){
		String feedLikesCount="com.imaginea.fontli:id/likeCountTextView";
		return feedLikesCount;
	}

	//post Comments view field
	public static String postComments(){	
		String postComments="com.imaginea.fontli:id/commentView";
		return postComments;
	}
	//post comment count field
	public static String postCommentsCount(){
		String postCommentsCount="com.imaginea.fontli:id/commentCount";
		return postCommentsCount;
	}

	//published post options like share
	public static String moreSharingIcons(){
		String moreSharingIcon="com.imaginea.fontli:id";
		return moreSharingIcon;

	}
	
	public static String feedUserName_XPATH()
	{
		String feedUserName_XPATH="//XCUIElementTypeTable[1]/XCUIElementTypeCell[1]//XCUIElementTypeButton[1]";
		return feedUserName_XPATH;
	}
	
	public static String imgPost_XPATH()
	{
		String imgPost_XPATH="//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]";
		return imgPost_XPATH;
	}

}
