package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void getURLFireFox() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\RINJU ANGEL\\Downloads\\geckodriver\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
}
