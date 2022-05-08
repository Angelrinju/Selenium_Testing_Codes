package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class MultiBrowser {
	WebDriver driver;
  @Test
  public void multiBrowserTesting() {
	  driver.get("https://demo.guru99.com/test/newtours/");
  }
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
	 }
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\RINJU ANGEL\\Downloads\\geckodriver\\geckodriver.exe");
		 driver=new FirefoxDriver();	 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 }
		 
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  

}
