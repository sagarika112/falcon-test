package com.falcon.lib.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
 WebDriver driver;
 public LoginPage(WebDriver driver)
 {
	 this.driver=driver;
 }
 public WebElement getUserNameTextbox()
 {
	 try
	 {
		 WebElement un = driver.findElement(By.name("username"));
		 return un;
	 }
	 catch(Exception e)
	 {
		 return null;
	 }
 }
 public WebElement getPasswordTextbox()
 {
	 try
	 {
		 WebElement pwd = driver.findElement(By.name("pwd"));
		 return pwd;
	 }
	 catch(Exception e)
	 {
		 return null;
	 }
 }
 public WebElement getLoginButton()
 {
	 try
	 {
		 return driver.findElement(By.id("loginButton"));
	 }
	 catch(Exception e)
	 {
		 return null;
	 }
 }
 public WebElement getLoginError()
 {
	 try
	 {
		 return driver.findElement(By.xpath("//span[text()='Username or"
		 		+ " Password is invalid. Please try again.']"));
		 
	 }
	 catch(Exception e)
	 {
		 return null;
	 }
 }
 public void waitForPageToLoad()
 {
	 WebDriverWait Wait = new WebDriverWait(driver,30);
	 Wait.until(ExpectedConditions.invisibilityOf(getUserNameTextbox()));
	 Wait.until(ExpectedConditions.invisibilityOf(getPasswordTextbox()));
	 Wait.until(ExpectedConditions.invisibilityOf(getLoginButton()));
	 
	 
 }
 
}
