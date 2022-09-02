package com.waits;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DynamicWaitFluent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-class\\Driver-CHROME\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		findElement.click();
		
		js.executeScript("arguments[0].click()",findElement);
		
		// fluent wait


		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		
		WebElement until = w.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
			return driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			}
		});
		
		until.click();
		
		driver.quit();
		
		
	
	}

}
