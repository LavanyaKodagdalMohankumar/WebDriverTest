package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Com;

public class FileUploadTest extends CommonTest{

	@SuppressWarnings("deprecation")
	@Test(description="File Upload")
	public void Contestmen() throws InterruptedException
	{
		Com c=PageFactory.initElements(driver, Com.class);
		c.fileUpload();
		 driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	
	}
}
