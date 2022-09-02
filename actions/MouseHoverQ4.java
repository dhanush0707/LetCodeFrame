package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverQ4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// object for move to element
		Actions a = new Actions(driver);
		driver.get("https://bazaar.shopclues.com/?__ar=Y");
		
		/*
		 * driver.findElement(By.xpath("(//button[text()])[1]")).click();
		 * driver.switchTo().alert().accept();
		 */
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(click).perform();
		
		driver.findElement(By.xpath("//a[text()='Nokia']")).click();
		
		
	}

}
