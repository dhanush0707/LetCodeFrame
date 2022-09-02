package com.facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\seleniumchrome\\driver\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.getTitle();
		
		/*
		 * WebElement KPnG0= driver.findElement(By.className("KPnG0")); KPnG0.click();
		 */
		//driver.switchTo().frame(1);
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("urs_truly_dhanush");
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("dhanushrilakha");
		
	}

}
