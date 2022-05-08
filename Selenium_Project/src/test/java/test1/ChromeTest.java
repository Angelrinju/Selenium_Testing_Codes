package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
 WebDriver driver;
  @Test
  public void getUrlMercury() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void getUrlObscura() {
	  
	  driver.get("https://selenium.obsqurazone.com/window-popup.php");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  
}
