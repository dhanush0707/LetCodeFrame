package com.ActionKeyBoardClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKey {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver-edge\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F0%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement findElement = driver.findElement(By.xpath("//input[@type='email']"));
		Thread.sleep(2000);
		findElement.sendKeys("dhanushiyam1920@gmail.com");
		
		Actions a= new Actions(driver);
		
		Thread.sleep(2000);

		// ctrl + a
		a.keyDown(Keys.CONTROL);
		
		a.sendKeys("a");
		
		a.keyUp(Keys.CONTROL);
		
		a.perform();
		
		Thread.sleep(2000);

		// ctrl + x
		a.keyDown(Keys.CONTROL);
		
		a.sendKeys("x");
		
		a.keyUp(Keys.CONTROL);
		
		a.perform();
		
		findElement.sendKeys("findElement");
		// tab
		
		a.sendKeys(Keys.TAB);
		
		a.sendKeys(Keys.TAB);
		
		a.sendKeys(Keys.TAB);
		
		a.sendKeys(Keys.ENTER);
		
		a.perform();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email"));
		
		// ctrl  + v
		
		a.keyDown(Keys.CONTROL);
		
		a.sendKeys("v");
		
		a.keyUp(Keys.CONTROL);
		
		a.perform();
		
		// enter
		
		a.sendKeys(Keys.ENTER);
		
		// pending
		// give enter key
	}

}
