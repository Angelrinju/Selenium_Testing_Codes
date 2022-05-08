package test1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AssertTest {
  WebDriver driver;
  @Test(priority=2)
  public void softAssert() {
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Grocerystore";
	  SoftAssert softAssert=new SoftAssert();
	  softAssert.assertEquals(actualTitle, expectedTitle);   
	  System.out.println("Test case passed");
	  softAssert.assertAll();                              
	  
  }
  @Test (priority=1)
  public void hardAssert()
  {
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Grocerystore";
	  Assert.assertEquals(actualTitle, expectedTitle,"Title matches");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.opesmount.in/grocerystore1/");
  }

}
