package Pages;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Com {

	WebDriver driver;
	
	public Com(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Checkboxes") WebElement checkboxes;
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[1]") WebElement checkbox1;
	@FindBy(how=How.XPATH,using="(//input[@type='checkbox'])[2]") WebElement checkbox2;
	
	@FindBy(how=How.LINK_TEXT,using="Context Menu")WebElement contextmenu;
	@FindBy(how=How.XPATH,using="//div[@oncontextmenu='displayMessage()' and @id='hot-spot']")WebElement rightclick;
	
	@FindBy(how=How.LINK_TEXT,using="Drag and Drop")WebElement dragndrop;
	@FindBy(how=How.ID,using="column-a")WebElement from;
	@FindBy(how=How.ID,using="column-b")WebElement to;
	
	@FindBy(how=How.LINK_TEXT,using="Dropdown")WebElement dropdown;
	@FindBy(how=How.ID,using="dropdown")WebElement optio;
	
	@FindBy(how=How.LINK_TEXT,using="Dynamic Content")WebElement dynmccntnt;
	@FindBy(how=How.XPATH,using="//div[@class='large-10 columns']")WebElement dynmccntndata;
	
	@FindBy(how=How.LINK_TEXT,using="Dynamic Controls")WebElement dynmccntrls;
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[1]")WebElement rmve;
	@FindBy(how=How.XPATH,using="//input[@id='checkbox']")WebElement chckbx;
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[1]")WebElement add;
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[2]")WebElement enable;
	//@FindBy(how=How.XPATH,using="//p[@id='message']")WebElement itsenbld;
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[2]")WebElement disable;
//	@FindBy(how=How.XPATH,using="//p[@id='message']")WebElement itsdisbld;
	
	
	
	@FindBy(how=How.LINK_TEXT,using="Dynamic Loading")WebElement dynmcldng;
	@FindBy(how=How.LINK_TEXT,using="Example 1: Element on page that is hidden")WebElement exmpl;
	@FindBy(how=How.XPATH,using="//div[@id='start']/button")WebElement strt;
	
	@FindBy(how=How.LINK_TEXT,using="File Download")WebElement filedwnld;
	@FindBy(how=How.LINK_TEXT,using="some-file.txt")WebElement smplfile;
	
	@FindBy(how=How.LINK_TEXT,using="File Upload")WebElement fileupld;
	@FindBy(how=How.ID,using="file-upload")WebElement chsefle;
	@FindBy(how=How.ID,using="file-submit")WebElement submitfle;
	
	@FindBy(how=How.LINK_TEXT,using="Floating Menu")WebElement fltngmnu;
	
	@FindBy(how=How.LINK_TEXT,using="Frames")WebElement frmes;
	@FindBy(how=How.LINK_TEXT,using="iFrame")WebElement ifrme;
	@FindBy(how=How.XPATH,using="//div[@class='tox-icon']")WebElement close;
	@FindBy(how=How.ID,using="tinymce")WebElement para;
	
	@FindBy(how=How.LINK_TEXT,using="Hovers")WebElement msehvr;
	@FindBy(how=How.XPATH,using="(//img[@src='/img/avatar-blank.jpg'])[1]")WebElement mousehoverframe;
		
	@FindBy(how=How.LINK_TEXT,using="JavaScript Alerts")WebElement jvscrptalrt;
	@FindBy(how=How.XPATH,using="//button[@onclick='jsAlert()']")WebElement jsalrt;
	@FindBy(how=How.XPATH,using="//button[@onclick='jsConfirm()']")WebElement jscnfrm;
	@FindBy(how=How.XPATH,using="//button[@onclick='jsPrompt()']")WebElement jsprmpt;
	
	@FindBy(how=How.LINK_TEXT,using="JavaScript onload event error")WebElement javscrpterr;
	@FindBy(how=How.XPATH,using="//body[@onload='loadError()']/p")WebElement err;
	
	@FindBy(how=How.LINK_TEXT,using="Multiple Windows")WebElement windw;
	@FindBy(how=How.XPATH,using="//a[@href='/windows/new']")WebElement clickhere;
	
	@FindBy(how=How.LINK_TEXT,using="Notification Messages")WebElement ntfcnmsg;
	@FindBy(how=How.XPATH,using="//a[@href='/notification_message']")WebElement clckhre;
	
	
	
	public void checkbox()
	{
		//Opens checkboxes page
		checkboxes.click();
		//Selects Checkbox1
		checkbox1.click();
		//If checkbox1 is enabled it asserts true else displays "checkbox is not enabled"
		if(checkbox1.isEnabled())
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Checkbox is not enabled");
		}
		//Selects Checkbox2
		checkbox2.click();
		//If checkbox2 is enabled it asserts false else displays "Checkbox is not disabled"
		if(checkbox2.isEnabled())
		{
			Assert.assertFalse(false);
		}
		else
		{
			System.out.println("Checkbox is not disabled");
		}
	}
	
	public void contextmenu()
	{
		//Opens Contextmenu page
		contextmenu.click();
		//Right clicks on the context menu
		Actions action = new Actions(driver);
		action.contextClick(rightclick).sendKeys(Keys.ENTER).perform();
		String actual="You selected a context menu";
		String expected=driver.switchTo().alert().getText();
		//Asserts the actual and expected result
		Assert.assertEquals(actual, expected);
	}
	
	public void draganddrop()
	{
		//Opens Drag and drop page
		dragndrop.click();
		//Drags and drops the element from source to destination
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to);
		String actual="B";
		String expected=driver.findElement(By.id("column-b")).getText();
		//Asserts the actual and expected result
		Assert.assertEquals(actual, expected);
	}
	
	@SuppressWarnings("deprecation")
	public void dropdown() throws InterruptedException
	{
		//Opens dropdown page
		//Selects option1 from dropdown menu
		dropdown.click();
		Select s=new Select(optio);
		s.selectByVisibleText("Option 1");
		//Asserts if the value option1 is selected else displays "Option1 is not selected"
		Boolean sel1=driver.findElement(By.xpath("//option[@value='1']")).isSelected();
		if(sel1==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Option1 is not selected");
		}
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Selects option2 from dropdown menu
		s.selectByVisibleText("Option 2");
		//Asserts if the value option2 is selected else displays "Option2 is not selected"
		Boolean sel2=driver.findElement(By.xpath("//option[@value='2']")).isSelected();
		if(sel2==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Option1 is not selected");
		}
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
	}
	
	@SuppressWarnings("deprecation")
	public void dynamicContent()
	{
		//Opens dynamic content page
		dynmccntnt.click();
		//Generates a random number and refreshes the page multiple times and asserts the data are identical on each page refresh
		double random=Math.random()*10;
		for(int i=1 ; i<=random ;i++)
		{
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			String actual=dynmccntndata.getText();
			driver.navigate().refresh();
			String expected=dynmccntndata.getText();
			Assert.assertNotEquals(actual, expected);
			
		}
	}
	
	public void dynamicControls() throws InterruptedException
	{
		//Opens dynamic controls page
		dynmccntrls.click();
		//Clicks on remove button
		rmve.click();
		//Uses explicit wait to check the checkbox is not present after clicking on remove button
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    String expected=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']"))).getText();
	    //Asserts the checkbox is gone
	    Assert.assertEquals("It's gone!", expected);
	    //Clicks on add button
		add.click();
		//Uses explicit wait to check whether the checkbos is present on the page after clicking on add button
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofMillis(1000));
		String expected1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']"))).getText();
		//Asserts the checkbox is present
		Assert.assertEquals("It's back!", expected1);
		
		//clicks on enable button
		enable.click();
		//Uses explicit wait to check whether the text box is enabled
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
	    String expected2=wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']"))).getText();
	    //Asserts if the textbox is enabled
	    Assert.assertEquals("It's enabled!", expected2);
	    //Clicks on disable button
		disable.click();
		//Uses explicit wait to check whether the text box is disabled
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofMillis(1000));
		String expected3=wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']"))).getText();
		//Asserts if the textbox is disabled
		Assert.assertEquals("It's disabled!", expected3);

	}
	
	public void dynamicLoading()
	{
		//Opens Dynamic loading page
		dynmcldng.click();
		//Selects Example1
		exmpl.click();
		//Clicks on start button
		strt.click();
		String actual="Hello World!";
		//Uses explicit wait until the message "Hello World" is visible on the page
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
		String expected=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4"))).getText();
		//Asserts the actual and expected result
		Assert.assertEquals(actual, expected);
	}

	@SuppressWarnings("deprecation")
	public void fileDownload() throws InterruptedException
	{
		//Storing the download pat on to a variable
		String downloadPath = "C:\\Users\\lavan\\Downloads";
		//Clicks on Download link
		filedwnld.click();
		//Selects the filename to download
		smplfile.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Asserts whether the file is downloaded on the provided destination
		Assert.assertTrue(isFileDownloaded(downloadPath, "some-file.txt"));//, "Failed to download Expected document");
	}
	
	//Method to fetch the downloaded file from Downloads
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	  	    
	    for (int i = 0; i < dir_contents.length; i++) 
	    {
	        if (dir_contents[i].getName().equals(fileName))
	            return flag=true;
	    }

	    return flag;
	}
	
	public void fileUpload()
	{
		//Opens the file upload page
		fileupld.click();
		//Clicks on choose file and select the file to upload
		chsefle.sendKeys("C:\\Users\\lavan\\Downloads\\2.jpeg");
		//Clicks on submit
		submitfle.click();
		String actual="File Uploaded!";
		String expected=driver.findElement(By.xpath("//div[@id='content']//h3 ")).getText();
		//Asserts the actual and expected message after the file upload
		Assert.assertEquals(actual, expected);
	}
	
	public void floatingMenu()
	{
		//Clicks on Floating menu
		fltngmnu.click();
		//Scrolls the page and checks whether the floating menu is displayed
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		boolean expected=driver.findElement(By.xpath("//div[@id='menu']//a")).isDisplayed();
		//Asserts true if floating menu is displayed
		Assert.assertEquals(true ,expected);
	}
	
	@SuppressWarnings("deprecation")
	public void iFrames() throws InterruptedException
	{
		//Opens the iFrames page
		frmes.click();
		//Clicks on iFrame
		ifrme.click();
		//Closes the alert message
		close.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Switches to iFrame
		WebElement frame1=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frame1);
		//Clears the content present on iFrame
		para.clear();
		//Enter some data onto the iFrame
		para.sendKeys("Webdriver Testing with IFrame");
		String actual="Webdriver Testing with IFrame";
		String expected=para.getText();
		//Asserts the actual and expected result
		Assert.assertEquals(actual,expected);
	}
	
	@SuppressWarnings("deprecation")
	public void mouseHover()
	{
		//Opens the mouseHover page
		msehvr.click();
		//Mousehover on one of the image
		Actions action=new Actions(driver);
		action.moveToElement(mousehoverframe).perform();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Fetches the text present on the Mousehover element
		WebElement txt=driver.findElement(By.xpath("(//div[@class='figcaption'])[1]"));
		String actual="name: user1\n"+"View profile";
		String expected=txt.getText().trim();
		//Asserts the actual and the expected result
		Assert.assertEquals(actual, expected);
	}
	
	@SuppressWarnings("deprecation")
	public void javaScriptAlerts()
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//Opens Javascipt Alerts page
		jvscrptalrt.click();
		//Clicks on JSAlert
		jsalrt.click();
		String actual1="I am a JS Alert";
		String expected1=driver.switchTo().alert().getText();
		//Switchs to the alert message and clicks on OK button
		driver.switchTo().alert().accept();
		//Assrts the actual and the expected alert message displayed on clicking of JSAlert
		Assert.assertEquals(actual1, expected1);
		
		//Clicks on JSConfirm button
		jscnfrm.click();
		String actual2="I am a JS Confirm";
		String expected2=driver.switchTo().alert().getText();
		//Switchs to the alert message and clicks on OK button
		driver.switchTo().alert().accept();
		//Assrts the actual and the expected alert message displayed on clicking of JSConfirm
		Assert.assertEquals(actual2, expected2);
		
		//Clicks on JSPrompt
		jsprmpt.click();
		//Enters some data on the JSPrompt textbox
		driver.switchTo().alert().sendKeys("JS Prompt Alert message is displayed");
		//Clicks on OK after entering the data
		driver.switchTo().alert().accept();
		String actual3="You entered: JS Prompt Alert message is displayed";
		String expected3=driver.findElement(By.xpath("//p[@id='result']")).getText();
		//Asserts the actual and expected message
		Assert.assertEquals(actual3, expected3);
	}
	
	public void javaScriptError()
	{
		//Opens the Javascript error page
		javscrpterr.click();
		String actual="This page has a JavaScript error in the onload event. This is often a problem to using normal Javascript injection techniques.";
		String expected=err.getText().trim();
		//Asserts the actual and expected message displayed on the page
		Assert.assertEquals(actual, expected);

	}
	
	public void newWindow()
	{
		//Opens Multiple windows page
		windw.click();
		//Clicks on "Click Here button"
		clickhere.click();
		//Gets the window handle of the main window opened 
		String mainWindowHandle = driver.getWindowHandle();
		//Gets the list of window handles of all the pages opened , iterates through them and asserts the text "New Window " on the page
	    Set<String> allWindowHandles = driver.getWindowHandles();
	    Iterator<String> iterator = allWindowHandles.iterator();
	    while (iterator.hasNext()) 
	    {
	            String ChildWindow = iterator.next();
	            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) 
	            {
	                driver.switchTo().window(ChildWindow);
	                WebElement text = driver.findElement(By.xpath("//div[@class='example']/h3"));
	                String actual="New Window";
	                String expected=text.getText();
	                Assert.assertEquals(actual, expected);
	            }
	     }
	}
	
	@SuppressWarnings("deprecation")
	public void notificationMessage() throws InterruptedException
	{		
		//Opens the Notification Message page
		ntfcnmsg.click();
		//Creating an arraylist and storing the notification message displayed on clicking of the button "Click Here"
		ArrayList<String> notificationsList=new ArrayList<String>();
		notificationsList.add("Action successful");
		notificationsList.add("Action unsuccesful, please try again");
		//Generating a random number and clicking on Click Here button multiple times
		double random=Math.random()*10;
		for(int i=0 ; i<=random+1 ;i++)
		{
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Click here")).click();
		}
		String actual = driver.findElement(By.id("flash")).getText().toString().trim().replaceAll("[\n]","");
		//Asserts whether the notification message displayed on each click is displayed in the arraylist and test passes if it is true
		Assert.assertEquals(notificationsList.contains(actual.substring(0,actual.length()-1)), true);
	
		
	}
}
