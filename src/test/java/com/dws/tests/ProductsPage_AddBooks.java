package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dws.constants.FrameworkConstants;
import com.dws.pages.ProductsPage;
import com.dws.utilities.ReadConfig;

public class ProductsPage_AddBooks extends BaseClass {

	/*
	 * login, select the book and add quantity, add to cart and validate the message
	 */
	@Test()
	public void addProducttoCart() throws InterruptedException {

		login();
		ProductsPage pp = new ProductsPage(driver);
		pp.getbooksUnderCategories().click();
		pp.getbookToPurchase().click();
		pp.getquantityField().clear();
		pp.getquantityField().sendKeys(ReadConfig.getBooksquantity());
		pp.getaddToCartButton().click();
		String actualAddtoCartMessage = pp.getValidateProductAddedMessage().getText();
		Assert.assertEquals(actualAddtoCartMessage, FrameworkConstants.getExpectedAddtoCartMessage());

	}

}
