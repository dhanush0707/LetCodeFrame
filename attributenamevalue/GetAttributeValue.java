package com.attributenamevalue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
          // get attribute input value
public class GetAttributeValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\"
				+ "eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("7094552888");



		WebElement findElement1 = driver.findElement(By.id("email"));

		String attribute2 = findElement1.getAttribute("value");
		System.out.println(attribute2);

		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("dhanushrilakha");
		
		String attribute = findElement2.getAttribute("value");
		System.out.println(attribute);
		driver.quit();


	}

}
