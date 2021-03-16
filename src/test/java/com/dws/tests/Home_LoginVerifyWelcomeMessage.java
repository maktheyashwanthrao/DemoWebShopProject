package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dws.constants.FrameworkConstants;
import com.dws.pages.HomePage;
import com.dws.pages.LoginPage;

public class Home_LoginVerifyWelcomeMessage extends BaseClass {

	/*
	 * Click on Login link in home page and verify the welcome message
	 */
	@Test()
	public void verifyCartButtonWithoutProduct() throws InterruptedException {

		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		Thread.sleep(2000);

		LoginPage lp = new LoginPage(driver);
		String actualWelComeMessage = lp.getwelcomMessage().getText();
		Assert.assertEquals(actualWelComeMessage, FrameworkConstants.getExpectedWelcomeMessage());

	}

}
