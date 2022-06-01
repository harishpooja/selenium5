package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleInstances
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		//we will never use minimize
		driver.manage().window().minimize();
		
		driver.manage().window().maximize(); 
		
		//multiple insatances of chrome driver
		
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		WebDriver driver3 = new ChromeDriver();
		
		int a= 50;
		int b= 60;
		int c= a+b;
		System.out.println(c);
		Thread.sleep(3000);
		int d= a-b;
		System.out.println(d);
		Thread.sleep(3000);
		int e= a*b;
		System.out.println(e);
		Thread.sleep(3000);
		int f= a/b;
		System.out.println(f);
		

}
}