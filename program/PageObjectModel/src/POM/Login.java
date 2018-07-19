package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Login
{
	public WebDriver driver;
	
	
	@FindBy(xpath=".//*[@id='txtUsername']")
	
	public WebElement objun;
	@FindBy(xpath=".//*[@id='txtPassword']")
	
	public WebElement objpwd;
	
	@FindBy(xpath=".//*[@id='btnLogin']")
	
	public WebElement objsubmit;
	
    public Login( WebDriver driver)
	{
    	this.driver=driver;
    	}
 public void open(String url)
 {
	  driver.get(url);
	  }
      public  void close()
      {
		driver.quit();
		}
  public String getTitle()
  {
return driver.getTitle();
}
	public void login(String un,String pwd)
	{ 
		objun.sendKeys(un);
		objpwd.sendKeys(pwd);
		objsubmit.click();
		}
	}
