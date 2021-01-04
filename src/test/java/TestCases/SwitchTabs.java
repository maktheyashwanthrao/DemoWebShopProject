package TestCases;

import PageObjects.RahulSheetyPracticePage;

public class SwitchTabs extends BaseClass{
	
	public void tabSwitch() throws InterruptedException {
		RahulSheetyPracticePage rsp = new RahulSheetyPracticePage(driver);
		rsp.switchTab().click();
		Thread.sleep(2000);
		
		
	}

}
