package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DownloadFileTest {
	 WebDriver driver;
  @Test
  public void doenloadFile() throws IOException {
	  
	  WebElement download=driver.findElement(By.id("messenger-download"));
	  String link=download.getAttribute("href");
	  String wget_command = "cmd /c C:\\Users\\RINJU ANGEL\\Downloads\\wget.exe -P C:\\Users\\RINJU ANGEL\\Downloads\\dwld --no-check-certificate " + link;
	  Runtime.getRuntime().exec(wget_command);	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/yahoo.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
