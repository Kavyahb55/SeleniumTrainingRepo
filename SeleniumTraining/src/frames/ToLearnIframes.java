package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://www.dream11.com/");
	//1.frame(int index)
	//driver.switchTo().frame(0);
	//driver.findElement(By.id("regEmail")).sendKeys("7022466184");
	
	//2.frame(string name/id)
	//driver.switchTo().frame("send-sms-iframe");
	//driver.findElement(By.id("regEmail")).sendKeys("7022466184");
	
	//3.frame(writing xpath)
	WebElement frameElement = driver.findElement(By.xpath("//iframe[title='Iframe Example']"));
	driver.switchTo().frame(frameElement);
	driver.findElement(By.id("regEmail")).sendKeys("7022466000");
	
	
		

	}

}
