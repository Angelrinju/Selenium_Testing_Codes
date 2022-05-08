package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DragAndDrop {
	WebDriver driver;
  @Test
  public void dragDropTest() {
	  
	  Actions act=new Actions(driver);
	  WebElement frm=driver.findElement(By.className("demo-frame"));
	  driver.switchTo().frame(frm);
	  WebElement source=driver.findElement(By.id("draggable"));
	  WebElement target=driver.findElement(By.id("droppable"));
	  act.dragAndDrop(source, target).perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
  }

}
