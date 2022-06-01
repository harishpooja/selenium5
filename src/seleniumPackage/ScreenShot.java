package seleniumPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
       System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
		
       driver.get("https://opensource-demo.orangehrmlive.com/");
				
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("E:\\Screenshot2\\Homepage.jpg");
		
		FileHandler.copy(sourceFile , destFile );
		
		System.out.println("screenshot is taken");
		
		
	}

}
