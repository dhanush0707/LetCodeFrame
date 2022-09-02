package com.dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		// single select drop down
		WebElement findElement = driver.findElement(By.id("fruits"));
		Select s = new Select(findElement);
		
		// select by index
		s.selectByIndex(0);
		// select by value
		s.selectByValue("3");
		// select by visible text
		s.selectByVisibleText("Pine Apple");
		// is multiple
		boolean multiple = s.isMultiple();
		System.out.println("single selection ----- "+multiple);
		
		// multi selection
		WebElement multi = driver.findElement(By.id("superheros"));
		Select ss = new Select(multi);
		// select by index
		ss.selectByIndex(6);
		// select by visible
		ss.selectByVisibleText("Wolverine");
		// select by value
		ss.selectByValue("rb");
		List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
		System.out.println("get all selected"+"\n"+allSelectedOptions);
		//w
		
		for (WebElement WebElement : allSelectedOptions) {
			String text = WebElement.getText();
			System.out.println(text);}
			
			org.openqa.selenium.WebElement firstSelectedOption = s.getFirstSelectedOption();
			String text2 = firstSelectedOption.getText();
			
			System.out.println(text2);
	
	}
}
