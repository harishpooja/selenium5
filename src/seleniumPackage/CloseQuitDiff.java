package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitDiff 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
					
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
			
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		driver.close();
		driver.quit();
}
}
