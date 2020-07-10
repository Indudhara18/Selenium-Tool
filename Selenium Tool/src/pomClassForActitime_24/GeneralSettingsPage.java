package pomClassForActitime_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralSettingsPage 
{

	// declaration on webElement
	
	@FindBy(xpath="//a[contains(text(),'Licenses')] ")
	private WebElement licenses ;
	
	
	// initialisation of declared WebElement
	
	public GeneralSettingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilaisation of web elements
	
	public void clickOnLicenses()
	{
		licenses.click();
	}
	
	
	
}
