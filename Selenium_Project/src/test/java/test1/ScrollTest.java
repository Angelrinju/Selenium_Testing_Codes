package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ScrollTest {
	WebDriver driver;
  @Test
  public void scrollTest() {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	  js.executeScript("window.scrollBy(0,70)");
	  WebElement tr1 =driver.findElement(By.linkText("Salon Travel"));
	  js.executeScript("arguments[0].scrollIntoView()",tr1);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  
  }

}
