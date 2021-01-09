package TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ContactUsPage;
import PageObjects.HomePage;

public class Home_Contactus_HomeButtonVerification_002 extends BaseClass{
	
	private static Logger log = LogManager.getLogger(Home_Contactus_HomeButtonVerification_002.class.getName());
	
	@Test()
	public void homeButtonVerification() throws InterruptedException {
		HomePage hp = new HomePage(driver);	
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		hp.getContactUsLink().click();
		Thread.sleep(2000);
		
		ContactUsPage cp = new ContactUsPage(driver);
		cp.getWomenbutton().click();
		Thread.sleep(2000);
		
		String actualHomePageTitle=driver.getTitle();
		String ExpecteHomePageTitle = "My Store";
		Assert.assertEquals(actualHomePageTitle, ExpecteHomePageTitle);
	}

}
