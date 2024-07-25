package listboxpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListboxpractise {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement pricelistbox = driver.findElement(By.id("cars"));
		Select priceselect=new Select(pricelistbox);
		priceselect.selectByIndex(0);
		priceselect.selectByValue("199");
		priceselect.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		
		
		//todeselct
		
		priceselect.deselectByIndex(0);
		priceselect.deselectByValue("199");
		priceselect.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
		
		
		
		

	}

}
