package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSummayPage {

	

		public WebDriver ldriver;

		public CartSummayPage(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);

		}



		//cartsummay empty error
			@FindBy(xpath = "//p[contains(@class, 'alert')]")
			@CacheLookup
			WebElement cartWarnMessage;
			

			public WebElement getCartWantMessage() {
				return cartWarnMessage;

			}
}
