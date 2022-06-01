package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice
{
	public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	//driver.maximize();
	
	//example
	
	String x= "RAHUL";
	int z= x.length();
	
	//seperate
	
	Options o= driver.manage();
	Window w= o.window();
	w.maximize();
	
	driver.manage().window().maximize();
	
	
	
	
}
}
