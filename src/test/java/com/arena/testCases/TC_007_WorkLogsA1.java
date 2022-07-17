package com.arena.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_007_WorkLogsA1;

import junit.framework.Assert;

public class TC_007_WorkLogsA1 extends BaseClass {
	
	@Test
	public void WorkLogs () throws InterruptedException, IOException
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
		
		projectPage.clickFieldWorks();
		logger.info("Field Works Clicked");
		Thread.sleep(2000);
		
		PO_007_WorkLogsA1 newWorkLogsA1=new PO_007_WorkLogsA1(driver);
		Thread.sleep(5000);
		
		newWorkLogsA1.crdWorkLogs();
		Thread.sleep(4000);
		logger.info("Worklogs Tab Clicked");
		
		newWorkLogsA1.tabLocationTypes();
		Thread.sleep(4000);
		logger.info("Location Type Selected");
		
		newWorkLogsA1.tabLocation();
		Thread.sleep(4000);
		logger.info("Location Selected");
		
		newWorkLogsA1.chkWorkPackage();
		Thread.sleep(4000);
		logger.info("Workpackage Checked");
		
		newWorkLogsA1.btnSaveChanges();
		Thread.sleep(4000);
		logger.info("Save Button Clicked");
		
		projectPage.clickProjectWorks();
		logger.info("Project Works clicked");
		
		boolean apl=driver.getPageSource().contains("Successfully saved worklogs");
		
		if(apl==true)
		{
			Thread.sleep(2000);
			logger.info("Successfully saved worklogs");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"newWorkLogsA1");
			logger.info("Worklog failed");
			Assert.assertTrue(false);
		}
		
	}

}
