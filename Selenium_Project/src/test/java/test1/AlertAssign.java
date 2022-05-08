package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertAssign {
	WebDriver driver;
  @Test
  public void verifyalertHandle() {
	  WebElement cusid=driver.findElement(By.xpath("//input[@name=\"cusid\"]"));
	  cusid.sendKeys("1212");
	  WebElement submit=driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	  submit.click();
	  Alert alert=driver.switchTo().alert();
	  alert.accept();
	  alert.accept();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
  }

}
