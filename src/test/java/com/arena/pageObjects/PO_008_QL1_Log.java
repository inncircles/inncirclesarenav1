package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_008_QL1_Log {
	
	WebDriver ldriver;
	
	public PO_008_QL1_Log(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='#/deliver-work/quality']")
	@CacheLookup
	WebElement tabQuality;
	
	@FindBy(xpath="//div[text()='Quality Level 1 ']")
	@CacheLookup
	WebElement crdQL1;
	
	@FindBy(xpath="//div[text()='PL-1 Cable 3']")
	@CacheLookup
	WebElement qtyLocation;
	
	@FindBy(xpath="//small[text()=' Expand All ']")
	@CacheLookup
	WebElement qtyExpand;
	
//	@FindBy(xpath="(//input[@type='radio' and @name='0'])[1]")
	@FindBy(xpath="//label[@for='mat-radio-2-input']//span")
	@CacheLookup
	WebElement chk1;
	
	
	@FindBy(xpath="//label[@for='mat-radio-6-input']//span")
	@CacheLookup
	WebElement chk2;
	
	@FindBy(xpath="//label[@for='mat-radio-10-input']//span")
	@CacheLookup
	WebElement chk3;
	
	@FindBy(xpath="//label[@for='mat-radio-14-input']//span")
	@CacheLookup
	WebElement chk4;
	
	@FindBy(xpath="//button[text()='SUBMIT']")
	@CacheLookup
	WebElement btnSubmit;
	
	public void tabQuality()
	{
		tabQuality.click();
	}

	public void crdQL1()
	{
		crdQL1.click();
	}
	
	public void qtyLocation()
	{
		qtyLocation.click();
	}
	
	public void qtyExpand()
	{
		qtyExpand.click();
	}
	
	public void chk1()
	{
		chk1.click();
	}
	
	public void chk2()
	{
		chk2.click();
	}
	
	public void chk3()
	{
		chk3.click();
	}
	
	public void chk4()
	{
		chk4.click();
	}
	
	public void btnSubmit()
	{
		btnSubmit.click();
	}
}
