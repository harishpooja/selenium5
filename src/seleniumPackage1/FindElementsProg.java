package seleniumPackage1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsProg 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\"
				+ "chromedriver_win32"+ "\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
System.out.println("broswer is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		//selenium waits- implicit wait -globally applied means applied to all elements in script
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input"));
		username.sendKeys("standard_user");
		System.out.println("USername is entered");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
		password.sendKeys("secret_sauce");
		System.out.println("Password is entered");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		System.out.println("Clicked on login button");
		
		//single product return
//		WebElement bagProduct = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
//		bagProduct.click();
		
		//at a time all products select
		
		//multiple products
		
	     List<WebElement>  allProducts = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		
	         allProducts.get(0).click();
	         allProducts.get(1).click();
	         allProducts.get(2).click();
	         allProducts.get(3).click();
	         allProducts.get(4).click();
	         allProducts.get(5).click();
	         
	         for(int i =0; i<allProducts.size();i++)
	         {
	        	 allProducts.get(i).click();
	         }
	    
	         //assingment --> add the validation
	     System.out.println("Multiple products added to cart");
	     
	     System.out.println("check the test case");
	     
//	     if
//	     else
	    	 System.out.println("test is passed");
	
	    
	}
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   