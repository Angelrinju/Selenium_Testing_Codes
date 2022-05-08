package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightClickTest {
	WebDriver driver;
  @Test
  public void rightClick() throws Exception {
	  Actions act= new Actions(driver);
	  WebElement rightClick=driver.findElement(By.xpath("//*[text()='right click me']"));
	  act.contextClick(rightClick).perform();
	  WebElement edit=driver.findElement(By.xpath("//*[text()='Edit']"));
	  edit.click();
	  Thread.sleep(3000);
	  Alert alert=driver.switchTo().alert();
	  alert.accept();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	  driver.manage().window().maximize();
  }

}

