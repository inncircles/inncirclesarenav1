package com.arena.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_013_SNC_Form_Config1;

import junit.framework.Assert;

public class TC_013_SNC_Form_Config1 extends BaseClass {
	
	@Test
	public void SNCConfig1 () throws InterruptedException, IOException, AWTException 
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
		
		projectPage.clickWorkPhasePlanning();
		logger.info("Field Works Clicked");
		Thread.sleep(2000);
		
				
		
		PO_013_SNC_Form_Config1 sncConfig=new PO_013_SNC_Form_Config1(driver);
		Thread.sleep(5000);
		
		
		sncConfig.OpeningCalls();
		Thread.sleep(3000);
		logger.info("Safety NC Form 1st Step");
		
		sncConfig.SelectForms();
		Thread.sleep(3000);
		logger.info("Safety NC Forms selected");
		
		sncConfig.btnSubmit();
		logger.info("Submit clicked");
		Thread.sleep(4000);
		
		boolean snc=driver.getPageSource().contains("General Safety successfully created.");
		
		if(snc==true)
		{
			Thread.sleep(2000);
			logger.info("Successfully created the Safery Non Calendar Category");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"SNCConfig1");
			logger.info("Safery Non Calendar Category creation failed");
			Assert.assertTrue(false);
		}
		
		sncConfig.catGeneralSafety();
		Thread.sleep(2000);
		logger.info("General Cagetory clicked");
		
		sncConfig.sncPeopleAssignment();
		Thread.sleep(2000);
		logger.info("Assigned Users");
		
		driver.navigate().refresh();
		Thread.sleep(7000);
		
		sncConfig.sncCopyUsers();
		Thread.sleep(4000);
		logger.info("Copy Users");
		
		sncConfig.btnCopySubmit();
		logger.info("Submit clicked");
		Thread.sleep(5000);
		
		boolean snc1=driver.getPageSource().contains("//span[text()='AI Testing']");
		
		if(snc1==true)
		{
			Thread.sleep(2000);
			logger.info("Successfully Assigned Users");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"SNCConfig1");
			logger.info("Users Assignment failed");
			Assert.assertTrue(false);
		}
		
	}
}
