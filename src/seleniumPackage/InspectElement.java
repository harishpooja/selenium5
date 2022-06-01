package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InspectElement
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
//		WebElement username= driver.findElement(By.id("email"));
//		
//		
//		username.sendKeys("microsoft");
//		
//		
//		WebElement password= driver.findElement(By.id("pass"));
//		
//		password.sendKeys("microsoft");
//		
//		Thread.sleep(2000);
//		
//		   WebElement loginbutton= driver.findElement(By.name("login")   );
//		
//		loginbutton.click();
//		
//		//test case 1
//		
//		String expectedTitle= "facebook";
//		
//		String actualTitle= driver.getTitle();
//		   
//		if(expectedTitle.equals(actualTitle))
//		
//		{
//			System.out.println("user is successfully able to login and hence test case is passed");
//		}
//		else
//		{
//			System.out.println("test case is failed");
//		}
//		
//		//test case- 2
//		
//		String expectedURL= "https://www.facebook.com";
//		
//		String actualURL= driver.getCurrentUrl();
//		
//		if(expectedURL.equals(actualURL))
//		{
//			System.out.println("TC is passed");
//		}
//		else
//		{
//			System.out.println("TC is failed");
//		}
//		
		//forgot password link
		//link text method / locator
		
		 WebElement forgotPassword= driver.findElement(By.linkText("Forgotten password?")   );
			
			forgotPassword.click();

			//partial link text method
			
			 WebElement forgotPassword1= driver.findElement(By.partialLinkText("password")   );
				
				forgotPassword1.click();
		
				
		
		
		
	}

}
