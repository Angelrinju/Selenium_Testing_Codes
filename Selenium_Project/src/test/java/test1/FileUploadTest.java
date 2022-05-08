package test1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileUploadTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement fileupload=driver.findElement(By.id("uploadfile_0"));
	  fileupload.sendKeys("C:\\Users\\RINJU ANGEL\\Desktop\\ANGEL_JAVA_NOTES.docx");
	  WebElement checkAgree=driver.findElement(By.id("terms"));
	  checkAgree.click();
	  WebElement submit=driver.findElement(By.id("submitbutton"));
	  submit.click();
	  WebElement message=driver.findElement(By.xpath(" //center[text()=\"has been successfully uploaded.\"]"));
	  String actualMessage= message.getAttribute("innerHTML");
	  System.out.println("ActualMessage:"+actualMessage);
	  SoftAssert softAssert=new SoftAssert();
	  softAssert.assertEquals(actualMessage,Constant.ExpectedMessage );   
	  System.out.println("Test case passed");
	  softAssert.assertAll();                           	 
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/upload/");
  }

}
