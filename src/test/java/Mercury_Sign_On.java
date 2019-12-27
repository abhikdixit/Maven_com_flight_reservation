

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mercury_Sign_On {
	
	@Test
	public void TC_001_SignOn_Successfull_Login(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\Selenium Training\\workspace\\HCL_Mercury_Tours\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("SIGN-ON")).click();	
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		driver.quit();
		
		
		
	}	

}
