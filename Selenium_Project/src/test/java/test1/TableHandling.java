package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableHandling {
	WebDriver driver;
	  @Test
	  public void tableHandling() {
	 //to get the single value from a dynamic table
	 WebElement tablevalue=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
	 String value=tablevalue.getText();
	 System.out.println(value);
	 
	 //to get the all values from a dynamic table
	 List<WebElement> trvalues=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr")); // double slash used to get all the tr values
	 int rowsize=trvalues.size();
	 System.out.println("Row size:"+rowsize);
	 for(int i=0;i<rowsize;i++)
	 {
	 List<WebElement> tdvalues=trvalues.get(i).findElements(By.tagName("td"));
	 for(int j=0;j<tdvalues.size();j++)
	 {
	String values=  tdvalues.get(j).getText();
	System.out.println("Table values:"+values);
	 
	 }
	 }
	 
	  }
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	driver.manage().window().maximize();
	  }

 @AfterTest
public void afterTest() {
	 driver.close();}

	}