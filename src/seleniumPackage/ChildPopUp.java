package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    // website open
	    driver.get("https://vctcpune.com/");
	    //click on button
	    
	    WebElement startLink= driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	    startLink.click();
	    //went on next page
	    
	    WebElement textBox= driver.findElement(By.xpath("//input[@id='autocomplete']"));
	    
	    textBox.sendKeys("India");
	}

}
