package com.xpathbyindex;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathByIndex {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT" + "\\eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%"
				+ "2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcr"
				+ "eate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
        
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[1]"));
		findElement.sendKeys("dhanush");
		
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[2]"));
		findElement2.sendKeys("d");
		
		Thread.sleep(2000);
		WebElement findElement3 = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[3]"));
		findElement3.sendKeys("dhanush1234321123");
		
		Thread.sleep(2000);
		WebElement findElement4 = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[4]"));
		findElement4.sendKeys("dhanushj248u%");
		
		Thread.sleep(2000);
		WebElement findElement5 = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[5]"));
		findElement5.sendKeys("dhanushj248u%");

		// WebDriverWait wait = new WebDriverWait(driver, 30);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement findElement6 = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		findElement6.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<Cookie> cookies1 = driver.manage().getCookies();
		System.out.println(cookies1);
		
		WebElement findElement7 = driver.findElement(By.id("phoneNumberId"));
		Thread.sleep(2000);
		
		findElement7.sendKeys("9444136625");
		
		driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("id=\"code\"")).sendKeys("03775");
		
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies);
	}
}
