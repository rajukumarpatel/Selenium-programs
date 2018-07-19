package crossbrowsin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBtesting 
{
  
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void gettext(String browserName)
	{
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajusingh\\Desktop\\jar\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	}


