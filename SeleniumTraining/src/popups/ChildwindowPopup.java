package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		Set<String> allindowids = driver.getWindowHandles();
		
	for(String id:allindowids)
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("amazon"))
			{
				driver.manage().window().maximize();
			
				
			}
					
			
		}
		
		
		

	}

}
