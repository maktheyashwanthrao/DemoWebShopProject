package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dws.constants.FrameworkConstants;
import com.dws.pages.ProductsPage;

public class ProductsPage_AddBooks extends BaseClass {

	@Test()
	public void addProducttoCart() throws InterruptedException {

		login();
		ProductsPage pp = new ProductsPage(driver);
		pp.getbooksUnderCategories().click();
		pp.getbookToPurchase().click();
		pp.getquantityField().clear();
		pp.getquantityField().sendKeys("3");
		pp.getaddToCartButton().click();
		String actualAddtoCartMessage = pp.getValidateProductAddedMessage().getText();
		Assert.assertEquals(actualAddtoCartMessage, FrameworkConstants.getExpectedAddtoCartMessage());

	}

}
