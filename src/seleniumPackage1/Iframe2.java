package seleniumPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\"
				+ "chromedriver_win32"+ "\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    System.out.println("browser open");
	    driver.manage().window().maximize();
	    System.out.println("URL open");
	    driver.get("https://www.saucedemo.com/");
	    
	  //selenium waits- implicit wait -globally applied means applied to all elements in script
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  		

	  	WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
	  	username.sendKeys("standard_user");
	  	System.out.println("username entered");
	  		
	  	WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
	  	password.sendKeys("secret_sauce");
	  	System.out.println("Password entered");
	  		
	  	WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	  	loginButton.click();
	  	System.out.println("CLicked on login button");
	  		
	  	//validation
	  	System.out.println("Checking login functionality");
	  		
	  	String expectedTitle = "Swag Labs";
	  	String actualTitle = driver.getTitle();
	  		
	  	if(expectedTitle.equals(actualTitle))
	  	{
	  		System.out.println("Test case is passed");
	  	}
	  	else
	  	{
	  		System.out.println("Test is  failed");
	  	}
	  	Thread.sleep(5000);
	  		
	  		
	  	//post condn
	  	//logOut
	  	//browser close
	    driver.quit();
	  	System.out.println("browser is closed");
	  		
	  		
	  		//DOM Model issue
	  		//repeated code
	  		//code maintain issue
 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
