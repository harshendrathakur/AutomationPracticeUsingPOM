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
		public WebElement myPersonalInfo;

	@FindBy(className="icon-building")
		WebElement mySavedAddresses;
	
	@FindBy(className="icon-heart")
		WebElement myWishlist;
	
	@FindBy(xpath="//span[@class='navigation_page']")
	WebElement pageTitle;
	
	public PersonalDetailsPage navigateToPersonalInfo() throws IOException {
		myPersonalInfo.click();
		return new PersonalDetailsPage();
	}
	
	public SavedAddresses navigateToSavedAddressesPage() throws IOException{
		mySavedAddresses.click();
		return new SavedAddresses();
	}
	
	public WishlistPage navigateToWishlistPage() throws IOException {
		myWishlist.click();
		return new WishlistPage();
	}
	
	public boolean checkPageTitle() {
		
		if(pageTitle.getText()=="My account") {
			return true;
		}
		else return false;
		
	
	}
}
