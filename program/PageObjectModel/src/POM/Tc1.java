package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc1

{ 
	WebDriver driver=new FirefoxDriver();
	 public Login page;
	 
	 @BeforeMethod
	  public void openTheBrowser()
	 {
		page=PageFactory.initElements(driver,Login.class);
		page.open("http://opensource.demo.orangehrmlive.com/");
		}
	 
	 @Test
	 public void orghrmlogin()
	 {
		page.login("Admin","admin");
		String title=page.getTitle();
		 System.out.println(title);
		 }
	 
    @AfterMethod
     public void closeTheBrowser()
    {
    	page.close(); 
    	}
    }
