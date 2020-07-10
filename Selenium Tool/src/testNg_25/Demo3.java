package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	
	@Test(priority=0)
	public void testF()
	{
		Reporter.log("From testF()" , true);
	}
	
	@Test(priority=5)
	public void testA()
	{
		Reporter.log("from A2" , false);
	}
	
	@Test(priority=-10)					// can pass negative integer		
	public void testZ()
	{
		Reporter.log("from Z" , false);
	}
	
	
	
//	@Test(priority=1.5)					// can't pass decimal
	public void testW()
	{
		Reporter.log("from W" , false);
	}
	
	int a = 100 ;
//	@Test(priority=a)					// can't pass variable as argument
	public void testQ()
	{
		
	}
	
	final int b = 55 ;					// can pass constant as argument
	@Test(priority=b)
	public void testV()
	{
		
	}
	
	
	
}
