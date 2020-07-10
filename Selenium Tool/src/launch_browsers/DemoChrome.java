package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	public static void main(String[] args) 
	{

//		String key = "webdriver.chrome.driver" ;
//		String value = "./driver/chromedriver.exe" ;
//		System.setProperty(key, value) ;
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
		
		new ChromeDriver() ;
	}

}
/* setProperty() is s static method		*/