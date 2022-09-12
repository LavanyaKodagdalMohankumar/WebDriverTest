package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class DynamicControlsTest extends CommonTest{
	@Test(description="Dynamic Controls")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.dynamicControls();
	
	
	}

}
