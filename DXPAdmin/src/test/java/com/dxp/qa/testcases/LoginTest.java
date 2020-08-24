package com.dxp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dxp.qa.base.Base;
import com.dxp.qa.pages.LoginPage;
import com.dxp.qa.pages.SignupPage;

public class LoginTest extends Base{
	LoginPage lp;
	SignupPage sp;
	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void Signup_test_init() throws IOException
	{
		initialize();
		sp=new SignupPage();
		lp=new LoginPage();
	}
	
	@Test
	public void logintest() throws IOException
	{
		sp.Signup().click();
		lp.Signup_Set(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@AfterMethod
	public void CloseBrowser()
	{
		d.close();
		
	}

}
