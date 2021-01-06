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



	//Homepage name verification
		@FindBy(linkText = "Women")
		@CacheLookup
		WebElement womenPage;
		

		public WebElement getWomenPage() {
			return womenPage;

		}

		//Homepage contactuse
				@FindBy(linkText = "Contact us")
				@CacheLookup
				WebElement Contactus;
				

				public WebElement getContactUsLink() {
					return Contactus;

				}
	
	
}
