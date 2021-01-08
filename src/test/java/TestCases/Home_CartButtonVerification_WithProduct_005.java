package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class Home_CartButtonVerification_WithProduct_005 extends BaseClass{
	@Test()
	public void verifyCartWithProduct() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		
		Actions action = new Actions(driver);
		action.moveToElement(hp.getMouseHover()).build().perform();
		hp.getAddtoCartButton().click();
		Thread.sleep(2000);
		
		hp.getCloseAddtoCartPopup().click();
		
		String ActualWarnMessage =hp.getAddtoCartButtonWithProduct().getText();
		String ExpectedWarnMessage = "Product";
		Assert.assertEquals(ActualWarnMessage, ExpectedWarnMessage);
		
	}
}
