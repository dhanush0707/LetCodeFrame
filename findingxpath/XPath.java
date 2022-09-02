package com.findingxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

public class XPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\"
				+ "eclipse-workspace\\seleniumchromexx\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("7094552888");
		//WebElement pass = driver.findElement(By.xpath("//input[@ aria-label='Password']"));
		//pass.sendKeys("dhanushrilakha");
		WebElement pass = driver.findElement(By.xpath("//input[@ aria-label=\"Password\"]"));
		pass.sendKeys("dhanushrilakha");
		WebElement click = driver.findElement(By.xpath("//button[@data-testid="
				+ "\"royal_login_button\"]"));
		click.click();
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_ds\"]/div/div[1]/div/div"
				+ "[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image")).click();

		/*
		 * WebElement profile = driver.findElement(By.xpath("//g[@xlink:href=\"https" +
		 * "://scontent.fmaa6-1.fna.fbcdn.net" +
		 * "/v/t1.6435-1/123513785_782150929009460_5727082606107188167_n.jpg?stp=cp" +
		 * "0_dst-jpg_p40x40&_nc_cat=101&ccb=1-7&_nc_sid=7206a8&_nc_ohc=GmsWO" +
		 * "-5iJiMAX9F7OgJ&_nc_ht=scontent.fmaa6-1.fna&oh=00_AT8UM5vkQkR3" +
		 * "-MNMoneEG9ipw_4WGFj0se2cUg-8GfGyWQ&oe=63095674\"]"));
		 */
		//WebElement profile = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image"));
		//WebElement findElement = driver.findElement(By.id("u_0_4_Nl"));
		//findElement.click()
		
		//profile.click();
		
		
		
		
	}

}
