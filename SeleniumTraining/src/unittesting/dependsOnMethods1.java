package unittesting;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods1 {
	
@Test(priority= 2)
	public void register()
	{
		Assert.fail();
		Reporter.log("user registered successfully",true);
		
				
	}
	
	@Test(priority = 1)
	public void login() {
	Reporter.log("user logged in succesfully",true);

}
}