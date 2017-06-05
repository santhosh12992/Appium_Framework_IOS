package bussiness_Flows;

import static org.testng.Assert.assertTrue;

import javax.swing.ScrollPaneLayout;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import Utilities.EventWrapper;
import Utilities.ExcelUtils;
import Utilities.Log;
import Utilities.Screenshots;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import pageObjects.DiscoverTab_Screen;
import pageObjects.Home_Screen;
import pageObjects.Login_Screen;
import pageObjects.NewsFeed_Screen;
import pageObjects.ProfileTab_Screen;

public class Discover {
	
	static String[] categories = {"Popular","New Collection","Monogram","Signage","Lettering","Calligraphy"};
	static String[] categoriesPosted = {"Popular","Monogram","Signage","Lettering","Calligraphy"};
	
	/**
	 * Performs follow action of a category under collections FROM Home page to Home page
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	
	public static String followCategory(AppiumDriver driver) throws Exception
	{
		String categoryName = navigate_Category(driver);
		EventWrapper.click(driver, MobileBy.AccessibilityId("FOLLOW"));
		driver.findElement(MobileBy.AccessibilityId("FOLLOWING"));
		Log.info("User has successfully followed "+categoryName);
		EventWrapper.click(driver, By.xpath(Home_Screen.homeTab_XPATH()));
		return categoryName;
	}
	
	/**
	 * Performs unfollow action of a given category under collections FROM Home page to Home page
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	
	public static String unfollowCategory(AppiumDriver driver, String category) throws Exception
	{
		EventWrapper.click(driver, By.xpath(Home_Screen.discoverTab_XPATH(driver)));
		navigate_tothis_category(driver,category);
		EventWrapper.click(driver, MobileBy.AccessibilityId("FOLLOWING"));
		driver.findElement(MobileBy.AccessibilityId("FOLLOW"));
		Log.info("User has successfully unfollowed "+category);
		EventWrapper.click(driver, By.xpath(Home_Screen.homeTab_XPATH(driver)));
		return category;
	}
	
	
	
	
	/**
	 * Performs like and unlike action for the first post in a catergory FROM Collections tab to Collections tab page
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	
	public static void likeAndUnlike(AppiumDriver driver) throws Exception
	{
		like(driver);
		unLike(driver);
		driver.navigate().back();
	}
	
	/**
	 * Performs like action for the first post in the current users page
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	private static void like(AppiumDriver driver)
	{
		String initial = driver.findElement(By.xpath(DiscoverTab_Screen.liketext_XPATH())).getText();
		EventWrapper.click(driver, By.xpath(DiscoverTab_Screen.likebutton_XPATH()));
		String now = driver.findElement(By.xpath(DiscoverTab_Screen.liketext_XPATH())).getText();
		Log.info("Like Count Before Liking the Post - "+initial);
		Log.info("Like count after liking the Post - "+now);
		Assert.assertEquals((Integer.parseInt(initial.split(" ")[0]))+1, Integer.parseInt(now.split(" ")[0]));
	}
	
	/**
	 * Performs unlike action for the first post in the current users page
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	private static void unLike(AppiumDriver driver)
	{
		String initial = driver.findElement(By.xpath(DiscoverTab_Screen.liketext_XPATH())).getText();
		EventWrapper.click(driver, By.xpath(DiscoverTab_Screen.likebutton_XPATH()));
		String now = driver.findElement(By.xpath(DiscoverTab_Screen.liketext_XPATH())).getText();Log.info("Like Count Before unLiking the Post - "+initial);
		Log.info("Like count after unLiking the Post - "+now);
		Assert.assertEquals((Integer.parseInt(initial.split(" ")[0]))-1, Integer.parseInt(now.split(" ")[0]));
	}
	
	/**
	 * Navigates to a category page randomly, FROM Home page TO any one category page under discover tab
	 * to perform Likes/Comments on the first post
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	public static String navigate_Category(AppiumDriver driver) throws Exception
	{
		EventWrapper.click(driver, By.xpath(Home_Screen.discoverTab_XPATH(driver)));
		String category = categoriesPosted[(int)(Math.random()*categoriesPosted.length)];
		return navigate_tothis_category(driver, category);
	}
	
	private static String navigate_tothis_category(AppiumDriver driver, String category)
	{
		EventWrapper.click(driver, MobileBy.AccessibilityId(category));
		EventWrapper.waitUntil(driver, By.xpath(DiscoverTab_Screen.categoryname_XPATH()));
		EventWrapper.waitUntil(driver,By.xpath(DiscoverTab_Screen.username_XPATH()));
		String categoryName= driver.findElement(By.xpath(DiscoverTab_Screen.categoryname_XPATH())).getAttribute("name").toString();
		Log.info("User Clicked on the Category - "+category+" and Navigated to Category - "+categoryName);
		Assert.assertEquals(category, categoryName);
		String userName = driver.findElement(By.xpath(DiscoverTab_Screen.username_XPATH())).getAttribute("name").toString();
		Log.info("Able to see the "+userName+"'s post in "+categoryName+" page.");
		return category;
	}
	
	
	
	
	/**
	 * Verifies to the Discover page and verifies the categories in it FROM Home page to Home page
	 * @param driver - Pass the Appium driver
	 * @throws Exception - Exception for wait
	 */
	
	public static void Verify_Categeries(AppiumDriver driver) throws Exception
	{
		EventWrapper.click(driver, By.xpath(Home_Screen.discoverTab_XPATH(driver)));
		for(int i = 0; i<categories.length;i++)
		{
			if(driver.findElements(MobileBy.AccessibilityId(categories[i])).size()>0)
			{
				Log.info("Verifed the presence of category - "+categories[i]);
				
			}
			else 
			{
				Log.info("Following Collection is not present in the Discover tab Gridview -"+categories[i]);
				Assert.assertEquals(true,false);
			}
		}
		EventWrapper.back(driver);
		
	}
	
	/**
	 * Performs comment action for the first post in a catergory FROM Category page TO Collections tab page,
	 * also verifies the comment count 
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception for wait
	 */
	public static void comment(AppiumDriver driver,String passValue) throws Exception
	{
		String initial = driver.findElement(By.xpath(DiscoverTab_Screen.commenttext_XPATH())).getText();
		EventWrapper.click(driver, By.xpath(DiscoverTab_Screen.commentbutton_XPATH()));
		EventWrapper.wait(driver, 15000);
		EventWrapper.waitUntil(driver, By.xpath(DiscoverTab_Screen.commenttextBox_XPATH()));
		EventWrapper.sendKeys(driver,By.xpath(DiscoverTab_Screen.commenttextBox_XPATH()), passValue);
		EventWrapper.click(driver,MobileBy.AccessibilityId(DiscoverTab_Screen.postComment_ID()));
		EventWrapper.wait(driver, 5000);
		EventWrapper.back(driver);
		EventWrapper.back(driver);
		String now = driver.findElement(By.xpath(DiscoverTab_Screen.commenttext_XPATH())).getText();
		Log.info("Comment Count before commenting the Post - "+initial);
		Log.info("Comment Count after commenting the Post - "+now);
		Assert.assertEquals((Integer.parseInt(initial.split(" ")[0]))+1, Integer.parseInt(now.split(" ")[0]));
		EventWrapper.back(driver);
	}

	/**
	 * Navigates to a profile user's home page FROM home page TO Profile users page via Collections
	 * @param driver - Appium driver
	 * @throws Exception - Exception for wait
	 */
	public static void navigate_ProfileUser(AppiumDriver driver) throws Exception 
	{
		navigate_Category(driver);
		EventWrapper.click(driver, By.xpath(DiscoverTab_Screen.username_XPATH()));
		EventWrapper.click(driver, By.xpath(ProfileTab_Screen.imgPost_XPATH()));
		Log.info("Opened the post's Image");
	}
}
