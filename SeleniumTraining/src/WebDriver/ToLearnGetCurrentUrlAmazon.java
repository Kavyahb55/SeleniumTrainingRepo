package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrlAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.amazon.com/"))
		{
			System.out.println("Valid login via url");
			
		}
		else {
			System.out.println("Wrong");
			
		}
		

	}

}
