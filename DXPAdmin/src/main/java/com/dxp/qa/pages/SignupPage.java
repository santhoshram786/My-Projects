package com.dxp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dxp.qa.base.Base;

public class SignupPage extends Base{
	
	public SignupPage() throws IOException {
		super();
		PageFactory.initElements(d, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	WebElement signup;
	
	public WebElement Signup()
	{
		return signup;
	}

}
