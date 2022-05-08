package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginUsingParameters {
	WebDriver driver;

@Parameters({"username","password"})
 @Test
public void login(String uservalue,String passvalue) {
	 
WebElement username=driver.findElement(By.name("userName"));
username.sendKeys(uservalue);

WebElement password=driver.findElement(By.name("password"));
password.sendKeys(passvalue);

WebElement subm=driver.findElement(By.name("submit"));
subm.click();
	 
}
 @BeforeTest
public void beforeTest() {
	 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours");
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  }

 @AfterTest
 public void afterTest() {
	 
driver.close();
	  }
}
