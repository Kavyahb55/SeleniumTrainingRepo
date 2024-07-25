package listboxpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListboxpractise {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/signup");
		//daydropdown
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select dayselect=new Select(daydropdown);
		dayselect.selectByIndex(4);
		System.out.println(dayselect.isMultiple());
		
		
		//month dropdown
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select monthselect=new Select(monthdropdown);
		monthselect.selectByValue("jan");
		
		//year dropdown
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select yearselect=new Select(yeardropdown);
		yearselect.selectByVisibleText("1997");
		
		
		
	}	



	

}
