package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Instagram"))
		{
			System.out.println("User logged in to webpage");
				
		}
		else {
			System.out.println("Invalid Login");
			
		}
		

	}

}
