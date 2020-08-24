package com.testing.framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;
import org.apache.logging.log4j.*;
public class HomePageTest extends Base {
	
	public static Logger log=LogManager.getLogger(HomePageTest.class.getName());
	LandingPage lp;
	@BeforeTest
	public void init() throws IOException
	{
		d=initialize();
		log.info("Driver is initilized");
		d.get("http://qaclickacademy.com/");

	}


	@Test(priority=1)
	public void Navigation() throws IOException 
	{
		
	
		lp=new LandingPage(d);
		String f_text=lp.f().getText();
		System.out.println(f_text);
				
		
	}
	
	@Test(priority=2)
	public void validate_text_registor()
	{
		lp=new LandingPage(d);
		String text=lp.text().getText();
		System.out.println(text);
		Assert.assertEquals(text, "Register");
	
	}
	
	
	@Test(priority=3,dataProvider="getdata")
	public void login_page_data(String username,String password)
	{
		lp.Login().click();
		LoginPage lop=new LoginPage(d);
		lop.email().clear();
		lop.email().sendKeys(username);
		lop.password().clear();
		lop.password().sendKeys(password);
		lop.login().click();
		d.get("http://qaclickacademy.com/");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="abc@wq.com";
		data[0][1]="123456";
		
		data[1][0]="cds@we.com";
		data[1][1]="1233334";
		
		return data;
	}
	@AfterTest
	public void close_browser()
	{
		d.close();
		d=null;
	}

}
