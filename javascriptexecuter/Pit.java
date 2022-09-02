package com.javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pit {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "selenium-chrome\\driver-fox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://pit.ac.in/artificial-intelligence.php");
		
		// javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,900)");
		
		js.executeScript("window.scrollBy(0,-100)");
		
		WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),'Artificial Intelligence & Data Science degree program has experienced ')]"));
		findElement.getAttribute("text");
		System.out.println(findElement);
		js.executeScript("arguments[0].scrollIntoView(false)",findElement);
		
		
		
		
	}

}
