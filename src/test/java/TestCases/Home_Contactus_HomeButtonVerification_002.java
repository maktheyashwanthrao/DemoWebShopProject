package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ContactUsPage;
import PageObjects.HomePage;

public class Home_Contactus_HomeButtonVerification_002 extends BaseClass{
	
	@Test()
	public void homeButtonVerification() throws InterruptedException {
		HomePage hp = new HomePage(driver);	
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
