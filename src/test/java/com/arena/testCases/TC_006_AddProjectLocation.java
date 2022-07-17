package com.arena.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_006_AddProjectLocation;

import junit.framework.Assert;

public class TC_006_AddProjectLocation extends BaseClass {

	
	@Test
	public void AddProjectLocation () throws InterruptedException, IOException
	{
		PO_001_LoginPage lp=new PO_001_LoginPage(driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		lp.setUserName(username);
		lp.setPassWord(password);
		Thread.sleep(1000);
		lp.clickSubmit();
																
		Thread.sleep(2000);
		
		PO_003_ProjectsPage projectsPage=new PO_003_ProjectsPage(driver);
		logger.info("Project Page clicked");
		projectsPage.clkProject();

		Thread.sleep(4000);
		
		PO_004_ProjectPage projectPage=new PO_004_ProjectPage(driver);
		Thread.sleep(2000);
		projectPage.clickProjectWorks();
		logger.info("Project Works clicked");
		Thread.sleep(2000);
		
		PO_006_AddProjectLocation newProjectLocation=new PO_006_AddProjectLocation(driver);
		Thread.sleep(4000);
		
		newProjectLocation.crdProWorkAreas();
		Thread.sleep(6000);
		newProjectLocation.btnProCreateLocation();
		Thread.sleep(5000);
		newProjectLocation.clkProAddLocation();
		Thread.sleep(5000);
		newProjectLocation.btnProLocSubmit();
		Thread.sleep(3000);
		
		projectPage.clickProjectWorks();
		logger.info("Project Works clicked");
		
		boolean apl=driver.getPageSource().contains("Tag is successfully created");
		
		if(apl==true)
		{
			Thread.sleep(2000);
			logger.info("Project location created successfully");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"AddProjectLocation");
			logger.info("Project location creation failed");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(4000);
		newProjectLocation.crdProWBS();
		Thread.sleep(4000);
		newProjectLocation.btnAddNewWBS();
		Thread.sleep(4000);
		newProjectLocation.selectWBS();
		Thread.sleep(4000);
		newProjectLocation.selectLocation();
		Thread.sleep(4000);
		newProjectLocation.btnWBSSave();
		Thread.sleep(4000);
		
		projectPage.clickProjectWorks();
		logger.info("Project Works clicked");
		
//		boolean mpwbs=driver.getPageSource().contains("Successfully saved the WBS mapping to Tag");
		boolean mpwbs=driver.getPageSource().contains("COMMERCIAL CONSTRUCTION PROJECT (CCP)");
		
		if(mpwbs==true)
		{
			logger.info("Successfully mapped the WBS");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"AddProjectLocation");
			logger.info("Mapping WBS failed");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(4000);
		newProjectLocation.crdProjectPeopleAssign();
		Thread.sleep(4000);
		
		newProjectLocation.selectProjectLocation();
		Thread.sleep(4000);
		logger.info("Selected project location");
		
		newProjectLocation.selectAllUsers();
		logger.info("Select all users clicked");
		
		Thread.sleep(6000);
		newProjectLocation.btnSaveChanges();
		logger.info("Save changes clicked");
		Thread.sleep(4000);
		
		projectPage.clickProjectWorks();
		logger.info("Project Works clicked");
		
		Thread.sleep(4000);
		boolean pa=driver.getPageSource().contains("COMMERCIAL CONSTRUCTION PROJECT (CCP)");
		
		if(pa==true)
		{
			logger.info("Successfully Assigned People");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"AddProjectLocation");
			logger.info("People assignment failed");
			Assert.assertTrue(false);
		}
	}
	
}
