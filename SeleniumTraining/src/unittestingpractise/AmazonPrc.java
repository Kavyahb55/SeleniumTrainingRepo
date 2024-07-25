package unittestingpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonPrc {
	@Test(groups = "smoke")
	public void launchAmazon() 
	{
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		Reporter.log("Amazon has launched",true);
	}

}
