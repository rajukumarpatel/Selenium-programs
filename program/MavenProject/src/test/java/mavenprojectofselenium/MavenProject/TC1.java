package mavenprojectofselenium.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC1 
{
	
@Test
public void OpenFB()

{  
	WebDriver driver=new FirefoxDriver();

	  driver.get("https://www.facebook.com/");
	
}
	

}
