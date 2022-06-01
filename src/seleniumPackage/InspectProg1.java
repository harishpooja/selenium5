package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectProg1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");

		WebElement username= driver.findElement(By.name("username"));
		
		username.sendKeys("instagram");
		

		WebElement password= driver.findElement(By.name("password"));
		
		username.sendKeys("insta");
		
		
		
		
		
		
}
}
