package DatadrivenFramework;

import org.openqa.selenium.WebDriver;

public class Login_Action
{
	public static void execute(WebDriver driver)
	{
		 Loginpage.text_singin(driver).click();
		
		Loginpage. text_Email(driver).sendKeys("rajukumarpatel669@gmail.com");
		Loginpage.text_next(driver).click();
		
		Loginpage.text_enterpass(driver).sendKeys("123456789raju");
		
		Loginpage.text_nextlast(driver).click();
	}

}
