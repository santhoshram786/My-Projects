package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public 	WebDriver d;
	public Properties prop;
	public WebDriver initialize() throws IOException {
		// TODO Auto-generated method stub
		
		prop=new Properties();
		//tokeep the path constant in any machine we use System.getProperty("user.dir")
		//FileInputStream ip=new FileInputStream("C:\\Users\\Malkari Santhosh\\Automation-Framework\\src\\main\\java\\resources\\Data.properties");
		FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.properties");
		prop.load(ip);
		//to run as a maven command use System.getProperty
		//mvn test -Dbrowser=chrome
		
		//String browserName= System.getProperty("browser");
		
		//to get the properties from the properties file use the below syntax
		String browserName=prop.getProperty("browser");
		
		if(browserName.contains("chrome"))
		{
			ChromeOptions o=new ChromeOptions();
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			if(browserName.contains("headless"))
			{
				o.addArguments("--headless");
			}
			
			d=new ChromeDriver(o);
			//d.manage().window().maximize();
			
		}
		else if(browserName.equals("firefox"))
		
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
				d=new FirefoxDriver();
			
		}
		else if (browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
			//WebDriver d=new IEDriver();
		}
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return d;
		
		

	}
	public void getScreenshot(String result) throws IOException
	{
//		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
//		
//		File dest=new File("S:\\selenium tuto\\Framework Design\\"+result+ "screenshot.png");
//		
//		FileUtils.copyFile(src, dest);
		
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("S:\\selenium tuto\\Framework Design\\"+result+ "screenshot.png"));
	}

}
