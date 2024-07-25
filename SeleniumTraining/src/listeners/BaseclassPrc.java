package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseclassPrc {
	public static WebDriver driver;
	
	public void broserSetup() 
	{
		Reporter.log("Open browser",true);
		driver=new ChromeDriver();
	}

}
