package com.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingCartPage {

	public WebDriver ldriver;

	public ShopingCartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	
	// Products selection for remove
		@FindBy(xpath = "//input[@name='removefromcart']']")
		WebElement selectcheckboxs;

		public WebElement getListOfBooks() {
			return selectcheckboxs;

		}
		
	// update Shoping cart
	@FindBy(xpath = "//input[@name='updatecart']")
	WebElement updateShopingCart;

	public WebElement getUpdateShopingCart() {
		return updateShopingCart;

	}

	// cart empty message
	@FindBy(xpath = "//div[@class='page-body']")
	WebElement cartEmptyMessage;

	public WebElement getEmptyCartMessage() {
		return cartEmptyMessage;

	}

}
