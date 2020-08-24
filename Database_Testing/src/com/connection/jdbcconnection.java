package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";//default

		String port= "3306";//default
		//automation is the database name
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/automation", "root", "Ram@4029");
		
		Statement s=con.createStatement();
		
		ResultSet rs=s.executeQuery("select * from Bank where Card_Type ='Credit_Card'");
		rs.next();//to get into the next index after header
		System.out.println(rs.getString("ussrNmae"));
		System.out.println(rs.getString("password"));
		
		while(rs.next())

		{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\com\\connection\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://login.salesforce.com");

		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("ussrNmae"));

		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
		String d=driver.getTitle();
		System.out.println(d);
		driver.close();

		}

		}

		}
		

