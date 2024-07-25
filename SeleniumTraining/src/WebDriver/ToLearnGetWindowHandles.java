package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/7");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowIds =driver.getWindowHandles();
//		to iterate set should use for each  loop(enhanced for loop)
		
		for(String id :allwindowIds) {
			System.out.println("id");
		

	}
	}
}
 

