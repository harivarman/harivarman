package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q2 {
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://en-gb.facebook.com/r.php");
			
		driver.manage().window().maximize();
			
		WebElement day = driver.findElement(By.id("day"));
			
		Select select = new Select(day);
			
		List<WebElement> options = select.getOptions();
			
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String name = element.getAttribute("Value");
			System.out.println(name);
				
		}
			
		driver.quit();
			
					
	}

}
