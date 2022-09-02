package com.attributenamevalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\"
				+ "eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		findElement.sendKeys("7094552888");
		
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("dhanushrilakha");
		// to get attribute value
		String attribute2 = findElement2.getAttribute("aria-label");
		System.out.println(attribute2);
		
		// attribute value for email
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		String attribute = email.getAttribute("placeholder");
	    System.out.println(attribute);
	    
	    // attribute value for password
	    
	    WebElement findElement3 = driver.findElement(By.xpath("//button[@value='1']"));
	    String attribute3 = findElement3.getAttribute("value");
	    System.out.println(attribute3);
	    
	    driver.quit();
	    
	    
		
		
		
		
		
		

		
	}

}
