package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.DressPage;
import PageObjects.HomePage;

public class Dress_VerifyPageTitle_001 extends BaseClass {

	private static Logger log = LogManager.getLogger(Dress_VerifyPageTitle_001.class.getName());

	@Test()
	public void verifyDressPage() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getDresSLink().click();
		Thread.sleep(2000);

		DressPage dp = new DressPage(driver);
		String actualName = dp.getDressPage().getText();
		String expectedName = "DRESSES ";
		log.info("verifyDressPage Test Case Setup Done");
		Assert.assertEquals(actualName, expectedName);
		log.info("verifyDressPage Test Case Pass");

	}
}