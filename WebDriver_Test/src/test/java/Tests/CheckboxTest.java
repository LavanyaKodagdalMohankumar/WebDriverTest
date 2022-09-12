package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class CheckboxTest extends CommonTest {

	@SuppressWarnings("deprecation")
	@Test( description="Checkboxes")
	public void Chcktest() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		c.checkbox();
	
	}
	
	
	
	
	
}
