package javascriptexecutorpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolintoview {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukari.com/");
		Thread.sleep(3000);
		WebElement whatsapp = driver.findElement(By.xpath("//span[text()='whatsappText']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguements[0].scrollIntoview(true)", whatsapp);
		
		



	}

}