package pomClassForActitime_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage 
{

	// declaration of WebElement
	
	@FindBy(xpath="//input[@value='Create New Tasks']")
	private WebElement createnewtask ;
	
	// initialisation of declared WebElement
	
	public OpenTasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	// utilaisation of web elements
	public void clickOnCreateNewtasks()
	{
		createnewtask.click();
	}

	
}
