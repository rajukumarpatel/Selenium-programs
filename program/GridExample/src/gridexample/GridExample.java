package gridexample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridExample
{ WebDriver driver;
  String BaseURL;
  String NodeURL;
  DesiredCapabilities capability;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		BaseURL ="https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login";
		NodeURL="http://192.168.43.48:4444/wd/hub";
		capability=DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		
		capability.setPlatform(Platform.ANY);
		
		driver=new RemoteWebDriver(new URL(NodeURL),capability);
		
	}
	
	@Test
	public void ApplicationAccess()
	{
		driver.get(BaseURL);
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("opensourcecms");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("opensourcecms");
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
	}
	
	@AfterTest
	public void closeapp()
	{
      driver.quit();
	}

} //open tow cmd one for hub and one for node
 //for starting hub===java -jar selenium-server-standalone-2.53.0.jar -role hub
 // for starting node===java -jar selenium-server-standalone-2.53.0.jar -role node  -hub http://192.168.43.48:4444/wd/hub



