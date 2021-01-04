package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulSheetyPracticePage {

	public WebDriver ldriver;

	public RahulSheetyPracticePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

//Radio button selection Xpath
	@FindBy(xpath = "//div[@id='radio-btn-example']/fieldset/label[2]/input")
	@CacheLookup
	WebElement selectRadioButton;

	// DropDown selection Xpath
	@FindBy(xpath = "//option[text() = 'Option2']")
	@CacheLookup
	WebElement dropDownSelection;

	// Checkbox selection Xpath
	
	@FindBy(xpath = "//input[@id='checkBoxOption1']")
	@CacheLookup
	WebElement checkboxSelection;
	
	//Alert handing	
	@FindBy(id="confirmbtn")
	@CacheLookup
	WebElement alertConfirm;
	
	//Switch Tab	
		@FindBy(id="opentab")
		@CacheLookup
		WebElement switchTab;

	public WebElement radioButtonSelection() {
		return selectRadioButton;

	}

	public WebElement dropDownSelection() {
		return dropDownSelection;

	}

	public WebElement checkboxSelection() {
		return checkboxSelection;

	}
	public WebElement alertConfirm() {
		return alertConfirm;

	}
	
	public WebElement switchTab() {
		return switchTab;

	}
}
