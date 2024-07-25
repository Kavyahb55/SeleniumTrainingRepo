package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGetWindowHandle1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID );

	}

}
