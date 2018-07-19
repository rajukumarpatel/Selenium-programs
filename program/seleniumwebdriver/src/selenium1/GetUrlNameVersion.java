package selenium1;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetUrlNameVersion
{
public static void main(String[] args)
{
	WebDriver driver=new FirefoxDriver();
	 Capabilities cap= ((RemoteWebDriver)driver).getCapabilities();
	 
	   String BrowserName=cap.getBrowserName();
	   String BrowserVersion=cap.getVersion();
	   
	   System.out.println("Browser Name ="+BrowserName);
	   
	   System.out.println("Browser Version ="+BrowserVersion);

	}

}
