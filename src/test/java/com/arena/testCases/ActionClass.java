package com.arena.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionClass {
	
	public void SelectImage(WebDriver driver, StringSelection ss1) throws AWTException, InterruptedException 
	{
		
		Robot rb=new Robot();
		rb.delay(3000);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
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
	}
	
	public void DateAndTime(WebDriver driver, String date1) 
	{
		// Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 date1= dateFormat.format(date);
	}
	
	public String getCurrentTime() {
		String currentDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date());
		return currentDate;
	}
	
	public void SelectUsers (WebDriver driver, WebElement webElement) 
	{
		webElement.click();
	}

}
