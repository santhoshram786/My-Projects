package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver d;
	
	private By signin=By.cssSelector("a[href*=\"sign_in\"]");
	
	private By text=By.cssSelector("a[href*=\"sign_up\"]");
	
	@FindBy(css="#content>div>div")
	WebElement features_text;
	
	public LandingPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.d=d;
		PageFactory.initElements(d, this);
	}

	public WebElement Login()
	{
		return d.findElement(signin);
	}
	
	public WebElement text()
	{
		return d.findElement(text);
	}

	public WebElement f()
	{
		return features_text;
	}
}
