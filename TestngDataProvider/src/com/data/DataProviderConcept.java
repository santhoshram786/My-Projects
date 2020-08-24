package com.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.TestUtil;


public class DataProviderConcept {
	WebDriver d;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Malkari Santhosh\\Documents\\jar files\\chromedriver_latest\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		//d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	@DataProvider
	public Iterator<Object[]> getdata() throws IOException
	{
		ArrayList<Object[]> testdata=TestUtil.getexceldata();
		return testdata.iterator();
	}
	@Test(dataProvider="getdata")
	public void testcase(String plang) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)d;
		d.get("https://google.com");
		String title=d.getTitle();
		System.out.println(title);
		d.findElement(By.name("q")).clear();
		d.findElement(By.name("q")).sendKeys(plang);
		//to scroll down
		js.executeScript("window.scrollBy(0,1000)");
		//to scroll up
		//js.executeScript("window.scrollBy(0,-1000)");
		d.findElement(By.name("btnK")).click();
		d.navigate().back();
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void close()
	{
		d.close();
	}
}
