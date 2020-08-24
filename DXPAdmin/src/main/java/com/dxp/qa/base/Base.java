package com.dxp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver d;

	public static Properties prop;

	public Base() throws IOException {
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\dxp\\qa\\config\\config.properties");

		prop = new Properties();

		prop.load(ip);

	}

	public static void  initialize() {
		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			ChromeOptions o = new ChromeOptions();

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\dxp\\qa\\config\\chromedriver.exe");
			if (browserName.contains("headless")) {
				o.addArguments("--headless");
			}

			d = new ChromeDriver(o);
			// d.manage().window().maximize();

		} else if (browserName.equals("firefox"))

		{
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\dxp\\qa\\config\\geckodriver.exe");
			d = new FirefoxDriver();

		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\dxp\\qa\\config\\IEDriverServer.exe");
			// WebDriver d=new IEDriver();
		}
		//d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://automationpractice.com/index.php");
		

	}

}
