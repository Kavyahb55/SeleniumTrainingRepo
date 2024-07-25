package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage1 {
	public RegisterPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);


	}

	//1.declaraisation
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@id='Email]")
	private WebElement emailTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	 

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	
	 
	 
	
	

}
