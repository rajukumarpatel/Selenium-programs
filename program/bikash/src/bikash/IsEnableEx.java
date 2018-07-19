package bikash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnableEx {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	
	   driver.get("https://www.google.co.in/");
Boolean b= driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).isEnabled();

       System.out.println(b);
	}

}
