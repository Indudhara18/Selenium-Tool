package WebElementMethods_13;

import org.openqa.selenium.By;

public class SubmitMethod extends BaseTest 
{

	public static void main(String[] args) 
	{
		openApp("Chrome");
		// find login button and submit on it                                          
		
		driver.findElement(By.id("user_login_btn")).submit();
		driver.navigate().to("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}	
}

/*
submit() works only if it is present in <form> tag
and type='submit'
*/