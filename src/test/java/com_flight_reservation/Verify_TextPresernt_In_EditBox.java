package com_flight_reservation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Verify_TextPresernt_In_EditBox {
@Test
	public void FirstName_Placeholder() {
		
	System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.name("firstname"));
		// Verify Search box is focused or not
		String FirstNamePlaceHolder=element.getAttribute("aria-label");
		System.out.println(FirstNamePlaceHolder);
		Assert.assertEquals(FirstNamePlaceHolder, "First name");
		driver.quit();
	}
}
