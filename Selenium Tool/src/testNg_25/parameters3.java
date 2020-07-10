package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters3 
{
	@Parameters({"un", "pw"})
	@Test
	public void test_InvalidLoginCredential(String un , String pw)
	{
		Reporter.log("username : " + un , true);
		Reporter.log("password : " + pw , true);
	}
	
	
}
