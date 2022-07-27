package com.arena.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_012_Safety_NC_Form1;

public class TC_012_Safety_NC_Form1 extends BaseClass {
	
	@Test
	public void SNCF1LOg () throws InterruptedException, IOException, AWTException 
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
		
				
		
		PO_012_Safety_NC_Form1 SNCF1=new PO_012_Safety_NC_Form1(driver);
		Thread.sleep(5000);
		
		
		SNCF1.OpeningCalls();
		Thread.sleep(3000);
		logger.info("Safety Form Expanded");
		
		SNCF1.InspectionItems();
		Thread.sleep(3000);
		logger.info("Checkpoints Entered");
		
		SNCF1.GeneralInfo();
		Thread.sleep(3000);
		logger.info("General Info Entered");
		
		
		
	}	

}
