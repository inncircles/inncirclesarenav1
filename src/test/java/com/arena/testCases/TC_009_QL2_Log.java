package com.arena.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;
import com.arena.pageObjects.PO_004_ProjectPage;
import com.arena.pageObjects.PO_009_QL2_Log;

import junit.framework.Assert;

public class TC_009_QL2_Log extends BaseClass {

	@Test
	public void QL2Log () throws InterruptedException, IOException, AWTException 
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
		
				
		
		PO_009_QL2_Log QL2Log=new PO_009_QL2_Log(driver);
		Thread.sleep(5000);
		
		QL2Log.tabQuality();
		Thread.sleep(4000);
		logger.info("Qualty Tab Clicked");
		
		QL2Log.crdQL1();
		Thread.sleep(4000);
		logger.info("Quality Level 1 Clicked");
		
		QL2Log.qtyLocation();
		Thread.sleep(5000);
		logger.info("Location Clicked");
		
		driver.navigate().refresh();
		Thread.sleep(7000);
		
		QL2Log.qtyExpand();
		Thread.sleep(4000);
		logger.info("Expand Clicked");
		


//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("scroll(0, 5000)","");
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 6000)");
		
		QL2Log.tabCheckpoints();
		Thread.sleep(2000);
		
		QL2Log.tabGeneralInfo();
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 9000)");
		
		QL2Log.tabTestContinuity();
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 12000)");
		
		QL2Log.tabTestInsulation();
		Thread.sleep(2000);
		
		QL2Log.tabTestAcceptance();
		Thread.sleep(2000);
		
		Robot rb=new Robot();
		rb.delay(3000);
		
		rb.keyPress(KeyEvent.VK_ESCAPE); // Press  Escape 
		rb.keyPress(KeyEvent.VK_ESCAPE); // Release Escape
		Thread.sleep(2000);
		logger.info("Escape key function activated");
		
		QL2Log.repNames();
		Thread.sleep(2000);
		

		QL2Log.btnSubmit();
		Thread.sleep(4000);
		logger.info("Submit button Clicked");
		
		boolean confirm=driver.getPageSource().contains("Save Confirmation");
		
		if(confirm==true) {
			driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();
			Thread.sleep(3000);
			logger.info("Yes button Clicked");
			
			boolean q2=driver.getPageSource().contains("Successfully saved qualitylogs");
			
			if(q2==true)
			{
				Thread.sleep(2000);
				logger.info("Successfully saved Quality Level 2 Form");
				Assert.assertTrue(true);
			}
			else
			{	
				captureScreen(driver,"QL2Log");
				logger.info("Quality Level 2 Form log failed");
				Assert.assertTrue(false);
			}
			
		}
	}

}
//		boolean ql=driver.getPageSource().contains("Configurable Form saved successfully");
//		
//		if(ql==true)
//		{
//			Thread.sleep(4000);
//			logger.info("Successfully saved Quality Level 1 Form");
//			Assert.assertTrue(true);
//		}
//		else
//		{	
//			captureScreen(driver,"QL1Log");
//			logger.info("Quality Level 1 Form log failed");
//			Assert.assertTrue(false);
//		}
		
	

	
//		driver.findElement(By.xpath("//div[text()='PL-1 Cable 3']")).click();
//		Thread.sleep(4000);
//		logger.info("Quality Level 2 Form Clicked");
//		
//		driver.findElement(By.xpath("//small[text()=' Expand All ']")).click();
//		Thread.sleep(4000);
//		logger.info("Quality Level 2 Expand All Clicked");
//		
////		List <WebElement> list1 = driver.findElements(By.xpath("(//input[@type='radio' and @name='0'])"));
////		
////		for(int i=0; i<list1.size();i++) {
////			WebElement ele=list1.get(i);
////			String ids = ele.getAttribute("id");
////			System.out.println(ids);
////		}
//		
//		driver.findElement(By.xpath("//label[@for='mat-radio-2-input']//span")).click();
//		Thread.sleep(2000);
//		logger.info("Check 1 Clicked");
//		
//		driver.findElement(By.xpath("//label[@for='mat-radio-7-input']//span")).click();
//		Thread.sleep(2000);
//		logger.info("Check 2 Clicked");
//		
//		Robot rb=new Robot();
//		rb.delay(3000);
//		
//		
////			// Create object of SimpleDateFormat class and decide the format
////			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
////			 
////			 //get current date time with Date()
////			 Date date = new Date();
////			 
////			 // Now format the date
////			 String date1= dateFormat.format(date);
//
//			ActionClass ac=new ActionClass();
//			
//			
//			//For No checkpoint
//			driver.findElement(By.xpath("//div[@contenteditable='true']//p")).sendKeys("Quality Level Checkpoint 1 " + ac.getCurrentTime());
//			Thread.sleep(4000);
//			
//			driver.findElement(By.xpath("//label[@for='file-input']//img")).click();
//			Thread.sleep(4000);
//			
//						
//			StringSelection ss1=new StringSelection("C:\\Users\\Inncircless\\Downloads\\Safety_Issue-07.jpg");
//			ac.SelectImage(driver, ss1);
//			
//			
//			driver.findElement(By.xpath("//label[@for='file-input']//img")).click();
//			Thread.sleep(4000);
//			
//			StringSelection ss2=new StringSelection("C:\\Users\\Inncircless\\Downloads\\Safety_Issue-08.jpg");
//			ac.SelectImage(driver, ss2);
//			
//			logger.info("Quality Level 2 Issue 1 Entered");
//		
//		
//		
//		driver.findElement(By.xpath("//label[@for='mat-radio-10-input']//span")).click();
//		Thread.sleep(2000);
//		logger.info("Check 3 Clicked");
//		
//		driver.findElement(By.xpath("//label[@for='mat-radio-14-input']//span")).click();
//		Thread.sleep(2000);
//		logger.info("Check 4 Clicked");
//		
//		driver.findElement(By.xpath("//label[@for='mat-radio-20-input']//span")).click();
//		Thread.sleep(2000);
//		logger.info("Check 5 Clicked");
//		
//		//Table Data 1st Row
//		driver.findElement(By.xpath("//textarea[@rows='10']")).clear();
//		driver.findElement(By.xpath("//textarea[@rows='10']")).sendKeys("Table Column 1 Row1 data");
//		Thread.sleep(2000);
//		logger.info("Table Column 1 Row1 data entered");
//		
//		
//		driver.findElement(By.xpath("//div[@formarrayname='values']//input")).clear();
//		driver.findElement(By.xpath("//div[@formarrayname='values']//input")).sendKeys("Table Column 2 Row1 data");
//		Thread.sleep(2000);
//		logger.info("Table Column 2 Row1 data entered");
//		
//		//Table Data 2nd Row
//		driver.findElement(By.xpath("(//textarea[@rows='10'])[2]")).clear();
//		driver.findElement(By.xpath("(//textarea[@rows='10'])[2]")).sendKeys("Table Column 1 Row2 data");
//		Thread.sleep(2000);
//		logger.info("Table Column 1 Row2 data entered");
//		
//		driver.findElement(By.xpath("(//div[@formarrayname='values']//input)[2]")).clear();
//		driver.findElement(By.xpath("(//div[@formarrayname='values']//input)[2]")).sendKeys("Table Column 2 Row2 data");
//		Thread.sleep(2000);
//		logger.info("Table Column 2 Row2 data entered");
//		
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//input[@placeholder=' ']")).clear();
//		driver.findElement(By.xpath("//input[@placeholder=' ']")).sendKeys("890");  //15
//		Thread.sleep(2000);
//		logger.info("size field data entered");
//		
//		driver.findElement(By.xpath("(//input[@placeholder=' '])[2]")).clear();
//		driver.findElement(By.xpath("(//input[@placeholder=' '])[2]")).sendKeys("HITACHI"); //16
//		Thread.sleep(2000);
//		logger.info("manufacturer field data entered");
//		
//		driver.findElement(By.xpath("(//input[@placeholder=' '])[3]")).clear();
//		driver.findElement(By.xpath("(//input[@placeholder=' '])[3]")).sendKeys("9237"); //17
//		Thread.sleep(2000);
//		logger.info("voltage field data entered");
//		
//		
////		List <WebElement> list2 = driver.findElements(By.xpath("(//input[@class='mat-form-field-infix ng-tns-c81-21'])"));
////		
////		for(int i=0; i>list2.size();i++) {
////			WebElement ele=list2.get(i);
////			String ids = ele.getAttribute("id");
////			System.out.println(ids);
////		}
//        
//		driver.findElement(By.xpath("//*[@id=\"mat-input-22\"]")).clear();
//        driver.findElement(By.xpath("//*[@id=\"mat-input-22\"]")).sendKeys("From Equipment ID");
//		Thread.sleep(2000);
//		logger.info("From Equipment ID field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-23\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-23\"]")).sendKeys("From Equip Desc");
//		Thread.sleep(2000);
//		logger.info("From Equipment disc field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-24\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-24\"]")).sendKeys("From Term Drawing");
//		Thread.sleep(2000);
//		logger.info("From Equipment drawing field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-25\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-25\"]")).sendKeys("To Equipment ID");
//		Thread.sleep(2000);
//		logger.info("From TO Equipment ID field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-26\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-26\"]")).sendKeys("To Equipment desc");
//		Thread.sleep(2000);
//		logger.info("From to Equipment disc field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-27\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-27\"]")).sendKeys("To Equipment draw");
//		Thread.sleep(2000);
//		logger.info("From to Equipment drawing field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-28\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-28\"]")).sendKeys("To Equipment comments");
//		Thread.sleep(2000);
//		logger.info("From to Equipment comments field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-29\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-29\"]")).sendKeys("ISC Name");
//		Thread.sleep(2000);
//		logger.info("ISC Name field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-30\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-30\"]")).sendKeys("ISC Signature");
//		Thread.sleep(2000);
//		logger.info("ISC signature field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-32\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-32\"]")).sendKeys("Cust Name");
//		Thread.sleep(2000);
//		logger.info("Cust name field data entered");
//		
//		driver.findElement(By.xpath("//*[@id=\"mat-input-33\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"mat-input-33\"]")).sendKeys("Cust Signature");
//		Thread.sleep(3000);
//		logger.info("Cust signature field data entered");
//		
//		driver.findElement(By.xpath("//button[text()='SUBMIT']")).click();
//		Thread.sleep(3000);
//		logger.info("Submit button Clicked");
//		
//		boolean confirm=driver.getPageSource().contains("Save Confirmation");
//		
//		if(confirm==true) {
//			driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();
//			Thread.sleep(3000);
//			logger.info("Yes button Clicked");
//			
//			boolean q2=driver.getPageSource().contains("Configurable Form saved successfully");
//			
//			if(q2==true)
//			{
//				Thread.sleep(2000);
//				logger.info("Successfully saved Quality Level 2 Form");
//				Assert.assertTrue(true);
//			}
//			else
//			{	
//				captureScreen(driver,"QL2Log");
//				logger.info("Quality Level 2 Form log failed");
//				Assert.assertTrue(false);
//			}
//			
//		}
//					
//		
//	}
		
		

	
	
