// Retriew the data present in text box
package WebElementMethods_13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RetriewDataFromtextBox extends BaseTest
{
	public static void main(String[] args) 
	{
		openApp("Firefox");
		String data = driver.findElement(By.id("email")).getAttribute("value") ;
		System.out.println(data);
		// clear the content from textbox
		driver.findElement(By.id("email")).clear();
		// pass kandamma to textbox\
		driver.findElement(By.id("email")).sendKeys("kandamma");
		// get data from textbox
		String kandammadata = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println( kandammadata );
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("hh");
		// get data from textbox
		String kandammadata1 = driver.findElement(By.id("password")).getAttribute("value");
		System.out.println( kandammadata1 );
		
		driver.close();
	}	
}
