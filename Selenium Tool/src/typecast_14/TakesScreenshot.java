package typecast_14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws IOException 
	{
	 	WebDriver driver = new ChromeDriver() ;
	 	driver.manage().window().maximize();
	 	driver.get("http://www.apple.com");
	 	// type casting from WebDriver<i> to TakesScreenshot<i>
	 	org.openqa.selenium.TakesScreenshot tssdriver = (org.openqa.selenium.TakesScreenshot) driver ;
	 	// create a source file
	 	File src = tssdriver.getScreenshotAs(OutputType.FILE) ;
	 	// create destination file
	 	File des = new File("./photo/apple.png") ;
	 	// copy file from source to destination
	 	FileUtils.copyFile(src, des);
	 	
	 	File des1 = new File("./photo/apple.jpg") ;			// jpg wont open in eclipse
	 	FileUtils.copyFile(src, des1);
	 	driver.close();
	}	
}
