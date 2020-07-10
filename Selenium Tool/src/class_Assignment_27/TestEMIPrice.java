package class_Assignment_27;

import org.testng.annotations.Test;


/**
 * This class is used to test login page of flipkart using valid credentials
 * @author Indudhar
 *
 */

public class TestEMIPrice extends BaseTest
{
	
	@Test(priority=0)
	public void emiPrice() throws InterruptedException
	{
		FlipkartLoginPage flp = new FlipkartLoginPage(driver);
		flp.clickXmark();
		
		FlipKartHomePage fhp = new FlipKartHomePage(driver);
		fhp.enterIntoSearchbox("iphone 11 pro");
		
		Flipkartsearchpage fsp = new Flipkartsearchpage(driver);
		Thread.sleep(2000);
		fsp.emiOfItem();
	}
	
}