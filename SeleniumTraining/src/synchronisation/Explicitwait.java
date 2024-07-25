package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				
		driver.get("https://www.shoppersstack.com/");
		//on checkdeliverybox
		driver.findElement(By.name("Check Delivery")).sendKeys("560068");
		//on checkboxbutton
		WebElement checkButton = driver.findElement(By.id("Check"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click(); 
		
		



	}

}
