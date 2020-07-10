package Amazon_WristWatche_29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FWUtils 
{

	public static void writeWatches(WebDriver driver , String sheet) throws FileNotFoundException, IOException
	{
		 List<WebElement> watches = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		 
		 Workbook wb = null ;
		 try 
		 {
			  wb = WorkbookFactory.create(new FileInputStream("./input/data.xlsx"));
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		 for (WebElement watch : watches) 
		 {
			 System.out.println( watch.getText() );
		 }
		 

		 for (int i = 1 ; i < watches.size() ; i++) 
		 {
			 wb.getSheet(sheet).createRow(i).createCell(0).setCellValue( watches.get(i).getText() );
			 wb.write(new FileOutputStream("./input/data.xlsx"));	
		 }
		 
		 List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 
		 for (WebElement price : prices) 
		 {
			 System.out.println( price.getText() );
		 }
		 
		 for (int i = 1 ; i < prices.size() ; i++) 
		 {
			 wb.getSheet(sheet).getRow(i).createCell(1).setCellValue( prices.get(i).getText() );
			 wb.write(new FileOutputStream("./input/data.xlsx"));
		 }
	}
	
	public static void TenWatch(WebDriver driver , String sheet, int row , int cell ) throws FileNotFoundException, IOException
	{
		Workbook wb = null ;
		
		try 
		{
			wb = WorkbookFactory.create(new FileInputStream("./input/data.xlsx"));
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		
		List<WebElement> watches = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		
		for (int i = 0; i < watches.size() ; i++) 
		{
			wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue( watches.get(10).getText() );
			wb.write(new FileOutputStream("./input/data.xlsx"));
		}	
	}

}
