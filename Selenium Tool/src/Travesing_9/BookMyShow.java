package Travesing_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://www.bookmyshow.com");
		Thread.sleep(5000);
		
		driver.findElement(By.id("inp_RegionSearch_top")).sendKeys("Chandigarh" , Keys.ENTER); ;
		Thread.sleep(6000);
		// click on NO on popup
		driver.findElement(By.id("wzrk-cancel")).click();
		// click on first movie
		driver.findElement(By.xpath("(//div[@class='slick-track'])[2]/div[1]")).click();
		Thread.sleep(3000);
		// click on Book Tickets button
		driver.findElement(By.xpath("//a[text()='Book Tickets']")).click();
		Thread.sleep(3000);
		// select next date
		driver.findElement(By.xpath("(//ul[@id='showDates'])/div/div/li[2]")).click();
		Thread.sleep(3000);
		// select timings from Carnival: Paras Mall
		driver.findElement(By.xpath("//a[text()='Carnival: Paras Mall, Zirakpur']/../../../../div[2]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		// select how many number of seats
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		Thread.sleep(3000);
		//select seats
		driver.findElement(By.xpath("//div[@id='A_10_16']")).click();
		Thread.sleep(3000);
		// click on book ticket button
		driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		Thread.sleep(5000);
		
		// im getting ElementNotInteractableException in line 50 because we need to scroll down 
		driver.findElement(By.xpath("//label[@for='box']")).click();
		driver.findElement(By.xpath("//a[@id='prePay']")).click();
	}
}
