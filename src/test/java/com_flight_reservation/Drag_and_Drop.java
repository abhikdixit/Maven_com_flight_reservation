package com_flight_reservation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_and_Drop {
	
	ChromeDriver driver;
  @Test
	public void DragDrop() throws InterruptedException 
	{
		 
		// Open webpage
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		// Add 5 seconds wait
		Thread.sleep(5000);
		// Create object of actions class
		Actions act=new Actions(driver);
		// find element which we need to drag
		WebElement drag=driver.findElement(By.id("draggable"));
		// find element which we need to drop
		WebElement drop=driver.findElement(By.id("droppable"));
		// this will drag element to destination
		act.dragAndDrop(drag, drop).build().perform();
		 Thread.sleep(5000);
		driver.quit();
		 
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
}
