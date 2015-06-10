package config;

import java.util.concurrent.TimeUnit;

import static executionEngine.DriverScript.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import executionEngine.DriverScript;
import utility.Log;

public class ActionKeywords {

	public static WebDriver driver;

	public static void openBrowser(String object) {
		try{
		Log.info("Opening Browser");
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		 driver=new ChromeDriver();
//		driver = new FirefoxDriver();
		}catch(Exception e){
			Log.info("Unable to open the browser"+e.getMessage());
			DriverScript.bResult=false;
		}
	}
	public static void navigate(String object) {
		try{
		Log.info("Navigating to URL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		}catch(Exception e){
			Log.info("Unable to Navigate "+e.getMessage());
			DriverScript.bResult=false;
		}
	}
	public static void click(String object){
		try{
			Log.info("Clicking on Webelement "+ object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();
		 }catch(Exception e){
 			Log.error("Not able to click --- " + e.getMessage());
 			DriverScript.bResult = false;
         	}
		}
 
	public static void input_Username(String object){
		try{
			Log.info("Entering the text in UserName");
			driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.UserName);
		 }catch(Exception e){
			 Log.error("Not able to Enter UserName --- " + e.getMessage());
			 DriverScript.bResult = false;
		 	}
		}
 
	public static void input_Password(String object){
		try{
			Log.info("Entering the text in Password");
			driver.findElement(By.xpath(OR.getProperty(object))).sendKeys(Constants.Password);
		 }catch(Exception e){
			 Log.error("Not able to Enter Password --- " + e.getMessage());
			 DriverScript.bResult = false;
		 	}
		}
 
	public static void waitFor(String object) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		 }catch(Exception e){
			 Log.error("Not able to Wait --- " + e.getMessage());
			 DriverScript.bResult = false;
         	}
		}
 
	public static void closeBrowser(String object){
		try{
			Log.info("Closing the browser");
			driver.quit();
		 }catch(Exception e){
			 Log.error("Not able to Close the Browser --- " + e.getMessage());
			 DriverScript.bResult = false;
         	}
		}
 
	}