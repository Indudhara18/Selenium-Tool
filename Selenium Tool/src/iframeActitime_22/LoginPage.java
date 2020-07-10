package iframeActitime_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest
{
	// declare the elements present in LoginPage
	private WebElement unTB ;
	private WebElement pwTB ;
	private WebElement lgnBTN ;
	private WebElement errMSg ;
	
	// initialise the declared elements (global nonstatic variables) inside constructor
	public LoginPage(WebDriver driver)
	{
		unTB = driver.findElement(By.name("username"));
		pwTB = driver.findElement(By.name("pwd"));
		lgnBTN = driver.findElement(By.id("loginButton"));
		errMSg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
	}
	
	public void setUserName(String username)
	{
		unTB.sendKeys(username);
	}
	

	public void setPassword(String password)
	{
		pwTB.sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		lgnBTN.click();
	}
	
	public void checkErrorMsg()
	{
		System.out.println( errMSg.isDisplayed() ); 
		
	}
	
	
}
