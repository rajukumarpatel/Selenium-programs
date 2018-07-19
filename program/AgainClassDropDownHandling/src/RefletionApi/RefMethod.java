package RefletionApi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RefMethod
{ public static WebDriver driver;
	public  void Openapp()
	{
	   driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	  
	 public void LoginApp()
	 {
		 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajukumarpatel669@gmail.com");
		 driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("rajunirmala");
	     driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	 
	 }
	public void Closeapp()
	{
		driver.close();
		
	}

}
