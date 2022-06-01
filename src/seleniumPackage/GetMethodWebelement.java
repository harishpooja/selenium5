package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodWebelement 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
      driver.manage().window().maximize();
		
      driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(2000);
				
		WebElement userName= driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
				
		String idAttribute = userName.getAttribute("id");
		System.out.println(idAttribute);
		
		String text= userName.getText();
		System.out.println();
		
		String tagName= userName.getTagName();
		System.out.println();
	
   }
}
