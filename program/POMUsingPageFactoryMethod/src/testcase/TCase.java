package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pageobjectmodel.Loginpage;

public class TCase 
{  
	@Test
   public void checkvalid()
   {
	WebDriver driver=BrowserFactory.startbrowser("firefox","http://demosite.center/wordpress/wp-login.php");
	
	 Loginpage	login_page=PageFactory.initElements(driver, Loginpage.class);
	 login_page.verifyLogin("admin","demo123");  
   }
}
