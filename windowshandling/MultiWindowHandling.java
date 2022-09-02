package com.windowshandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver-fox\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
	    WebElement findElement = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	    findElement.click();
	    
	    WebElement findElement2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    findElement2.click();
	    
	    String firstwin = driver.getWindowHandle();   // A123
	    
	    Set<String> multiwin = driver.getWindowHandles();
	    
	    List<String> li = new ArrayList();
	    li.addAll(multiwin);
	    Thread.sleep(3000);
	    driver.switchTo().window(li.get(1));
	    
	    //click //about// button on screen
	    Thread.sleep(3000);
        WebElement findElement3 = driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[1]"));
        findElement3.click();
        
	    driver.switchTo().window(li.get(2));
	 
	}

}
