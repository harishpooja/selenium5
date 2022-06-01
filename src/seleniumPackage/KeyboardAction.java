package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		//P
		act.sendKeys("P").perform();
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		String valueActual = result.getText();
		System.out.println(valueActual);
		
		String valueExpected = "You entered: P";
		
		if(valueActual.equals(valueExpected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		act.sendKeys(Keys.BACK_SPACE).perform();
		
		
		
		

	}

}
