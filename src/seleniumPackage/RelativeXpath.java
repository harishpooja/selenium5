package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath
{
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
		
		 // username
		
		WebElement userName= driver.findElement(By.xpath("//html//body//div//from"));
		userName.sendKeys("Admin");
						
	     //password
						
		WebElement password= driver.findElement(By.xpath("//html//body//div"));
						
		password.sendKeys("admin123");
				
	 //login button
				
    	WebElement loginButton= driver.findElement(By.xpath("//html//body//div"));
				
		loginButton.click();
		
       // forgot password
		
    	WebElement forgotPassword= driver.findElement(By.xpath("//html//body//div"));
    			
    	forgotPassword.click();
		
	}

}



