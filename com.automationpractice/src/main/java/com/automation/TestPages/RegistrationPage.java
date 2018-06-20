package com.automation.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationpractice.TestBase.Base;

public class RegistrationPage extends Base{
	
	public RegistrationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="id_gender1")
		public WebElement selectGender;
	
	@FindBy(id="customer_firstname")
		WebElement custFirstName;
	
	@FindBy(id="customer_lastname")
	WebElement custLastName;
	
	@FindBy(id="email")
	WebElement custEmail;
	
	@FindBy(id="passwd")
	WebElement custPassword;

	@FindBy(id="days")
	WebElement dobDate;
	
	@FindBy(id="months")
	WebElement dobMonths;
	
	@FindBy(id="years")
	WebElement dobYears;
	
	
	@FindBy(id="firstname")
	WebElement addrFirstname;
	
	@FindBy(id="lastname")
	WebElement addrLastname;
	
	@FindBy(id="address1")
	WebElement addrAddress;
	
	@FindBy(id="city")
	WebElement addrCity;

	@FindBy(id="id_state")
	WebElement addrState;


	@FindBy(id="postcode")
	WebElement addrPostalcode;

	@FindBy(id="phone_mobile")
	WebElement addrPhone;
	
	@FindBy(id="alias")
	WebElement addrName;
	
	@FindBy(id="submitAccount")
	WebElement createAccountbtn;
	
	public AccountLandingPage submitRegistrationForm(String title, String customer_FirstName, String customer_LastName, String customer_Password, String dob_day, String dob_month, String dob_year, String address_FirstName, String address_LastName, String Address, String City, String State, String zipcode, String Mobile, String addressName) throws IOException {
		
		//for now hoard coding the data
		
		//int postCode = Integer.parseInt(zipcode);
		
		//selectGender.click();
		custFirstName.sendKeys(customer_FirstName);
		custLastName.sendKeys(customer_LastName);
		custPassword.sendKeys(customer_Password);
		
		Select d = new Select(dobDate);
		d.selectByValue(dob_day);
		Select m = new Select(dobMonths);
		m.selectByValue(dob_month);
		Select y = new Select(dobYears);
		y.selectByValue(dob_year);
		
		addrFirstname.sendKeys(address_FirstName);
		addrLastname.sendKeys(address_LastName);
		addrAddress.sendKeys(Address);
		addrCity.sendKeys(City);
		
		Select st = new Select(addrState);
		st.selectByValue(State);
		
		addrPostalcode.sendKeys(zipcode);
		addrPhone.sendKeys(Mobile);
		addrName.sendKeys(addressName);
		createAccountbtn.click();
		return new AccountLandingPage();
	}
	
	
}
