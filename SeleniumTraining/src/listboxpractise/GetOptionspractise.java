package listboxpractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionspractise {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement pricelistbox = driver.findElement(By.id("cars"));
		Select priceselect=new Select(pricelistbox);
		List<WebElement> alloptions = priceselect.getOptions();
		System.out.println(alloptions.size());
		
		
		//for(WebElement option:alloptions) {
			
		//	System.out.println(option.getText());
		
		priceselect.selectByIndex(1);
		priceselect.selectByIndex(2);
		WebElement firstseloption = priceselect.getFirstSelectedOption();
		System.out.println(firstseloption.getText());
		
		List<WebElement> allseloptions = priceselect.getAllSelectedOptions();
		for(WebElement option:allseloptions)
		{
			
			System.out.println(option.getText());
			
		}
		System.out.println(priceselect.isMultiple());
		
		
		
		
		
		
		
		
		
			
			
			
			
		}
			
			
		


	}


