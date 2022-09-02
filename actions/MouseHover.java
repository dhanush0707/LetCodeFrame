package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='COURSES']"));
		// move to element
		Actions a = new Actions(driver);
		a.moveToElement(findElement).perform();
		
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Robotic Process Automation Training']"));
		a.moveToElement(findElement2).perform();
		
		WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Blue Prism Training']"));
		a.moveToElement(findElement3).perform();
		findElement3.click();
		driver.navigate().to("http://www.greenstechnologys.com/blue-prism-training.html");
		WebElement findElement4 = driver.findElement(By.xpath("//h2[text()='\"Call us for course fees and attractive discounts\"']"));
		String text = findElement4.getText();
		System.out.println(findElement4 + "\n");
		System.out.println(text);
		driver.quit();
		
	}

}
