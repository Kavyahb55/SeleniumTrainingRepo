package unittesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMerthod {
	@Test
	public void Register() {
	Reporter.log("user registered successfully",true);
	}
	
	@Test(dependsOnMethods = "Register")
	public void Login()
	{
		Reporter.log("user logged in successfully",true);
		
		
	}
	
}
