package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_007_WorkLogsA1 {
	
	WebDriver ldriver;
		
		public PO_007_WorkLogsA1(WebDriver rdriver) 
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//div[text()='Work Logs ']")
		@CacheLookup
		WebElement crdWorkLogs;
		
		@FindBy(xpath="//i[contains(@class,'fa icon-up')]")
		@CacheLookup
		WebElement tabLocationTypes;
		
		@FindBy(xpath="//h6[contains(@class,'mat-tooltip-trigger mb-0')]")
		@CacheLookup
		WebElement tabLocation;
		
		@FindBy(xpath="//label[@for='62d01e4ec772b555314709ee-input']//span")
		@CacheLookup
		WebElement chkWorkPackage;
		
		@FindBy(xpath="//span[text()=' Save Changes ']")
		@CacheLookup
		WebElement btnSaveChanges;
		
		
		
		public void crdWorkLogs()
		{
			crdWorkLogs.click();
		}
		
		public void tabLocationTypes()
		{
			tabLocationTypes.click();
		}
		
		public void tabLocation()
		{
			tabLocation.click();
		}
		
		public void chkWorkPackage()
		{
			chkWorkPackage.click();
		}
		
		public void btnSaveChanges()
		{
			btnSaveChanges.click();
		}
		
		

}
