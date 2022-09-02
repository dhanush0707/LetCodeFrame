package com.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCmmands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\"
				+ "ELCOT\\eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		// launch url
		driver.get("https://www.facebook.com/");
		
		// maximize window
		driver.manage().window().maximize();
		
		//to open one url to another url
		driver.navigate().to("https://www.amazon.in/");
		
		// to move previous url
		driver.navigate().back();
				
		// forward
		driver.navigate().forward();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		findElement.sendKeys("apple mach book");
		
		// refresh
		driver.navigate().refresh();
	}

}
