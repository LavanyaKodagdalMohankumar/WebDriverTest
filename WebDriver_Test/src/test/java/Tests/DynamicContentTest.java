package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class DynamicContentTest extends CommonTest{
	
	@Test(description="Dynamic Content")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.dynamicContent();
	
	
	}

}
