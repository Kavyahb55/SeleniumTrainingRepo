package webdrivermethodspractise;

import java.awt.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().window().setSize(new Dimension(400,200));
	
	}

}
