package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupProg 
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\crome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
       driver.manage().window().maximize();
		
       driver.get("https://demoqa.com/alerts");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       WebElement clickMeButton= driver.findElement(By.xpath("//button[@id='alertButton']"));
       clickMeButton.click();
       Thread.sleep(5000);
       
       Alert alt= driver.switchTo().alert();
       System.out.println(alt.getText());
       alt.accept();
       Thread.sleep(2000);
      // WebElement confirmButton= driver.findElement(By.xpath("//button[@id='alertButton']"));
	}

}
