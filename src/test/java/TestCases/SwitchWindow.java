package TestCases;
//Switch to new browser window and new tab will be handled in same way using window handlers
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SwitchWindow extends BaseClass{
	
	@Test()
	public void switchtonewWindow() throws InterruptedException {
		driver.findElement(By.id("openwindow")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it =handler.iterator();
		String parentWindow = it.next();
		String childWindow =it.next();
		driver.switchTo().window(childWindow);
		Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();
	}

}
