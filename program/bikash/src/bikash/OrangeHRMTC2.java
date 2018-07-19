package bikash;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMTC2 {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new FirefoxDriver();
	 driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      String title= driver.getTitle();
     System.out.println(title);
       if (title.equals("OrangeHRM"))
       {
    	 System.out.println(title+ " is displayed");  }
       
      WebElement uname=  driver.findElement(By.xpath(".//*[@id='txtUsername']"));
      WebElement pass=  driver.findElement(By.xpath(".//*[@id='txtPassword']"));
      WebElement login=  driver.findElement(By.xpath(".//*[@id='btnLogin']"));
          if (uname.isDisplayed() & pass.isDisplayed() & login.isDisplayed())
         { 
        	  System.out.println(" uname is available");
        	  System.out.println(" pass is available");
        	  System.out.println(" login is availabe");}
          
           uname.clear();
           uname.sendKeys("opensourcecms");
           pass.clear();
           pass.sendKeys("opensourcecms");
           login.click();
           //mouse hover action
      WebElement  mouseaction=driver.findElement(By.xpath(".//*[@id='pim']/a/span"));
          Actions actions=new Actions(driver);
          actions.moveToElement(mouseaction).perform();
            //Thread.sleep(1000);
             driver.findElement(By.xpath(".//*[@id='pim']/ul/li[3]/a/span")).click();
             
             driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys("raju");
             driver.findElement(By.xpath(".//*[@id='middleName']")).sendKeys("kumar");
             driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys("patel");
             driver.findElement(By.xpath(".//*[@id='employeeId']")).sendKeys("1234");
             driver.findElement(By.xpath(".//*[@id='photofile']")).click();
             
                //autoit program
                 Thread.sleep(3000);
               
                 Runtime.getRuntime().exec("C:\\Users\\rajusingh\\Desktop\\UploadingFile.exe");
                   Thread.sleep(3000);
              WebElement sav= driver.findElement(By.xpath(".//*[@id='btnSave']"));
                 if( sav.isDisplayed())
                		 {
                  System.out.println("save button available ");
                		
                		 }
                 
            driver.findElement(By.xpath(".//*[@id='btnSave']")).click();    
	}


}
