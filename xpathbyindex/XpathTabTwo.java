package com.xpathbyindex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTabTwo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT"
				+ "\\eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webgradsidvphone?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp&TL=AKqFyY-LM4huirYgrJN2V3MmKV7O_nnCB3qicaladkayu0LYRY2DRYtD0jWPaBNt");
	    
		driver.get("https://accounts.google.com/signup/v2/webgradsidvphone?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp&TL=AKqFyY-LM4huirYgrJN2V3MmKV7O_nnCB3qicaladkayu0LYRY2DRYtD0jWPaBNt");
		WebElement findElement7 = driver.findElement(By.id("phoneNumberId"));
		findElement7.sendKeys("7094552888");
		
		// x path from let code
		//https://chrome.google.com/webstore/detail/letxpath/bekehlnepmijedippfibbmbglglbmlgk
	
	}

}
