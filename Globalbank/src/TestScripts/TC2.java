package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class TC2 extends RootTest 
{
	AppFunc ap=new AppFunc(gf);
	 
	 @Test
	 public void VerifyBranchCreation() throws IOException
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 
		 
		 ap.CreateBranch("Dolara", "karma","karma2","karma1","allahabad");
		  ap.Logout();
		  gf.closeBrowser();
		 
	 }
}
