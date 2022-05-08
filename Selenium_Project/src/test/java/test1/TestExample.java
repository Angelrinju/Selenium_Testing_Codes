package test1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TestExample {
	 WebDriver driver;
	 
  @Test (priority=1)
  public void verifyTitle() {
	  
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Welcome: Mercury Tours";
	//  Assert.assertEquals(actualTitle, expectedTitle,"title mismatch"); //
	 
	  System.out.println("First test case executted");
  }
  @Test(priority=2)
  public void verifyURL() {
	  
	  String actualURL=driver.getCurrentUrl();
	  System.out.println("URL: "+actualURL);
	  String expectedURL="https://demo.guru99.com/test/newtours/";

	  
  }
  
  @Test (priority=3)
  public void verifyUsername() {
	  WebElement userName=driver.findElement(By.name("userName"));
	  boolean display= userName.isDisplayed();
	  Assert.assertTrue(display,"message");
	  System.out.println("Displayed");
	//  Assert.assertTrue(userName.isDisplayed());
	  boolean enabled=userName.isEnabled();
  }
  @Test (priority=4)
  public void verifypassword() {
	  WebElement password=driver.findElement(By.name("password"));
	  boolean display= password.isDisplayed();
	  System.out.println(display);
	  boolean enabled=password.isEnabled();
	  System.out.println(enabled);
	  
  }
  @Test (priority=5)
  public void verifyLogin() {
	  WebElement userName=driver.findElement(By.name("userName"));
	  WebElement password=driver.findElement(By.name("password"));
	  userName.sendKeys("angel@gmail.com");
	  password.sendKeys("angel123");
	  
	  WebElement submitButton = driver.findElement(By.name("submit"));               
	  submitButton.click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  }

}
