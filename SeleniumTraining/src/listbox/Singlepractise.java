package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;


public class Singlepractise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/signup");
	//day dropdown
	WebElement daydropdown = driver.findElement(By.id("day"));
	Select daySelect=new Select(daydropdown);
	daySelect.selectByIndex(4);
	
	//month dropdown

	WebElement monthdropdown = driver.findElement(By.id("month"));
	Select monthSelect=new Select(monthdropdown);
	monthSelect.selectByValue("12");
	
	//YEAR DROP DOWN
	WebElement yeardropdown = driver.findElement(By.id("year"));
	Select yearselect=new Select(yeardropdown);
	yearselect.selectByVisibleText("2022");
	List<WebElement> count = yearselect.getOptions();
	System.out.println(count.size());
			 
	
	
	
	
	

	}

}
