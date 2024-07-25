package actionspractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/product.php");
		
		WebElement add = driver.findElement(By.id("add"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick().perform();
		//or
		act.doubleClick(add).doubleClick(add).perform();

	}

}
