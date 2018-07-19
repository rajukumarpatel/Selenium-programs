package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage
{
  @Test
  public void OranghrmLogin()
  { WebDriver driver=new FirefoxDriver();
     driver.get("http://opensource.demo.orangehrmlive.com/");
     driver.manage().window().maximize();
     
     VerifyLogin login=new VerifyLogin(driver);
     login.userName();
     login.password();
     login.loginbtn();
     login.Closeapp();
     
	  
	  
  }
}
