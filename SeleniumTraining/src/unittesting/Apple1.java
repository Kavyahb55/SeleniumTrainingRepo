package unittesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Apple1 {
	public void launchapple() 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/");
		Reporter.log("Apple has launched",true);
		
	}
	

}
