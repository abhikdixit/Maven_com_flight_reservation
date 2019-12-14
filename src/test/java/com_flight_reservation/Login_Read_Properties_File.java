package com_flight_reservation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Read_Properties_File {
		
	@Test	
	public static void Flight_Login() throws IOException
	{
		String absolutePath=System.getProperty("user.dir");
		String filepath=absolutePath+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",filepath);
		ChromeDriver driver = new ChromeDriver();
		
	File file = new File("D:\\F Drive\\Selenium Training Data\\workspace\\com_flight_reservation\\DataFile.properties");
	Properties prop = new Properties();
	FileInputStream fileInput = new FileInputStream(file);
	prop.load(fileInput);
	
	driver.get(prop.getProperty("URL"));
	driver.manage().window().maximize();
	driver.findElement(By.linkText(prop.getProperty("FlinkSignOn"))).click();
	driver.findElement(By.name(prop.getProperty("Fusername"))).sendKeys("testing");
	driver.findElement(By.name(prop.getProperty("Fuserpass"))).sendKeys("testing");
	driver.findElement(By.name("login")).click();
	driver.quit();
  }
}
