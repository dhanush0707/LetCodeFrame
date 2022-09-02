package com.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver-edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/windows");
		
		//WebElement findElement0 = driver.findElement(By.xpath("//button[@id='multi']"));
		WebElement findElement = driver.findElement(By.xpath("//button[@id='home']"));
		findElement.click();
		
		Thread.sleep(2000);
		
		String parId = driver.getWindowHandle();
		
		Set<String> AllIds = driver.getWindowHandles();
		
		for (String s : AllIds) {
			
			if ( !parId.equals(s)) {
				
				driver.switchTo().window(s);
			}
		}
		WebElement findElement2 = driver.findElement(By.xpath("//h1[text()=' Practice and become pro in test automation']"));
		String text = findElement2.getText();
		System.out.println(text);
		
		String title = driver.getTitle();
		System.out.println(title);
		}
		
		
		
		
		
		
		
	}

