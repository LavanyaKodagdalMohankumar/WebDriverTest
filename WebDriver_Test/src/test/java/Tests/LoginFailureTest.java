package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Login;

public class LoginFailureTest extends BaseTest {

	@SuppressWarnings("deprecation")
	@Test(description="Login Failure")
	public void Loginsutest() throws InterruptedException
	{
		
	Login l=PageFactory.initElements(driver, Login.class);
	l.LoginFail();
	 driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	String actual="http://localhost:7080/login";
	String expected=driver.getCurrentUrl();
	Assert.assertEquals(actual, expected);
	
	}
	
}
