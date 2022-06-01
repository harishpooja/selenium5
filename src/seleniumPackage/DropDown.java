package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
	public static void main(String[] args) 
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
	      driver.manage().window().maximize();
			
	      driver.get("https://vctcpune.com/selenium/practice.html");
	      
	      //dropdown
	      
	      WebElement dropDown =  driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	      dropDown.click();
	      Select s= new Select(dropDown);
	      s.selectByValue("option2");
	      s.selectByVisibleText("option3");

}
}