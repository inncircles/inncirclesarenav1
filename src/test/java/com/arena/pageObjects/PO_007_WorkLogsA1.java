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
		
		@FindBy(xpath="(//div[@class='d-flex px-0']//div)[2]")
		@CacheLookup
		WebElement crdWorkLogs;
		
		@FindBy(xpath="//i[contains(@class,'fa icon-up')]")
		@CacheLookup
		WebElement tabLocationTypes;
		
		@FindBy(xpath="//h6[text()=' INS - CONDUIT ']")
		@CacheLookup
		WebElement tabLocation;
		
		@FindBy(xpath="//label[@for='series-0-input']//span")
		@CacheLookup
		WebElement chkWorkPackage;
		
		
		//2
		@FindBy(xpath="//h6[text()=' INST - WIRE ']")
		@CacheLookup
		WebElement chkWireWorkPackage;
		
		//3
		@FindBy(xpath="//h6[text()=' INST - FIELD TERMS ']")
		@CacheLookup
		WebElement chkFldTermsWorkPackage;
			
		
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
		
		//2
		public void chkWireWorkPackage()
		{
			chkWireWorkPackage.click();
		}
		
		//3
		public void chkFldTermsWorkPackage()
		{
			chkFldTermsWorkPackage.click();
		}
		
		public void btnSaveChanges()
		{
			btnSaveChanges.click();
		}
		
		

}
