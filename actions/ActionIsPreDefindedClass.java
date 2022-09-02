package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionIsPreDefindedClass {
           public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
					+ "seleniumchromexx\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.aol.com/games");
			
			WebElement findElement = driver.findElement(By.xpath("//*[@id=\"header-form-search-input\"]"));
			findElement.sendKeys("plants  zoombies");
			//findElement1.sendKeys("planta vs zoombies");
			
			// double click
			Actions a = new Actions(driver);
			driver.navigate().back();
			a.doubleClick(findElement).perform();
			
			//right click
			a.contextClick(findElement).perform();
			
			
			WebElement findElement2 = driver.findElement(By.xpath("//button[@target='_self']"));
			findElement2.click();
			
			
			
			
			
		}
}
