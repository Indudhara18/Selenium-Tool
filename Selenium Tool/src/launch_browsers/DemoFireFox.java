package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFireFox {

	public static void main(String[] args) {
		
//		String key = "webdriver.gecko.driver" ;
//		String value = "./driver/geckodriver.exe" ;
//		System.setProperty(key, value) ;
	
		System.setProperty("webdriver.gecko.driver" , "./driver/geckodriver.exe");
		
		new FirefoxDriver() ;			// open the browser
		
	}
}
