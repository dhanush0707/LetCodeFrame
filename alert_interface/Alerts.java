package com.alert_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
//				+ "selenium-chrome\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Register.html");
//		
//		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
//		driver.findElement(By.xpath("//a[text()='Alerts']")).click();
//		Thread.sleep(3000);
////		Alert alert01 = driver.switchTo().alert();	
////		alert01.dismiss(); 
//		
//		//driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
//		WebElement alertb = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		  alertb.click();
//		  Alert alert0 = driver.switchTo().alert();
//		  alert0.accept();
//		  Thread.sleep(5000);
//				  
//		
//		//Thread.sleep(3000);
//		
//		Alert alert02 = driver.switchTo().alert();	
//		alert02.accept();  
//		
//	}
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
		  //
		  WebElement findElement = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		  findElement.click();
		  
		  driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		  Thread.sleep(5000);
		  Alert conformalert = driver.switchTo().alert();
		  conformalert.accept();

}}
