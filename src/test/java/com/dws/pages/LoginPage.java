package com.dws.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Login Page welComeMessage
		@FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
		WebElement welcomMessage;

		public WebElement getwelcomMessage() {
			return welcomMessage;

		}
	
	
	
	// Login Page Email
	@FindBy(id = "Email")
	WebElement emailId;

	public WebElement getEmailId() {
		return emailId;

	}
	
	// Login Page password
		@FindBy(name = "Password")
		WebElement password;

		public WebElement getPassword() {
			return password;

		}
		
		
		// Login Page Loginbutton
		@FindBy(xpath = "//input[contains(@class,'button-1 login-button')]")
		WebElement Loginbutton;

		public WebElement getLoginbutton() {
			return Loginbutton;

		}

}
