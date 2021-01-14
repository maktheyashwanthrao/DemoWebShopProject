package TestCases;

import org.testng.annotations.Test;

import PageObjects.AuthenticationPage;
import PageObjects.HomePage;

public class Registration extends BaseClass{
	
	
	
	@Test()
	public void completeRegistraion() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.getSigninLink().click();
		Thread.sleep(5000);
		
		AuthenticationPage ap = new AuthenticationPage(driver);
		ap.writeEmail().sendKeys("test@testing.com");
		ap.CreateAnAccount().click();
		Thread.sleep(5000);

		
		
	}
	
}
