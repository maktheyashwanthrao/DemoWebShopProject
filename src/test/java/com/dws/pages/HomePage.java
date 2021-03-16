package com.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver ldriver;

	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Homepage Login Click
	@FindBy(linkText = "Log in")
	WebElement LoginLink;

	public WebElement getLoginLink() {
		return LoginLink;

	}

	// Homepage navbar books
		@FindBy(linkText = "Log in")
		WebElement SelectbooksFromNavbar;

		public WebElement getBooksNavBar() {
			return SelectbooksFromNavbar;

		}
	
}
