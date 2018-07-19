package bikash;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMTC1 {
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new FirefoxDriver();
driver.navigate().to("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
  String title  = driver.getTitle();
   //System.out.println(title);
     if(title.equals("OrangeHRM"))
     {
    	System.out.println(title+"is Displayed"); 
     }
      
    WebElement element= driver.findElement(By.xpath(".//*[@id='txtUsername']"));
    WebElement element1 = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
    WebElement element2=driver.findElement(By.xpath(".//*[@id='btnLogin']"));

      if (element.isDisplayed() & element1.isDisplayed() & element2.isDisplayed())
      {
		System.out.println("User name is available");
		System.out.println(" password is available");
		System.out.println(" login is available");
      }
      
             element.clear();
		element.sendKeys("opensourcecms");
		     element1.clear();
		  element1.sendKeys("opensourcecms");
		  element2.click();
	
      
       
      title=driver.getTitle();
       System.out.println(title);
        if (title.equals("OrangeHRM")) {
	System.out.println(title+"Admin page is displayed");
        }
	   String wel=driver.findElement(By.xpath(".//*[@id='welcome']")).getText();
	
        if (wel.equals("Welcome Admin")) {
        	System.out.println(wel+"is Displayed");
        	}
             Thread.sleep(3000);
       driver.findElement(By.xpath(".//*[@id='welcome']")).click();
      
       driver.findElement(By.linkText("Logout")).click();
       
        title=driver.getTitle();
        
        System.out.println(title);
          if (title.equals("OrangeHRM"))
          {
        	System.out.println("logout is completed");  
        	 System.out.println(title+"is displayed");
        	  
          }
             driver.close();
             driver.quit();
             System.out.println("close the object");
}}
