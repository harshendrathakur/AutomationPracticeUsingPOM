package com.automation.TestPages;

import java.io.IOException;
import com.automation.TestPages.AccountLandingPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.TestBase.Base;

public class LoginPage extends Base {
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="email")
		WebElement loginEmail;
	
	@FindBy(id="passwd")
		WebElement loginPassword;
	
	@FindBy(id="SubmitLogin")
	  WebElement loginBtn;
	
	@FindBy(id="email_create")
		WebElement createEmail;
	
	@FindBy(id="SubmitCreate")
		WebElement createAccount;
	
	public AccountLandingPage login(String uname, String pwd) throws IOException {
		
		loginEmail.sendKeys(uname);
		loginPassword.sendKeys(pwd);
		loginBtn.click();
		
		return new AccountLandingPage();
		
	}
	
	public RegistrationPage startCreateAccountFlow(String newEmail) throws IOException {
		
		createEmail.sendKeys(newEmail);
		createAccount.click();
		
		return new RegistrationPage();
		
	}
	
	
}
