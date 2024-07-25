package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowids = driver.getWindowHandles();
		
		for(String id:allWindowids)
			driver.switchTo().window(id);
		{
			if(driver.getCurrentUrl().contains("flipkart"))
			{
				driver.manage().window().maximize();
			}
		}
		
		
	}

}
