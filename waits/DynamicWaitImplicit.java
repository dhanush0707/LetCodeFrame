package com.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicWaitImplicit {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-class\\Driver-EDGE\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		findElement.click();
		
		js.executeScript("arguments[0].click()", findElement);
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		findElement2.click();
		 
			}

}
