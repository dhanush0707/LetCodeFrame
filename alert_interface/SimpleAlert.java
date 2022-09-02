package com.alert_interface;
//  import java.awt.Desktop.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
// fire fox driver
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\" + "selenium-chrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// actions obj
		Actions a = new Actions(driver);
		// robot class for keyboard access
		Robot r = new Robot();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement switchto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		// switchto.click();
		
		  a.moveToElement(switchto).perform();
		  
		  r.keyPress(KeyEvent.VK_DOWN); 
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		  WebElement action = driver.findElement(By.xpath("//a[text()='Alerts']"));
		  action.click();
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  WebElement alertb = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		  alertb.click();
		  Alert alert0 = driver.switchTo().alert();
		  alert0.accept();
		  Thread.sleep(5000);
				  
		//  r.keyPress(500eyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 
		 //driver.close();
	}

}
