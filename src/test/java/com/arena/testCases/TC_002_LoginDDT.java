package com.arena.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.utilities.XLUtils;

import junit.framework.Assert;

public class TC_002_LoginDDT extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void TC_002_loginDDT(String user, String pwd) throws InterruptedException
	{
		PO_001_LoginPage lp=new PO_001_LoginPage(driver);
		lp.setUserName(user);
		lp.setPassWord(pwd);
		lp.clickSubmit();
		
		Thread.sleep(2000);
		if(isAlertPresent()==true)
		{
//			driver.switchTo().alert().accept(); //close alert
//			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login Failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login Passed");
			Thread.sleep(2000);
			lp.clickAccount();
			Thread.sleep(2000);
			lp.clickLogout();
//			driver.switchTo().alert().accept(); //close logout alert
//			driver.switchTo().defaultContent();
		}
		
		
	}
	
	public boolean isAlertPresent() //user defined method created to check alert is present or not
	{
		try
		{
		//driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/arena/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "LoginData");
		int colcount=XLUtils.getCellCount(path, "LoginData", 1);
		
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) 
		{
			for(int j=0;j<colcount;j++) 
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "LoginData", i, j);
			}
		}
	return logindata;	
	}

}
