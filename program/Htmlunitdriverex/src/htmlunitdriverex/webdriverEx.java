package htmlunitdriverex;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class webdriverEx
{

	public static void main(String[] args) 
	{
     HtmlUnitDriver driver=new HtmlUnitDriver();
             driver.get("http://google.com");
             
             String name=driver.getTitle();
             System.out.println(name);
             

	}

}
