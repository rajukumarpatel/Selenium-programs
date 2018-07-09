package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import GlobalFunc.AppFunc;
import Utilities.Constants;

public class EbankingARoleDeletion extends RootTest
{
    AppFunc ap=new AppFunc(gf);
	  @Test
	 public void ResetofNewRoles() throws FileNotFoundException, IOException, InterruptedException
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 
		 ap.ebankingARoleDeletion();
		  ap.Logout();
		  gf.closeBrowser();
		 
	 }
}

