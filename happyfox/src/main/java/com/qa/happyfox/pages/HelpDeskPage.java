package com.qa.happyfox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.happyfox.base.TestBase;

public class HelpDeskPage extends TestBase{
	
	@FindBy(name=".//a[contains(text(),'Help Desk')]")
	WebElement helpdeskpagetitle;
	
	public HelpDeskPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifypagetitle()
	{	
		return driver.getTitle();
	}

}
