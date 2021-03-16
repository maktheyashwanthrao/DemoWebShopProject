package com.dws.tests;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import com.dws.pages.HomePage;
import com.dws.pages.LoginPage;
import com.dws.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public ExtentReports extent;

	@BeforeClass()
	public void setUp() throws InterruptedException {

		ReadConfig rc = new ReadConfig();
		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(rc.getApplicationURL());

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

	public static void login() {
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailId().sendKeys(ReadConfig.getEmailId());
		lp.getPassword().sendKeys(ReadConfig.getPassword());
		lp.getLoginbutton().click();
	}

}
