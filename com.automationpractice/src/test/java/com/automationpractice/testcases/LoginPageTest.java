package com.automationpractice.testcases;

import org.testng.annotations.Test;

import com.automation.TestPages.LoginPage;
import com.automationpractice.TestBase.Base;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class LoginPageTest extends Base{
	
	LoginPage loginPage;
	
	public LoginPageTest() throws IOException {
		super();
	}
	
  @Test
  public void f() throws IOException {
  
	  loginPage.login("harshendra@yopmail.com", "broadband");
  
  }
  @BeforeMethod
  public void beforeMethod() {
  
	  initialization();
	  try {
		loginPage = new LoginPage();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
