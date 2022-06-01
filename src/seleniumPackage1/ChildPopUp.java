package seleniumPackage1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\"
				+ "chromedriver_win32"+ "\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	  //website open
	  		driver.get("https://vctcpune.com/");
	  		
	  		//to get main page address
	  		String mainPageAddress = driver.getWindowHandle();
	  		
	  		System.out.println("MainPage-"+mainPageAddress);
	  		

//	  		//click on button
	  		WebElement startLink = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
	  		startLink.click();
	  		
	  		//will not use set concept-since index problem
//	  	    Set<String> allPageAddresses =  driver.getWindowHandles();
//	  		System.out.println("AllPageAddresses-"+allPageAddresses);
	  		
	  		//we will use List concept

//	  		int x = 100;
//	  		double y = (double) x;
	  		
	  	    List<String> allPageAddresses = new ArrayList<String>(driver.getWindowHandles());
	  		System.out.println(allPageAddresses);
	  		
//	  		//switch selenium focus on next page-childpage
	          driver.switchTo().window(allPageAddresses.get(1));

//	  		//went on next page
	  		WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	  		textBox.sendKeys("India");
	  		
	  		System.out.println("end of program");

		
	}

}
