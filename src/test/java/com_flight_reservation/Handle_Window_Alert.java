package com_flight_reservation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handle_Window_Alert {
	ChromeDriver driver;	
	@Test
	public void HDFCLAlert() throws Exception
	{
			
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		String ActTest = driver.switchTo().alert().getText();
		String ExpTest="Customer ID  cannot be left blank.";
		Assert.assertEquals(ActTest, ExpTest);
		driver.switchTo().alert().accept();
		
	}
	
	@BeforeTest
	public void LaunchBrowser()
		
		{
		String absolutePath=System.getProperty("user.dir");
		String filepath=absolutePath+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",filepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

@AfterTest
public void CloseBrowser() {
	  driver.quit();
}

}
