package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseMoveTest {
	WebDriver driver;
  @Test
  public void mouseTest() {
	  
	  Actions act= new Actions(driver);
	  WebElement elemt=driver.findElement(By.linkText("Main Item 1"));
	  act.moveToElement(elemt).perform();
	  WebElement elemt2=driver.findElement(By.linkText("Main Item 2"));
	  act.moveToElement(elemt2).perform();
	  WebElement elemt3=driver.findElement(By.linkText("Sub Item"));
	  act.moveToElement(elemt3).perform();	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/menu/");
	  driver.manage().window().maximize();
  }

}
