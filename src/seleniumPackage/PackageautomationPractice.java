package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PackageautomationPractice
{
	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
				
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		driver.manage().window().minimize();
		
		Thread.sleep(10000);
		
		driver.close();
		driver.quit();
		
		
		
		
	}

}
