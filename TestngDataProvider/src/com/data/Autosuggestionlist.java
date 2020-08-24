package com.data;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Autosuggestionlist 
{
   public static void main(String[] args) throws InterruptedException
   {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Malkari Santhosh\\Documents\\jar files\\chromedriver_latest\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.get("http://www.google.com/");
      driver.findElement(By.name("q")).sendKeys("mobile");
      Thread.sleep(2000);
      String xp="//ul/li//a[contains(text(),'mobile')]";
    //*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/ul
      List<WebElement> allMobiles = driver.findElements(By.xpath("//li[@role=\"presentation\"]"));
      for(WebElement mobile:allMobiles)
      {
         System.out.println(mobile.getText());
      }
      driver.quit();
   }
}