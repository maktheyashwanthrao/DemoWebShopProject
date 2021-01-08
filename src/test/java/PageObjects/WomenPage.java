package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
	public WebDriver ldriver;

	public WomenPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// Homepage name verification
	@FindBy(xpath = "//select//option")
	@CacheLookup
	WebElement sortdropdown;

	public WebElement getSortDroDown() {
		return sortdropdown;

	}
}
