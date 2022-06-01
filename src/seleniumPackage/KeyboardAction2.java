package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction2
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://text-compare.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement area1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		area1.sendKeys("India is my Country");
		
		Actions act = new Actions(driver);
		
		//select all --> ctrl + A
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//copy --> ctrl +C
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		WebElement area2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	    area2.click();
	
	  
	    //ctrl + V
	    
	    act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.perform();
	
		//assignement
		//compare button find out
//		click
//		message --> The two texts are identical!
//		
//		//test caase -pass
//		else --.act fail

		
	}
}
