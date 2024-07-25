package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver; 


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

public class SingleSelectListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		
		// for daydropdown
		
	WebElement dayDropdown = driver.findElement(By.id("day"));
	Select daySelect=new Select(dayDropdown);
	daySelect.selectByIndex(15);
	
	//for month dropdown
	
	WebElement monthsDropdown = driver.findElement(By.id("month"));
	Select monthSelect=new Select(monthsDropdown);
	monthSelect.selectByValue("11");
	
	//for year dropdown
	
	WebElement yearDropdown = driver.findElement(By.id("year"));
	Select yearSelect=new Select(yearDropdown);
	yearSelect.selectByVisibleText("1997");
	List<WebElement> count = yearSelect.getOptions();
	System.out.println(count.size());
	

	
	

	
	
	

	}

}
	