package com.dws.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dws.constants.FrameworkConstants;
import com.dws.pages.CheckOutPage;
import com.dws.pages.HomePage;
import com.dws.pages.LoginPage;
import com.dws.pages.ProductsPage;
import com.dws.utilities.ReadConfig;

public class ProductsPage_CheckOut extends BaseClass {

	@Test()
	public void Checkout() throws InterruptedException {

		// Login to application
		login();

		// Click on Checkout
		ProductsPage pp = new ProductsPage(driver);
		pp.getCartLink().click();
		pp.getTermsandConditionsCheckbox().click();
		pp.getCheckoutButton().click();

		/*
		 * Select the new Billing address and read the input data from config file and
		 * enter the required info
		 */
		CheckOutPage cop = new CheckOutPage(driver);
		WebElement billingaddressDropDown = driver.findElement(By.id("billing-address-select"));
		Select select = new Select(billingaddressDropDown);
		select.selectByVisibleText("New Address");

		WebElement countryDropDown = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select countryselect = new Select(countryDropDown);
		countryselect.selectByVisibleText("India");

		cop.getCityName().sendKeys(ReadConfig.getCityName());
		cop.getAddress1().sendKeys(ReadConfig.getAddress1());
		cop.getZipPostalCOde().sendKeys(ReadConfig.getZipPostalCode());
		cop.getPhoneNumber().sendKeys(ReadConfig.getPhoneNumber());
		cop.getBillingAddressContinue().click();

		/*
		 * Selecting the shipping address same as billing address
		 */
		WebElement shippingaddressDropDown = driver.findElement(By.id("shipping-address-select"));
		Select select1 = new Select(shippingaddressDropDown);
		int noOfDropdowns = select1.getOptions().size();
		select1.selectByIndex(noOfDropdowns - 2);
		cop.getShippingAddressContinue().click();

		/*
		 * Shipping method selection
		 */
		cop.getShippingMethod().click();
		cop.getShippingMethodContinue().click();

		/*
		 * Cashon Delivery selection
		 */
		cop.getCashOnDelivery().click();
		cop.getPaymentMethodContinue().click();
		String actualCashonDeliveryMessage = cop.getPaymentInfoMessage().getText();
		Assert.assertEquals(actualCashonDeliveryMessage, FrameworkConstants.getExpectedCashonDeliveryMessage());
		cop.getPaymentInfoContinue().click();
		/*
		 * Confirm the order and logout
		 */
		cop.getConfirmOrderButton().click();
		String actualorderConfirmationMessage = cop.getConfirmOrderMessage().getText();
		Assert.assertEquals(actualorderConfirmationMessage, FrameworkConstants.getExpectedorderConfirmationMessage());

		cop.getLogout().click();

	}
}