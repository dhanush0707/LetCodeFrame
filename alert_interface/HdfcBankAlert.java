package com.alert_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBankAlert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "selenium-chrome\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		Robot r= new Robot();
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		
		Thread.sleep(3000);
		//driver.quit();
		
		
	}

}
