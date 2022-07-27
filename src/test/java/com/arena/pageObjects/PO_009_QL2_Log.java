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

public class PO_009_QL2_Log extends BaseClass{
	
	WebDriver ldriver;
		
	public PO_009_QL2_Log(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='#/deliver-work/quality']")
	@CacheLookup
	WebElement tabQuality;
	
	@FindBy(xpath="//div[text()='Quality Level 2 ']")
	@CacheLookup
	WebElement crdQL1;
	
	@FindBy(xpath="//div[text()='Cable 1']")
	@CacheLookup
	WebElement qtyLocation;
	
	@FindBy(xpath="//small[text()=' Expand All ']")
	@CacheLookup
	WebElement qtyExpand;
	

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
	
	@FindBy(xpath="//button[text()='SUBMIT']")
	@CacheLookup
	WebElement btnSubmit;
	
		
	//General Info
		@FindBy(xpath="//input[@data-placeholder=' ']")
		@CacheLookup
		WebElement txtLocationArea;
		
		@FindBy(xpath="(//input[@data-placeholder=' '])[2]")
		@CacheLookup
		WebElement txtDrawingNo;
		
		@FindBy(xpath="(//input[@data-placeholder=' '])[3]")
		@CacheLookup
		WebElement txtCableNo;
		
		@FindBy(xpath="//input[@id='mat-input-3']")
		@CacheLookup
		WebElement txtSize;
		
		@FindBy(xpath="//input[@id='mat-input-4']")
		@CacheLookup
		WebElement txtMfgr;
	
	// Test Continuity
		
		@FindBy(xpath="//mat-select[@id='mat-select-0']/div[1]/div[2]/div[1]")
		@CacheLookup
		WebElement downPowerConductors;
		
		@FindBy(xpath="//mat-option[@id='mat-option-0']//span[1]")
		@CacheLookup
		WebElement sltPowerConductors;
		
		@FindBy(xpath="//mat-select[@id='mat-select-2']/div[1]/div[2]/div[1]")
		@CacheLookup
		WebElement downControlConductors;
		
		@FindBy(xpath="//mat-option[@id='mat-option-4']//span[1]")
		@CacheLookup
		WebElement sltControlConductors;
		
	
	// Test Insulation
	
		@FindBy(xpath="//input[@id='mat-input-9']")
		@CacheLookup
		WebElement txtInsPowerCond1;
		
		@FindBy(xpath="//input[@id='mat-input-10']")
		@CacheLookup
		WebElement txtInsPowerCond2;
		
		@FindBy(xpath="//input[@id='mat-input-11']")
		@CacheLookup
		WebElement txtInsPowerCond3;
		
		
	// Test Acceptance
		@FindBy(xpath="//mat-select[@id='mat-select-4']/div[1]/div[2]/div[1]")
		@CacheLookup
		WebElement downTestAttached;
		
		@FindBy(xpath="//mat-option[@role='option']//span")
		@CacheLookup
		WebElement sltAcceptanceVal1;
		
		@FindBy(xpath="(//mat-option[@role='option']//span)[2]")
		@CacheLookup
		WebElement sltAcceptanceVal2;
	
	// RepNames
		@FindBy(xpath="//input[@id='mat-input-30']")
		@CacheLookup
		WebElement ownerRepName;
		
		@FindBy(xpath="//label[@for='mat-checkbox-2-input']//span")
		@CacheLookup
		WebElement ownerRepSign;
		
		@FindBy(xpath="//input[@id='mat-input-32']")
		@CacheLookup
		WebElement custRepName;
		
		@FindBy(xpath="//mat-checkbox[@id='mat-checkbox-3']/label[1]/span[1]")
		@CacheLookup
		WebElement custRepSign;
	
	//No Checkpoint
		@FindBy(xpath="//label[@for='file-input']//img[1]")
		@CacheLookup
		WebElement clkImage;
		
		@FindBy(xpath="//div[@data-placeholder='Comments']//p[1]")
		@CacheLookup
		WebElement chkComment1;
	
	//Checkpoints
	public void tabCheckpoints() throws InterruptedException, AWTException
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
		
		chkComment1.sendKeys("Quality Level Checkpoint 1 " + ac.getCurrentTime());
		Thread.sleep(4000);
		
		logger.info("Quality Level 2 Issue 1 Entered");
		
		
	}
	//General Info
	public void tabGeneralInfo() throws InterruptedException
	{
		txtLocationArea.clear();
		txtLocationArea.sendKeys("USA");
		Thread.sleep(2000);
		
		txtDrawingNo.clear();
		txtDrawingNo.sendKeys("8000");
		Thread.sleep(2000);
		
		txtCableNo.clear();
		txtCableNo.sendKeys("9000");
		Thread.sleep(2000);
		
		txtSize.clear();
		txtSize.sendKeys("7000");
		Thread.sleep(2000);
		
		txtMfgr.clear();
		txtMfgr.sendKeys("HITACHI");
		Thread.sleep(2000);
		logger.info("MFG Entered");
				
	}
	
	// Test Continuity
	
		public void tabTestContinuity() throws InterruptedException
		{
			downPowerConductors.click();
			Thread.sleep(4000);
			logger.info("Power Conductors down button clicked");
			sltPowerConductors.click();
			Thread.sleep(4000);
			logger.info("Power Conductors value selected clicked");
			downControlConductors.click();
			Thread.sleep(4000);
			logger.info("Control Conductors down button clicked");
			Thread.sleep(4000);
			sltControlConductors.click();
			logger.info("Control Conductors value selected clicked");
			Thread.sleep(4000);
				
		}
	
	// Test Insulation
	
	public void tabTestInsulation() throws InterruptedException
	{
		txtInsPowerCond1.clear();
		txtInsPowerCond1.sendKeys("Power Conductors: A-B");
		Thread.sleep(5000);
		
		txtInsPowerCond2.clear();
		txtInsPowerCond2.sendKeys("Power Conductors: A-Gnd");
		Thread.sleep(5000);
		
		txtInsPowerCond3.clear();
		txtInsPowerCond3.sendKeys("Power Conductors: B-C");
		Thread.sleep(5000);
		logger.info("Test Insulation data entered");
	}
	
	//Test Acceptance
	public void tabTestAcceptance() throws InterruptedException
	{
		downTestAttached.click();
		Thread.sleep(4000);
		sltAcceptanceVal1.click();
		Thread.sleep(4000);
		sltAcceptanceVal2.click();
		Thread.sleep(4000);
		logger.info("Test Acceptance values selected");

	}
	
	public void repNames () throws InterruptedException 
	{
		ownerRepName.clear();
		ownerRepName.sendKeys("Srikanth");
		Thread.sleep(2000);
		
		ownerRepSign.click();
		Thread.sleep(2000);
		
		custRepName.clear();
		custRepName.sendKeys("David");
		Thread.sleep(2000);
		
		custRepSign.click();
		Thread.sleep(2000);
		logger.info("Representatives Names Entered");
	}
	
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


