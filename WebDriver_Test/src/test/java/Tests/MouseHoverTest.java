package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class MouseHoverTest extends CommonTest {
	@Test(description="MouseHover")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.mouseHover();
	
	
	}
}
