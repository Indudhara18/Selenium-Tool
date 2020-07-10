package tasksinbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

 class DemoChrome {

	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		// open chrome browser
		ChromeDriver driver = new ChromeDriver() ;
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
