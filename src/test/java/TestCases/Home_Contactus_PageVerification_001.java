package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.ContactUsPage;
import PageObjects.HomePage;

public class Home_Contactus_PageVerification_001 extends BaseClass {

	private static Logger log = LogManager.getLogger(Home_Contactus_PageVerification_001.class.getName());

	@Test(priority = 1)
	public void verifyContactUseLink() throws InterruptedException, IOException {

		HomePage hp = new HomePage(driver);

		hp.getContactUsLink().click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.xpath("//div[@id='center_column']/h1")).getText();
		String ExpectedTitle = "CUSTOMER SERVICE - CONTACT US   "; // Wantedly added extra speces to fail this test case

		log.info("verifyContactUseLink Test method Setup Done");

		Assert.assertEquals(actualtitle, ExpectedTitle);
		log.info("verifyContactUseLink Test method Pass");

	}

	@Test(priority = 2)
	public void sendMessage() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getContactUsLink().click();
		Thread.sleep(2000);

		ContactUsPage cp = new ContactUsPage(driver);
		cp.selectSubjectHeading().click();
		Thread.sleep(2000);
		cp.getEmailAddress().sendKeys("test@test.com");
		Thread.sleep(2000);
		cp.getOrderReference().sendKeys("Testing");
		Thread.sleep(2000);
		cp.getMessagebox().sendKeys("yashwanth testing");
		Thread.sleep(2000);

		log.info("sendMessage Test method Setup Done and it got pass");

	}

	@Test(priority = 3)
	public void homeButtonVerification() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getContactUsLink().click();
		Thread.sleep(2000);

		ContactUsPage cp = new ContactUsPage(driver);
		cp.getWomenbutton().click();
		Thread.sleep(2000);

		String actualHomePageTitle = driver.getTitle();
		String ExpecteHomePageTitle = "My Store";
		log.info("homeButtonVerification Test method Setup Done");
		Assert.assertEquals(actualHomePageTitle, ExpecteHomePageTitle);
		log.info("homeButtonVerification Test method Pass");

	}

}
