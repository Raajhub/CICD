package com.sdet;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest
{
	App myApp = new App(); //priority=0
	
	@Test(enabled=true)
	void negative_testLogin()
	{
		System.out.println("Validating negative scenario - - - ");
		AssertJUnit.assertEquals(0, myApp.userlogin("test", "tets123"));
	}
	
	@Test(enabled=false)
	void positive_test_Login()
	{
		System.out.println("Validating Positive scenario+ + + + ");
		AssertJUnit.assertEquals(1, myApp.userlogin("test", "test@123"));
		
	}
}

