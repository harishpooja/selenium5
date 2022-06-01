package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodWebelement
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
		
       driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
		
		//1.xpath by fullpath // username
		
		WebElement userName= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[2]/input"));
		
		userName.clear();
		
		userName.sendKeys("Admin");
						
	    //2.xpath by fullpath //password
						
		WebElement password= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[3]/input"));
		userName.clear();				
		password.sendKeys("admin123");
				
		//3.xpath by fullpath //login button
				
		WebElement loginButton= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/form/div[5]/input"));
				
		loginButton.click();
		
	}

}
