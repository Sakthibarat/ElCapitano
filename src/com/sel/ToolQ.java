package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolQ {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.toolsqa.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement scDown = driver.findElement(By.xpath("//div[text()='Share this page']"));
		WebElement scUp = driver.findElement(By.className("branding"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scDown);
		js.executeScript("arguments[0].scrollIntoView(false)", scUp);
}
}
		
		
		
			
		
		
		
		
		

