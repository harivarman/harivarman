package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
		
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://en-gb.facebook.com/r.php");
			
		driver.manage().window().maximize();
			
		WebElement day = driver.findElement(By.id("day"));
			
		String days = day.getText();
		
		System.out.println(days);
		
		WebElement month = driver.findElement(By.id("month"));
		
		String text = month.getText();
		
		System.out.println(text);
		
		WebElement year = driver.findElement(By.id("year"));
		
		String years = year.getText();
		
		System.out.println(years);
		
		driver.quit();
		
			
		}
			
	
	}						
