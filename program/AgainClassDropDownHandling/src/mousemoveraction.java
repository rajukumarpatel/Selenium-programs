import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemoveraction {

	public static void main(String[] args) 
	{
      WebDriver driver = new FirefoxDriver();
         driver.get("http://opensource.demo.orangehrmlive.com/");
         driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
         driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
         driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
     WebElement wb= driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']/b"));
        Actions ac=new Actions(driver);
          ac.moveToElement(wb).perform();

	}

}
