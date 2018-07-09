package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class NewUsercreation extends RootTest
{
	 AppFunc ap=new AppFunc(gf);
	  @Test
	 public void NewUserCreation() throws FileNotFoundException, IOException, InterruptedException
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 ap. createNewUser("Raj","Rajkumar","26354","263543");
		 ap.Logout();
		 gf.closeBrowser();
		 
	 }
	  
	 
}

