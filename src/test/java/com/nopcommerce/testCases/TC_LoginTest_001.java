package com.nopcommerce.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		logger.info("URL opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		logger.info("Email Provided");
		lp.setPassword(password);
		logger.info("Password Provided");
		lp.clickLogin();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			
			Assert.assertTrue(true);
			logger.info("TestCase Passed");
			lp.clickLogout();
		}
		else {
			captureScreenShot(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("TestCase Failed");
		}
	}
		
		
	
		
	

}
