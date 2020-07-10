// How to find web elements in dom page using Locators

package Locators_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Manu/Desktop/html%20files/Qspiders.html");
		
		// find web element in dom page and do actions on it
//		String tagname = "a" ;
//		By by = By.tagName(tagname) ;
//		WebElement link = driver.findElement(by) ;
//		link.click();
		
		// code optimization 
		// using tagname
//		WebElement link = driver.findElement(By.tagName("a")) ;		// in html code tagname is a
//		link.click(); 
		
		// using id
//		driver.findElement(By.id("a1")).click() ;
		
		// using name
//		driver.findElement( By.name("n1") ) . click();
		
		// using classname
//		driver.findElement( By.className("c1") ) . click(); 
		
		// using linkText
//		driver.findElement( By.linkText("Qspiders") ) . click() ;
		
		// using partialLinkText
		driver.findElement( By.partialLinkText("Qsp") ) . click() ;
		
	}
	
}
