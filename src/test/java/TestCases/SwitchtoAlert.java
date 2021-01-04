package TestCases;

import org.testng.annotations.Test;

import PageObjects.RahulSheetyPracticePage;

public class SwitchtoAlert extends BaseClass{
	
	@Test()
	public void alerthanding() throws InterruptedException {
		RahulSheetyPracticePage rsp = new RahulSheetyPracticePage(driver);
		rsp.alertConfirm().click();
		//Actions alert = new Actions(driver);
		driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
				
	}

}
