package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\crome driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String url= "the-internet.herokuapp.com/basic_auth";;
		String username= "admin";
		String password= "admin";
		String mainurl= "https://"+username+":"+password+"@"+url;
		driver.get(mainurl); 
		
	}

}
