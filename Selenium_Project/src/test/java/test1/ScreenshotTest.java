package test1;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScreenshotTest {
	WebDriver driver;
  @Test
  public void screeShot() throws IOException {
	  
	  TakesScreenshot  ss=(TakesScreenshot) driver;
	  File fl= ss.getScreenshotAs(OutputType.FILE);
	//  File desg=new File("C:\\Users\\RINJU ANGEL\\Downloads\\screen\\myscreen.jpeg");
	  FileUtils.copyFile(fl, new File("C:\\Users\\RINJU ANGEL\\Downloads\\screen\\myscreen.jpeg"));
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/");
  }

}
