package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsExample
{
  
	@Test
	public void openapp()
	{
		WebDriver driver =new FirefoxDriver();
		  driver.get("http://facebook.com");
		
		
		
	}
	@Test
	public void openapp1()
	{
		WebDriver driver =new FirefoxDriver();
		  driver.get("http://facebook.com");
	}
		
}
