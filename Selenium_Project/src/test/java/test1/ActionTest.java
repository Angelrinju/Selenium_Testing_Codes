package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionTest {
	WebDriver driver;
	
  @Test(priority=2)
  public void mouseHover() {
	 
	 // WebElement support=driver.findElement(By.xpath("//a[text()=\"Support\"]"));
	  WebElement support=driver.findElement(By.linkText("Support"));
	  Actions act=new Actions(driver);
	  act.moveToElement(support).perform();
	  WebElement learning=driver.findElement(By.xpath("//a[text()=\"Learning Center\"]"));
	  act.doubleClick(learning).perform();
	  driver.navigate().back();
  }
  @Test(priority=1)
  public void dragandDrop()
  
  {
	  WebElement iframe=driver.findElement(By.className("demo-frame"));
	  driver.switchTo().frame(iframe);
	  WebElement source=driver.findElement(By.xpath("//div[contains(@id,\"draggable\")]"));
	  WebElement target=driver.findElement(By.xpath("//div[contains(@id,\"dropp\")]"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(source, target).perform();	
  } 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://Jqueryui.com/droppable/");
	  driver.manage().window().maximize();
  }

}
