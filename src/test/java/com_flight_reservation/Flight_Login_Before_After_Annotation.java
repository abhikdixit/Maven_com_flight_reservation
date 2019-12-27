package com_flight_reservation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;




public class Flight_Login_Before_After_Annotation {
	
	ChromeDriver driver;
	@Test
	public void TC_001_SignOn_Successfull_Login(){
		
		driver.findElement(By.linkText("SIGN-ON")).click();	
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
	
		
		
	}	
	
	
	@Before
	public void LaunchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\Selenium Training\\workspace\\HCL_Mercury_Tours\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		
	}

	
	@After
	
	public void CloseBrowse(){
		
		driver.quit();
		
		
		
	}
}
