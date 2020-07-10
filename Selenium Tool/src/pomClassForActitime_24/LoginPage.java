package pomClassForActitime_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// declaration of WebElements

	@FindBy(name="username")
	private WebElement unTb ;
	
	@FindBy(name="pwd")
	private WebElement pwTb ;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement lgnBTN ;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMSg ;
	
	
	// initialising of declared WebElements inside non static member
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilaisation of WebElements
	
	public void setUserName(String name)
	{
		unTb.sendKeys(name);
	}
	
	public void setPassword(String password)
	{
		pwTb.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		lgnBTN.click();
	}
	
	public void checkErrorMessage()
	{
		boolean b = errMSg.isDisplayed() ;
		System.out.println("Error message displayed :" + b);
	}
	
}
