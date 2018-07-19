package screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class screenshotUtility 
{
	@Test
	public static void screenshot()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    
	}

}
