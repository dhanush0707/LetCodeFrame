package com.xpathbytextconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PubgPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\"
				+ "eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		
             WebDriver driver = new ChromeDriver();	
		driver.get("https://asia.battlegrounds.pubg.com/en/");
		WebElement findElement = driver.findElement(By.xpath("//div[text()=We use cookies on our website to give you the most"
				+ " relevant experience by remembering your preferences and repeat visits. By"
				+ " clicking “Accept All”, you consent to the use of ALL the cookies. However, you may "
				+ "visit \"Cookie Settings\" to provide a controlled consent.]"));
		String text = findElement.getText();
		System.out.println(text);
		driver.quit();
		
		
		
		
		
		
		
	}

}
