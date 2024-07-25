package framespractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnIframeconcept {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("regEmail")).sendKeys("12345");//working
		
		
		//driver.switchTo().frame("send-sms-iframe");
		//driver.findElement(By.id("regEmail")).sendKeys("12345");//not working
		
		
WebElement frameElement = driver.findElement(By.xpath("//iframe@[title='Iframe Example']"));
driver.switchTo().frame(frameElement);
driver.findElement(By.id("regEmail")).sendKeys("12345");

//to select language dropdown
driver.switchTo().defaultContent();
WebElement languageDD = driver.findElement(By.id("select-selected"));
Select langselect=new Select(languageDD);
wait.until(ExpectedConditions.visibilityOf(languageDD));
langselect.selectByIndex(1);



		
		
		
		
		
		
		



	}

}
