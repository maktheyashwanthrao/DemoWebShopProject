package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class Home_ContactUs_LinkVerification_001 extends BaseClass{
	
	@Test
	public void verifyContactUseLink() throws InterruptedException {
		HomePage hp = new HomePage(driver);	
		hp.getContactUsLink().click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.xpath("//div[@id='center_column']/h1")).getText();	
		String ExpectedTitle="CUSTOMER SERVICE - CONTACT US";
		Assert.assertEquals(actualtitle, ExpectedTitle);
	}

}
