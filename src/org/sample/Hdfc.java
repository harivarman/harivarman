package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc{
	
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		WebElement frameset = driver.findElement(By.name("login_page"));
		
		driver.switchTo().frame(frameset);
		
		WebElement txtuserid = driver.findElement(By.name("fldLoginUserId"));
		
		txtuserid.sendKeys("123");
		
		WebElement image = driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
		
		image.click();
		
		WebElement ipin = driver.findElement(By.name("fldPassword"));
		
		ipin.sendKeys("123456");
		
		//driver.quit();
		
		
}
}
