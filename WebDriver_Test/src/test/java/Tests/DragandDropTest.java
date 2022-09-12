package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class DragandDropTest extends CommonTest {
	
	@SuppressWarnings("deprecation")
	@Test(description="Drag and Drop")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.draganddrop();
		 driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	}

}
