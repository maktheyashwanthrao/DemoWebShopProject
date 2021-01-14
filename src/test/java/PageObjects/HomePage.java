package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver ldriver;

	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Homepage name verification
	@FindBy(linkText = "Women")
	@CacheLookup
	WebElement womenPage;

	public WebElement getWomenPage() {
		return womenPage;

	}

	// Homepage contactuse
	@FindBy(linkText = "Contact us")
	@CacheLookup
	WebElement Contactus;

	public WebElement getContactUsLink() {
		return Contactus ;

	}

	
	// Homepage Signin
		@FindBy(linkText = "Sign in")
		@CacheLookup
		WebElement Signin;

		public WebElement getSigninLink() {
			return Signin ;

		}
		
	// CartButton
	@FindBy(className = "ajax_cart_no_product")
	@CacheLookup
	WebElement cartButton;

	public WebElement getcartButton() {
		return cartButton;

	}
	
	// selectproduct add to cart
		@FindBy(xpath = "//span[text() = 'Add to cart']")
		@CacheLookup
		WebElement addtoCart;

		public WebElement getAddtoCartButton() {
			return addtoCart;

		}
		
		// mousehover to any product 
		@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
		@CacheLookup
		WebElement mouseHoverproduct;

		public WebElement getMouseHover() {			
			return mouseHoverproduct;

		}
		
		// selectproduct button with product
				@FindBy(xpath = "//span[text()='Product']")
				@CacheLookup
				WebElement addtoCartWithProduct;

				public WebElement getAddtoCartButtonWithProduct() {
					return addtoCartWithProduct;

				}
				
				// capturing product amount in main page
				@FindBy(xpath = "//span[contains(@class,'product-price')]")
				@CacheLookup
				WebElement productPrice;

				public WebElement getProductPrice() {
					return productPrice;

				}
				
				// capturing product amount popup
				@FindBy(xpath = "//span[contains(@class,'ajax_block_products_total')]")
				@CacheLookup
				WebElement productPriceInPopup;

				public WebElement getProductPriceInPopUp() {
					return productPriceInPopup;

				}
				
				// close Add to cart popup 
				@FindBy(xpath = "//span[@title='Close window']")
				@CacheLookup
				WebElement closeAddtoCartPopup;

				public WebElement getCloseAddtoCartPopup() {
					return closeAddtoCartPopup;

				}
				
				
				// get product added message
				@FindBy(xpath = "//div[@id='layer_cart']//div//div//h2")
				@CacheLookup
				WebElement productmessage;

				public WebElement getSuccessfulMessage() {
					return productmessage;

				}
				
				// Dress Page Link
				@FindBy(linkText = "DRESSES")
				@CacheLookup
				WebElement dressLink;

				public WebElement getDresSLink() {
					return dressLink;

				}
}
