
package captureScreenShort;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenShort
{
@Test
public void takescreeshotfb() throws IOException
{   WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajukumarpate669@gmail.com");
     TakesScreenshot ts=(TakesScreenshot) driver;
	 File source= ts.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(source,new File("./screenshot/facebook.png"));
	  System.out.println("taken screenshoot");
	  
       driver.close();
	}

}
