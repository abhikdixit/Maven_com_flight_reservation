package com_flight_reservation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRM {
	public WebDriver driver ;
	@BeforeTest
	public void lanchApp() {
		
		String absolutePath = System.getProperty("user.dir");
		String path = absolutePath+"\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	@Test(priority=1)
	public void loginValidation() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement admin = driver.findElement(By.id("welcome"));
		if(admin.isDisplayed()) {
			System.out.println("Login Success.............");
		}
	}
	@Test(priority=3)
	public void titleValidation() {
		
		String actual = driver.getTitle();
		String expected = "OrangeHRM";
		Assert.assertEquals(actual, expected);

	}
	@Test(priority=2)
	public void logoValidation() {
		WebElement logo = driver.findElement(By.xpath("//img[@src='/webres_5df488ddad8b23.30204013/themes/default/images/logo.png']"));
		if(logo.isDisplayed()) {
			System.out.println("logo is displayed");
		}
	}
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
		
	}

}
