package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedEnabledMethod
{
	public static void main(String[] args) 
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
	      driver.manage().window().maximize();
			
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      
	      //1. isDisplayed
	      
	      //hide button  // show button  // text button
	      
	      WebElement hideButton =  driver.findElement(By.xpath("//input[@id='hide-textbox']"));
			
	      hideButton.click();
	      
	      WebElement textBox =  driver.findElement(By.xpath("//input[@id='displayed-text']"));
			
	      boolean result1= textBox.isDisplayed();
	      
	      System.out.println("after clicking on hide button-"+ result1);
	      
	      WebElement showButton =  driver.findElement(By.xpath("//input[@id='show-textbox']"));
	    	      
	      showButton.click(); 
	      
	      boolean result2 = textBox.isDisplayed();
	      System.out.println("after clicking on showbutton-"+ result2);
	      
	      if(result2 == true)
	      {
	    	  textBox.sendKeys("india");
	      }
	      else
	      {
	    	  showButton.click(); 
	    	  textBox.sendKeys("india");
	      }
	      //2. isEnabled
	      
	      WebElement textBox =  driver.findElement(By.xpath(""));
	      
	      textBox.click(); 
	      
	      boolean result = textBox.isEnabled();
	      {
	    	  textBox.sendKeys("india");
	      }
	      
	      else
	      {
	    	  System.out.println("we can not pass the value"); 
	      }
	      
	      
	      
	   }
					

}
