package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class NewEmployeereations extends RootTest
{
	 AppFunc ap=new AppFunc(gf);
	  @Test
	 public void NewEmoloyCreation() throws FileNotFoundException, IOException, InterruptedException
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 
		 ap.newEmployeereation("rajYadave","53426");
		 ap.Logout();
		 gf.closeBrowser();
		 
	 }
	  
	   
	 
}

