package com.arena.testCases;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;

import junit.framework.Assert;

public class TC_011_CreateNewProject extends BaseClass {
	
	@Test
	public void CreateNewProject () throws InterruptedException, IOException, AWTException 
	{
		PO_001_LoginPage lp=new PO_001_LoginPage(driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		lp.setUserName(username);
		lp.setPassWord(password);
		Thread.sleep(1000);
		lp.clickSubmit();
		
		ActionClass ac=new ActionClass();
		
		Thread.sleep(4000);
		
		
		
		driver.findElement(By.xpath("//span[text()=' Create Project ']")).click();
		logger.info("Create Project Clicked");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@class='profile']")).click();
		logger.info("Image Upload clicked");
		Thread.sleep(3000);
		
		StringSelection ss1=new StringSelection("C:\\Users\\Inncircless\\Downloads\\ISC_1.jpg");
		ac.SelectImage(driver, ss1);
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='projectName']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='projectName']")).sendKeys("AI Testing");
		logger.info("Project Name Entered");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='customer']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='customer']")).sendKeys("ISC Constructors");
		logger.info("Customer Name Entered");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//div[contains(@class,'mat-form-field-outline mat-form-field-outline-thick')]/following-sibling::div)[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//mat-option[@role='option']//span)[2]")).click();
		logger.info("Const Type Clicked");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='location']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='location']")).sendKeys("Baton Rouge");
		logger.info("Location Entered");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='builder']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='builder']")).sendKeys("ISC Constructors");
		logger.info("Owner Entered");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='manager']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='manager']")).sendKeys("Srikanth Bangaru");
		logger.info("PM Entered");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='roughEstimation']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='roughEstimation']")).sendKeys("1000 PER SQFT");
		logger.info("Estimate Entered");
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
		logger.info("Submit clicked");
		Thread.sleep(4500);
		
		boolean cp=driver.getPageSource().contains("Successfully saved the project!");
		
		if(cp==true)
		{
			Thread.sleep(2000);
			logger.info("Successfully created the Project");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"CreateNewProject");
			logger.info("Project creation failed");
			Assert.assertTrue(false);
		}
	
	}

}
