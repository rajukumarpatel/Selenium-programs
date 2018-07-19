package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class TC3 extends RootTest
{


	AppFunc ap=new AppFunc(gf);
	 
	 @Test
	 public void VerifyBranchCreation() throws FileNotFoundException, IOException, InterruptedException
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 
		 // ap.verifyLogin();
		 ap.CreateNewRole("raju","developer");
		 Thread.sleep(3000);
		  ap.Logout();
		  gf.closeBrowser();
		 
	 }
}
