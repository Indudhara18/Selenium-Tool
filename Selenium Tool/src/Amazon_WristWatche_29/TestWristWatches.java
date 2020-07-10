package Amazon_WristWatche_29;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestWristWatches extends BaseTest
{
	@Test
	public void testWristWatches() throws FileNotFoundException, IOException
	{
		AmazonHomePage hp = new AmazonHomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		hp.searchBox("wrist watches");
	
		Amazon1stPage Firstpage = new Amazon1stPage(driver);
		Firstpage.watchType();
		
		Amazon2ndPage SecondPage = new Amazon2ndPage(driver);
		SecondPage.selectLeather();
				
		Amazon3rdPage ThirdPage = new Amazon3rdPage(driver);
		ThirdPage.selectDiscount();
		
	//	FWUtils.writeWatches(driver , "sheet2");
		
		FWUtils.TenWatch(driver, "sheet2", 50 , 0);
		
		
	}
	
	
}
