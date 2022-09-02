package com.xpathbytextconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oyo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT"
				+ "\\eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oyorooms.com/?utm_source=google&utm_medium=cpc&utm_device=c&utm_"
				+ "campaign=India_SEM_Brand_generic&utm_campaignid=1701551904&utm_adgroup=719820973"
				+ "71&utm_content=538023998106&utm_keyword=oyo&gclid=Cj0KCQjw54iXBhCXARIsADWpsG-GO3i"
				+ "RzdA-b7QmLU0_BqQrSO0-jPfULTGj-zQeLvBj6H4P7cPkkxEaAlHYEALw_wcB");	
		WebElement findElement = driver.findElement(By.xpath("//h1[text()=Over 157,000 hotels and homes across 35 countries]"));
		String tagName = findElement.getTagName();
		System.out.println(tagName);
		
		
		
		
		
		
		
		
	}

}
