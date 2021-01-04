package TestCases;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

import Utilities.ReadConfig;

public class BaseClass {

	public WebDriver driver;	
	
	
	
	@BeforeClass()
	public void setUp() throws InterruptedException {
		
		ReadConfig rc = new ReadConfig();
		
		System.setProperty("webdriver.chrome.driver", rc.getChromeDriverPath());
		 driver = new ChromeDriver();		
		driver.get(rc.getApplicationURL());
		//driver.findElement(By.xpath("")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}

	@AfterClass()
	public void tearDown() {
		driver.quit();
	}
}
