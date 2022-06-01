package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlTitle 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String expectedURL = "https://www.facebook.com";
		
		String actualURL = driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		//2. get Title assignment
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		driver.close();
		
		
	}

}
