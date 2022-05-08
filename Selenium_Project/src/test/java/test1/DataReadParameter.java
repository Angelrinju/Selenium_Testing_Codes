package test1;

import org.testng.annotations.Test;

import dataread.ExcelData;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataReadParameter {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String username, String passwords) {
	  
	  WebElement uname=driver.findElement(By.name("userName"));
	  uname.sendKeys(username);
	  WebElement passwrd=driver.findElement(By.name("password"));
	  passwrd.sendKeys(passwords);
	  WebElement submit=driver.findElement(By.name("submit"));
	  submit.click();
	  
  }

  @DataProvider
  public Object[][] dp() throws InvalidFormatException, IOException {
	Object[][] data=  ExcelData.getDataFromSheet("C:\\Users\\RINJU ANGEL\\Desktop\\login.xlsx");
	return data;  
    }
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RINJU ANGEL\\Downloads\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
  }
  
  @BeforeMethod
  public void beforMethod()
  {
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
  }
    
  }

