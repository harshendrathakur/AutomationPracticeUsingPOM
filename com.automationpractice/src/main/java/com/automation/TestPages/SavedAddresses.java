package com.automation.TestPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.automationpractice.TestBase.Base;

public class SavedAddresses extends Base {
	
	public SavedAddresses() throws IOException {
		PageFactory.initElements(driver, this);
	}

}
