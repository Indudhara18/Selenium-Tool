package pomClassForActitime_24;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTasksPage
{

	// declaration on webElement
	
	@FindBy(xpath="//select[@name='customerId']")
	private WebElement Addcustomer ;
		
	@FindBy(xpath="//input[@name='customerName']")
	private WebElement EnterCustomerName ;
	
	@FindBy(xpath="//input[@name='projectName']")	
	private WebElement EnterprojectName ;
	
	@FindBy(xpath="//input[@name='task[0].name']")	
	private WebElement EnterTaskName ;

	@FindBy(xpath="//img[@id='ext-gen7']")	
	private WebElement calender ;
	

	@FindBy(xpath="(//span[text()='28'])[2]")	
	private WebElement date ;
	
	@FindBy(xpath="//input[@value='Create Tasks']")	
	private WebElement createTaskButton ;
	
	// initialisation of declared WebElement
		
	public CreateNewTasksPage(WebDriver driver)
	{	
		PageFactory.initElements(driver, this);
	}
		
	// utilaisation of web elements
			
	public void clickOnAddCustomer()
	{
		Addcustomer.click();
	}
	

	public void enterCustomerName(String name)
	{
		EnterCustomerName.sendKeys(name);
	}
	
	public void enterprojectName(String name)
	{
		EnterprojectName.sendKeys(name);
	}
	
	public void enterTask(String name)
	{
		EnterTaskName.sendKeys(name);
	}

	public void clickOnCalender()
	{
		calender.click();
	}
	
	public void clickOnDate()
	{
		date.click();
	}
	
	public void clickOnCreateTasksButton()
	{
		createTaskButton.click();
	}
}
