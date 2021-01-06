package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;

public class Women_VerifyPageTitle_001 extends BaseClass{
	
	@Test()
	public void selectCheckbox() throws InterruptedException {
		
		HomePage hp = new HomePage(driver);
		
		
			hp.getWomenPage().click();
			Thread.sleep(5000);
			System.out.println("women page verified");
			

	}

}
