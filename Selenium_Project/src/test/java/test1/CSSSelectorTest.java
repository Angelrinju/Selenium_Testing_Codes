package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelectorTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  WebElement email=driver.findElement(By.cssSelector("input#userName"));
	  WebElement mouseOut=driver.findElement(By.cssSelector("td.mouseOut"));
	  WebElement phone=driver.findElement(By.cssSelector("input[name=phone]"));
	  WebElement phone1=driver.findElement(By.cssSelector("input[name^=ph]"));
	  WebElement phone3=driver.findElement(By.cssSelector("input[name$=ne]"));
	  WebElement firstName=driver.findElement(By.cssSelector("input[name*=fir]"));
	 	  
  }
}
