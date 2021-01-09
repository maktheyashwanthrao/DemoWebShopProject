package TestCases;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class Home_ContactUs_LinkVerification_001 extends BaseClass{
	
	
	private static Logger log = LogManager.getLogger(Home_ContactUs_LinkVerification_001.class.getName());
	
	@Test
	public void verifyContactUseLink()  throws InterruptedException {
		HomePage hp = new HomePage(driver);	
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		hp.getContactUsLink().click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.xpath("//div[@id='center_column']/h1")).getText();	
		String ExpectedTitle="CUSTOMER SERVICE - CONTACT US";
		Assert.assertEquals(actualtitle, ExpectedTitle);
	}

}
