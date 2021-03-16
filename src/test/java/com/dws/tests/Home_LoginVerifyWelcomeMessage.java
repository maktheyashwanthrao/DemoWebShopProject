package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dws.pages.HomePage;
import com.dws.pages.LoginPage;

public class Home_LoginVerifyWelcomeMessage extends BaseClass {	

	@Test(priority = 1)
	public void verifyCartButtonWithoutProduct() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getLoginLink().click();
		Thread.sleep(2000);

		String expectedWelComeMessage = "Welcome, Please Sign In!";
		LoginPage lp = new LoginPage(driver);
		String actualWelComeMessage = lp.getwelcomMessage().getText();				
		Assert.assertEquals(actualWelComeMessage, expectedWelComeMessage);
		System.out.println("WelCome Message Validation successful");
		

	}

	
}
