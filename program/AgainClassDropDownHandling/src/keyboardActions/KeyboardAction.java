package keyboardActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAction 
{
	@Test
	public void Keyboard() throws InterruptedException
	{
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://spicejet.com");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	Thread.sleep(4000);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	a.keyDown(Keys.ALT).sendKeys(Keys.F1).build().perform();
}
}
