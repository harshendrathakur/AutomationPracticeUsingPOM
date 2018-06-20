package com.automation.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.TestBase.Base;

public class AccountLandingPage extends Base{

	public AccountLandingPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="icon-user")
		WebElement myPersonalInfo;

	@FindBy(className="icon-building")
		WebElement mySavedAddresses;
	
	@FindBy(className="icon-heart")
		WebElement myWishlist;
	
	@FindBy(className="page-heading")
	WebElement pageTitle;
	
	public void navToPersonalInfo() {
		myPersonalInfo.click();
	}
	
	public void checkPageTitle() {
		
		
		
		System.out.println("success");
	}
}
