package pomClass_23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{
	@FindBy(name="username")
	private WebElement unTB ;
	
	@FindBy(name="pwd")
	private WebElement pwTB ;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement lgnBTN ;
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
	
	
}
