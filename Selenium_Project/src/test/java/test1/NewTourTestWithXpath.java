package test1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTourTestWithXpath {
	WebDriver driver;
  @Test(priority=2)
  public void register() {
	    WebElement registration = driver.findElement(By.xpath("//a[text()=\"REGISTER\"]")); 
		registration.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[contains(@name,\"firstName\")]"));                  
		firstname.sendKeys("ANGEL"); 
		
		WebElement lastname = driver.findElement(By.xpath("//input[starts-with(@name,\"las\")]"));                  
		lastname.sendKeys("ANNA VARGHESE");
		
		WebElement phone=driver.findElement(By.xpath("//input[contains(@name,\"phone\")]"));
		phone.sendKeys("0055555555"); 
		
		WebElement email=driver.findElement(By.xpath("//input[@name=\"userName\"]"));
		email.sendKeys("angel@gmail.com"); 
		
		WebElement address=driver.findElement(By.xpath("//input[contains(@name,\"address1\")]"));
		address.sendKeys("GRACE VILLA");
		
		WebElement city=driver.findElement(By.xpath("//input[starts-with(@name,\"ci\")]"));
		city.sendKeys("ADOOR");
		
		WebElement state=driver.findElement(By.xpath("//input[contains(@name,\"state\")]"));
		state.sendKeys("KERALA");
		
		WebElement postalcode=driver.findElement(By.xpath("//input[@name=\"postalCode\"]"));
		postalcode.sendKeys("691555");
		
		WebElement username=driver.findElement(By.xpath("//input[@id=\"email\" and @name=\"email\"]"));
		username.sendKeys("angel@gmail.com");
			
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\" ]"));
		password.sendKeys("angel123");
		
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@name=\"confirmPassword\" ]"));
		confirmpassword.sendKeys("angel123");   
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@name=\"submit\" or @id=\"submit\" ]"));               
		submitButton.click();	
 }
  
  @Test(priority=1)
  public void Verifylogin() {
	  
	  WebElement uname=driver.findElement(By.xpath("//input[@name=\"userName\"]"));
	  uname.sendKeys("Angel123");
	  WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	  password.sendKeys("Angel123");
	  WebElement submit=driver.findElement(By.xpath("//input[@name=\"submit\"]"));
	  submit.click();
	  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  
  }

}
