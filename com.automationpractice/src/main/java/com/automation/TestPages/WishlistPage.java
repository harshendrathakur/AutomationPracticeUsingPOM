package com.automation.TestPages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.automationpractice.TestBase.Base;

public class WishlistPage extends Base{
	
	public WishlistPage() throws IOException{
		PageFactory.initElements(driver, this);
	}

}
