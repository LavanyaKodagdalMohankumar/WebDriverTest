package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class DynamicLoadingTest extends CommonTest{

	@Test(description="Dynamic Loading")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.dynamicLoading();
	
	
	}
}
