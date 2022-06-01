package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram2 
{
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
		
		//1.xpath by attribute // username
		
		WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		userName.sendKeys("Admin");
				
		//2.xpath by text -not run by text so i use attribute//password
				
		WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
				
		password.sendKeys("admin123");
		
		//3.xpath by contains- by attribute //login button
		
		WebElement loginButton= driver.findElement(By.xpath("//input[@contains(@name,'Submit')]"));
		
    	loginButton.click();
		
    	//4.xpath by contains- by  text // forgot password
		
    	WebElement forgotPassword= driver.findElement(By.xpath("//a[contains(@text(),'Forgot your password?']]"));
    			
    	forgotPassword.click();
    			
		
		
		
		
	}

}
