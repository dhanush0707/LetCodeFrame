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

public class ComnfomAlert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\" + "selenium-chrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		// robot class for keyboard access
		Robot r = new Robot();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement switchto = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		// switchto.click();
		Thread.sleep(5000);
		  a.moveToElement(switchto).perform();
		  Thread.sleep(5000);

//		  Thread.sleep(5000);
		  WebElement comfomalert = driver.findElement(By.xpath("//a[text()='Alerts']"));
		  comfomalert.click();
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		  // conform alert 
		  
		  WebElement findElement = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		  findElement.click();
		  
		  driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		  Thread.sleep(5000);
		  Alert conformalert = driver.switchTo().alert();
		  conformalert.accept();

}
}