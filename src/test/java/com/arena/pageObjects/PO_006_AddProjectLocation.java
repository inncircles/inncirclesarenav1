package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO_006_AddProjectLocation {
	
	WebDriver ldriver;
	
	public PO_006_AddProjectLocation(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//Add Project Location
	@FindBy(xpath="//div[text()='Project Work Areas ']")
	@CacheLookup
	WebElement crdProjectWorkAreas;
	
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
	
	@FindBy(xpath="//span[text()='Add New Mappings']")
	@CacheLookup
	WebElement btnAddNewWBS;
	
	@FindBy(xpath="//div[text()=' Cable Works Progress And Quality Template New  ']")
	@CacheLookup
	WebElement selectWBS;
	
	@FindBy(xpath="//label[@for='cb-1-0-input']//span")
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
	
	@FindBy(xpath="//h6[text()=' PL-1 Cable 3']")
	@CacheLookup
	WebElement selectProjectLocation;
	
	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")
	@CacheLookup
	WebElement selectAllUsers;
	
	@FindBy(xpath="//span[text()='SAVE CHANGES']")
	@CacheLookup
	WebElement btnSaveChanges;
	
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
	public void selectProjectLocation()
	{
		selectProjectLocation.click();
	}
	public void selectAllUsers()
	{
		selectAllUsers.click();
	}
	public void btnSaveChanges()
	{
		btnSaveChanges.click();
	}
}
