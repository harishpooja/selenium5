package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPossibilities 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
	
	//1. not possible
	
	//WebDriver driver = new WebDriver();
	
//	driver.get("https://www.facebook.com");
	
	//2.possible but we not using this syntax
	
//	ChromeDriver driver = new ChromeDriver();
				
//	driver.get("https://www.facebook.com");

	//3.possible and we are using it
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
}
}
