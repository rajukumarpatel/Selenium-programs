package profile;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfileDacument {

	public static void main(String[] args)
	{
       ProfilesIni pr=new ProfilesIni();
       FirefoxProfile fp=pr.getProfile("rajusinghroy");
       FirefoxDriver driver=new FirefoxDriver(fp);
       
       driver.get("http://google.com");
       
       //click on gmail
       driver.findElement(By.linkText("Gmail")).click();
       String Actual=driver.getTitle();
       String Expected="Gmail";
       if(Actual.contains(Expected))
       {


       System.out.println("pass");
       }      
       else
       {
    	   System.out.println("fail");
       }
       
       
	}

}
