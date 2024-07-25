package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCurrentUrlFlipkart {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String url1 = driver.getCurrentUrl();
		System.out.println("url1");
		if(url1.equals("https://www.flipkart.com/"))
		{
			System.out.println("Correect url");
			
		}
		else {
			System.out.println("Wrong url");
			
			
		}
		

	}

}
