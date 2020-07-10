package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optional 
{

	@Test
	@Parameters({"username" , "password"})
	public void test_Invalid(@Optional("indudhara") String username , @Optional("IDG")  String password)
	{
		Reporter.log("Username :" + username , true);
		Reporter.log("Password : " + password , true);
		
	}
	
}
