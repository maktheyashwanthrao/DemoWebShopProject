package com.dws.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public WebDriver ldriver;

	public ProductsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Products Page GetUserID
	@FindBy(linkText = "maktheyashwanthrao@gmail.com")
	WebElement UserId;

	public WebElement getUserId() {
		return UserId;

	}

	// Products Page getCartLink
	@FindBy(xpath = "//li[@id='topcartlink']")
	WebElement CartLink;

	public WebElement getCartLink() {
		return CartLink;

	}

	// Products gotTocart
	@FindBy(xpath = "//li[@id='topcartlink']")
	WebElement goToCart;

	public WebElement getgoToCart() {
		return goToCart;

	}

	// Select books tab under Catagetios
	@FindBy(linkText = "Books")
	WebElement booksLink;

	public WebElement getbooksUnderCategories() {
		return booksLink;

	}

	// Select books tab under Catagetios
	@FindBy(xpath = "//h2[@class='product-title']/a")
	WebElement selectbook;

	public WebElement getbookToPurchase() {
		return selectbook;

	}

	// quantity selection
	@FindBy(id = "addtocart_13_EnteredQuantity")
	WebElement quantitybox;

	public WebElement getquantityField() {
		return quantitybox;

	}

	// addtocart
	@FindBy(xpath = "//input[@id='add-to-cart-button-13']")
	WebElement addToCart;

	public WebElement getaddToCartButton() {
		return addToCart;

	}

	// product added message
	@FindBy(xpath = "//p[@class='content']")
	WebElement productaddedMessage;

	public WebElement getValidateProductAddedMessage() {
		return productaddedMessage;

	}

	// accept terms and conditions
	@FindBy(xpath = "//input[@id='termsofservice']")
	WebElement teamsandConditions;

	public WebElement getTermsandConditionsCheckbox() {
		return teamsandConditions;

	}

	// checkout button
	@FindBy(id = "checkout")
	WebElement checkoutbutton;

	public WebElement getCheckoutButton() {
		return checkoutbutton;

	}

	// Products selection for remove
	@FindAll(value = @FindBy(xpath = "//input[@name='removefromcart']']"))
	List<WebElement> selectcheckboxs;

	public List<WebElement> getListOfBooks() {
		return selectcheckboxs;

	}
}
