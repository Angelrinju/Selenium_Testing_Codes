package test;

import org.testng.annotations.Test;

import PageDetails.Login;
import dataread.ExcelData;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class LoginTest extends Base{
	
	
  @Test(dataProvider = "dp")
  public void logintest(String n, String s) {
	  Login lg=new Login(driver);
	  lg.loginExample(n,s);
	  driver.get("http://demo.guru99.com/test/newtours/");
  }

  @DataProvider
  public Object[][] dp() throws InvalidFormatException, IOException {
	  Object[][] data=  ExcelData.getDataFromSheet("C:\\Users\\RINJU ANGEL\\Desktop\\login.xlsx");
		return data;  
    
   
  }
  
  
}
