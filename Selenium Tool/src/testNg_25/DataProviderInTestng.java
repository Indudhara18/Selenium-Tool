package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestng 
{
	@DataProvider
	public Object[][] dataValue()
	{
		Object[][] s = new Object[3][2];			// here row=3 is number of itteration
												// and column=2 is number of formal arguments in @Test method
		s[0][0] = "userA" ;
		s[0][1] = "pw123" ;
		
		s[1][0] = "userB" ;
		s[1][1] = "pw456" ;
		
		s[2][0] = "userC" ;
		s[2][1] = "pw789" ;
		
		return s ;
	}
	
	@Test( dataProvider = "dataValue" )
	public void test_Invalid(String un , String pw)
	{
		Reporter.log("username -->" + un , true);
		Reporter.log("password -->" + pw , true);
	}
	
}
