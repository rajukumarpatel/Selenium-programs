package DatadrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainmethod 
{
	static WebDriver  driver;
public static void main(String[] args) 
	{ 
	  driver= new FirefoxDriver();
       driver.get("https://www.google.com/gmail/about/#");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Login_Action.execute(driver);
	
	
	}

}
