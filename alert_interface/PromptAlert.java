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

public class PromptAlert {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\" + "selenium-chrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		// robot class for keyboard access
		Robot r = new Robot();

		driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[text()='Register']")).click();
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
		  
		  // prompt alert
		  
		  driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		  driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		  
		  Alert prompalert = driver.switchTo().alert();
		  String text = prompalert.getText();
		  System.out.println(text);
		  prompalert.sendKeys("alert  --  prompt");
		  prompalert.accept();
		  driver.quit();

}}
