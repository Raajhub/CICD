package com.sdet;

import java.util.ResourceBundle;

public class App 
{
	public int userlogin (String un, String pwd)
	{

		ResourceBundle rb = ResourceBundle.getBundle("config");
		
		String user  = rb.getString("username");
		String paswd = rb.getString("password");
		
		if(un.equals(user) && pwd.equals(paswd))
			
				return 1;
			
		
			else
			
				return 0;
			
	}
}
