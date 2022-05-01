package com.nopcommerce.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;
import com.nopcommerce.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass {
	
	static int counter = 0;
	
	@Test(dataProvider = "loginData")
	public void loginTest(String email,String password) throws IOException, InterruptedException {
		
		driver.get(baseURL);
		logger.info("URL opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		logger.info("Email Provided"+email);
		lp.setPassword(password);
		logger.info("Password Provided"+password);
		lp.clickLogin();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			
			Assert.assertTrue(true);
			logger.info("TestCase Passed");
			lp.clickLogout();
		}
		else {
			captureScreenShot(driver,"loginTest"+counter);
			counter += 1;
			Assert.assertTrue(false);
			logger.info("TestCase Failed");
		}
		
	}
	
	@DataProvider(name = "loginData")
	public String[][] getLoginData() throws IOException {
		
		String path = "C://Users//amarn.SUMITHRA//Downloads//Part6-Adding+DataDrivenTestcase//Part6-Adding DataDrivenTestcase//testData//LoginData.xlsx";
		String sheet = "Sheet1";
	
		int rowNum = XLUtils.getRowCount(path,sheet);
		int columnCount = XLUtils.getCellCount(path, sheet, rowNum);
		
		String loginData[][] = new String[rowNum][columnCount];
		
		for (int i=1;i<=rowNum;i++) {
			for(int j=0;j<columnCount;j++) {
				loginData[i-1][j]=XLUtils.getCellData(path, sheet, i, j);
			}
		}
		
		return loginData;
	}
	
	

}
