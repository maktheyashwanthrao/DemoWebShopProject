package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
	public WebDriver ldriver;

	public AuthenticationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Email Address for registration
	@FindBy(id = "email_create")
	@CacheLookup
	WebElement writeemial;

	public WebElement writeEmail() {
		return writeemial;

	}

	// Create an account  for registration
		@FindBy(xpath = "//button[@id='SubmitCreate']")
		@CacheLookup
		WebElement CreateAnAccount;

		public WebElement CreateAnAccount() {
			return CreateAnAccount;

		}
	
}
