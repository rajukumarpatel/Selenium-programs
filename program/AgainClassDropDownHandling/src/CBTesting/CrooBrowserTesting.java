package CBTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrooBrowserTesting 
{
	WebDriver driver;
	@Parameters("browser")
	@Test
    public void openapp(String BrowserName)
	{ 
	if(BrowserName.equalsIgnoreCase("firefox"))
		{   
		    driver=new FirefoxDriver();
			driver.manage().window().maximize();
			}
		else if(BrowserName.equalsIgnoreCase("chrome"))
		{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajusingh\\Desktop\\jar\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
			  }
		   driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
	       driver.close();
	
	}

}
