package com.javascriptexecuter;
//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\"
				+ "selenium-chrome\\driver-fox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://greenstechnology.com/");

		// down casting
		JavascriptExecutor js = (JavascriptExecutor)driver;

		Thread.sleep(3000);
		// to scroll down using pixel
		js.executeScript("window.scrollBy(0,5000)");

		Thread.sleep(3000);
		// to scroll up using pixel
		js.executeScript("window.scrollBy(0,-2000)");

		Thread.sleep(3000);
		// to scroll down using web element reference 
		WebElement findElement = driver.findElement(By.xpath("(//h2[@class='size24'])[5]"));
		js.executeScript("arguments[0].scrollIntoView(true)",findElement);

		Thread.sleep(3000);
		// to scroll up using web element reference
		WebElement findElement2 = driver.findElement(By.xpath("//h1[@class='domain-name']"));
		js.executeScript("arguments[0].scrollIntoView(false)",findElement2);



		/////////////////////////////////////////////////////////////////////////////////////////////////////


		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();

		driver.findElement(By.xpath("(//input[@name='domain_name'])[2]")).sendKeys("selenium automation testing");

		//Actions asd = new Actions(driver);

		driver.findElement(By.id("hdv3HomeSearchButtonID")).click();

		// passing the text using java script execution
		WebElement findElement3 = driver.findElement(By.xpath("(//input[@class='bord value_do_not_clear'])[1]"));
		js.executeScript("arguments[0].setAttribute('value','10000')",findElement3);

        WebElement findElement4 = driver.findElement(By.xpath("(//input[@class='bord value_do_not_clear'])[2]"));
        js.executeScript("arguments[0].setAttribute('value','15000')",findElement4);
        
        WebElement findElement5 = driver.findElement(By.xpath("(//input[@class='bord value_do_not_clear'])[3]"));
        js.executeScript("arguments[0].setAttribute('value','30')",findElement5);
        
        WebElement findElement6 = driver.findElement(By.xpath("(//input[@class='bord value_do_not_clear'])[4]"));
        js.executeScript("arguments[0].setAttribute('value','50')",findElement6);
        
        WebElement findElement7 = driver.findElement(By.id("hdv3DomainSearchSubmitID"));
        findElement7.click();
        
        WebElement findElement8 = driver.findElement(By.id("hdv3HeaderSearchTextID"));
        js.executeScript("arguments[0].setAttribute('value','sql')",findElement8);
        findElement8.sendKeys(" and .net");
        
      //driver.findElement(By.id("hdv3HeaderSearchButtonID")).click();
       
        driver.findElement(By.xpath("(//a[@class='nav-link'])[5]")).click();
        WebElement findElement9 = driver.findElement(By.id("hdv3CheckoutFormDomainID"));
        js.executeScript("arguments[0].setAttribute('value','automation tesing')",findElement9);
        
        js.executeScript("arguments[0].setAttribute('style','background:yellow;border:solid 2px pink')",findElement9);
        
        WebElement findElement10 = driver.findElement(By.id("hdv3CheckoutFormPasswordID"));
        js.executeScript("arguments[0].setAttribute('style','background:pink;solid 2px yellow')",findElement10);
        findElement10.sendKeys("0987654234");
        
		// driver.manage().window().minimize();

		//driver.quit();


	}
}
