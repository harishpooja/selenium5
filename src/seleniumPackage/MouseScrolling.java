package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScrolling 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32"
				+ "\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		//casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    
		//input in javaScript language
        //scroll down
		js.executeScript("window.scrollBy(0,2000)");
		
	
		Thread.sleep(5000);
	
		//scroll up
		js.executeScript("window.scrollBy(0,-2000)");
	

		
	}
}
