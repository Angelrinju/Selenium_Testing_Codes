package test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTest {
	
  WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement simpleClick = driver.findElement(By.xpath("//button[text()='Click me!']"));
	  simpleClick.click();
	  Alert alert= driver.switchTo().alert();
	  String myText=  alert.getText();
	  System.out.println(myText);
	  alert.accept();    
	 
	/*  WebElement promptClick=driver.findElement(By.xpath("//button[text()='Click me!']/following::button"));
      promptClick.click();
      alert.accept();
	 // alert.dismiss();
      
	/*  WebElement ConfirmationClick =driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	  ConfirmationClick.click();
	  alert.sendKeys("hai");
	  alert.accept(); */
	  	  
  }
   
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	  }
}
