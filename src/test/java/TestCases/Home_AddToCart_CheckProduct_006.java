package TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
////test case is pending to verify product added successfully due to xpath issue check once
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;

public class Home_AddToCart_CheckProduct_006 extends BaseClass{
	
	private static Logger log = LogManager.getLogger(Home_AddToCart_CheckProduct_006.class.getName());
	
	@Test()
	public void ProductSelection() {
		HomePage hp = new HomePage(driver);
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		Actions action = new Actions(driver);
		action.moveToElement(hp.getMouseHover()).build().perform();
		String productprice=hp.getProductPrice().getText();
		System.out.println(productprice);
		hp.getAddtoCartButton().click();
		
		String ExpectedProductPrice= hp.getProductPriceInPopUp().getText();
		
		System.out.println(ExpectedProductPrice);
		Assert.assertEquals(productprice, ExpectedProductPrice);
		//System.out.println(driver.findElement(By.xpath("//div[@id='layer_cart']//div//div//h2")).getText());
		//System.out.println(hp.getSuccessfulMessage().getText());
		
		 //i[@class='icon-ok']	
		//*[@id="layer_cart"]/div[1]/div[1]/h2
	}

}
