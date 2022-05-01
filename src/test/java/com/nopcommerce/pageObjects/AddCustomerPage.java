package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p") @CacheLookup WebElement linkCustomer;
	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p") @CacheLookup WebElement subLinkCustomer ;
	@FindBy(xpath = "/html/body/div[3]/div[1]/form[1]/div/div/a") @CacheLookup WebElement btnAddNew ;
	@FindBy(xpath = "//*[@id=\"Email\"]") @CacheLookup WebElement txtEmail ;
	@FindBy(xpath = "//*[@id=\"Password\"]") @CacheLookup WebElement txtPassword ;
	@FindBy(xpath = "//*[@id=\"FirstName\"]") @CacheLookup WebElement txtFirstName;
	@FindBy(xpath = "//*[@id=\"LastName\"]") @CacheLookup WebElement txtLastName;
	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[5]/div[2]/div/div[2]/label") @CacheLookup WebElement radioFemale  ;
	@FindBy(xpath = "//*[@id=\"DateOfBirth\"]") @CacheLookup WebElement txtDOB ;
	@FindBy(xpath = "//*[@id=\"Company\"]") @CacheLookup WebElement txtCompanyName;
	@FindBy(xpath = "//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div/input") @CacheLookup WebElement txtNewsLetter;
	@FindBy(xpath = "//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]") @CacheLookup WebElement cancelRegistered ;
	@FindBy(xpath = "//*[@id=\"SelectedCustomerRoleIds_listbox\"]/li[3]") @CacheLookup WebElement guestRegistered;
	@FindBy(xpath = "//*[@id=\"AdminComment\"]") @CacheLookup WebElement txtAdminComments;
	@FindBy(xpath = "/html/body/div[3]/div[1]/form/div[1]/div/button[1]") @CacheLookup WebElement btnSave;
	
	
	public void clickLinkCustomer() {
		linkCustomer.click();
	}
	
	public void clickSubLinkCustomer() {
		subLinkCustomer.click();
	}
	
	public void clickAddNewButton() {
		btnAddNew.click();
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	public void clickRadioFemale() {
		radioFemale.click();
	}
	
	public void setDOB(String dob) {
		txtDOB.sendKeys(dob);
	}
	public void setCompanyName(String compName) {
		txtCompanyName.sendKeys(compName);
	}
	public void setNewsLetter(String newsLetter) {
		txtNewsLetter.sendKeys(newsLetter);
	}
	public void clickCancelRegister() {
		cancelRegistered.click();
	}
	
	public void clickGuestRegistered() {
		guestRegistered.click();
	}
	public void setAdminComments(String adminComments) {
		txtAdminComments.sendKeys(adminComments);
	}
	
	public void clickSaveButton() {
		btnSave.click();
	}
	

}
