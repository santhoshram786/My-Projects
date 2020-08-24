package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver d;
	
	By email=By.id("user_email");
	By password=By.id("user_password");
	//By login_button=By.name("commit");
	
	@FindBy(name="commit")
	WebElement login;
	
	  /****
	   * 
	   * @FindBy(how = How.ID, using = "username")
	private WebElement username;

	OR

	@FindBy(id="username")
	private WebElement userName;

	OR

	@FindBy(className=".input.username")
	private WebElement username;
	   */
	public LoginPage(WebDriver d) {
		
		// TODO Auto-generated constructor stub
		
		this.d=d;
		PageFactory.initElements(d, this);
	}


	public WebElement email()
	{
		return d.findElement(email);
	}
	
	
	public WebElement password()
	{
		return d.findElement(password);
		
	}
	
	public WebElement login()
	{
		return login;
	}
	

}
