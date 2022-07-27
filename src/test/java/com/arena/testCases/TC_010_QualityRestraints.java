package com.arena.testCases;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;

import junit.framework.Assert;

public class TC_010_QualityRestraints extends BaseClass {
	
	@Test
	public void QualityRestraints () throws InterruptedException, IOException, AWTException 
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
		
		driver.findElement(By.xpath("//a[@href='#/deliver-work/quality']")).click();
		Thread.sleep(3000);
		logger.info("Quality Tab Clicked");
		
		driver.findElement(By.xpath("//div[text()='Punch List ']")).click();
		Thread.sleep(4000);
		logger.info("Punch List Tab Clicked");
		
		driver.findElement(By.xpath("(//a[@routerlinkactive='inn-tab-active'])[2]")).click();
		Thread.sleep(4000);
		logger.info("Restraints  Tab Clicked");
		
		driver.findElement(By.xpath("//span[text()='Add Restraint']")).click();
		Thread.sleep(4000);
		logger.info("Add Restraint  button Clicked");
		
		
		
		
		driver.findElement(By.xpath("//div[contains(@class,'mat-form-field-outline mat-form-field-outline-thick')]/following-sibling::div")).click();
		Thread.sleep(2000);
		logger.info("CWA Clicked");
		
		driver.findElement(By.xpath("//mat-option[@role='option']//span[1]")).click();
		Thread.sleep(2000);
		logger.info("1st option Selected");
		
		driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-outline mat-form-field-outline-thick')]/following-sibling::div)[2]")).click();
		Thread.sleep(2000);
		logger.info("WD Clicked");
		
		driver.findElement(By.xpath("(//mat-option[@role='option']//span)[2]")).click();
		Thread.sleep(2000);
		logger.info("2st option Selected");
		
		driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-outline mat-form-field-outline-thick')]/following-sibling::div)[3]")).click();
		Thread.sleep(2000);
		logger.info("Tag Type Clicked");
		
		driver.findElement(By.xpath("//mat-option[@role='option']//span")).click();
		Thread.sleep(2000);
		logger.info("1st option Selected");
		
		driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-outline mat-form-field-outline-thick')]/following-sibling::div)[4]")).click();
		Thread.sleep(2000);
		logger.info("Tag Clicked");
		
		driver.findElement(By.xpath("//mat-option[@role='option']//span[1]")).click();
		Thread.sleep(2000);
		logger.info("1st option Selected");
		
		
		
		String restDesc = null;
		
		List <WebElement> list2 = driver.findElements(By.xpath("//input[contains(@id, 'mat-input-')]"));
		
		for(int i=0; i<list2.size();i++) {
			WebElement ele=list2.get(i);
			String ids = ele.getAttribute("id");
			System.out.println(ids);
			restDesc = ids;
		}
		
		ActionClass ac=new ActionClass();
		
		String strMyXPath = "//input[@id='" + restDesc + "']";
		System.out.println(strMyXPath);
		driver.findElement(By.xpath(strMyXPath)).clear();
		driver.findElement(By.xpath(strMyXPath)).sendKeys("Quality Restraints " + ac.getCurrentTime());
		
//		driver.findElement(By.xpath("//input[@id='mat-input-8']")).sendKeys("Quality Restraints");
		logger.info("Restraints description entered");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//label[@class='cursor-pointer']//img[1]")).click();
		logger.info("Image Upload clicked");
		Thread.sleep(4000);
		
		
		StringSelection ss1=new StringSelection("C:\\Users\\Inncircless\\Downloads\\Safety_Issue-07.jpg");
		ac.SelectImage(driver, ss1);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//label[@class='cursor-pointer']//img[1]")).click();
		Thread.sleep(4000);
		
		StringSelection ss2=new StringSelection("C:\\Users\\Inncircless\\Downloads\\Safety_Issue-08.jpg");
		ac.SelectImage(driver, ss2);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		logger.info("Submit button clicked");
		Thread.sleep(5000);
		
		
			
		boolean qr=driver.getPageSource().contains("Successfully saved PNL defect log!");
		
		if(qr==true)
		{
			Thread.sleep(2000);
			logger.info("Successfully saved Quality Restraint");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"QualityRestraints");
			logger.info("Quality Restraint log failed");
			Assert.assertTrue(false);
		}
	
	}

}
