package Utilities;
 
import org.apache.log4j.Logger;
 
 public class Log 
 {
	 static String testcase ;
// Initialize Log4j logs
 
	 private static Logger Log = Logger.getLogger(Log.class.getName());//
 
 // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
 
 public static void startTestCase(String sTestCaseName)
 
 	{
	 	testcase = sTestCaseName;
 
		Log.info("****************************************************************************************");
	 
		Log.info("****************************************************************************************");
	 
		Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
	 
		Log.info("****************************************************************************************");
	 
		Log.info("****************************************************************************************");
 
		System.out.println("****************************************************************************************");
		System.out.println("****************************************************************************************");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("****************************************************************************************");
		System.out.println("****************************************************************************************");
	}
 
	//This is to print log for the ending of the test case
 
 public static void endTestCase()
 	{
 
		Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		Log.info("                                            X");
		Log.info("                                            X");
	 
	
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("                                            X");
		System.out.println("                                            X");
		
		
		
 
	}
 
	// Need to create these methods, so that they can be called  
 
 public static void info(String message) 
 		{
 
			Log.info(message);
			System.out.println(message);
 
 		}
 
 public static void Exception(Exception message) 
		{
	
			Log.info(message);
	
		}
 
 public static void warn(String message) 
 		{
 
	 		Log.warn(message);
 
 		}
 
 public static void error(String message) 
 		{
 
	 		Log.error(message);
 
 		}
 
 public static void fatal(String message) 
 		{
 
	 		Log.fatal(message);
 
 		}
 
 public static void debug(String message) 
 		{
 
	 		Log.debug(message);
 
 		}
 
}