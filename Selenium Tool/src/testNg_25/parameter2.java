package testNg_25;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter2 
{
	// inorder to pass multiple test data open testngparameter2.xml
	
	@Test
	@Parameters({"un" , "pw"})	// whatever the parameters declare them inside {} as strings
	public void createUser(String un , String pw)
	{
		Reporter.log("user is created" ,  true);
		Reporter.log("user name:" + un , true);
		Reporter.log("password: " + pw , true);
	}

}
