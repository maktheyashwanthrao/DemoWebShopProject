package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import PageObjects.HomePage;
import PageObjects.WomenPage;

public class Women_VerifyWomensPage_001 extends BaseClass {

	private static Logger log = LogManager.getLogger(BaseClass.class.getName());

	@Test(priority = 1)
	public void VerifyWomenPageSection() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		System.out.println("WebDriver Object " + driver);

		hp.getWomenPage().click();
		Thread.sleep(5000);
		String actualtitle = driver.findElement(By.className("cat-name")).getText();
		String ExpectedTitle = "WOMEN ";

		log.info("VerifyWomenPageSection Test method Setup Done");
		Assert.assertEquals(actualtitle, ExpectedTitle);
		log.info("VerifyWomenPageSection Test method Pass");

	}

	@Test(priority = 2)
	public void verifySortByDropDowm() throws InterruptedException {

		HomePage hp = new HomePage(driver);

		hp.getWomenPage().click();
		Thread.sleep(2000);

		ArrayList<String> actualDropDownValues = new ArrayList<String>();

		ArrayList<String> expecetedDropDownValues = new ArrayList<String>();
		expecetedDropDownValues.add("Price: Lowest first");
		expecetedDropDownValues.add("Price: Highest first");
		expecetedDropDownValues.add("Product Name: A to Z");
		expecetedDropDownValues.add("Product Name: Z to A");
		expecetedDropDownValues.add("In stock");
		expecetedDropDownValues.add("Reference: Lowest first");
		expecetedDropDownValues.add("Reference: Highest first");

		System.out.println("Expected dropdowm values " + expecetedDropDownValues);

		List<WebElement> dropDownList = driver.findElements(By.xpath("//select//option"));
		int numberofvaluesindropdown = dropDownList.size();
		for (int i = 1; i < numberofvaluesindropdown; i++) {
			String ActualDropDownvalue = driver.findElements(By.xpath("//select//option")).get(i).getText();
			actualDropDownValues.add(driver.findElements(By.xpath("//select//option")).get(i).getText());

			if (ActualDropDownvalue == "In Stock") {
				Select s = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
				s.selectByValue(ActualDropDownvalue);
				Thread.sleep(5000);

			}

		}
		System.out.println("Actual dropdowm values " + actualDropDownValues);
		log.info("verifySortByDropDowm Test method Setup Done");
		Assert.assertEquals(actualDropDownValues, expecetedDropDownValues);
		log.info("verifySortByDropDowm Test method Pass");

	}
}
