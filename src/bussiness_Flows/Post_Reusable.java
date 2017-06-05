package bussiness_Flows;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utilities.EventWrapper;
import Utilities.Log;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import pageObjects.DiscoverTab_Screen;
import pageObjects.Post_Screen;
import pageObjects.SOSTab_Screen;

public class Post_Reusable {
	

	/**
	 * Performs like and unlike action for the enlarged post FROM enlarged post TO enlarged post
	 * FROM users profile page TO Users profile page
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
		
	public static void likeAndUnlike(AppiumDriver driver) throws Exception
	{
		like(driver);
		unLike(driver);
		driver.navigate().back();
		EventWrapper.wait(driver, 1000);
	}
	
	/**
	 * Performs like action in the enlarged post FROM enlarged post TO enlarged post
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	
	private static void like(AppiumDriver driver)
	{
		
		String initial = driver.findElement(By.xpath(Post_Screen.likeCount_XPATH(driver))).getText();
		EventWrapper.click(driver, By.xpath(Post_Screen.likeButton_XPATH(driver)));
		String now = driver.findElement(By.xpath(Post_Screen.likeCount_XPATH(driver))).getText();
		Log.info("Like Count Before Liking the Post - "+initial);
		Log.info("Like count after liking the Post - "+now);
		Assert.assertEquals((Integer.parseInt(initial.split(" ")[0]))+1, Integer.parseInt(now.split(" ")[0]));
	}
	
	/**
	 * Performs unlike action in the enlarged post FROM enlarged post TO enlarged post
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	
	private static void unLike(AppiumDriver driver)
	{
		String initial = driver.findElement(By.xpath(Post_Screen.likeCount_XPATH(driver))).getText();
		EventWrapper.click(driver, By.xpath(Post_Screen.likeButton_XPATH(driver)));
		String now = driver.findElement(By.xpath(Post_Screen.likeCount_XPATH(driver))).getText();
		Log.info("Like Count Before unLiking the Post - "+initial);
		Log.info("Like count after unLiking the Post - "+now);
		Assert.assertEquals((Integer.parseInt(initial.split(" ")[0]))-1, Integer.parseInt(now.split(" ")[0]));
	}
	
	/**
	 * Performs comment action in the enlarged post FROM enlarged post TO enlarged post
	 * @param driver - Pass Appium Driver
	 * @throws Exception - Exception gor wait
	 */
	
	public static void comment(AppiumDriver driver, String text) throws Exception
	{
		String initial = driver.findElement(By.xpath(Post_Screen.commentCount_XPATH(driver))).getText();
		EventWrapper.click(driver, By.xpath(Post_Screen.commentButton_XPATH(driver)));
		EventWrapper.wait(driver, 5000);
		EventWrapper.waitUntil(driver, By.xpath(DiscoverTab_Screen.commenttextBox_XPATH()));
		EventWrapper.wait(driver, 5000);
		EventWrapper.sendKeys(driver,By.xpath(DiscoverTab_Screen.commenttextBox_XPATH()), text);
		EventWrapper.click(driver,MobileBy.AccessibilityId(DiscoverTab_Screen.postComment_ID()));
		EventWrapper.wait(driver, 5000);
		EventWrapper.back(driver);
		String now = driver.findElement(By.xpath(Post_Screen.commentCount_XPATH(driver))).getText();
		Log.info("Like Count Before Liking the Post - "+initial);
		Log.info("Like count after Liking the Post - "+now);
		Assert.assertEquals((Integer.parseInt(initial.split(" ")[0]))+1, Integer.parseInt(now.split(" ")[0]));
		EventWrapper.back(driver);
	}

}
