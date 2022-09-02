package com.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.javascriptexecuter.JavaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
public class ScreenShotGreensTech {
             public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\"
		+ "eclipse-workspace\\selenium-chrome\\driver-fox\\geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://en.wikipedia.org/wiki/The_Avengers_(2012_film)");	
		
		WebElement findElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/div/ul/li[5]/a/span"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",findElement);
		Thread.sleep(3000);
		WebElement user = driver.findElement(By.xpath("(//div[@class='mw-input'])[1]"));
		Thread.sleep(3000);

		
		js.executeScript("arguments[0].setAttribute('value','dhanushphotography')", user);
			}
}
