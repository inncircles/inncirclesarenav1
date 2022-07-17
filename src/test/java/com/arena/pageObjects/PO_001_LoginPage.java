package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_001_LoginPage {
	
	WebDriver ldriver;
	
	public PO_001_LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@formcontrolname='username']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	@CacheLookup
	WebElement txtPassWord;
	
	@FindBy(xpath="//span[text()='LOG IN']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//div[text()[normalize-space()='Account']]")
	@CacheLookup
	WebElement btnAccount;
	
	@FindBy(xpath="//button[text()='Logout']")
	@CacheLookup
	WebElement btnLogout;
	
	public void setUserName(String uname) 
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassWord(String pwd) 
	{
		txtPassWord.sendKeys(pwd);
	}

	public void clickSubmit() 
	{
		btnLogin.click();
	}
	public void clickAccount() 
	{
		btnAccount.click();
	}
	public void clickLogout() 
	{
		btnLogout.click();
	}
}
