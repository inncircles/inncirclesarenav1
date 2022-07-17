package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_004_ProjectPage {
	
	WebDriver ldriver;
	
	public PO_004_ProjectPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='#/project-works']//div")
	@CacheLookup
	WebElement lnkProjectWorks;					
	
	@FindBy(xpath="//a[@href='#/work-delivery-models']//div")
	@CacheLookup
	WebElement lnkWorkPhasePlanning;
	
	@FindBy(xpath="//a[@href='#/deliver-work']//div")
	@CacheLookup
	WebElement lnkFieldWorks;
	
		@FindBy(xpath="//div[text()[normalize-space()='RFI']]")
		@CacheLookup
		WebElement btnRFI;
		

	@FindBy(xpath="//a[@href='#/analytics']//div")
	@CacheLookup
	WebElement lnkDataAnalytics;
	
	@FindBy(xpath="//a[@href='#/schemas/permissionScheme']//div")
	@CacheLookup
	WebElement lnkUserPermissions;
	
	@FindBy(xpath="//a[@href='#/project-settings']//div")
	@CacheLookup
	WebElement lnkProjectSettings;
	
	
	public void clickProjectWorks() {
		lnkProjectWorks.click();
	}
	
	public void clickWorkPhasePlanning() {
		lnkWorkPhasePlanning.click();
	}
	
	public void clickFieldWorks() {
		lnkFieldWorks.click();
	}
	
		public void clickRFI() {
			btnRFI.click();
		}
	
	public void clickDataAnalytics() {
		lnkDataAnalytics.click();
	}
	
	public void clickUserPermissions() {
		lnkUserPermissions.click();
	}
	
	public void clickProjectSettings() {
		lnkProjectSettings.click();
	}
}
