package TestCases;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.WomenPage;

public class Women_VerifySortByDropDown_001 extends BaseClass{

	
	private static Logger log = LogManager.getLogger(BaseClass.class.getName());
	
	@Test()
	public void verifySortByDropDowm() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		
		
		hp.getWomenPage().click();
		Thread.sleep(2000);
		
		//Check how to use findbyelements in @findBy annotation
		//WomenPage wp = new WomenPage(driver);
		List<WebElement> dropDownList = driver.findElements(By.xpath("//select//option"));
		int numberofvaluesindropdown = dropDownList.size();
				for(int i=0;i<numberofvaluesindropdown;i++) {
				String dropdownvalue= driver.findElements(By.xpath("//select//option")).get(i).getText();
				System.out.println(dropdownvalue);
					if(dropdownvalue=="In Stock") {
						Select s = new Select(driver.findElement(By.xpath("//select[@id='selectProductSort']")));
						s.selectByValue(dropdownvalue);
						Thread.sleep(5000);
						
					}
					
					
				}
	}
}
