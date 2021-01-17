package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	public WebDriver ldriver;

	public ContactUsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	//Homebutton xpath
			@FindBy(xpath = "//i[@class='icon-home']")
			@CacheLookup
			WebElement homeButton;
			

			public WebElement getWomenbutton() {
				return homeButton;

			}
	
			
			//subjectheading xpath
			@FindBy(xpath = "//select[@id='id_contact' ]/option[2]")
			@CacheLookup
			WebElement subjectHeading;
			

			public WebElement selectSubjectHeading() {
				return subjectHeading;

			}
			
			//EmailAddress xpath
			@FindBy(id = "email")
			@CacheLookup
			WebElement emailAddress;
			

			public WebElement getEmailAddress() {
				return emailAddress;

			}
			
			//OrderReference xpath
			@FindBy(id = "id_order")
			@CacheLookup
			WebElement orderReference;
			

			public WebElement getOrderReference() {
				return orderReference;

			}
			
			//Messagebox xpath
			@FindBy(id = "message")
			@CacheLookup
			WebElement messagebox;
			

			public WebElement getMessagebox() {
				return messagebox;

			}
			
			//Choose File xpath
			@FindBy(xpath = "//input[@id='fileUpload']")
			@CacheLookup
			WebElement chooseFile;
			

			public WebElement getChooseFileButton() {
				return chooseFile;

			}
			
			
			//Click on send button xpath
			@FindBy(xpath = "//button[@id='submitMessage']")
			@CacheLookup
			WebElement sendButton;
			

			public WebElement getSendButton() {
				return sendButton;

			}
			
			
			//Get Successful message send in customer service page xpath
			@FindBy(xpath = "//p[contains(@class,'alert-success')]")
			@CacheLookup
			WebElement SuccessSendMessage;
			

			public WebElement getSuccessMessage() {
				return SuccessSendMessage;

			}
	
}
