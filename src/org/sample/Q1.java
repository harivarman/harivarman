package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Q1{
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(year);
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String name = element.getText();
			System.out.println(name);
			
		}
		
		driver.quit();
		
				
	}

}
