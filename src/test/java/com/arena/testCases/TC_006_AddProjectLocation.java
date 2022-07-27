package com.arena.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

		Thread.sleep(3000);
		
		PO_004_ProjectPage projectPage=new PO_004_ProjectPage(driver);
		Thread.sleep(2000);
		projectPage.clickProjectWorks();
		logger.info("Project Works clicked");
		Thread.sleep(2000);
		
		PO_006_AddProjectLocation newProjectLocation=new PO_006_AddProjectLocation(driver);
		Thread.sleep(4000);
		
		newProjectLocation.crdProWorkAreas();
		Thread.sleep(4000);
		
		
		//Create New CWA
		
		
		newProjectLocation.btnCreateCWA();
		Thread.sleep(3000);
		logger.info("Create CWA clicked");
		
		newProjectLocation.clkAddCWA();
		Thread.sleep(3000);
		
		newProjectLocation.btnCWASubmit();
		Thread.sleep(3000);
		logger.info("Button CWA Submit clicked");
		
		newProjectLocation.rightclkCWA();
		Thread.sleep(3000);
		logger.info("Button CWA Submit clicked");
		
		//rightclick
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		WebElement webElement = driver.findElement(By.xpath("//div[text()='CWA  1']"));
		actions.contextClick(webElement).perform();

		
//		newProjectLocation.rightclkCWA();
//		Thread.sleep(4000);
		
		newProjectLocation.clkEditCWA();
		Thread.sleep(3000);
		
		newProjectLocation.newCWA("NEWCWA");
		Thread.sleep(3000);
		
		newProjectLocation.btnEditCWA();
		Thread.sleep(3000);
		
		logger.info("CWA Name changed");
		
		// Add New System
		
		newProjectLocation.btnAddSys();
		Thread.sleep(3000);
		
		newProjectLocation.btnAddNewSys();
		Thread.sleep(3000);
		
		newProjectLocation.btnSysSubmit();
		Thread.sleep(3000);
		
		
		newProjectLocation.btnProCreateLocation();
		Thread.sleep(4000);
		newProjectLocation.clkProAddLocation();
		Thread.sleep(4000);
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
		
		newProjectLocation.tabLocation();
		Thread.sleep(4000);
		
		newProjectLocation.btnAddNewWBS();
		Thread.sleep(4000);
		newProjectLocation.selectWBS();
		Thread.sleep(4000);
		logger.info("Selected WBS");
		newProjectLocation.selectLocation();
		Thread.sleep(4000);
		logger.info("Checked WBS for locaion");
		newProjectLocation.btnWBSSave();
		Thread.sleep(5000);
		
		projectPage.clickProjectWorks();
		logger.info("Project Works clicked");
				
//		boolean mpwbs=driver.getPageSource().contains("Successfully saved the WBS mapping to Tag");
		boolean mpwbs=driver.getPageSource().contains("Successfully saved the WBS mapping to");
		
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
		
		
		// People Assignment
		Thread.sleep(4000);
		newProjectLocation.crdProjectPeopleAssign();
		driver.navigate().refresh();
		Thread.sleep(4000);
		
//		newProjectLocation.tabLocPL();
//		Thread.sleep(4000);
//		logger.info("Selected project tab");
//		
//		newProjectLocation.selectProjectLocation();
//		Thread.sleep(4000);
//		logger.info("Selected project location");
		
		//Select WPS
		
		
		newProjectLocation.selectPLWP1();
		Thread.sleep(3000);
		newProjectLocation.selectAllUsers();
		Thread.sleep(3000);
		logger.info("Selected WP1");
		
		newProjectLocation.copyUsers();
		Thread.sleep(3000);
		logger.info("Copy users button clicked");
		
		newProjectLocation.copyLocation();
		Thread.sleep(4000);
		logger.info("Selected Location for copy");
				
//		newProjectLocation.selectPLWP2();
//		Thread.sleep(3000);
//		newProjectLocation.selectAllUsers();
//		Thread.sleep(3000);
//		logger.info("Selected WP2");
//				
//		newProjectLocation.selectPLWP3();
//		Thread.sleep(3000);
//		newProjectLocation.selectAllUsers();
//		Thread.sleep(3000);
//		logger.info("Selected WP3");
//		
//			
//		newProjectLocation.selectPLWP4();
//		Thread.sleep(3000);
//		newProjectLocation.selectAllUsers();
//		Thread.sleep(3000);
//		logger.info("Selected WP4");
//		
//		newProjectLocation.selectPLWP5();
//		Thread.sleep(3000);
//		newProjectLocation.selectAllUsers();
//		Thread.sleep(3000);
//		logger.info("Selected WP1");
//			
//				
//		newProjectLocation.selectPLWP6();
//		Thread.sleep(3000);
//		newProjectLocation.selectAllUsers();
//		Thread.sleep(3000);
//		logger.info("Selected WP6");
		
		newProjectLocation.btnSaveChanges();
		logger.info("Save changes clicked");
		Thread.sleep(4000);
		
			
		boolean pa=driver.getPageSource().contains("Successfully Assigned Users");
					
		
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
