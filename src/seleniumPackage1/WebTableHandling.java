package seleniumPackage1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\crome driver\\"
				+ "chromedriver_win32"+ "\\chromedriver.exe ");
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    
	  //selenium waits- implicit wait -globally applied means applied to all elements in script
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  		
	  	//singl element
//	  	WebElement columnn1= driver.findElement(By.xpath("//th[text()='Instructor']"));
//	  	System.out.println(columnn1.getText());
	  		
	    List<WebElement> columns = driver.findElements(By.xpath("//table//tbody//tr//th"));
	  	System.out.println(columns.size());
	  	    
	  		for(int i=0; i<columns.size(); i++)
	  		{
	  			System.out.println(columns.get(i).getText());
	  		}
	  		
	  		//rowwise data- celldata
	  		
	  	List<WebElement> allCellData = driver.findElements(By.xpath("//table//tbody//tr//td"));
	  	//size
	  	System.out.println(allCellData.size());
	  	
	  	for(int i=0; i<allCellData.size(); i++)
	  	{
	  		System.out.println(allCellData.get(i).getText());
	  	}
	  		
	  		   
	    
	}

}
