package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void demo(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}else if(browser.equals("chrome")){
			
			
		driver=new EdgeDriver();
			}
	else if(browser.equals("chrome"))
			{
		driver=new FirefoxDriver();
			}
	
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

}
