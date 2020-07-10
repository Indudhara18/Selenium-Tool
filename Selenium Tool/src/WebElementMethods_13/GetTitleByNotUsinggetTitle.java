package WebElementMethods_13;

import org.openqa.selenium.By;

public class GetTitleByNotUsinggetTitle extends BaseTest
{
	public static void main(String[] args) throws InterruptedException
	{
		openApp("Chrome");
		Thread.sleep(3000);
		System.out.println( driver.findElement(By.tagName("title")).getText()  );
		System.out.println( driver.findElement(By.tagName("title")).getAttribute("textcontent") );
		System.out.println( driver.findElement(By.tagName("title")).getAttribute("textContent") );
		//driver.close();
	}
	
	
}
