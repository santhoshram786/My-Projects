package com.data;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DropDownListSortedOrNot {

	  public static void main(String[] args) throws InterruptedException
	   {
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Malkari Santhosh\\Documents\\jar files\\chromedriver_latest\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      driver.get("http://www.ebay.in/");
      Thread.sleep(3000);  
      WebElement element = driver.findElement(By.id("gh-cat"));
      element.click();
      List<WebElement> dropDownvalues = element.findElements(By.tagName("option"));
      ArrayList<String> listValues = new ArrayList<String>();
      for(WebElement value : dropDownvalues) {
         System.out.println("values are"+ value.getText());
         listValues.add(value.getText());
      }
      boolean sortedOrNot = sortedOrNot(listValues);
      assertEquals(true, sortedOrNot);
      driver.close();
   }
   public static boolean sortedOrNot(ArrayList<String> dropDownValues) {
      System.out.println("number of values "+ dropDownValues.size());
      for(int i=0; i<dropDownValues.size();i++) {
         int temp = dropDownValues.get(i).compareTo(dropDownValues.get(i+1));
         if(temp>1) {
            System.out.println("i value"+i);
            return false;
         }
      }
      return true; 
   }
}
