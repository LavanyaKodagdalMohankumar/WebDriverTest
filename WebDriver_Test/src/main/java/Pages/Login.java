package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {

	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="username") WebElement username;
	@FindBy(how=How.ID,using="password") WebElement password;
	@FindBy(how=How.XPATH,using="//button[@type='submit']") WebElement login;
	
	
	
	public void LoginSuc()
	{
		
		username.sendKeys("tomsmith");
		password.sendKeys("SuperSecretPassword!");
		login.click();
	}
	
	public void LoginFail()
	{
		username.sendKeys("tmith");
		password.sendKeys("SuperetPassword!");
		login.click();
	}
	
	
}
