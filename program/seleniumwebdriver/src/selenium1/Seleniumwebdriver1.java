package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Seleniumwebdriver1 
{

public static void main(String[] args)
	{
	
    System.setProperty("webdriver.chrome.driver", "C:\\seleniumwebdriver\\chromedriver_win32\\chromedriver.exe");
	   
	 WebDriver driver=new ChromeDriver();
	 
	        driver.get("http://www.google.com");
	       driver.manage().window().maximize();
	 
	       System.out.println(driver.getTitle());
	       
	       driver.get("http://www.facebook.com");
	       // driver.close();
	       

	}

}
