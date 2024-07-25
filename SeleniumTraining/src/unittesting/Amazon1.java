package unittesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Amazon1 {
	public void launchAmazon()
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Reporter.log("Amazon has launched",true);
		
	}

}
