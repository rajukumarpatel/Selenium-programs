package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerEX {

	public static void main(String[] args) 
	{
		System.setProperty(" webdriver.ie.driverr", "C:\\Users\\rajusingh\\Desktop\\jar\\IEDriverServer_x64_3.11.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		 driver.get("http://www.google.com");
	driver.manage().window().maximize();
	  driver.get("http://www.facebook.com");
	    

	}

}
