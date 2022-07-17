package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_005_RFI {
	
	WebDriver ldriver;
	
	public PO_005_RFI(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath="//span[text()='CREATE']")
	@CacheLookup
	WebElement btnCreate;

	
	@FindBy(xpath="//input[@data-placeholder='Enter revision']")
	@CacheLookup
	WebElement txtRev;
	
	@FindBy(xpath="//div[@data-placeholder='Type text here']//p[1]")
	@CacheLookup
	WebElement txtDescription;
	
	@FindBy(xpath="//span[text()='Status']/following::textarea")
	@CacheLookup
	WebElement txtStatus;
	
	@FindBy(xpath="//span[text()='Priority']/following::input")
	@CacheLookup
	WebElement txtPriority;
	
	@FindBy(xpath="//span[text()='Impact']/following::input")
	@CacheLookup
	WebElement txtImpact;
	
	@FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']/div[2]/div[1]/mat-dialog-content[1]/app-local-shared-form[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	@CacheLookup
	WebElement btnDiscipline;
	
	
	@FindBy(xpath="//span[text()=' A ']")
	@CacheLookup
	WebElement btnDA;
	
	@FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']/div[2]/div[1]/mat-dialog-content[1]/app-local-shared-form[1]/form[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-inn-select[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	@CacheLookup
	WebElement btnTest;
	
	@FindBy(xpath="//span[text()=' A ']")
	@CacheLookup
	WebElement btnTA;
	
	@FindBy(xpath="(//input[@data-placeholder='Enter text'])[2]")
	@CacheLookup
	WebElement txtConfig1;
	
	@FindBy(className="image-upload")
	@CacheLookup
	WebElement selectImage;

	@FindBy(xpath="//button[contains(@class,'mat-focus-indicator btn-sm')]")
	@CacheLookup
	WebElement btnRFIsubmit;
	
	public void btnCreate() {
		btnCreate.click();
	}
	
	public void rfiRevision(String rRevision) {
		txtRev.sendKeys(rRevision);
	}

	public void rfiDescription(String rDescription) {
		txtDescription.sendKeys(rDescription);
	}
	
	public void rfiStatus(String rStatus) {
		txtStatus.sendKeys(rStatus);
	}
	
	public void rfiPriority(String rPriority) {
		txtPriority.sendKeys(rPriority);
	}
	
	public void rfiImpact(String mm, String dd, String yyyy) {
		txtImpact.sendKeys(mm);
		txtImpact.sendKeys(dd);
		txtImpact.sendKeys(yyyy);
	}
	
	public void rfiDiscipline() {
		btnDiscipline.click();
	}
	
	public void rfiDA() {
		btnDA.click();
	}
	
	public void rfiTest() {
		btnTest.click();
	}
	
	public void rfiTA() {
		btnTA.click();
	}
	
	public void rfiConfig1(String rConfig1) {
		txtConfig1.sendKeys(rConfig1);
	}
	
	public void rfiSelectImage() {
		selectImage.click();
	}
	
	
	public void clickSubmit() 
	{
		btnRFIsubmit.click();
	}

	
}
