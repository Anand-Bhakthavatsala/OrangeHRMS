package com.test.practice.SeleniumWebDriverManager2;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrangeHRMS {
	
	@Test //TestNG annotations
	public void testOrangeHRMS()
	{		
		//Chrome browser
	
		WebDriverManager.chromedriver().setup();//it will recognise the chrome browser version in our system
		WebDriver driver = new ChromeDriver(); //driver object
		
		/*//FireFox Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");		
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();		
		System.out.println("Successfully executed - 7th July");
	}
}
