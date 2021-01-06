package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class Women_VerifyPageTitle_001 extends BaseClass{
	
	@Test()
	public void VerifyWomenPage() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);	
		
			hp.getWomenPage().click();
			Thread.sleep(5000);
			String actualtitle = driver.findElement(By.className("cat-name")).getText();	
			String ExpectedTitle="WOMEN ";
			Assert.assertEquals(actualtitle, ExpectedTitle);
			
			
			

	}

}
