package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartSummayPage;
import PageObjects.HomePage;

public class Home_CartButton_004 extends BaseClass{
	
	@Test()
	public void verifyCartWithoutProduct() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.getcartButton().click();
		Thread.sleep(2000);
		
		CartSummayPage csp = new CartSummayPage(driver);
		String ActualWarnMessage = csp.getCartWantMessage().getText();
		String ExpectedWarnMessage = "Your shopping cart is empty.";
		Assert.assertEquals(ActualWarnMessage, ExpectedWarnMessage);
		
	}

	///this is incomplete
	@Test()
	public void verifyCartWithProduct() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		hp.getcartButton().click();
		Thread.sleep(2000);
		
		CartSummayPage csp = new CartSummayPage(driver);
		String ActualWarnMessage = csp.getCartWantMessage().getText();
		String ExpectedWarnMessage = "Your shopping cart is empty.";
		Assert.assertEquals(ActualWarnMessage, ExpectedWarnMessage);
		
	}
}
