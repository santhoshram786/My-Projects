package com.dxp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dxp.qa.base.Base;

public class LoginPage extends Base{
	
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(d, this);
	}



	@FindBy(id="email")
	WebElement email_id;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement submit;
	
	
	public WebElement Email()
	{
		return email_id;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Submit()
	{
		return submit;
	}
	
	
	
	public HomePage Signup_Set(String us,String pw) throws IOException
	{
		email_id.sendKeys(us);
		password.sendKeys(pw);
		submit.click();
		
		return new HomePage();
	}

}
