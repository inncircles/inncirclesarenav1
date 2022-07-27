package com.arena.pageObjects;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arena.testCases.ActionClass;
import com.arena.testCases.BaseClass;

public class PO_012_Safety_NC_Form1 extends BaseClass {
	
	WebDriver ldriver;
	
	public PO_012_Safety_NC_Form1(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='#/deliver-work/safety']")
	@CacheLookup
	WebElement tabSafety;
	
	@FindBy(xpath="//div[text()='Safety Forms ']")
	@CacheLookup
	WebElement crdSNC;
	
	@FindBy(xpath="//h6[text()=' Pre-Job Safety Checklist']")
	@CacheLookup
	WebElement sftPreJobChk;
	
	@FindBy(xpath="//span[text()='CREATE FORM']")
	@CacheLookup
	WebElement sftCreateForm;
	
	@FindBy(xpath="//small[text()=' Expand All ']")
	@CacheLookup
	WebElement sftExpandAll;
	
	//Inspection Items
		@FindBy(xpath="//label[@for='mat-radio-2-input']//span")
		@CacheLookup
		WebElement chk1;
		
		@FindBy(xpath="//label[@for='mat-radio-7-input']//span")
		@CacheLookup
		WebElement chk2;
		
		@FindBy(xpath="//label[@for='mat-radio-10-input']//span")
		@CacheLookup
		WebElement chk3;
		
		@FindBy(xpath="//label[@for='mat-radio-14-input']//span")
		@CacheLookup
		WebElement chk4;
		
		@FindBy(xpath="//label[@for='mat-radio-18-input']//span")
		@CacheLookup
		WebElement chk5;
		
		@FindBy(xpath="//label[@for='mat-radio-22-input']//span")
		@CacheLookup
		WebElement chk6;
		
		@FindBy(xpath="//label[@for='file-input']//img[1]")
		@CacheLookup
		WebElement clkImage;
		
		@FindBy(xpath="//div[@data-gramm='false']//p[1]")
		@CacheLookup
		WebElement chkComment1;
		
	//General Info
		@FindBy(xpath="//input[@data-placeholder=' ']")
		@CacheLookup
		WebElement txtGenOwner;
		
		@FindBy(xpath="(//input[@placeholder=' '])[2]")
		@CacheLookup
		WebElement txtGenPM;
		
		@FindBy(xpath="(//input[@placeholder=' '])[3]")
		@CacheLookup
		WebElement txtGenPNo;
		
		@FindBy(xpath="//span[text()=' SUBMIT ']")
		@CacheLookup
		WebElement btnSubmit;
	
	public void OpeningCalls() throws InterruptedException 
	{
		tabSafety.click();
		Thread.sleep(4000);
		
		crdSNC.click();
		Thread.sleep(4000);
		
		sftPreJobChk.click();
		Thread.sleep(4000);
		
		sftCreateForm.click();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		Thread.sleep(7000);
		
		sftExpandAll.click();
		Thread.sleep(4000);
		
	}
	
	public void InspectionItems() throws InterruptedException, AWTException 
	{
		ActionClass ac=new ActionClass();
		
		chk1.click();
		Thread.sleep(4000);
		logger.info("Check 1 Clicked");
		
		
		chk2.click();
		Thread.sleep(4000);
		
		//For No checkpoint
				
		clkImage.click();
		Thread.sleep(4000);
		
		StringSelection ss1=new StringSelection("C:\\Users\\Inncircless\\Downloads\\Safety_Issue-07.jpg");
		ac.SelectImage(driver, ss1);
		
		
		clkImage.click();
		Thread.sleep(4000);
		
		StringSelection ss2=new StringSelection("C:\\Users\\Inncircless\\Downloads\\Safety_Issue-08.jpg");
		ac.SelectImage(driver, ss2);
		
		chkComment1.sendKeys("Safety Non-calendar Checkpoint 1 " + ac.getCurrentTime());
		Thread.sleep(4000);
		
		logger.info("Safety Non-calendar Issue 1 Entered");
	}
	
	public void GeneralInfo() throws InterruptedException 
	{
		txtGenOwner.clear();
		txtGenOwner.sendKeys("ISC");
		Thread.sleep(2000);
		
		txtGenPM.clear();
		txtGenPM.sendKeys("Srikanth");
		Thread.sleep(2000);
		
		txtGenPNo.clear();
		txtGenPNo.sendKeys("98876");
		Thread.sleep(2000);
	}
	
	public void btnSubmit() 
	{
		btnSubmit.click();
	}
}
