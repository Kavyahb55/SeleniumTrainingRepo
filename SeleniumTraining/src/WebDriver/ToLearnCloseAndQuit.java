package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
	// driver.close();
		driver.get("https://www.shoppersstack.com/products_page/7");
		Thread.sleep(20000);
		driver.findElement(By.id("Compare")).click();;
		driver.quit();
	

	}

}
