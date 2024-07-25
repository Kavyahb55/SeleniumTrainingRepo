package datadrivenprc;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RDFP {

	public static void main(String[] args) throws IOException {
		//1.create fileinputstream/filereader object
	FileInputStream fis=new FileInputStream("./testdatapractise/commondatapractise.properties/");
	
	//2.create respectivefiletypeobject
	Properties prop=new Properties();
	prop.load(fis);
	
	//call read methods
	String url = prop.getProperty("url");
	String username = prop.getProperty("username");
	String password = prop.getProperty("password");
	
	
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	
	
	
	
	}

}
