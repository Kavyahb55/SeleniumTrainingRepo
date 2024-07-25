public class SingleSelectListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select dayselect=new Select(dayDropdown);
		dayselect.selectByIndex(4);
		
	
	}
}
