package framespractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class On3horlineofdream11 {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		driver.findElement(By.xpath("//iframe@[title='Ifram]e Example'"));
		driver.switchTo().frame(0);

		driver.findElement(By.id("regEmail")).sendKeys("123456789");
		
		
	
	
	}

}
