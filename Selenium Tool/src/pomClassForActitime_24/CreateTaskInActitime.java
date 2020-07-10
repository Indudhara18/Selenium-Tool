package pomClassForActitime_24;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTaskInActitime 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://indudharagowdaacer/login.do");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickOnLogin();
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver)	;
		etp.clickOnTasks();
		
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnCreateNewtasks();
		
		CreateNewTasksPage cntp = new CreateNewTasksPage(driver);
		cntp.clickOnAddCustomer();
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		cntp.enterCustomerName("Douglass Tries");
		cntp.enterprojectName("Fireball");
		cntp.enterTask("Write Test scenarios");
		cntp.clickOnCalender();
		cntp.clickOnDate();
		cntp.clickOnCreateTasksButton();
		
	}
	
}
