package actionspractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");	
		WebElement menlink = driver.findElement(By.partialLinkText("MEN"));
		Actions act = new Actions(driver);
		act.moveToElement(menlink).perform();
		driver.findElement(By.linkText("Casual Shirt")).click();
		



	}

}
