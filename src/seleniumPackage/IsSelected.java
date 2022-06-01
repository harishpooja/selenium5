package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{
	public static void main(String[] args) 
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
	      driver.manage().window().maximize();
			
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      
	      //1. isSelected
	      
	 	      
	      WebElement radioButton =  driver.findElement(By.xpath("//input[@value='Radio1']"));
				          
	      boolean result= radioButton.isSelected();
	      
	      System.out.println("result");
	            
	 	      
	      if(result == false)
	      {
	    	  radioButton.click();
	      }
	      else
	      {
	    	 System.out.println("button is already selected");
	      }
         boolean result1= radioButton.isSelected();
	      
	      System.out.println("after clicking-"+result1);

}
}
