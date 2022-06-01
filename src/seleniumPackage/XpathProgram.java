package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram 
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
		
		//2.xpath by text //password
		
		WebElement password= driver.findElement(By.xpath("//span[@text()='Password']"));
		
		password.sendKeys("admin123");

		
		
		
		
	}

}
