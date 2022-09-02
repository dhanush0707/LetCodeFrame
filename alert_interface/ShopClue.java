package com.alert_interface;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class ShopClue {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\" + "selenium-chrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/?__ar=Y");
		// actions obj
		//Actions a = new Actions(driver);
        Alert alert = driver.switchTo().alert();
        alert.accept();
}
}