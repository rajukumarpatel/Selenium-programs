package RefletionApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class AppCalling 
{
   
	@Test
	
	public void appcall() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		RefMethod rm=new RefMethod();
		 // rm.Openapp();
		//  rm.LoginApp();
		 // rm.Closeapp();
		
		  String s="Openapp";
		 // Method  m=RefMethod.class.getMethod(s);
		  Method m=rm.getClass().getMethod(s);
		   m.invoke(s);
	}
	
}
