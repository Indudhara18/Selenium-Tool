package pomClass_23;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{

	@FindBy(xpath="//a")
	private List<WebElement> allLinks ;
	
	
	public GooglePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getAllLinks()
	{
		for (WebElement link : allLinks) 
		{
			 String s = link.getText();
		}
	}
	

	
	
}
