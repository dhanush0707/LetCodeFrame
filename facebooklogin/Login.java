package com.facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "seleniumchrome\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to launch url
		driver.get("https://www.facebook.com/");
		// to locate element
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("7094552888");
		// to locate element
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("dhanushrilakha");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		driver.manage().window().maximize();
		
	}

}
