package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MozilaClass 
{
	public static void main(String[] args)throws InterruptedException 
	{
//		System.setProperty("webdriver.gecko.driver","E:\\geckodriver\\geckodriver.exe");
//		
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("https://www.google.com");
//		
//	
//			System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
//			
//			WebDriver driver1 = new ChromeDriver();
//			
//			driver1.get("https://www.facebook.com");
//			
//			System.setProperty("webdriver.edge.driver","E:\\edgedriver\\msedgedriver.exe");
//			
//			WebDriver driver2 = new EdgeDriver();
//			
//			driver2.get("https://www.google.com");
			
            System.setProperty("webdriver.ie.driver","E:\\IEdriver\\IEDriverServer.exe");
			
			WebDriver driver3 = new InternetExplorerDriver();
			
			driver3.get("https://www.google.com");
			

}
}