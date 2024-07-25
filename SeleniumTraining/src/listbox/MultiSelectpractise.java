package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectpractise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.demoapp.skillray.com");
	WebElement pricelistbox = driver.findElement(By.id("cars"));
	Select priceSelect=new Select(pricelistbox);
	priceSelect.selectByIndex(0);
	priceSelect.selectByValue("199");
	priceSelect.selectByVisibleText("INR 50 - INR 99 ( 1 )");
	
	//TO DISSELECT
	
	priceSelect.deselectByIndex(0);
	priceSelect.deselectByValue("199");
	priceSelect.deselectByVisibleText("INR 50 - INR 99 ( 1 )");
	
	//OR
	priceSelect.deselectAll();
	
	
	
	
	
	
	

	}

}
