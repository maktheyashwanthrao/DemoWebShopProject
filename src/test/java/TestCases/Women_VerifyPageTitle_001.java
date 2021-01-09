package TestCases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class Women_VerifyPageTitle_001 extends BaseClass{
	
	private static Logger log = LogManager.getLogger(BaseClass.class.getName());
	@Test()
	public void VerifyWomenPage() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);	
		
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		
			hp.getWomenPage().click();
			Thread.sleep(5000);
			String actualtitle = driver.findElement(By.className("cat-name")).getText();	
			String ExpectedTitle="WOMEN ";
			Assert.assertEquals(actualtitle, ExpectedTitle);
			
			
			

	}

}
