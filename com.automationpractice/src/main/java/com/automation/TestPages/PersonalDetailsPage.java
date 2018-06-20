package com.automation.TestPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.TestBase.Base;

public class PersonalDetailsPage extends Base {
	
	public PersonalDetailsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="id_gender1")
		WebElement mr;
	
	@FindBy(id="id_gender2")
		WebElement mrs;
	
	@FindBy(id="firstname")
		WebElement frstname;
	
	@FindBy(id="lastname")
		WebElement lstname;
	
	@FindBy(id="old_passwd")
		public WebElement oldPassword;
	
	@FindBy(id="passwd")
		WebElement newPassword;
	@FindBy(id="confirmation")
		WebElement confirmPassword;
	
	@FindBy(xpath="//button[@type='submit' and @name='submitIdentity']")
		WebElement saveChange;
	
	public void changePassword(String currentpswd, String newpswd) {
		oldPassword.sendKeys(currentpswd);
		newPassword.sendKeys(newpswd);
		confirmPassword.sendKeys(newpswd);
		saveChange.click();
	}
}
