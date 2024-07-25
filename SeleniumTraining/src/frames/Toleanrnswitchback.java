package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Toleanrnswitchback {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.get("https://www.dream11.com/");
	WebElement frameElement = driver.findElement(By.xpath("//iframe[title='Iframe Example']"));
	driver.switchTo().frame(frameElement);
	driver.findElement(By.id("regEmail")).sendKeys("7022466000");
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("menu_parent")).click();//take id of div tag not div style
	
	
		//navigate to petdiseasealrt map
	//click on any state and click on signup button
	//capture heading
	

	}

}
