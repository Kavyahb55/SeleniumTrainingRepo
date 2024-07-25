package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		String parentID = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowid = driver.getWindowHandles();
		for(String id:allWindowid)
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("ebay"))
			{
				driver.manage().window().maximize();
			}
			
		}
		driver.switchTo().window(parentID);
		driver.close();
		
		
		
		
		

	}

}
