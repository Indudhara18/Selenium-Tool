package tasksinbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demoFirefox {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) {
		
		// open browser
		FirefoxDriver driver = new FirefoxDriver() ;
		// maximize browser
		driver.manage().window().maximize();
		// enter url
		driver.get("http://www.google.com");
		// get url and print it
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		// get title and print it
		String atitle = driver.getTitle();
		System.out.println(atitle);
		// close browser
		driver.close();
		
	}
}
