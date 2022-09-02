package com.robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassQ4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Actions a =new Actions(driver);
		
		
		driver.get("https://greenstech.in/");
		WebElement mover = driver.findElement(By.xpath("//span[text()='Programming & Frameworks']"));
	    //a.moveToElement(mover).perform()
		a.contextClick(mover).perform();
	    
		
		
		
		
		
		
		
		
	}

}
