package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class TC1 extends RootTest
{
 AppFunc ap=new AppFunc(gf);
 
 @Test
 public void AdminLogin() throws FileNotFoundException, IOException
 {
	 gf.startBrowserFirefox("http://bank.uftselenium.com/");
	 
	 gf.maximixeBrowser();
	 
	 ap.Loadpropfile();
	 
	 ap.login(Constants.Uname,Constants.pword);
	 
	  ap.Logout();
	  gf.closeBrowser();
 }
 

}
