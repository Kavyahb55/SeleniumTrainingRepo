package listbox;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MultiSelectListBox {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillray.com");
		
		WebElement priceListbox = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(priceListbox);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("199");
		priceSelect.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		
			
		
		
			
	}

}

