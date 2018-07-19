package bikash;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class IsDisplayedEx {
	
	public static void main(String[] args){
		
	 WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com ");
	  
	  WebElement objlogin=driver.findElement(By.xpath(".//*[@id='u_0_2']"));
	   if(objlogin.isDisplayed())
	   {
		   System.out.println("Login button is available");
		    }
	   else
	   {
		   System.out.println("Login button is not available");
		   
	   }
	  

	}

}
