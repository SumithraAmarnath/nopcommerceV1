package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AddCustomerPage;
import com.nopcommerce.pageObjects.LoginPage;

public class TC_AddNewCustomerTest_003 extends BaseClass{
	
	@Test
	public void addCustomerTest() throws InterruptedException {
		driver.get(baseURL);
		logger.info("URL opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		logger.info("Email Provided");
		lp.setPassword(password);
		logger.info("Password Provided");
		lp.clickLogin();
		
		AddCustomerPage acp = new AddCustomerPage(driver);
		acp.clickLinkCustomer();
		acp.clickSubLinkCustomer();
		acp.clickAddNewButton();
		System.out.println(generateRandomString()+"@you.com");
		acp.setEmail(generateRandomString()+"@you.com");
		
		acp.setPassword("pass");
		
		acp.setFirstName("Hello");
		
		acp.setLastName("Everyone");
		
		acp.clickRadioFemale();
		
		acp.setDOB("4/20/2000");
		
		acp.setCompanyName("Company name");
		
		acp.setAdminComments("kakfkfjksfjkadsfjdksfjdklsfjdklsfjdlkjfldksjf");
		
		acp.clickSaveButton();
	}

	
}
