package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RegisterXpathTest {
  WebDriver driver;
  @Test
  public void xpathTest() {
	  WebElement uname=driver.findElement(By.xpath("//input[@name=\"userName\"]"));
	  uname.sendKeys("angel123");
	  WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	  password.sendKeys("angel123");
	  WebElement submit=driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	  submit.click();
	  	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
	  
  }

}
