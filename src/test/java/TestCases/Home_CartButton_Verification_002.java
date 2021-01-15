package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.CartSummayPage;
import PageObjects.HomePage;

public class Home_CartButton_Verification_002 extends BaseClass {

	private static Logger log = LogManager.getLogger(Home_CartButton_Verification_002.class.getName());

	@Test(priority = 1)
	public void verifyCartButtonWithoutProduct() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getcartButton().click();
		Thread.sleep(2000);

		CartSummayPage csp = new CartSummayPage(driver);
		String ActualWarnMessage = csp.getCartWantMessage().getText();
		String ExpectedWarnMessage = "Your shopping cart is empty.";
		log.info("verifyCartWithoutProduct Test method Setup Done");
		Assert.assertEquals(ActualWarnMessage, ExpectedWarnMessage);
		log.info("verifyCartWithoutProduct Test method Pass");

	}

	@Test(priority = 2)
	public void verifyCartButtonWithProduct() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		Actions action = new Actions(driver);
		action.moveToElement(hp.getMouseHover()).build().perform();
		hp.getAddtoCartButton().click();
		Thread.sleep(2000);

		hp.getCloseAddtoCartPopup().click();

		String ActualWarnMessage = hp.getAddtoCartButtonWithProduct().getText();
		String ExpectedWarnMessage = "Product";

		log.info("verifyCartWithProduct Test method Setup Done");
		Assert.assertEquals(ActualWarnMessage, ExpectedWarnMessage);

		log.info("verifyCartWithProduct Test method Pass");

	}
}
