package com.arena.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;

import junit.framework.Assert;

public class TC_001_LoginTest extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException 
	{
		
		logger.info("URL is opened");
		
		PO_001_LoginPage lp=new PO_001_LoginPage(driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		lp.setUserName(username);
		
		logger.info("Entered Username");

		lp.setPassWord(password);
		
		logger.info("Entered password");
		
		Thread.sleep(2000);
		lp.clickSubmit();
		
		Thread.sleep(2000);
		lp.clickAccount();
		
		Thread.sleep(2000);
		lp.clickLogout();
		
		if(driver.getTitle().equals("Arena")) 
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");

		}
		else 
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");

		}
	}
}
