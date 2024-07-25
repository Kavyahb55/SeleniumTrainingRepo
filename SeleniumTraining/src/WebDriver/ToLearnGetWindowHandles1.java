package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles1 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/7");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> kavya = driver.getWindowHandles();
		//To iterate set we must use foreach /enhanced for loop
		
		for(String id:kavya)
		{
			System.out.println(id);
		}
		
		
		

	}

}
