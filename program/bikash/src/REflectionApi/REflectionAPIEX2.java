package REflectionApi;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class REflectionAPIEX2 
{

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
      String kword="WD";
      String kword1="MT";
      Method m1= REflectionapiEX.class.getMethod(kword);
      m1.invoke(m1);
      Method m= REflectionapiEX.class.getMethod(kword);
		m.invoke(m);
	}
}
