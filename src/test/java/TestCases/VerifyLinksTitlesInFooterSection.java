package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VerifyLinksTitlesInFooterSection extends BaseClass{
	
	@Test()
	public void verifylinks() throws InterruptedException {
		for(int i=2;i<6;i++) {
			//Actions action = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[2]")).sendKeys(Keys.CONTROL + "ENTER");
			Thread.sleep(2000);
			System.out.println("link clicked");
			
	}

}}
