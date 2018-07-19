package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage
{
	@Test
   public void VerfiyLogin()
   {
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://demosite.center/wordpress/wp-login.php");
	   
	   VerfiyLogin login=new VerfiyLogin (driver);
	    
	    login.typeuserName();
	    login.typepassword();
	    login.typelogin();
	   
	    driver.quit();
	   
   }
}
