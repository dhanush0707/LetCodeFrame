package com.xpathtextcontains;
              // get text from browser 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:"
				+ "\\Users\\ELCOT\\eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),'Training and Placements')]"));
		String text = findElement.getText();
		System.out.println(text);
		driver.quit();
		
		
	}

}
