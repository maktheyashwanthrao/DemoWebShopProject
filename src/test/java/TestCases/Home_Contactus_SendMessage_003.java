package TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import PageObjects.ContactUsPage;
import PageObjects.HomePage;

public class Home_Contactus_SendMessage_003 extends BaseClass{
	
	private static Logger log = LogManager.getLogger(Home_Contactus_SendMessage_003.class.getName());
	
	@Test()
	public void sendMessage() throws InterruptedException {
		HomePage hp = new HomePage(driver);	
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		
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
	}

}
