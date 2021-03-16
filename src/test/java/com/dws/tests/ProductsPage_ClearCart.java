package com.dws.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dws.constants.FrameworkConstants;
import com.dws.pages.HomePage;
import com.dws.pages.ProductsPage;
import com.dws.pages.ShopingCartPage;

public class ProductsPage_ClearCart extends BaseClass {

	/*
	 * Login and click on cart button, select all products under cart and clear the
	 * cart and verify message
	 */
	@Test()
	public void ProductPage() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getLoginLink().click();
		Thread.sleep(2000);
		login();

		ProductsPage pp = new ProductsPage(driver);

		Actions action = new Actions(driver);
		WebElement target = pp.getCartLink();
		Thread.sleep(3000);
		action.moveToElement(target).build().perform();
		pp.getgoToCart().click();

		List<WebElement> checboxs = driver.findElements(By.xpath("//input[@name='removefromcart']"));
		int numOfCheckbox = checboxs.size();
		for (int i = 0; i < numOfCheckbox; i++) {
			checboxs.get(i).click();
			Thread.sleep(3000);
		}

		ShopingCartPage sc = new ShopingCartPage(driver);
		sc.getUpdateShopingCart().click();

		String actualCartMessage = sc.getEmptyCartMessage().getText();
		Assert.assertEquals(actualCartMessage, FrameworkConstants.getExpectedCartMessage());

	}

}
