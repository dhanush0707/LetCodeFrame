package com.windowshandling;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenNewTabbedWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-chrome\\driver-fox\\geckodriver.exe");
		// single window handling
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		WebElement findElement = driver.findElement(By.xpath("//button[text()='    click   ']"));
		findElement.click();
		// switch to new window
		String singlewindow = driver.getWindowHandle();    // A123
		// return all windows
		Set<String> allwindow = driver.getWindowHandles();     // A123 B123

		for (String allw : allwindow) {
			if (!singlewindow .equals(allw) ) {
				driver.switchTo().window(singlewindow);
			}
		}
		WebElement findElement2 = driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[1]"));
		findElement2.click();
	               // pending thru exception 
	}
}
