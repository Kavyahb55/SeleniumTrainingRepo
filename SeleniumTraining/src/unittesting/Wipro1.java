package unittesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Wipro1 {
	
	public void launchWipro()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wipro.com/");
		Reporter.log("Wipro has launched",true);
	}

}
