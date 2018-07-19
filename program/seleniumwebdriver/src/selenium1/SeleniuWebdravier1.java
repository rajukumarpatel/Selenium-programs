package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class SeleniuWebdravier1 {

	public static void main(String[] args) 
	{
	
        WebDriver driver=new FirefoxDriver();
	    //driver.get("http://www.google.com");
	     driver.manage().window().maximize();
	     driver.get("http://www.facebook.com");
	     driver.findElement(By.id("email")).sendKeys("rajukumarpatel669@gmail.com");
	     driver.findElement(By.id("pass")).sendKeys("nirmalaraju");
	     
	     
	    // driver.findElement(By.id("pass")).clear();;
	     
	     
	    // driver.findElement(By.id("u_0_2")).click();
	     driver.findElement(By.name("firstname")).sendKeys("raju");
	     driver.findElement(By.name("lastname")).sendKeys("patel");
	     driver.findElement(By.xpath(".//*[@id='u_0_p']")).sendKeys("8858031479");
	     driver.findElement(By.name("reg_passwd__")).sendKeys("rajukumar12345");
	     
	    
	    WebElement ojd=driver.findElement(By.id("day"));
	     Select sc=new Select(ojd);
	         
	     
	     
	                                                                                                                               
	         sc.selectByIndex(2);
	       //  sc.selectByValue("day");
	         //sc.deselectByVisibleText("2");
	         
	         WebElement ojd1=driver.findElement(By.name("birthday_month"));
		     Select sc1=new Select(ojd1);
		           sc1.selectByVisibleText("Mar");

		     WebElement ojd3=driver.findElement(By.xpath(".//*[@id='year']"));
		     Select s=new Select(ojd3);
		          s.selectByVisibleText("2004");
		     
		     
          driver.findElement(By.xpath(".//*[@id='u_0_10']/span[1]/label")).click();
	      driver.findElement(By.xpath(".//*[@id='u_0_12']")).click();
                
	}

}

