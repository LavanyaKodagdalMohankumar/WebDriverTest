package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class ContextMenuTest extends CommonTest{

	@Test(description="Contextmenu")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.contextmenu();
	
	}
}
