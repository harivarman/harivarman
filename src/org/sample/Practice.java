package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement btncreatenew = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		btncreatenew.click(); 
		
		//Thread.sleep(2000);
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		txtfirstname.sendKeys("Greens");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		txtlastname.sendKeys("Technologies");
	

}
}
