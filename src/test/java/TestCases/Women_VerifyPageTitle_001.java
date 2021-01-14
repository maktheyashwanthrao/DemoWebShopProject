package TestCases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjects.HomePage;


public class Women_VerifyPageTitle_001 extends BaseClass {

	
	//public ExtentReports extent;
	
	private static Logger log = LogManager.getLogger(BaseClass.class.getName());

//	@BeforeTest()
//	public void config() {
//		String path = System.getProperty("user.dir")+"\\Reports\\index.html";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Yashwanth - This is my Report name");
//		reporter.config().setDocumentTitle("Yashwanth Test Result");
//		
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("Tester", "Yashwanth");
//		
//		
//	}

	@Test()
	public void VerifyWomenPage() throws InterruptedException {
		ExtentTest test = extent.createTest("Initial Demo");
		HomePage hp = new HomePage(driver);

		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		System.out.println("WebDriver Object " +driver);

		
		
		hp.getWomenPage().click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.className("cat-name")).getText();
		String ExpectedTitle = "WOMEN ";
		Assert.assertEquals(actualtitle, ExpectedTitle);

		extent.flush();

	}

}
