package pomClassForActitime_24;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage 
{
	// declaration on webElement
	
	@FindBy(xpath="//div[text()='Settings']")
	private WebElement settings ;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasks ;
	
	// initialisation of declared WebElement
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilaisation of web elements
	
	public void clickOnSettings()
	{
		settings.click();
	}
	
	public void clickOnTasks() 
	{
		tasks.click();
	}
}
