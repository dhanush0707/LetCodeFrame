package com.ActionKeyBoardClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapsLetterActions {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-msedge\\driver-4.47\\msedgedriver.exe");
		
        WebDriver driver = new EdgeDriver();
        
           driver.get("https://twitter.com/i/flow/login");
           
           WebElement findElement = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div"));
           Actions a = new Actions(driver);
           a.keyDown(Keys.SHIFT);
           
           findElement.sendKeys("iuearfgviug");
           
           a.keyUp(Keys.SHIFT);
           
}
}