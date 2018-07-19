package MultiwindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiwindowHandle 
{  public static String fr;
//not run
	 public static void main(String ss[])
	 {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bharatstudent.com/");
		driver.findElement(By.xpath(".//*[@id='u_0_1']/table/tbody/tr/td[2]/span/span")).click();
		/*    Set<String> wb=driver.getWindowHandles();
		  Iterator<String> itr=wb.iterator();
		  
		    while(itr.hasNext())
		    {
		    	 fr=itr.next();
		    }
		    
		    driver.switchTo().window(fr);  */
	 }

}
