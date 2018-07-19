package DynamicWebelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dynamic 
{
	@Test
	public void Dynamicelement() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("rajukumarpatel669@gmail.com");
        driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
         Thread.sleep(4000);
        driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("123456789raju");
        driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath(".//*[@id=':ac']/div/div")).click();
	    driver.findElement(By.xpath(".//div[starts-with(@id,':')]/h2/div[2]")).click();
	
	    driver.close();
	}

}
