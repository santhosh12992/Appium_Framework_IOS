package automationFramework;

import org.testng.annotations.Test;

import Utilities.Log;
import appModules.AppNotificationComment_Action;
import appModules.AppNotificationFollow_Action;
import appModules.AppNotificationLike_Action;
import appModules.AppNotificationTagged_Action;
import appModules.AppNotificationUserMentioned_Action;
import appModules.CameraPicAddtoProfile_Action;
import appModules.CameraPicAddtoTypeCollections_Action;
import appModules.DiscoverTabCommentCountVerify_Action;
import appModules.DiscoverTabLikeCountVerify_Action;
import appModules.DiscoverTabProfileLikeCountVerify_Action;
import appModules.DiscovertabAllCategoriesVerify_Action;
import appModules.DiscovertabFollowVerify_Action;
import appModules.LoginFB_Action;
import appModules.LoginFontli_Action;
import appModules.LoginTW_Action;
import appModules.NFTabProfileCommentsCountVerify_Action;
import appModules.NFTabProfileFollowVerify_Action;
import appModules.NFaddPicture_Action;
import appModules.NewUserRegistration_Action;
import appModules.PostingSpam_Action;
import appModules.SearchforCollections_Action;
import appModules.SearchforHashtag_Action;
import appModules.SearchforaUser_Action;
import appModules.UpdateEmailID_Action;
import appModules.UpdatePassword_Action;
import appModules.UpdateUserName_Action;

public class TestCases extends TestBase
{
	@Test(description="TC001_Verify that user is able to login with Facebook credentials")
	public void TC001() throws Exception
	{
		Log.startTestCase("1. Verify that user is able to login with Facebook credentials");
		LoginFB_Action.Execute(driver);	
		Log.endTestCase();
	}
     
	@Test(description="TC002_Verify that user is able to login with Twitter credentails")
	public void TC002() throws Exception
	{
		Log.startTestCase("2. Verify that user is able to login with Twitter credentails");
		LoginTW_Action.Execute(driver);	
		Log.endTestCase();
	}
	
	@Test(description="TC003_Verify that user is able to login with Fontli credentails")
	public void TC003() throws Exception
	{
		Log.startTestCase("3. Verify that user is able to login with Fontli credentails");
		LoginFontli_Action.Execute(driver);	
		Log.endTestCase();
	}
	
	@Test(description="TC004_Verify that user is able to see fontli collections under Discover tab")
	public void TC004() throws Exception
	{
		Log.startTestCase("4. Verify that user is able to see fontli collections under Discover tab");
		DiscovertabAllCategoriesVerify_Action.Execute(driver);
		Log.endTestCase();
	}
	
	@Test(description="TC005_verify the like and unlike count for a post in Discover tab")
	public void TC005() throws Exception
	{
		Log.startTestCase("5. Verifying Like and Un-Like counts for a post from Discover tab view");
		DiscoverTabLikeCountVerify_Action.Execute(driver);
		Log.endTestCase();
	}
	
	@Test(description="TC006_Verifying Comments counts for a post from Discover tab view")
	public void TC006() throws Exception
	{
		Log.startTestCase("6. Verifying Comments counts for a post from Discover tab view");
		DiscoverTabCommentCountVerify_Action.Execute(driver);
		Log.endTestCase();
	}
		
	@Test(description="TC007_Verifying Following and unfollowing counts for the logged in user from Discover tab")
	public void TC007() throws Exception
	{
		Log.startTestCase("7. Verifying Following and unfollowing counts for the logged in user from Discover tab");
		DiscovertabFollowVerify_Action.Execute(driver);
		Log.endTestCase();
	}
	
	@Test(description="TC008_Verify the Like and Un-Like counts for a post from user Profile under discover tab")
	public void TC008() throws Exception
	{
		Log.startTestCase("08. Verify the Like and Un-Like counts for a post from user Profile under discover tabb");
		DiscoverTabProfileLikeCountVerify_Action.Execute(driver);
		Log.endTestCase();
	}
		
	//GIT ISSUE - 443
	@Test(description="TC009_Verify the Following and UnFollowing counts for the logged in user from NewsFeed tab")
	public void TC009() throws Exception
	{
		Log.startTestCase("9. Verifying Following and UnFollowing counts for the logged in user from NewsFeed tab");
		NFTabProfileFollowVerify_Action.Execute(driver);
		Log.endTestCase();
	}
	
	@Test(description="TC010_Verify the Comments counts for the logged in user from NewsFeed tab")
	public void TC010() throws Exception
	{
		Log.startTestCase("10. Verifying Comments counts for the logged in user from NewsFeed tab");
		NFTabProfileCommentsCountVerify_Action.Execute(driver);
		Log.endTestCase();
	}
	
	@Test(description="TC011_Verify that user is able to do new user registration")
	public void TC011() throws Exception
	{
		Log.startTestCase("11. Verify that user is able to do new user registration");
		NewUserRegistration_Action.Execute(driver);
		Log.endTestCase();
	}
	
	@Test(description ="TC012_Verify whether a user can add a picture to NewsFeed and delete the same picture from NewsFeed tab")
	public void TC012() throws Exception
	{
		Log.startTestCase("12, Verifying whether a user can add a picture to NewsFeed and delete the same picture from NewsFeed tab");
		System.out.println("12, Verifying whether a user can add a picture to NewsFeed and delete the same picture from NewsFeed tab");
		NFaddPicture_Action.Execute(driver);
	}
		
	@Test(description ="TC013_Verify whether a user can add a picture to Colletions tab using More action and delete the same picture from Collections tab")
	public void TC013() throws Exception
		{
			Log.startTestCase("13. Verifying whether a user can add a picture to Colletions tab using More action and delete the same picture from Collections tab");
			System.out.println("13. Verifying whether a user can add a picture to Colletions tab using More action and delete the same picture from Collections tab");
			CameraPicAddtoTypeCollections_Action.Execute(driver);
		}	
	
	
	@Test(description="TC014_Verify whether a user is able to add a picture to his profile tab and delete the same from Profile tab")
	public void TC014() throws Exception
		{
			Log.startTestCase("14. Verifying whether a user is able to add a picture to his profile tab and delete the same from Profile tab");
			System.out.println("14. Verifying whether a user is able to add a picture to his profile tab and delete the same from Profile tab");
			CameraPicAddtoProfile_Action.Execute(driver);
		}
		
		
	@Test(description="TC015_Verify the search funtionality for people")
	public void TC015() throws Exception
		{
			Log.startTestCase("15.Verifying the result with the searched value");
			System.out.println("15.Verifying the result with the searched value");
			SearchforaUser_Action.Execute(driver);
		}
	
	@Test(description="TC016_Verify the search funtionality for HashTags")
	public void TC016() throws Exception
		{
			Log.startTestCase("16. Verify the search funtionality for HashTag");
			System.out.println("16. Verify the search funtionality for HashTag");
			SearchforHashtag_Action.Execute(driver);
		}
		
	@Test(description="TC017_Verify the search funtionality for Collections")
	public void TC017() throws Exception
		{
			Log.startTestCase("17. Verify the search funtionality for Collections");
			System.out.println("17. Verify the search funtionality for Collections");
			SearchforCollections_Action.Execute(driver);
		}
		
	@Test(description="TC018_Verify that user is able to update his User Name")
	public void TC018() throws Exception
		{
			Log.startTestCase("18. Verify that user is able to update his User Name");
			System.out.println("18. Verify that user is able to update his User Name");
			UpdateUserName_Action.Execute(driver);
		}
	
	@Test(description="TC019_Verify that user is able to update his EmailID")
	public void TC019() throws Exception
		{
			Log.startTestCase("19. Verify that user is able to update his EmailID");
			System.out.println("19. Verify that user is able to update his EmailID");
			UpdateEmailID_Action.Execute(driver);
		}

	@Test(description="TC020_Verify that user is able to update his Password")
	public void TC020() throws Exception
		{
			Log.startTestCase("20. Verify that user is able to update his Password");
			System.out.println("20. Verify that user is able to update his Password");
			UpdatePassword_Action.Execute(driver);
		}


	@Test(description="TC021_Verify app notification when someone follows the user")
	public void TC021() throws Exception
		{
			Log.startTestCase("21. Verify app notification when someone follow the user");
			System.out.println("21. Verify app notification when someone follow the user");
			AppNotificationFollow_Action.Execute(driver);
		}
	
	
	@Test(description="TC022_Verify app notification when someone liked the post of the user")
	public void TC022() throws Exception
		{
			Log.startTestCase("22. Verify app notification when someone liked the post of the user");
			System.out.println("22. Verify app notification when someone liked the post of the user");
			AppNotificationLike_Action.Execute(driver);
		}
	
	
	@Test(description="TC023_Verify app notification when someone commented on the post of the user")
	public void TC023() throws Exception
		{
			Log.startTestCase("23. Verify app notification when someone commented on the post of the user");
			System.out.println("23. Verify app notification when someone commented on the post of the user");
			AppNotificationComment_Action.Execute(driver);
		}
	
	@Test(description="TC024_Verify app notification when someone mentioned the name of the user in comment")
	public void TC024() throws Exception
		{
			Log.startTestCase("24. Verify app notification when someone mentioned the name of the user in comment");
			System.out.println("24. Verify app notification when someone mentioned the name of the user in comment");
			AppNotificationUserMentioned_Action.Execute(driver);
		}
	
	
	@Test(description="TC025_Verify app notification when someone tagged the post of the user with fonts")
	public void TC025() throws Exception
		{
			Log.startTestCase("25. Verify app notification when someone tagged the post of the user with fonts");
			System.out.println("25. Verify app notification when someone tagged the post of the user with fonts");
			AppNotificationTagged_Action.Execute(driver);
		}
	
	@Test(description="TC026_Verify that user is not able to upload spam images")
	public void TC026() throws Exception
		{
			Log.startTestCase("26_Verify that user is not able to upload spam images");
			System.out.println("26_Verify that user is not able to upload spam images");
			PostingSpam_Action.Execute(driver);
		}
}
