package seleniumPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\"
				+ "chromedriver_win32"+ "\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//frame element

	    WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
			
//	    switch to IFrame -pass the frame element
		driver.switchTo().frame(frameElement);
				

	    WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		dropDown.click();
				
	     Select s = new Select(dropDown);
				
		s.selectByVisibleText("Avatar");
				

	}

}
