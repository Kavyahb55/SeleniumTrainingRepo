package framespractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnIframeconcept2 {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
//1.driver.switchTo().frame(0);
//driver.findElement(By.id("regEmail")).sendKeys("123456789");

//2.driver.switchTo().frame("send-sms-iframe");
		//driver.findElement(By.id("regEmail")).sendKeys("123456789");
		
		
WebElement frameElement = driver.findElement(By.xpath("//iframe@[title='Ifram]e Example'"));
driver.switchTo().frame(frameElement);
driver.findElement(By.id("regEmail")).sendKeys("123456789");


		
		//rt side of page
		driver.switchTo().defaultContent();
		WebElement langDD = driver.findElement(By.id("select-selected"));
		Select langselect=new Select(langDD);
		wait.until(ExpectedConditions.visibilityOf(langDD));
		langselect.selectByIndex(1);
		
		//leftside of script three hor lines
		driver.switchTo().defaultContent();
		driver.findElement(By.id("menu_parent")).click();		
		
		
				
		
		
		
		
		


	}

}
