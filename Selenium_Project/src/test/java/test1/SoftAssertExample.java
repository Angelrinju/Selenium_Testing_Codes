package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	WebDriver driver;
  @Test
 public void verifyTitle() {
	  
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Welcome: Mercury";              //False title
	  SoftAssert softAssert=new SoftAssert();
	  softAssert.assertEquals(actualTitle, expectedTitle);   //Test case will be passed,not throwing assertion error
	  System.out.println("Test case passed");
	  softAssert.assertAll();                               //Test case will be failed,Whenever a assertAll() encounters
	  System.out.println("Test case failed");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  }
}
