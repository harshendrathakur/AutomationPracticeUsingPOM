package com.automationpractice.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.TestPages.AccountLandingPage;
import com.automation.TestPages.LoginPage;
import com.automation.TestPages.RegistrationPage;
import com.automationpractice.TestBase.Base;
import com.automationpractice.Utils.TestUtils;

public class RegistrationPageTest extends Base{

	LoginPage loginPage;
	RegistrationPage registrationPage;
	AccountLandingPage accountLandingPage;
	TestUtils testUtils;
	String Sheetname = "createaccount";
	public RegistrationPageTest() throws IOException {
		super();
	}
	
 @BeforeMethod
 public void setup() throws IOException {
	 initialization();
	 loginPage = new LoginPage();
 }
 
 @Test(dataProvider="provideTestData")
 public void createAccountTest(String title, String customer_FirstName, String customer_LastName, String customer_Email, String customer_Password, String dob_day, String dob_month, String dob_year, String address_FirstName, String address_LastName, String Address, String City, String State, String zipcode, String Mobile, String addressName) throws IOException {

	 registrationPage = loginPage.startCreateAccountFlow(customer_Email);
	 wait.until(ExpectedConditions.elementToBeClickable(registrationPage.selectGender));
	 
	 accountLandingPage = registrationPage.submitRegistrationForm(title, customer_FirstName, customer_LastName, customer_Password,  dob_day, dob_month, dob_year, address_FirstName, address_LastName, Address, City, State, zipcode, Mobile, addressName);
	 
 }
 	
 
 @DataProvider(name="provideTestData")
 public Object[][] provideData() {
	 Object[][] data=TestUtils.getTestdata(Sheetname);
	 return data;
	 
	 
 }
 @AfterMethod
 public void destroyBrowser() {
	 driver.quit();
 }

}
