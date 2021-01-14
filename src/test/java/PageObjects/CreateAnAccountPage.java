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

	// Dresspage name verification
	@FindBy(xpath = "//span[@class='cat-name']")
	@CacheLookup
	WebElement dressPage;

	public WebElement getDressPage() {
		return dressPage;

	}

}
