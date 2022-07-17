package com.arena.testCases;

import java.io.IOException;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_008_QL1_Log;

import junit.framework.Assert;

public class TC_008_QL1_Log extends BaseClass {
	
	@Test
	public void QL1Log () throws InterruptedException, IOException
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
		
		PO_008_QL1_Log QL1Log=new PO_008_QL1_Log(driver);
		Thread.sleep(5000);
		
		QL1Log.tabQuality();
		Thread.sleep(4000);
		logger.info("Qualty Tab Clicked");
		
		QL1Log.crdQL1();
		Thread.sleep(4000);
		logger.info("Quality Level 1 Clicked");
		
		QL1Log.qtyLocation();
		Thread.sleep(4000);
		logger.info("Location Clicked");
		
//		driver.navigate().refresh();

		
		QL1Log.qtyExpand();
		Thread.sleep(4000);
		logger.info("Expand Clicked");
		

//		System.out.println(driver.findElement(By.xpath("(//input[@type='radio' and @tabindex='0' and @name='0'])[1]")));
		
//		List <WebElement> list1 = driver.findElements(By.xpath("(//input[@type='radio' and @name='0'])"));
//		
//		for(int i=0; i<list1.size();i++) {
//			WebElement ele=list1.get(i);
//			String ids = ele.getAttribute("id");
//			System.out.println(ids);
//		}
		
		driver.findElement(By.xpath("//label[@for='mat-radio-2-input']//span")).click();
		Thread.sleep(4000);
		logger.info("Check 1 Clicked");
		
//		List <WebElement> list2 = driver.findElements(By.xpath("(//input[@type='radio' and @name='1'])"));
//		
//		for(int i=0; i<list2.size();i++) {
//			WebElement ele=list2.get(i);
//			String ids = ele.getAttribute("id");
//			System.out.println(ids);
//		}
		
		driver.findElement(By.xpath("//label[@for='mat-radio-6-input']//span")).click();
		Thread.sleep(2000);
		logger.info("Check 2 Clicked");
		
		driver.findElement(By.xpath("//label[@for='mat-radio-10-input']//span")).click();
		Thread.sleep(2000);
		logger.info("Check 3 Clicked");
		
		driver.findElement(By.xpath("//label[@for='mat-radio-14-input']//span")).click();
		Thread.sleep(2000);
		logger.info("Check 4 Clicked");
		
		driver.findElement(By.xpath("//label[@for='mat-radio-18-input']//span")).click();
		Thread.sleep(2000);
		logger.info("Check 5 Clicked");
		
		driver.findElement(By.xpath("//div[contains(@class,'mat-form-field-outline mat-form-field-outline-thick')]/following-sibling::div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=' Yes ']")).click();
		Thread.sleep(2000);
		logger.info("Terminals selected Yes");
		
		driver.findElement(By.xpath("//input[@placeholder=' ']")).clear();
		driver.findElement(By.xpath("//input[@placeholder=' ']")).sendKeys("900");
		Thread.sleep(2000);
		logger.info("Torque number entered");
		
		driver.findElement(By.xpath("(//input[@placeholder=' '])[2]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder=' '])[2]")).sendKeys("Low voltage is a designation that indicates that something uses a lower stream of power than a traditional wall socket provides. Usually this means they come with some sort of a transformer or step-down device that reduces the voltage to a much lower level, which in turn means it's much safer to use.");
		Thread.sleep(2000);
		logger.info("Comments entered");
		
		driver.findElement(By.xpath("(//input[@placeholder=' '])[3]")).clear();
		driver.findElement(By.xpath("(//input[@placeholder=' '])[3]")).sendKeys("ISC Construction Corporation");
		Thread.sleep(2000);
		logger.info("Name entered");
		
		driver.findElement(By.xpath("//span[text()='Check here to sign']")).click();
		Thread.sleep(2000);
		logger.info("Sing 1 Selected");
		
		
//		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c81-20']//input[1]")).clear();
//		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c81-20']//input[1]")).sendKeys("InnCircles India Limited");
//		Thread.sleep(4000);
//		logger.info("Customer name entered");
		
		driver.findElement(By.xpath("(//span[text()='Check here to sign'])[2]")).click();
		Thread.sleep(2000);
		logger.info("Sing 2 Selected");
		
		QL1Log.btnSubmit();
		Thread.sleep(3000);
		logger.info("Submit button Clicked");
				
		
		boolean ql=driver.getPageSource().contains("Configurable Form saved successfully");
		
		if(ql==true)
		{
			Thread.sleep(2000);
			logger.info("Successfully saved Quality Level 1 Form");
			Assert.assertTrue(true);
		}
		else
		{	
			captureScreen(driver,"newWorkLogsA1");
			logger.info("Quality Level 1 Form log failed");
			Assert.assertTrue(false);
		}
		
	}

}
