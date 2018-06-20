package com.automationpractice.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.TestPages.AccountLandingPage;
import com.automation.TestPages.LoginPage;
import com.automation.TestPages.PersonalDetailsPage;
import com.automationpractice.TestBase.Base;

public class PersonalDetailsPageTest extends Base {
	
	LoginPage loginPage;
	AccountLandingPage accountLandingPage;
	PersonalDetailsPage pdp;
	
	public PersonalDetailsPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		accountLandingPage = new AccountLandingPage();
		accountLandingPage = loginPage.login("FN1@LN1.com", "broadband");
		wait.until(ExpectedConditions.elementToBeClickable(accountLandingPage.myPersonalInfo));
		pdp = accountLandingPage.navigateToPersonalInfo();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("old_passwd")));
	}
	
	@Test
	public void changePasswordTest() {
		pdp.changePassword("broadband", "broadband");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/p")));
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/p")).getText(), "Your personal information has been successfully updated.");
	}
	
	/*
	public void teardown() {
		driver.quit();
	}*/
}
