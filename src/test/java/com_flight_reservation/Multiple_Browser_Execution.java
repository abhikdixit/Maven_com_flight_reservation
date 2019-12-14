package com_flight_reservation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiple_Browser_Execution {
WebDriver driver;
	
	@BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception {
		
        if(browser.equalsIgnoreCase("firefox")){
   		 System.setProperty("webdriver.gecko.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Selenium_WebDriver_3.9\\geckodriver.exe");
   		 driver = new FirefoxDriver();
        }
       else if(browser.equalsIgnoreCase("chrome")){
    		 System.setProperty("webdriver.chrome.driver","C:\\Users\\adixit\\workspace\\Selenium_WebDriver_3.9\\chromedriver.exe");
    			driver = new ChromeDriver();
        }

        else{

            //If no browser passed throw exception
        	System.out.println("Browser is not correct");
            throw new Exception("Browser is not correct");
        }

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    
	//@Test(dataProvider="Login")
	//public void Flight_Login(String uname,String password) {
	@Test
	public void Flight_Login() {

		String baseurl = "http://newtours.demoaut.com/mercurywelcome.php";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
	
	}
	  @AfterTest
	  public void CloseBrowser() {
		  driver.quit();
	  }

}
