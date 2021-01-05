package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjects.RahulSheetyPracticePage;

public class SwitchTabs extends BaseClass{
	
	@Test()
	public void tabSwitch() throws InterruptedException {
		RahulSheetyPracticePage rsp = new RahulSheetyPracticePage(driver);
		rsp.switchTab().click();
		Thread.sleep(2000);
		
		
		Set<String> handler =driver.getWindowHandles();
		
		Iterator<String> it =handler.iterator();
		String parentWindow = it.next();
		String childWindow =it.next();
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.linkText("Courses")).click();
		Thread.sleep(2000);
		
	}

}
