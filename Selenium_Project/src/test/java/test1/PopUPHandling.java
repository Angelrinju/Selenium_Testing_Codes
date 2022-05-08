package test1;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PopUPHandling {
	WebDriver driver;
  @Test
  public void popUpHandle() throws InterruptedException {
	  WebElement button=driver.findElement(By.linkText("Like us On Facebook"));
	  button.click();
	  String mainwindow=driver.getWindowHandle();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator <String> itr=windows.iterator();
	  while(itr.hasNext())
	  {
		  String childwindow=itr.next();
		  if(!mainwindow.equalsIgnoreCase(childwindow))
		  {
			  driver.switchTo().window(childwindow);
			  driver.manage().window().maximize();
			  Thread.sleep(2000);
			  WebElement login=driver.findElement(By.linkText("Log In"));
			  login.click();
			  WebElement username=driver.findElement(By.name("email"));
			  username.sendKeys(Constant.uname);
			  WebElement password=driver.findElement(By.name("pass"));
			  password.sendKeys(Constant.password);
			  WebElement log=driver.findElement(By.name("login"));
			  log.click();
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/window-popup.php");
	  driver.manage().window().maximize();
  }

}
