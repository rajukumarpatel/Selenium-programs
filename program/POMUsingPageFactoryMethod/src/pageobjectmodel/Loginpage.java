package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage
{  WebDriver driver;
   public Loginpage(WebDriver Idriver)
	{
		this.driver=Idriver ;
		
	}
  @FindBy(xpath=".//*[@id='user_login']")
  @CacheLookup
  WebElement username;
  
  @FindBy(id="user_pass")
  @CacheLookup
  WebElement password;
  @FindBy(how=How.XPATH,using=".//*[@id='wp-submit']")
  @CacheLookup
  WebElement submit_login;
  
    public void verifyLogin(String un,String pass)
    {
    	 username.sendKeys(un);
    	 password.sendKeys(pass);
    	 submit_login.click();
    }
    
     
}
