package pomClassForActitime_24;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class productEditionOfActitime 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://indudharagowdaacer/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickOnLogin();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver)	;
		etp.clickOnSettings();
		
		GeneralSettingsPage gsp = new GeneralSettingsPage(driver);
		gsp.clickOnLicenses();
		
		Licensespage lip = new Licensespage(driver);
		lip.getProductedition();
	
		driver.close();
	}
}
