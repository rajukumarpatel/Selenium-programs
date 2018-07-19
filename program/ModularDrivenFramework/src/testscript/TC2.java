package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC2
{
	@Test
	public  void verifylogin()
	   {
		   WebDriver driver=new FirefoxDriver();
		     driver.get("");
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
	   }
}
