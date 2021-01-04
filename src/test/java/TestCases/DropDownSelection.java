package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.RahulSheetyPracticePage;

public class DropDownSelection extends BaseClass{
	
	
	
	@Test()
	public void selectDropDown() throws InterruptedException {
		RahulSheetyPracticePage rsp = new RahulSheetyPracticePage(driver);
		rsp.dropDownSelection().click();
		Thread.sleep(3000);
		
		System.out.println("DropDown Selected");
	}
	

}
