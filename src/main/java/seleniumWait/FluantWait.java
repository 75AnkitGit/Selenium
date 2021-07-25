package seleniumWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluantWait {

	protected WebDriver driver;
	
	@SuppressWarnings("unchecked")
	@Test
	public void guru99tutorials() throws InterruptedException 
	{
	System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	driver = new ChromeDriver();
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//Declare and initialise a fluent wait
	
	Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(3))
            .ignoring(NoSuchElementException.class);
	
	
	
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
		}
	
	
	

	
	
	
	
	
	}

}
