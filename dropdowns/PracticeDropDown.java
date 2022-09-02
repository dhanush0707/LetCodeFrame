package com.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver-edge\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement web = driver.findElement(By.xpath("//select[@id='first']"));
		
		// single selection drop down
		
		Select se = new Select(web);
		
		se.selectByIndex(0);
		
		se.selectByValue("Google");
		
		se.selectByVisibleText("Yahoo");
		
		boolean multiple = se.isMultiple();
		
		System.out.println("single selectio--- "+multiple);
		
		WebElement firstSelectedOption = se.getFirstSelectedOption();
		
		String text = firstSelectedOption.getText();
		
		System.out.println("selected is -- "+text);
		
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		
		Select animal = new Select(animals);
		
		animal.selectByVisibleText("Big Baby Cat");
		
		animal.selectByIndex(3);
		
		WebElement firstSelectedOption2 = animal.getFirstSelectedOption();
		
		String animaltext2 = firstSelectedOption2.getText();
		
		System.out.println("single selection animal-- "+animaltext2);
		
		///////////////////////////////////////////////////////
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	    js.executeScript("window.scrollBy(0,300)");
		///////////////////////////////////////////////////////
	    
	    // multiple drop down
	}
}
