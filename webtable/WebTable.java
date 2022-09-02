package com.webtable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\selenium-class\\Driver-FOX\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	// get table heading
	
	System.out.println("table headings"+"\n"+"'''''''''''''''''");
	
	WebElement table = driver.findElement(By.id("customers"));
	
	List<WebElement> tablehead = table.findElements(By.tagName("th"));
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	WebElement toscroll = driver.findElement(By.xpath("(//table[@id='customers']//td)[15]"));
	
	js.executeScript("arguments[0].scrollIntoView(true)", toscroll);
	
	for(int i =0; i < tablehead.size(); i++) {
		WebElement heading = tablehead.get(i);
		String text = heading.getText();
		System.out.println(text);
	}
	//to get all rows
	
	List<WebElement> allrows = table.findElements(By.tagName("tr"));
	System.out.println("table details"+"\n"+"''''''''''''''");
	for(int i=0; i<allrows.size(); i++) {
		WebElement webElement = allrows.get(i);
		String text1 = webElement.getText();
		System.out.println(text1);
	}
    List<WebElement> holetable = table.findElements(By.tagName("tr"));
    for(int i=0; i<holetable.size(); i++) {
    	WebElement roe = holetable.get(i);
    	List<WebElement> findElements1 = roe.findElements(By.tagName("td"));
    	
    	for(int j=0; j<findElements1.size(); j++) {
    		WebElement tableline = findElements1.get(j);
    		String text2 = tableline.getText();
    		System.out.println(text2);
      }
    }
    // to get particular web element 
    System.out.println("to get particular web element  "+"||||||||||||||||||||||||||||");
   List<WebElement> findElements2 = table.findElements(By.tagName("td"));
    for(int i =0; i<findElements2.size(); i++) {
    	WebElement webElement = findElements2.get(i);
    	String text2 = webElement.getText();
    	
    	if(text2.contains("Yoshi")) {
    	System.out.println(text2);
      }
    }
  }
}
