package com.dxp.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dxp.qa.base.Base;

public class HomePage extends Base{
	
	
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(d, this);
	}

	@FindBy(css="#contact-link > a")
	WebElement contactus;
	
	public WebElement Contacts()
	{
		return contactus;
	}
}
