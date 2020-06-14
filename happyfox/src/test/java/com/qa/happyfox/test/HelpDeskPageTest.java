package com.qa.happyfox.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.happyfox.base.TestBase;
import com.qa.happyfox.pages.HelpDeskPage;

public class HelpDeskPageTest extends TestBase{
	
	HelpDeskPage helpdeskpage;
	
	public HelpDeskPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		helpdeskpage = new HelpDeskPage();
	}
	
	@Test(priority=1)
	public void pagetitleverification()
	{
		String titleverification=helpdeskpage.verifypagetitle();
		Assert.assertEquals(titleverification,"Help Desk Software | Customer Support Software | Support Ticket System");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
