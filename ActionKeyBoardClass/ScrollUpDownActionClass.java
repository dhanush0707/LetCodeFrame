package com.ActionKeyBoardClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDownActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver-edge\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://greenstech.in/");
		
		Actions a = new Actions(driver);
		
		// scroll up scroll down using action class
		
		for (int i = 0; i < 5; i++) {
			a.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
	}
		for(int i =0;i< -5;i++) {
			a.sendKeys(Keys.PAGE_UP);
		}
	}


}
