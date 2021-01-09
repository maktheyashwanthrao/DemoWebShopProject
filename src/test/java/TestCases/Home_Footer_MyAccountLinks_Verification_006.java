package TestCases;
/// actual verification of links is pending need to compare link name with title name

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Home_Footer_MyAccountLinks_Verification_006 extends BaseClass {

	private static Logger log = LogManager.getLogger(Home_Footer_MyAccountLinks_Verification_006.class.getName());
	
	@Test()
	public void verifyMyAccountFooterLinks() throws InterruptedException {
		
		log.error("Home Page driver is initialized");
		log.fatal("am fatal error");
		log.info("am information");
		

		List<WebElement> footerLinks = driver
				.findElements(By.xpath("//section[@id='block_various_links_footer']//ul//li//a"));
		int numberOfLinks = footerLinks.size();
		System.out.println("Number of links " + numberOfLinks);

		for (int i = 0; i < numberOfLinks; i++) {
			driver.findElements(By.xpath("//section[@id='block_various_links_footer']//ul//li//a")).get(i)
					.sendKeys(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(5000);

			String linkName = driver.findElements(By.xpath("//section[@id='block_various_links_footer']//ul//li//a"))
					.get(i).getText();
			System.out.println(linkName);

		}

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> itr = handler.iterator();
		while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());

		}

	}

}
