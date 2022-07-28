package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arena.testCases.BaseClass;

public class PO_013_SNC_Form_Config1 extends BaseClass {
	
WebDriver ldriver;
	
	public PO_013_SNC_Form_Config1(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='#/work-delivery-models/safety']")
	@CacheLookup
	WebElement tabSafety;
	
	@FindBy(xpath="//div[text()='Setup Project Safety Forms ']")
	@CacheLookup
	WebElement crdSNC;
	
	@FindBy(xpath="//span[text()=' CREATE SAFETY FORM CATEGORY ']")
	@CacheLookup
	WebElement createSFCat;
	
	@FindBy(xpath="//label[text()='Project Safety Forms']/following::input")
	@CacheLookup
	WebElement txtFormCatName;
	
	@FindBy(xpath="//label[@class='checkbox loc-type']//div")
	@CacheLookup
	WebElement chkOne;
	
	@FindBy(xpath="(//div[@class='checkbox__box'])[2]")
	@CacheLookup
	WebElement chkTwo;
	
	@FindBy(xpath="(//div[@class='checkbox__box'])[3]")
	@CacheLookup
	WebElement chkThree;
	
	@FindBy(xpath="//div[text()='Incident Investigation Report']/following-sibling::div")
	@CacheLookup
	WebElement chkFour;
	
	@FindBy(xpath="//div[text()='Job Safety Analysis']/following-sibling::div")
	@CacheLookup
	WebElement chkFive;
	
	@FindBy(xpath="//span[text()='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	
	
	@FindBy(xpath="//h6[text()='General Safety']")
	@CacheLookup
	WebElement catGeneralSafety;
	
	@FindBy(xpath="//span[text()=' Click to make assignments ']")
	@CacheLookup
	WebElement form1PA;
	
	@FindBy(xpath="//div[text()='System Admin']/following-sibling::div")
	@CacheLookup
	WebElement user1;
	
	@FindBy(xpath="//div[text()='Sai Sathvik Nethi']/following-sibling::div")
	@CacheLookup
	WebElement user2;
	
	@FindBy(xpath="//div[text()='Raghu Srinu']/following-sibling::div")
	@CacheLookup
	WebElement user3;
	
	@FindBy(xpath="//div[text()='Abhinav B']/following-sibling::div")
	@CacheLookup
	WebElement user4;
	
	@FindBy(xpath="//div[text()='Arindam Kalra']/following-sibling::div")
	@CacheLookup
	WebElement user5;
	
	@FindBy(xpath="//div[text()='Swetha Pandhiti']/following-sibling::div")
	@CacheLookup
	WebElement user6;
	
	@FindBy(xpath="//span[text()=' Submit']")
	@CacheLookup
	WebElement btnPASubmit;
	
	@FindBy(xpath="//i[contains(@class,'fa fa-copy')]")
	@CacheLookup
	WebElement btnCopyUsers;
	
	@FindBy(xpath="//label[@for='mat-checkbox-5-input']//span")
	@CacheLookup
	WebElement chkSelectAllUsers;
	
	@FindBy(xpath="//span[text()=' Submit']")
	@CacheLookup
	WebElement btnCopySubmit;
	
	public void catGeneralSafety() throws InterruptedException 
	{
		catGeneralSafety.click();
		Thread.sleep(3000);
	}
	
	public void sncPeopleAssignment() throws InterruptedException 
	{
		form1PA.click();
		Thread.sleep(3000);
		
		user1.click();
		Thread.sleep(3000);
		
		user2.click();
		Thread.sleep(3000);
		
		user3.click();
		Thread.sleep(3000);
		
		user4.click();
		Thread.sleep(3000);
		
		user5.click();
		Thread.sleep(3000);
		
		user6.click();
		Thread.sleep(3000);
		
		btnPASubmit.click();
		Thread.sleep(3000);
	}
	
	public void sncCopyUsers() throws InterruptedException 
	{
		btnCopyUsers.click();
		Thread.sleep(3000);
		
		chkSelectAllUsers.click();
		Thread.sleep(3000);
		
//		btnCopySubmit.click();
//		Thread.sleep(3000);
	}
	
	public void OpeningCalls() throws InterruptedException 
	{
		tabSafety.click();
		Thread.sleep(4000);
		
		crdSNC.click();
		Thread.sleep(4000);
		
		createSFCat.click();
		Thread.sleep(4000);
		
		txtFormCatName.sendKeys("General Safety");
		Thread.sleep(4000);		
	}
	
	public void SelectForms () throws InterruptedException 
	{
		chkOne.click();
		Thread.sleep(3000);
		
		chkTwo.click();
		Thread.sleep(3000);
		
		chkThree.click();
		Thread.sleep(3000);
		
		chkFour.click();
		Thread.sleep(3000);
		
		chkFive.click();
		Thread.sleep(3000);
	}
	
	public void btnSubmit() 
	{
		btnSubmit.click();
	}
	
	public void btnCopySubmit() 
	{
		btnCopySubmit.click();
	}
}
