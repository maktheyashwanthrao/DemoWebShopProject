package TestCases;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DressPage;
import PageObjects.HomePage;

public class Dress_VerifyPageTitle_001 extends BaseClass{

	private static Logger log = LogManager.getLogger(BaseClass.class.getName());
	@Test()
	public void verifyDressPage() throws InterruptedException {
	HomePage hp = new HomePage(driver);
	
	log.error("Home Page driver is initialized");
	log.fatal("am fatal error");
	log.info("am information");
	
	hp.getDresSLink().click();
	Thread.sleep(2000);
	
	DressPage dp = new DressPage(driver);
	String actualName=dp.getDressPage().getText();
	String expectedName = "DRESSES ";
	Assert.assertEquals(actualName, expectedName);
}
}