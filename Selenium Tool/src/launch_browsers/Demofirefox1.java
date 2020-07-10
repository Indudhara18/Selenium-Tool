package launch_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demofirefox1 {

		
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver" , "./driver.geckodriver.exe");
		

	FirefoxDriver driver = new FirefoxDriver() ;
	driver.get("http://www.google.com");
	System.out.println(driver);				// java object address
	String adi = driver.getWindowHandle() ;
	System.out.println( adi );
	
	}
}
