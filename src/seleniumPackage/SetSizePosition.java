package seleniumPackage;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizePosition 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//set size for browser
		
		Dimension d= new Dimension(300,500);
		
		driver.manage().window().setSize(d);
				
		Point p = new Point(100,100);
		
		driver.manage().window().setPosition(null);
		
		
	}

}
