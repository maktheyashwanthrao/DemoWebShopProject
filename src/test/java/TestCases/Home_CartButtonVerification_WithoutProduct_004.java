package TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartSummayPage;
import PageObjects.HomePage;

public class Home_CartButtonVerification_WithoutProduct_004 extends BaseClass{
	
	private static Logger log = LogManager.getLogger(Home_CartButtonVerification_WithoutProduct_004.class.getName());
	
	@Test()
	public void verifyCartWithoutProduct() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		
		hp.getcartButton().click();
		Thread.sleep(2000);
		
		CartSummayPage csp = new CartSummayPage(driver);
		String ActualWarnMessage = csp.getCartWantMessage().getText();
		String ExpectedWarnMessage = "Your shopping cart is empty.";
		Assert.assertEquals(ActualWarnMessage, ExpectedWarnMessage);
		
	}

	
	
}
