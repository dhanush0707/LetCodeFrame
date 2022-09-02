package com.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownLetCode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		// single select drop down
		WebElement findElement = driver.findElement(By.id("lang"));
		Select s = new Select(findElement);
		
		Thread.sleep(3000);
		s.selectByIndex(3);
		Thread.sleep(3000);
        s.selectByValue("py");
		Thread.sleep(3000);
		s.selectByVisibleText("Java");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement WebElement:allSelectedOptions) {
			String text = WebElement.getText();
			System.out.println(text);
		}
		// single selection
		WebElement findElement2 = driver.findElement(By.id("country"));
		Select sss = new Select(findElement2);
		sss.selectByValue("India");
		WebElement firstSelectedOption = sss.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		// multi selection
		WebElement findElement3 = driver.findElement(By.id("superheros"));
		Select ss = new Select(findElement3);
		ss.selectByVisibleText("Black Panther");
		ss.selectByValue("bt");
		ss.selectByIndex(1);
		List<WebElement> allSelectedOptions2 = ss.getAllSelectedOptions();
		for(WebElement WebElement :allSelectedOptions2) {
			String text = WebElement.getText();
			System.out.println(text);
		}
		ss.deselectByIndex(1);
		
		
		
		

}
}