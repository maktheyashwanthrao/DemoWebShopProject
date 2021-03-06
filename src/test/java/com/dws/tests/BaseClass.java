package com.dws.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.dws.pages.HomePage;
import com.dws.pages.LoginPage;
import com.dws.utilities.ReadConfig;

public class BaseClass {

	public static WebDriver driver;
	public ExtentReports extent;
	
	//Setup and launch browser
	@BeforeClass()
	public void setUp() throws InterruptedException {
		
		 //WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		ReadConfig rc = new ReadConfig();
		driver.get(rc.getApplicationURL());

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	//Close the browser
	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

	/*
	 * Method for login
	 */
	public static void login() {
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailId().sendKeys(ReadConfig.getEmailId());
		lp.getPassword().sendKeys(ReadConfig.getPassword());
		lp.getLoginbutton().click();
	}

}
