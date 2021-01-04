package TestCases;

import org.testng.annotations.Test;

import PageObjects.RahulSheetyPracticePage;

public class CheckboxSelection extends BaseClass{
	
	@Test()
	public void selectCheckbox() throws InterruptedException {
		
		RahulSheetyPracticePage rsp = new RahulSheetyPracticePage(driver);
		
		
			rsp.checkboxSelection().click();
			Thread.sleep(5000);
			System.out.println("Checkbox Selected");
			

	}

}
