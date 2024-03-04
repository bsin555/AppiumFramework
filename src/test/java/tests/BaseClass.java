package tests;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class BaseClass extends ExtentReportsDemo {
AndroidDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();


		capabilities.setCapability("deviceName","V2065");
		//capabilities.setCapability("udid", "41fc4872");
		capabilities.setCapability("platformname", "Android");     
		capabilities.setCapability("automationName","uiautomator2");
		capabilities.setCapability("platformversion", "10");

		/*The number of seconds the Appium server should wait for clients 
		 * to send commands before deciding 
		 * that the client has gone away and the session 
		 * should shut down*/

		capabilities.setCapability("appium:newCommandTimeout", 60);

		//capabilities.setCapability("app", "completePathOfApkFile");
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("chromedriverExecutable","C:\\Users\\bsing\\git\\AppiumFramework\\drivers\\chromedriver122-win64\\chromedriver.exe");;


		//	capabilities.setCapability("appPackage","com.oneplus.calculator");
		//	capabilities.setCapability("appActivity", "com.oneplus.calculator.Calculator");



		URL url = URI.create("http://127.0.0.1:4723/").toURL();

		driver = new AndroidDriver(url, capabilities);
		
		
	}
	
	

	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
