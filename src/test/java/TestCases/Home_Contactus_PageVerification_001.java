package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.ContactUsPage;
import PageObjects.HomePage;
import Utilities.ReadConfig;

public class Home_Contactus_PageVerification_001 extends BaseClass{

	private static Logger log = LogManager.getLogger(Home_Contactus_PageVerification_001.class.getName());

	@Test(enabled=false)
	public void verifyContactUseLink() throws InterruptedException, IOException {

		HomePage hp = new HomePage(driver);

		hp.getContactUsLink().click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.xpath("//div[@id='center_column']/h1")).getText();
		String ExpectedTitle = "CUSTOMER SERVICE - CONTACT US";

		log.info("verifyContactUseLink Test method Setup Done");

		Assert.assertEquals(actualtitle, ExpectedTitle);
		log.info("verifyContactUseLink Test method Pass");

	}

	@Test(enabled=false)
	public void sendMessage_UploadusingSendKeys() throws InterruptedException, AWTException {

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

		cp.getChooseFileButton().sendKeys("F:\\Docs\\Test File to Upload.docx");
		
		Thread.sleep(2000);

		Thread.sleep(2000);
		cp.getMessagebox().sendKeys("yashwanth testing");
		Thread.sleep(2000);

		cp.getSendButton().click();
		Thread.sleep(2000);

		String ActualMessage = cp.getSuccessMessage().getText();
		String ExpectedMessage = "Your message has been successfully sent to our team.";
		Assert.assertEquals(ActualMessage, ExpectedMessage);

		log.info("sendMessage Test method Setup Done and it got pass");

	}

	@Test(enabled=false)
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

	@Test(enabled = false)// try to complete file upload using robot class in Java
	public void Monster_FileUploadUsingRobotClass() throws InterruptedException, AWTException {
		
		// Specify the file location with extension
				StringSelection sel = new StringSelection("F:\\Docs\\Test File to Upload.docx");

				// Copy to clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
				System.out.println("selection" + sel);
				
		driver.get("https://www.monsterindia.com/rio/login");
		driver.findElement(By.id("signInName")).sendKeys("yashwanthrao425@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Myash@425");
		driver.findElement(By.id("signInbtn")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"stickySidebar\"]/div[1]/div/a")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//i[@class='mqfi-upload']")).click();
		Thread.sleep(10000);
		

		// This will click on Browse button
		
		driver.findElement(By.xpath("//input[@id='resume']")).click();
		
		System.out.println("Browse button clicked");

		// Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//*[@id=\"modalDescription\"]/div/div[2]/div/div/button")).click();
		Thread.sleep(5000);
	}

}
