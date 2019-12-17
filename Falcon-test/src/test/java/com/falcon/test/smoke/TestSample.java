package com.falcon.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.falcon.lib.ui.LoginPage;
import com.falcon.lib.utils.CreateDriver;

public class TestSample {
WebDriver driver;
LoginPage login;
@BeforeMethod
public void preConditions()
{
	driver=CreateDriver.getBrowserInstance();
	login=new LoginPage(driver);
}
@AfterMethod
public void postConditions()
{
	driver.close();
}
@Test
public void testSample()
{
	String actualTitle=driver.getTitle();
	String ExxpectedTitle="actiTIME - Login";
	Assert.assertEquals(actualTitle, ExxpectedTitle);
	
	
}
}
