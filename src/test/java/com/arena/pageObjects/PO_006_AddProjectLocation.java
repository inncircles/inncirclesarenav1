package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arena.testCases.BaseClass;

public class PO_006_AddProjectLocation extends BaseClass {
	
	WebDriver ldriver;
	WebElement webElement;
	
	public PO_006_AddProjectLocation(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
		
	@FindBy(xpath="//div[text()='Project Work Areas ']")
	@CacheLookup
	WebElement crdProjectWorkAreas;
	
	//Add CWA 
	//1
	@FindBy(xpath="//button[contains(@class,'add-new-log-button btn-sm')]//span")
	@CacheLookup
	WebElement btnCreateCWA;
	
	//2
	@FindBy(xpath="//button[text()='+']")
	@CacheLookup
	WebElement clkAddCWA;
	
	//3
	@FindBy(xpath="//span[text()='Submit']")
	@CacheLookup
	WebElement btnCWASubmit;
	
	//4
	@FindBy(xpath="//div[text()='CWA  1']")
	@CacheLookup
	WebElement rightclkCWA;
	
	//5
	@FindBy(xpath="//li[text()='Edit']")
	@CacheLookup
	WebElement clkEditCWA;
	
	//6
	@FindBy(xpath="//span[text()='CWA  1']/following::input")
	@CacheLookup
	WebElement newCWA;
	
	//7	
	@FindBy(xpath="//span[text()='Submit']")
	@CacheLookup
	WebElement btnEditCWA;
	
	//Add System
	//8
	@FindBy(xpath="(//button[contains(@class,'add-new-log-button btn-sm')]//span)[2]")
	@CacheLookup
	WebElement btnAddSys;
	
	//9
	@FindBy(xpath="//button[text()='+']")
	@CacheLookup
	WebElement btnAddNewSys;
	
	//10
	@FindBy(xpath="//span[text()='Submit']")
	@CacheLookup
	WebElement btnSysSubmit;
	
	
	//Add Project Location
	@FindBy(xpath="//span[text()='CREATE']")
	@CacheLookup
	WebElement btnCreateLocation;
	
	@FindBy(xpath="//button[text()='+']")
	@CacheLookup
	WebElement clkAddLocation;
	
	@FindBy(xpath="//span[text()='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	
	//Mapping Project Work Breakdown Structure
	@FindBy(xpath="//div[text()='Project Work Breakdown Structure ']")
	@CacheLookup
	WebElement crdProjectWBS;
	
	@FindBy(xpath="(//a[contains(@class,'inn-tab-link cursor-pointer')])[1]")
	@CacheLookup
	WebElement tabLocation;
	
	@FindBy(xpath="//span[text()='Add New Mappings']")
	@CacheLookup
	WebElement btnAddNewWBS;
	
	@FindBy(xpath="//div[contains(@class,'nav-item p-3')]//div")
	@CacheLookup
	WebElement selectWBS;
	
	@FindBy(xpath="//mat-checkbox[@id='cb-0-0']/label[1]/span[1]")
	@CacheLookup
	WebElement selectLocation;
	
	@FindBy(xpath="//span[text()=' Save Changes']")
	@CacheLookup
	WebElement btnSave;
	
	@FindBy(id="toast-container")
	@CacheLookup
	WebElement tstMessage;
	
	//People Assignment
	@FindBy(xpath="//div[text()='Project People Assignments ']")
	@CacheLookup
	WebElement crdProjectPeopleAssign;
	
	@FindBy(xpath="//div[text()='NEWCWA']")
	@CacheLookup
	WebElement tabLocPL;	
	
	@FindBy(xpath="//h6[text()=' Cable 1']")
	@CacheLookup
	WebElement selectProjectLocation;
	
	
	//selecting wps
	@FindBy(xpath="(//div[contains(@class,'d-flex align-items-center')]//h6)[3]")
	@CacheLookup
	WebElement selectPLWP1;
	
	@FindBy(xpath="(//div[contains(@class,'d-flex align-items-center')]//h6)[7]")
	@CacheLookup
	WebElement selectPLWP2;
	
	@FindBy(xpath="(//div[contains(@class,'d-flex align-items-center')]//h6)[8]")
	@CacheLookup
	WebElement selectPLWP3;
	
	@FindBy(xpath="(//div[contains(@class,'d-flex align-items-center')]//h6)[9]")
	@CacheLookup
	WebElement selectPLWP4;
	
	@FindBy(xpath="(//div[contains(@class,'d-flex align-items-center')]//h6)[10]")
	@CacheLookup
	WebElement selectPLWP5;
	
	@FindBy(xpath="(//div[contains(@class,'d-flex align-items-center')]//h6)[4]")
	@CacheLookup
	WebElement selectPLWP6;
	
	
	
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[3]")
	@CacheLookup
	WebElement selectUser1;
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[12]")
	@CacheLookup
	WebElement selectUser2;
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[19]")
	@CacheLookup
	WebElement selectUser3;
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[21]")
	@CacheLookup
	WebElement selectUser4;
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[27]")
	@CacheLookup
	WebElement selectUser5;
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[35]")
	@CacheLookup
	WebElement selectUser6;
	
	@FindBy(xpath="(//button[contains(@class,'mat-focus-indicator mat-flat-button')])[2]")
	@CacheLookup
	WebElement copyUsers;
	
	@FindBy(xpath="//mat-checkbox[@id='mat-checkbox-39']/label[1]/span[1]")
	@CacheLookup
	WebElement copyLocation;
	
	@FindBy(xpath="//span[text()='SAVE CHANGES']")
	@CacheLookup
	WebElement btnSaveChanges;
	
	//Add CWA
	
	public void btnCreateCWA()
	{
		btnCreateCWA.click();
	}
	
	public void clkAddCWA()
	{
		clkAddCWA.click();
	}
	
	public void btnCWASubmit()
	{
		btnCWASubmit.click();
	}
	
	public void rightclkCWA()
	{
		rightclkCWA.click();
	}
	
//	Actions actions = new Actions(driver);
	
	public void clkEditCWA()
	{
		clkEditCWA.click();
	}
	
	public void newCWA(String nCWA)
	{
		newCWA.sendKeys(nCWA);
	}
	
	public void btnEditCWA()
	{
		btnEditCWA.click();
	}
	
	// Add New System
	
	public void btnAddSys()
	{
		btnAddSys.click();
	}
	
	public void btnAddNewSys()
	{
		btnAddNewSys.click();
	}
	
	public void btnSysSubmit()
	{
		btnSysSubmit.click();
	}
	
	
	
	//Add Project Location
	public void crdProWorkAreas()
	{
		crdProjectWorkAreas.click();
	}
	
	public void btnProCreateLocation()
	{
		btnCreateLocation.click();
	}
	
	public void clkProAddLocation() {
		clkAddLocation.click();
	}
	
	public void btnProLocSubmit() {
		btnSubmit.click();;
	}

	//Mapping Project Work Breakdown Structure
	public void crdProWBS()
	{
		crdProjectWBS.click();
	}
	
	public void tabLocation()
	{
		tabLocation.click();
	}
	
	public void btnAddNewWBS() 
	{
		btnAddNewWBS.click();
	}
	public void selectWBS() 
	{
		selectWBS.click();
	}
	
	public void selectLocation() 
	{
		selectLocation.click();
	}
	
	public void btnWBSSave() {
		btnSave.click();;
	}
	
	public void tstMessage(String tMessage) {
		btnSave.sendKeys(tMessage);
	}
	
	//People Assignment
	public void crdProjectPeopleAssign()
	{
		crdProjectPeopleAssign.click();
	}
	
	public void tabLocPL()
	{
		tabLocPL.click();
	}
	
	public void selectProjectLocation()
	{
		selectProjectLocation.click();
	}
	
	public void selectPLWP1()
	{
		selectPLWP1.click();
	}
	
	public void selectPLWP2()
	{
		selectPLWP2.click();
	}
	
	public void selectPLWP3()
	{
		selectPLWP3.click();
	}
	
	public void selectPLWP4()
	{
		selectPLWP4.click();
	}
	
	public void selectPLWP5()
	{
		selectPLWP5.click();
	}
	
	public void selectPLWP6()
	{
		selectPLWP6.click();
	}
	
	public void selectAllUsers() throws InterruptedException 
	{
		selectUser1.click();
		Thread.sleep(3000);
		logger.info("Selected 1User");
		
		selectUser2.click();
		Thread.sleep(3000);
		selectUser3.click();
		Thread.sleep(3000);
		selectUser4.click();
		Thread.sleep(3000);
		selectUser5.click();
		Thread.sleep(3000);
		selectUser6.click();
		Thread.sleep(3000);
		btnSaveChanges.click();
		Thread.sleep(5000);
	}
	
	public void copyUsers()
	{
		copyUsers.click();
	}
	
	public void copyLocation()
	{
		copyLocation.click();
	}
	
	public void btnSaveChanges()
	{
		btnSaveChanges.click();
	}
}
