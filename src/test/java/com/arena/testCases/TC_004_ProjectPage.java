package com.arena.testCases;

import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_003_ProjectsPage;

public class TC_004_ProjectPage extends BaseClass {
	
	@Test
	public void projectPage () throws InterruptedException 
	{
		PO_001_LoginPage lp=new PO_001_LoginPage(driver);
		Thread.sleep(2000);
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
		logger.info("WorkPhase Planning clicked");
		Thread.sleep(2000);
		projectPage.clickFieldWorks();
		logger.info("Field Works Clicked");
		Thread.sleep(2000);
		projectPage.clickDataAnalytics();
		logger.info("Data Analytics clicked");
		Thread.sleep(2000);
		projectPage.clickUserPermissions();
		logger.info("User Permissions clicked");
		Thread.sleep(2000);
		projectPage.clickProjectSettings();
		logger.info("Project Settings clicked");
		Thread.sleep(2000);
	}

}
