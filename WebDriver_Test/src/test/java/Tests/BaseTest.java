package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {
	
	public static WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	 public void initialize() throws IOException
	 { 
		 
          System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
          driver = new ChromeDriver();	 
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
          driver.get("http://localhost:7080/login");
      
         
	 
	 }
	 
	 
	 @SuppressWarnings("deprecation")
	@AfterClass
	 public void TeardownTest() throws InterruptedException
	 {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     driver.close();
	 }

}
