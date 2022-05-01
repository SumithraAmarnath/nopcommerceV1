package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(id="Email") @CacheLookup WebElement txtEmail;
	@FindBy(name="Password") @CacheLookup WebElement txtPassword;
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")@CacheLookup WebElement btnLogout;
	@FindBy(xpath = "/html/body/div[3]/nav/div/ul/li[3]/a") @CacheLookup WebElement lnkLogout;
	
	public void setEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	
	public void setPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	
	public void clickLogin() {
		btnLogout.click();
	}
	
	
	public void clickLogout() {
		lnkLogout.click();
	}

}
