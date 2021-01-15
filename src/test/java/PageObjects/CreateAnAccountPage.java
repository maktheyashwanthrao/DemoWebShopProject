package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {
	
	public WebDriver ldriver;

	public CreateAnAccountPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Create Account Phone Number 
	@FindBy(id = "phone_mobile")
	@CacheLookup
	WebElement phoneNumber;

	public WebElement getPhoneNumber() {
		return phoneNumber;

	}

	// Create Account Lastname
		@FindBy(id = "lastname")
		@CacheLookup
		WebElement Lastname;

		public WebElement getLastName() {
			return Lastname;

		}
		// Create Account First name 
		@FindBy(id = "firstname")
		@CacheLookup
		WebElement Firstname ;

		public WebElement getFirstname() {
			return Firstname ;

		}
		// Create Account password 
		@FindBy(id = "passwd")
		@CacheLookup
		WebElement password;

		public WebElement getPassword() {
			return password;

		}
		// Create Account Address
		@FindBy(id = "address1")
		@CacheLookup
		WebElement Address;

		public WebElement getAddress() {
			return Address;

		}
		// Create Account city 
		@FindBy(id = "city")
		@CacheLookup
		WebElement city;

		public WebElement getCity() {
			return city;

		}
		// Create Account postal code
		@FindBy(id = "postcode")
		@CacheLookup
		WebElement postalcode;

		public WebElement getPostalCode() {
			return postalcode;

		}
		// Create Account country
		@FindBy(id = "id_country")
		@CacheLookup
		WebElement country;

		public WebElement getCountry() {
			return country;

		}
		
		// Create Account Registerbutton
				@FindBy(xpath = "//button[@id='submitAccount']")
				@CacheLookup
				WebElement registerButton;

				public WebElement getRegisterButton() {
					return registerButton;

				}
		
}
