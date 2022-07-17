package com.arena.testCases;

import org.testng.annotations.Test;

import com.arena.pageObjects.PO_001_LoginPage;
import com.arena.pageObjects.PO_003_ProjectsPage;

public class TC_003_ProjectsPage extends BaseClass {

	@Test
	public void projectsPage () throws InterruptedException 
	{
		PO_001_LoginPage lp=new PO_001_LoginPage(driver);
		Thread.sleep(2000);
		lp.setUserName(username);
		lp.setPassWord(password);
		Thread.sleep(2000);
		lp.clickSubmit();
		
		Thread.sleep(2000);
		
		PO_003_ProjectsPage prjPage=new PO_003_ProjectsPage(driver);
		prjPage.clkProject();
	
	}
	
}
