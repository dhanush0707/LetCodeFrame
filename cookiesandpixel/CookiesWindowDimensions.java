package com.cookiesandpixel;

//import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesWindowDimensions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\"
				+ "eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		// to delete cookies etc...
		driver.manage().deleteAllCookies();
		// to resize the window
		Dimension d= new Dimension(222, 222);
		driver.manage().window().setSize(d);
		driver.close();
		// to reposition window
		/*
		 * Point p = new Point(250,250); driver.manage().window().setPosition("p");
		 * Point p1 = new Point(22, 22);
		 */
		//driver.manage().window().setPosition(p);
		//Point p = new Point(222, 222);
		//driver.manage().window().setPosition(p);
		
		
		
		// to close browser
		
		
		
			
				
		
	}

}
