package typecast_14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOfKingsman 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.netflix.com");
		
		TakesScreenshot ts = ( TakesScreenshot )driver ;
		File src = ts.getScreenshotAs(OutputType.FILE) ;
		File des = new File("./photo/netflix.png") ;
		FileUtils.copyFile(src, des); 
		
		driver.close();
	}
}
