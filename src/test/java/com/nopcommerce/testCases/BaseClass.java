package com.nopcommerce.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.nopcommerce.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig rc = new ReadConfig();
	
	public String baseURL = rc.getApplicationURL();
	public String email = rc.getEmail();
	public String password = rc.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) {
		
		logger = Logger.getLogger("nopcommerce");
		PropertyConfigurator.configure("log4j.properties");
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",rc.getChromePath());
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver",rc.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(browser.equals("ie")){
			System.setProperty("webdriver.ie.driver",rc.getIePath());
			driver = new InternetExplorerDriver();
		}
		
		
		
		
	}
	
	@AfterClass	
	public void tearDown() {
		
		driver.quit();
	}

	
	public void captureScreenShot(WebDriver driver,String testCaseName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\ScreenShots\\"+testCaseName+".png");
		FileUtils.copyFile(source, target);
		
	}
	
	public String generateRandomString() {
		return RandomStringUtils.randomAlphabetic(8);
	}
	
	public String generateRandomInt() {
		return RandomStringUtils.randomNumeric(8);
	}
}
