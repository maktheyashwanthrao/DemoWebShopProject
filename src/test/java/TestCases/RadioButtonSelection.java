package TestCases;

import java.io.IOException;
import java.util.logging.LogManager;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObjects.RahulSheetyPracticePage;

public class RadioButtonSelection extends BaseClass{
	
	
	@Test()
	public void selectRadio() throws InterruptedException, IOException {
		
		RahulSheetyPracticePage rsp = new RahulSheetyPracticePage(driver);
		
		
			rsp.radioButtonSelection().click();
			Thread.sleep(5000);
			System.out.println("Radio Button Selected for"  );
		}
		
		
			
		
		
	}


