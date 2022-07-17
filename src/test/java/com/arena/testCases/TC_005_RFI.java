package com.arena.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_005_RFI;

import junit.framework.Assert;

public class TC_005_RFI extends BaseClass 
{

	@Test
	public void newRFIForm() throws InterruptedException, AWTException, IOException
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
		
		projectPage.clickRFI();
		Thread.sleep(2000);

		PO_005_RFI newRFI=new PO_005_RFI(driver);
		Thread.sleep(2000);
		
		newRFI.btnCreate();
		
		logger.info("RFI Form opened");
		newRFI.rfiRevision("890");
		Thread.sleep(2000);
		newRFI.rfiDescription("The leading safety hazards on construction sites include falls, being caught between objects, electrocutions, and being struck by objects. These hazards have caused injuries and deaths on construction sites throughout the world.");
		Thread.sleep(2000);
		newRFI.rfiStatus("Open");
		Thread.sleep(2000);
		newRFI.rfiPriority("High");
		Thread.sleep(2000);
		newRFI.rfiConfig1("Safety issues at construction site involves safety during excavation, scaffolding, formwork, working at heights, material handling and stacking, housekeeping works.");
		
		Thread.sleep(2000);
//		newRFI.rfiImpact("09", "07", "2022");
		
//		Thread.sleep(2000);
//		logger.info("Date Entered");
//		Thread.sleep(2000);

//		newRFI.rfiDiscipline();
//		Thread.sleep(2000);
//		newRFI.rfiDA();
//		logger.info("Discipline selected");
//		Thread.sleep(2000);
//		newRFI.rfiTest();
//		Thread.sleep(2000);
//		newRFI.rfiTA();
//		Thread.sleep(2000);
//		logger.info("Test selected");
		
		Robot rb=new Robot();
		rb.delay(3000);
		
//		rb.keyPress(KeyEvent.VK_ESCAPE); // Press  Escape 
//		rb.keyPress(KeyEvent.VK_ESCAPE); // Release Escape
//		

//		newRFI.rfiConfig1("Configuration Text 1");
		
		logger.info("Clicked on Form");
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("scroll(0, 5000)","");
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 5000)");
		
		newRFI.rfiSelectImage();
		logger.info("Clicked on Image button");
		
		
		rb.delay(3000);
		
		//put the file into clipboard
		StringSelection ss=new StringSelection("C:\\Users\\Inncircless\\Downloads\\Safety_Issue-07.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Control+V
		rb.keyPress(KeyEvent.VK_CONTROL); // Press on CTRL +
		rb.keyPress(KeyEvent.VK_V); // Press on V
		
		rb.keyRelease(KeyEvent.VK_CONTROL); // Release CTRL +
		rb.keyRelease(KeyEvent.VK_V); // Release V
		
		Thread.sleep(2000);
		//Press Enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(4000);

		
		newRFI.clickSubmit();
		rb.delay(4000);
//		Thread.sleep(4000);
		
		
		
		boolean res=driver.getPageSource().contains("Please fill all the required fields in the form");
		
		
			
			
		
				
		if(res==true)
		{
			captureScreen(driver,"newRFIForm");
			logger.info("RFI Form creation failed");
			Assert.assertTrue(false);
		}
		else
		{	
			Thread.sleep(2000);
			//Press Enter key
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(2000);
			logger.info("RFI Form created");
			Assert.assertTrue(true);
		}
		
	}
	
	
}
