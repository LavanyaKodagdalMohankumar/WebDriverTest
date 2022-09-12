package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class NotificationMessageTest extends CommonTest{

	@Test(description="Notification message")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.notificationMessage();
	
	
	}
}
