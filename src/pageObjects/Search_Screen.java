package pageObjects;

public class Search_Screen 
{
	public static String searchButton_XPATH() 
	{
		String searchButton_XPATH = "//XCUIElementTypeNavigationBar/XCUIElementTypeButton[2]";
		return searchButton_XPATH;
	}
	
	public static String searchString_XPATH() 
	{
		String searchString_XPATH = "//XCUIElementTypeTextField[1]";
		return searchString_XPATH;
	}
	public static String nameFollow()
	{
		String nameFollow = "FOLLOW";
		return nameFollow;
	}

	public static String idHashtagsTab() 
	{
		String idHashtagsTab = "com.imaginea.fontli:id/rdb_tag";
		return idHashtagsTab;
	}
	
	public static String peopleTab_ID() 
	{
		String idPeopleTab = "PEOPLE";
		return idPeopleTab;
	}
	
	public static String nameCollectionTab() 
	{
		String idCollectionTab = "COLLECTIONS";
		return idCollectionTab;
	}
	
	public static String idUserFullName() 
	{
		String idUserFullName = "com.imaginea.fontli:id/userFullName";
		return idUserFullName;
	}
	
	public static String idUserName() 
	{
		String idUserName = "com.imaginea.fontli:id/userName";
		return idUserName;
	}
	
	public static String idHashtagValue() 
	{
		String idHashtagValue = "com.imaginea.fontli:id/txt_hash_tag";
		return idHashtagValue;
	}
	
	public static String idCollectionName() 
	{
		String idCollectionName = "com.imaginea.fontli:id/collection_name";
		return idCollectionName;
	}
	
	public static String userResult_XPATH()
	{
		String userResult_XPATH = "//XCUIElementTypeTable/XCUIElementTypeCell[1]";
		return userResult_XPATH;
	}
	
	public static String idProfileName()
	{
		String idProfileName = "com.imaginea.fontli:id/profileName";
		return idProfileName;
	}

}
