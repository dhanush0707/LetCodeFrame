package com.seleniumchrome;

           import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
		// to setup property of browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace"
				+ "\\seleniumchrome\\driver\\chromedriver.exe");
		//to open chrome browser
		WebDriver driver = new ChromeDriver();
		// to launch url 
		driver.get("https://facebook.com/");  // hyper text transfer protocol secure
		//      to maximize the window
		/*
		 * //driver.maximizeOptions manage = driver.manage(); //String windowHandle =
		 * driver.getWindowHandle();
		 */		
		driver.manage().window().maximize();
		// get title
		String title = driver.getTitle();
		System.out.println(title);
		// get current url
		String title2 = driver.getTitle();
		System.out.println(title2);
		// get page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		// to close the browser
		driver.close();
		//Example name = new Example();
	}

}
