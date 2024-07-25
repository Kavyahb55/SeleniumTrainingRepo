package pompractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePagePrc {
	//2.Initialization 
	public WelcomePagePrc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//1.Declaration
@FindBy(linkText = "RegisterLink")
private WebElement registerLink;


//3.Generate Getters
public WebElement getRegisterLink() {
	return registerLink;
}



	
	

}
