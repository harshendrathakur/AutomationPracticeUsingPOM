package com.automationpractice.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	
	public Base() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\harsh\\git\\AutomationPractice\\com.automationpractice\\src\\main\\java\\com\\automationpractice\\config\\config.properties");
		prop.load(fis);
		
	}
	
	public static void initialization() {
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\harsh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}	
		
		driver.get(prop.getProperty("url"));
		wait= new WebDriverWait(driver, 30);
	}
	
}