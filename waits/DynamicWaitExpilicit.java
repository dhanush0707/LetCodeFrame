package com.waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class DynamicWaitExpilicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-class\\Driver-FOX\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver(); 	 
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		findElement.click(); 
		
		js.executeScript("arguments[0].click()",findElement);
		
		// explicit wait
		
		WebDriverWait expilicitwait = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement until = (expilicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[2]"))));
		until.click();
		
//		WebElement findElement2 = driver.findElement(By.id("//input[@id='u_13_5_sr']"));
//		findElement2.click();
	
	}

}
