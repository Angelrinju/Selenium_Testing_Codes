package test1;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class KeyBoardEvents {
 WebDriver driver;
  @Test
  public void keyHandle() throws AWTException, InterruptedException {
	  Robot rb= new Robot();
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_T);
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_T);
	  
	  String parent=driver.getWindowHandle();
	  System.out.println(parent);
	  Thread.sleep(3000);
	  
	  Set <String> childs=driver.getWindowHandles();
	  Iterator <String> itr=childs.iterator();
	  while(itr.hasNext())
	  {
		  String child=itr.next();
		  if(!parent.equalsIgnoreCase(child))
		  {
			  driver.switchTo().window(child);
			  driver.get("https://demo.guru99.com/test/newtours/");
		  }
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\RINJU ANGEL\\Downloads\\geckodriver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
  }

}
