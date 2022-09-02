package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source0 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	    WebElement target0 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    Actions a = new Actions(driver);
	    a.dragAndDrop(source0, target0).perform();
	    
	    WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    a.dragAndDrop(source1, target1).perform();
	    
	    WebElement source2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	    WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    a.dragAndDrop(source2, target2).perform();
	    
	    WebElement source3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    a.dragAndDrop(source3, target3).perform();
	    
	 
	    
	
	
	
	}

}
