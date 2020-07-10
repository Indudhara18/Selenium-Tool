package testNgExample1_26;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends BaseTest
{
	@Test
	public void test_A()
	{
		Reporter.log("My right hand" ,true);
	}
	
	@Test
	public void test_B()
	{
		Reporter.log("Bunny leave it", true);
	}
	
	@Test
	public void test_C()
	{
		Reporter.log("bidalla", true);
	}
	
	@Test
	public void test_D()
	{
		Reporter.log("dont hurt kid's hand", true);
	}
}
