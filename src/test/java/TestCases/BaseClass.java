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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.ReadConfig;

public class BaseClass {

	public WebDriver driver;
	public ExtentReports extent;

	@BeforeTest()
	public void setUp() throws InterruptedException {

		ReadConfig rc = new ReadConfig();

		System.setProperty("webdriver.chrome.driver", rc.getChromeDriverPath());
		driver = new ChromeDriver();
		driver.get(rc.getApplicationURL());
		// driver.findElement(By.xpath("")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		String path = System.getProperty("user.dir") + "\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Yashwanth - This is my Report name");
		reporter.config().setDocumentTitle("Yashwanth Test Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester  ", "Yashwanth");
		System.out.println("Extent report object" + extent);

	}

	

	@AfterTest()
	public void tearDown() {
		driver.quit();
	}
}
