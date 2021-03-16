package com.dws.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dws.constants.FrameworkConstants;
import com.dws.pages.HomePage;
import com.dws.pages.LoginPage;
import com.dws.pages.ProductsPage;
import com.dws.utilities.ReadConfig;

public class LoginPage_Login_VerifyUserId extends BaseClass {

	/*
	 * Login with valid credentials and get the login userid and verify it
	 */
	@Test()
	public void LoginandVerifyUserId() throws InterruptedException {	
		
		login();
		ProductsPage pp = new ProductsPage(driver);
		String actualUserID = pp.getUserId().getText();
		Assert.assertEquals(actualUserID, FrameworkConstants.getExpecteduserid());

	}

}
