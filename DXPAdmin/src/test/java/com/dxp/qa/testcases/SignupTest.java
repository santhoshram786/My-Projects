package com.dxp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dxp.qa.base.Base;
import com.dxp.qa.pages.SignupPage;

public class SignupTest extends Base{
	
	SignupPage sp;
	public SignupTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void Signup_test_init() throws IOException
	{
		initialize();
		sp=new SignupPage();
	}
	
	@Test
	public void signup_test()
	{
		sp.Signup().click();
	}
	@AfterMethod
	public void CloseBrowser()
	{
		d.close();
		
	}

}
