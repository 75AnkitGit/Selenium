package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShot {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void SetUp() {
		String driverPath="D:\\Automation Eclipse\\Selenium\\Driver\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		String url="http://www.seleniumframework.com/Practiceform/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void screenshot() throws IOException {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		System.out.println(SrcFile);
		String driverPath="D:\\Automation Eclipse\\Selenium\\screenshot\\screenhot.PNJ";
		
		//File DestFile=new File(driverPath);
		//FileUtils.copyFile(SrcFile, DestFile);
	}
	
	@AfterTest
	public void Teardown() {
		driver.quit();
		
	}

}
