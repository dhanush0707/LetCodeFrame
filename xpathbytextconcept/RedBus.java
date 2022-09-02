package com.xpathbytextconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\"
				+ "Users\\ELCOT\\eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.redbus.com/");
		 WebElement findElement = driver.findElement(By.xpath("//div[text()='Find affordable travel tickets across the world, all at one place']"));
		 String t = findElement.getText();
		 //System.out.println(t);
		 
		 System.out.println(t);
		 WebElement findElement2 = driver.findElement(By.xpath("//div[text()='We ensure your information is safe and your travel is hassle free, wherever you go']"));
		 String text = findElement2.getText();
		 System.out.println(text);
		 
		 WebElement findElement3 = driver.findElement(By.xpath("//div[text()='Find the best deals online and guess what, refunds are simple!']"));
		 String text2 = findElement3.getText();
		 System.out.println(text2);
		 
		 
		 driver.findElement(By.id("search_butn")).sendKeys("chennai");
		 
		 driver.findElement(By.xpath("//div[@class='destination input-box']")).sendKeys("usa");
		 
		 driver.findElement(By.xpath("//div[@class=icon-down icon ich dib]")).click();
		 
		 // driver.findElement(By.xpath(""))
		 
		 
		 
		 
		 
		 driver.quit();
		
		
}

}
