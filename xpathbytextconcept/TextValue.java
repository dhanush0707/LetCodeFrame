package com.xpathbytextconcept;
    
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT"
				+"\\eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		// syntex : // tagname[text() = 'text value']
		WebElement findEement = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect "
				+ "and share with the people in your life.']"));
		String text = findEement.getText();
		
		System.out.println(text);
		
		driver.quit();
		
		
		
		
	}

}
