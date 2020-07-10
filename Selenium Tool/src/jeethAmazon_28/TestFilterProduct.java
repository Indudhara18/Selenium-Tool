package jeethAmazon_28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFilterProduct 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] rgs) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
	 	WebDriver driver = new ChromeDriver();
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	driver.manage().window().maximize();
	 	driver.get("http://www.amazon.in");
	 	
	  	WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	 	search.sendKeys("wrist watches" , Keys.ENTER);
	 	
	 	WebDriverWait wait = new WebDriverWait(driver, 10);
//	  	wait.until(ExpectedConditions.titleContains("Amazon.in:wrist watches"));
	
	  	WebElement brand = driver.findElement(By.xpath("//span[text()='Brand']"));
	  	int ybrand = brand.getLocation().getY();
	  	JavascriptExecutor jse = (JavascriptExecutor) driver ;
	  	jse.executeScript("window.scrollBy(0,"+ybrand+")");
	  	
	    List<WebElement> watches = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
	  	
	    Workbook wb = WorkbookFactory.create(new FileInputStream("./input/data.xlsx"));
	    
	    
	    for (WebElement watch : watches) 
	  	{
	    	String s = watch.getText();
  			System.out.println( s );
	  		
	  		for (int i = 0; i <= watches.size() ; i++) 
	  		{
	  			
	  			wb.getSheet("sheet1").createRow(i).createCell(0).setCellValue(s);
			}
		}
	    wb.write(new FileOutputStream("./input/data.xlsx"));
	    
	    
//	  	WebElement displaytype = driver.findElement(By.xpath("//span[text()='Watch Display Type']"));
//	 	int yaxis = displaytype.getLocation().getY();
//	  	JavascriptExecutor jse = ( JavascriptExecutor )driver ;
//	  	jse.executeScript("window.scrollBy(0,"+yaxis+")");
//	  			
//	 	driver.findElement(By.xpath("//span[text()='Analogue']")).click();
//	 	
//	 	WebDriverWait wait1 = new WebDriverWait(driver, 10);
//	 	wait1.until(ExpectedConditions.titleContains("Amazon.in: wrist watches - Analogue: Watches"));
//	 	
//	 	WebElement brandmaterial = driver.findElement(By.xpath("//span[text()='Movement']"));
//	 	int yaxis1 = brandmaterial.getLocation().getY();
//	 	jse.executeScript("window.scrollBy(0,"+yaxis1+")");
//	 	
//	 	driver.findElement(By.xpath("//span[text()='Leather']")).click();
//	 	
//	 	WebDriverWait wait2 = new WebDriverWait(driver, 10);
//	 	wait2.until(ExpectedConditions.titleContains("Amazon.in: wrist watches - Analogue / Leather: Watches"));
//	 	
//	  	WebElement brand = driver.findElement(By.xpath("//span[text()='Avg. Customer Review']"));
//	  	int yaxis2 = brand.getLocation().getY();
//	  	jse.executeScript("window.scrollBy(0,"+yaxis2+")");
//	  	
	  //driver.findElement(By.xpath("(//span[text()='See more'])[1]")).click();
//	  	wait2.until(ExpectedConditions.titleContains("Amazon.in: wrist watches - Analogue / Leather: Watches"));
//	  	Thread.sleep(2000);
//	  	driver.findElement(By.xpath("//span[text()='Dice']")).click();
//	  	
//	  	WebDriverWait wait3 = new WebDriverWait(driver, 10);
//	 	wait3.until(ExpectedConditions.titleContains("Amazon.in: wrist watches - Dice / Analogue / Leather: Watches"));
//	 	driver.findElement(By.xpath("//span[text()='25% Off or more']")).click();
//	  	
//	 	WebDriverWait wait4 = new WebDriverWait(driver, 10);
//	 	wait4.until(ExpectedConditions.titleContains("Amazon.in: wrist watches - Dice / Analogue / Leather / 25% Off or more: Watches"));
//	 	driver.close();
	 	
	 	
	}
	
}
