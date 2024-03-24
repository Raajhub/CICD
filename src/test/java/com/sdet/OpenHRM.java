package com.sdet;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenHRM 
{
	 @Test
	 public void Open_HRM_Login() throws InterruptedException 
	 {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new  ChromeDriver ();
		 
		// WebDriverManager.safaridriver().setup();
		// WebDriver driver = new SafariDriver();
		
		 
		 //driver.manage().timeouts()
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		// WebDriverWait wait = new WebDriverWait(driver, null);	
		// wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@name=\"username\"]")));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		 
//		 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Admin");
//		 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("admin123");
//		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 
		 Assert.assertEquals("OrangeHRM", driver.getTitle(), "OrangeHRM Validated");
		 
		 
		 driver.close();

		 
		 
	 }
	}

