package com.arena.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PO_003_ProjectsPage {
	
	WebDriver ldriver;
	
	public PO_003_ProjectsPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using="//h3[text()=' AI Testing ']")
	@CacheLookup
	WebElement clkProject;
	
	
	public void clkProject() {
		clkProject.click();
	}
	
	
}
										