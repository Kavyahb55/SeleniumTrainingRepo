package unittestingpractise;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 {
	@Test//TestNG CLASS
	public void test()//Testcase
	{
		Reporter.log("test executing...",true	);//Teststeps
	}
	@Test
	public void demo()
	{
		Reporter.log("demo executing...",true	);
	}

}
