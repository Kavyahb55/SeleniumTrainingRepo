package popuppractise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowpopupPrc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		String parentID = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowhandles = driver.getWindowHandles();
		allwindowhandles.remove(parentID);
		for(String id:allwindowhandles)
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("amazon"))
			{
				driver.manage().window().maximize();
			}
			driver.switchTo().window(parentID); 
			driver.close();
				
						
		}
		
	
		
		
		


	}

}
