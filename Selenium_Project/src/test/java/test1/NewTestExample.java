package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTestExample {
	WebDriver driver;
  @Test
  public void verifyLogin() {
	  
	    WebElement uname = driver.findElement(By.name("userName"));
		uname.sendKeys("angel123");
	   
	    WebElement password = driver.findElement(By.name("password"));                   //sendKeys()
		password.sendKeys("angel123");
		
		WebElement submitButton = driver.findElement(By.name("submit"));                //click()
		submitButton.click();	  
  }
  
  @Test
  public void titleCheck() {
	  String actual=driver.getTitle();
	  String expected="Login:Mercurry";
	  if(actual.equals(expected))
	  {
		  System.out.println("equals");
	  }
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/\n");
  }

}
