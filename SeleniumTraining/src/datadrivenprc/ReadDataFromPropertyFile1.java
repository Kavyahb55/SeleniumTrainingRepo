package datadrivenprc;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile1 {

	public static void main(String[] args) throws IOException {
//step1:create fileinputstream/filereadertype object
		FileInputStream fis=new FileInputStream("./testdatapractise/commondatapractise.properties/");
		
		//step2:create respective filetypeobject
		Properties prop=new Properties();
		prop.load(fis);
		
		//step3:call read method
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		//to launch web application with samedata
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		
		


	}

}
