package org.sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q9 {
		
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://en-gb.facebook.com/r.php");
			
		driver.manage().window().maximize();
			
		WebElement month = driver.findElement(By.id("month"));
		
		Select select = new Select(month);
		
		List<WebElement> options = select.getOptions();
		
		for (WebElement element : options) {
			
			String text = element.getText();
			
			System.out.println(text);		
			}
		Set<Object> s = new LinkedHashSet<>();
		
		s.addAll(options);
		
		if (s.size()==options.size()) {
			System.out.println("No duplicate");
		} else {
			System.out.println("Duplicate");
		}
		driver.quit();
		}

}