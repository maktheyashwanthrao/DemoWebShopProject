package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
////test case is pending to verify product added successfully due to xpath issue check once
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.HomePage;

public class Home_AddToCart_CheckProduct_003 extends BaseClass {

	private static Logger log = LogManager.getLogger(Home_AddToCart_CheckProduct_003.class.getName());

	@Test()
	public void ProductSelection() {

		HomePage hp = new HomePage(driver);

		Actions action = new Actions(driver);
		action.moveToElement(hp.getMouseHover()).build().perform();
		String productprice = hp.getProductPrice().getText();
		System.out.println(productprice);
		hp.getAddtoCartButton().click();

		String ExpectedProductPrice = hp.getProductPriceInPopUp().getText();

		System.out.println(ExpectedProductPrice);

		log.info("ProductSelection Test method Setup Done");

		Assert.assertEquals(productprice, ExpectedProductPrice);

		log.info("ProductSelection Test method Pass");

	}

}
