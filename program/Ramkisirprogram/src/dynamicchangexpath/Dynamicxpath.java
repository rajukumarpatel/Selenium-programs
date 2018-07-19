package dynamicchangexpath;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamicxpath {

	public static void main(String[] args)
	{
	 FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://www.rediff.com");
	    driver.findElement(By.xpath(".//*[@id='signin_info']/a[2]")).click();
  
	    driver.findElement(By.xpath("//input[contains(@ name,'name')]")).sendKeys("rajukumar");
	
	    driver.findElement(By.xpath("//input[contains(@ name,'login')]")).sendKeys("rajukumar@reddif.com");
	}

}
