package com_flight_reservation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Mercury_SignOn_TestNg {
	
	ChromeDriver driver;
  @Test
  public void Sign_On() {
	  
	    driver.findElement(By.linkText("SIGN-ON")).click();	
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
  }
  @BeforeClass
  public void Launch_Browser() {
	  
	    String absolutepath=System.getProperty("user.dir");
		String filepath=absolutepath+"\\drivers"+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterClass
  public void close_Browser() {
	  
	  driver.quit();
	  
	  
  }

}
