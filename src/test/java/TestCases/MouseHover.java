package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover extends BaseClass{
	
	@Test()
	public void mouseHoverOperations() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Top")).click();
		Thread.sleep(5000);
	}

}
