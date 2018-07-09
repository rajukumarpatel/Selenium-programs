package GlobalFunc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import GeneralMethods.GerneralFunc;

public class AppFunc 
{
	

	GerneralFunc gf;
	
	public AppFunc (GerneralFunc gf)
	{
		this.gf=gf;
		}
	File LocFile=new File("C:\\Users\\rajusingh\\seleniumworkspace\\Globalbank\\src\\objectRepository\\login.propFile");
	
	Properties p=new Properties();
	
	public void Loadpropfile() throws FileNotFoundException, IOException
	{
		p.load(new FileInputStream( LocFile));
		}
	public void login(String Username,String password)
	{
		
		String UsernameLoc=p.getProperty("un.text.loc");
		String PasswordLoc=p.getProperty("pwd.text.loc");
		String loginbtnLoc=p.getProperty("login.text.loc");
		
		gf.VerifyElementPresent("name", UsernameLoc);
		
		gf.sendKeys("name", UsernameLoc, Username);
		
		// verify password
  
		gf.VerifyElementPresent("name",PasswordLoc);
		
		gf.sendKeys("name", PasswordLoc, password);
		 gf.sleepThread(3000);
		 
		 gf.click("name", loginbtnLoc);
		 
		 gf.waitforPageToLoad();
		
	      }
	
	public void Logout()
	{
		gf.sleepThread(5000);
		
		gf.click("xpath",".//*[@id='Table_02'or @id='Table_01']/tbody/tr/td[3]/a/img");
		
	//	gf.click("xpath",".//*[@id='Table_01']/tbody/tr/td[3]/a/img");
		
	   }
	
	public void verifyLogin()
	{
		
	gf.verifyText("xpath", ".//*[@id='login']","Welcome to Admin ");
	}
	
	public void CreateBranch(String BN,String Add1,String Add2,String Add3 ,String Area)
	{
		gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img");
		gf.click("xpath"," .//*[@id='BtnNewBR']");
		
	     gf.sendKeys("xpath", ".//*[@id='txtbName']", BN);
		
		gf.sendKeys("xpath", ".//*[@id='txtAdd1']", Add1);
		gf.sendKeys("xpath", ".//*[@id='Txtadd2']", Add2);
		
		gf.sendKeys("xpath", ".//*[@id='txtadd3']", Add3);
		
	    gf.sendKeys("xpath", ".//*[@id='txtArea']", Area);
	    
		  
		gf.selectByValue("xpath", ".//*[@id='lst_counrtyU']", "INDIA");
		gf.selectByValue("xpath", ".//*[@id='lst_stateI']", "Delhi");
		
		gf.selectByValue("xpath", ".//*[@id='lst_cityI']", "Delhi");
		
		gf.click("xpath",".//*[@id='btn_insert']"); 
		gf.selectalert();
		
	}
	    public void ResetOFNewbranch(String BN,String Add1,String Add2,String Add3 ,String Area)
	    {
	    	gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img");
			gf.click("xpath"," .//*[@id='BtnNewBR']");
			
		     gf.sendKeys("xpath", ".//*[@id='txtbName']", BN);
			
			gf.sendKeys("xpath", ".//*[@id='txtAdd1']", Add1);
			gf.sendKeys("xpath", ".//*[@id='Txtadd2']", Add2);
			
			gf.sendKeys("xpath", ".//*[@id='txtadd3']", Add3);
			
		    gf.sendKeys("xpath", ".//*[@id='txtArea']", Area);
		    
			  
			gf.selectByValue("xpath", ".//*[@id='lst_counrtyU']", "INDIA");
			gf.selectByValue("xpath", ".//*[@id='lst_stateI']", "Delhi");
			
			gf.selectByValue("xpath", ".//*[@id='lst_cityI']", "Delhi");
			
			
		      gf.click("xpath",".//*[@id='Btn_Reset']"); 
		      
			 // gf.selectalert();   
			
	    }
	    
	     public void NewBranchUpdation(String Bname,String Add1,String Add2,String area)
	     {
	     gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img");
	     gf.click("xpath"," .//*[@id='DG_bankdetails']/tbody/tr[3]/td[7]/a/img");
	    
	     gf.sendKeys("xpath", ".//*[@id='txtbnameU']",Bname);
	     
	     gf.sendKeys("xpath", ".//*[@id='txtadd1u']",Add1);
	     gf.sendKeys("xpath", ".//*[@id='txtadd2u']",Add2);
	     
	    // gf.sendKeys("xpath", ".//*[@id='txtadd3U']",Add3);
	     
	     gf.sendKeys("xpath", ".//*[@id='txtareaU']",area);
	     
	     
	     gf.selectByValue("xpath", ".//*[@id='drlst_countryU']", "INDIA");
	     gf.selectByValue("xpath", ".//*[@id='lst_stateU']", "Delhi");
	     gf.selectByValue("xpath", ".//*[@id='LST_cityU']", "Delhi");
	     
	     gf.click("xpath",".//*[@id='btnupdate']");
	     
	     gf.selectalert(); 
	     
	     }
	     
	     public void EAbranchesBDeletion()
	     {
	      gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img");
		
		  gf.click("xpath",".//*[@id='DG_bankdetails']/tbody/tr[3]/td[8]/a/img");
		  
		  gf.selectalert();
	    	 
	    	 
	     }
	public void CreateNewRole(String name,String desig)
	{
		gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img");
		gf.click("xpath",".//*[@id='btnRoles']");
		
		 gf.sendKeys("xpath", ".//*[@id='txtRname']", name);
		gf.sendKeys("xpath", ".//*[@id='txtRDesc']", desig);
		
		gf.selectByValue("xpath", ".//*[@id='lstRtypeN']","E");
			
		gf.click("xpath",".//*[@id='btninsert']"); 
		gf.selectalert();
		
		}
	public void resetOfNewRole(String name,String desig)
	{
		gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img");
		gf.click("xpath",".//*[@id='btnRoles']");
		
		 gf.sendKeys("xpath", ".//*[@id='txtRname']", name);
		gf.sendKeys("xpath", ".//*[@id='txtRDesc']", desig);
		
		gf.selectByValue("xpath", ".//*[@id='lstRtypeN']","E");
			
		gf.click("xpath",".//*[@id='Btn_Reset']"); 
		
		
		}
	
	public void ebankingARoleUpdation(String rolename,String roledesig)
	{
	gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img");
	gf.click("xpath",".//*[@id='DGRoles']/tbody/tr[2]/td[4]/a/img");	
	
	
	 gf.sendKeys("xpath", ".//*[@id='txtrNameU']",rolename);
	 gf.sendKeys("xpath", ".//*[@id='txtrdescU']",roledesig);
	 
	 gf.selectByValue("xpath", ".//*[@id='lstRtype']", "E");
	 gf.click("xpath",".//*[@id='btnupdate']");
	 
	 gf.selectalert();
	}
	public void ebankingARoleDeletion()
	{
    gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img");
	
    gf.click("xpath",".//*[@id='DGRoles']/tbody/tr[2]/td[5]/a/img");	
	
    gf.selectalert();
    gf.selectalert();
	}
	
	public void createNewUser (String cname,String uname,String Lpassword,String Tpassword)
	{
		gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img");
		gf.click("xpath",".//*[@id='Btnuser']");
		
		gf.selectByValue("xpath",".//*[@id='lst_Roles']","mannam");
		gf.selectByValue("xpath",".//*[@id='lst_Branch']", "123");
		//gf.selectByValue("xpath",".//*[@id='DrCName']","");
		
		gf.sendKeys("xpath",".//*[@id='Lbc_name']", cname);
		gf.sendKeys("xpath", ".//*[@id='txtUname']", uname);
		gf.sendKeys("xpath", ".//*[@id='txtLpwd']", Lpassword);
		gf.sendKeys("xpath",".//*[@id='txtTpwd']",  Tpassword);
		
		//gf.click("xpath", ".//*[@id='BtnSubmit']");
		gf.click("xpath", ".//*[@id='Panel1userinputs']/table[2]/tbody/tr/td[2]");
		 //gf.selectalert();
	    }
	   public void newEmployeereation(String emname,String pass)
	    {
		 gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img");
		 gf.click("xpath",".//*[@id='BtnNew']");
		 
		 gf.sendKeys("xpath", ".//*[@id='txtUname']",emname );
		 gf.sendKeys("xpath", ".//*[@id='txtLpwd']",pass);
		 
		 gf.selectByValue("xpath", ".//*[@id='lst_Roles']","ragini");
		 gf.selectByValue("xpath", ".//*[@id='lst_Branch']","123");
		 
		// gf.click("xpath",".//*[@id='BtnSubmit']");
		 
		   gf.click("xpath",".//*[@id='btnreset']");
		 
		// gf.selectalert();
			
	    }
	   
	   public void employeeUpdation(String emname,String pass)
	   {
	    gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img");
		gf.click("xpath",".//*[@id='DGBanker']/tbody/tr[2]/td[6]/a/img");  
	  
	    gf.sendKeys("xpath",".//*[@id='txtBnameU']",emname );
	    gf.sendKeys("xpath",".//*[@id='txtPwdU']",pass );
	    
	    gf.selectByValue("xpath", ".//*[@id='lstrolesU']","ragini");
	    gf.selectByValue("xpath", ".//*[@id='lstBidU']", "123");
	   
	    gf.click("xpath",".//*[@id='BtnUpdate']");
	    gf.selectalert();
	   }
	   
	   public void employeeDeletion()
	   {
		gf.click("xpath", ".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img");
		gf.click("xpath",".//*[@id='DGBanker']/tbody/tr[2]/td[7]/a/img");   
	   
		gf.selectalert();
		gf.selectalert();
		
	   
	   }
}
