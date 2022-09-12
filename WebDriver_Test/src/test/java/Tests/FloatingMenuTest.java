package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class FloatingMenuTest extends CommonTest{
	@SuppressWarnings("deprecation")
	@Test(description="Floating Menu")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.floatingMenu();			
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	}

}
