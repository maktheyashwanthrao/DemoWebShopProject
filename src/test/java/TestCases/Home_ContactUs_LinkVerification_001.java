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

import PageObjects.HomePage;

public class Home_ContactUs_LinkVerification_001 extends BaseClass{
	
	
	private static Logger log = LogManager.getLogger(Home_ContactUs_LinkVerification_001.class.getName());
	
	@Test
	public void verifyContactUseLink()  throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);	
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		hp.getContactUsLink().click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.xpath("//div[@id='center_column']/h1")).getText();	
		String ExpectedTitle="CUSTOMER SERVICE - CONTACT US   ";  //Wantedly added extra speces to fail this test case
		
		System.out.println("Test Case execution completed");
		
		TakesScreenshot	ts=(TakesScreenshot)driver;
		System.out.println("Driver type cast completed");
		File source =ts.getScreenshotAs(OutputType.FILE);
		System.out.println("source file completed");
		File targetFile = new File(System.getProperty("user.dir")+"/Screenshots/"+"error.png");
		System.out.println("Destination file completed");
		FileUtils.copyFile(source, targetFile);
		System.out.println("copied screenshot to folder");
		
		
		Assert.assertEquals(actualtitle, ExpectedTitle) ;
		
		
		
			
		
		
	}

}
