package com.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {

	public WebDriver ldriver;

	public CheckOutPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// billingAddress selection
	@FindBy(linkText = "billing-address-select")
	WebElement billingAddress;

	public WebElement getbillingAddress() {
		Select select = new Select(billingAddress);
		select.selectByVisibleText("New Address");
		return billingAddress;

	}

	// billingAddress madetory fields - firstname
	@FindBy(name = "BillingNewAddress.FirstName")
	WebElement firstName;

	public WebElement getFirstName() {
		return firstName;

	}

	// billingAddress madetory fields - lastnamename
	@FindBy(name = "BillingNewAddress.LastName")
	WebElement lastName;

	public WebElement getLastName() {
		return lastName;

	}

	// billingAddress madetory fields - email
	@FindBy(name = "BillingNewAddress.Email")
	WebElement email;

	public WebElement getEmailAddress() {
		return email;

	}

	// billingAddress madetory fields - country
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement country;

	public WebElement getCountryDropDown() {
		Select select = new Select(country);
		select.selectByVisibleText("India");
		return country;

	}

	// billingAddress madetory fields -city
	@FindBy(name = "BillingNewAddress.City")
	WebElement city;

	public WebElement getCityName() {
		return city;

	}

	// billingAddress madetory fields -address1
	@FindBy(name = "BillingNewAddress.Address1")
	WebElement address1;

	public WebElement getAddress1() {
		return address1;

	}

	// billingAddress madetory fields -Postal code
	@FindBy(name = "BillingNewAddress.ZipPostalCode")
	WebElement ZipPostalCOde;

	public WebElement getZipPostalCOde() {
		return ZipPostalCOde;

	}

	// billingAddress madetory fields -PhoneNumber
	@FindBy(name = "BillingNewAddress.PhoneNumber")
	WebElement PhoneNumber;

	public WebElement getPhoneNumber() {
		return PhoneNumber;

	}

	// billingAddress madetory fields -BillingAddress Continue
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	WebElement BillingAddressContinue;

	public WebElement getBillingAddressContinue() {
		return BillingAddressContinue;

	}

	// ShippingAddress madetory fields -Addrress Selection
	@FindBy(id = "shipping-address-select")
	WebElement shippingAddress;

	public WebElement getShippingAddress() {
		Select select1 = new Select(shippingAddressContinue);
		int noOfDropdowns = select1.getOptions().size();
		select1.selectByIndex(noOfDropdowns - 2);
		return shippingAddress;

	}

	// ShippingAddress madetory fields -continue
	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
	WebElement shippingAddressContinue;

	public WebElement getShippingAddressContinue() {
		return shippingAddressContinue;

	}

	// Shippingmethod NextDay selection
	@FindBy(xpath = "//input[@id='shippingoption_1']")
	WebElement shippingMethod;

	public WebElement getShippingMethod() {
		return shippingMethod;

	}

	// Shippingmethod NextDay selection
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/input")
	WebElement shippingMethodContinue;

	public WebElement getShippingMethodContinue() {
		return shippingMethodContinue;

	}

	// Paymentmethod Cashondelivery selection
	@FindBy(xpath = "//input[@id='paymentmethod_0']")
	WebElement paymentMethod;

	public WebElement getCashOnDelivery() {
		return paymentMethod;

	}

	// Paymentmethod continue Selection
	@FindBy(xpath = "//div[@id='payment-method-buttons-container']/input")
	WebElement paymentMethodContinue;

	public WebElement getPaymentMethodContinue() {
		return paymentMethodContinue;

	}

	// PaymentInformation -message verification
	@FindBy(xpath = "//p[text()='You will pay by COD']")
	WebElement paymentInfoMessage;

	public WebElement getPaymentInfoMessage() {
		return paymentInfoMessage;

	}

	// PaymentInforamtion Continue
	@FindBy(xpath = "//div[@id='payment-info-buttons-container']/input")
	WebElement paymentInfoContinue;

	public WebElement getPaymentInfoContinue() {
		return paymentInfoContinue;

	}

	// Confirm Order
	@FindBy(xpath = "//div[@id='confirm-order-buttons-container']/input")
	WebElement ConfirmOrder;

	public WebElement getConfirmOrderButton() {
		return ConfirmOrder;

	}

	// Order Confirmation
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	WebElement confirmOrderMessage;

	public WebElement getConfirmOrderMessage() {
		return confirmOrderMessage;

	}

	// Order Confirmation continue
	@FindBy(xpath = "//input[@class='button-2 order-completed-continue-button']")
	WebElement confirmOrderContinue;

	public WebElement getConfirmOrderContinue() {
		return confirmOrderContinue;

	}

	// Logout
	@FindBy(linkText = "Log out")
	WebElement logout;

	public WebElement getLogout() {
		return logout;

	}
}
