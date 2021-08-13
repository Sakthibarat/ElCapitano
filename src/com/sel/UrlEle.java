package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlEle {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
		WebElement conTxt = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		conTxt.click();
		WebElement creTxt = driver.findElement(By.id("createAccountSubmit"));
		creTxt.click();
		WebElement nameTxt = driver.findElement(By.name("customerName"));
		nameTxt.sendKeys("Barat baru");
		WebElement mobTxt = driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile number')]"));
		mobTxt.sendKeys("979080");
		WebElement maiTxt = driver.findElement(By.xpath("//input[@type='email']"));
		maiTxt.sendKeys("Bb");
		WebElement pasTxt = driver.findElement(By.xpath("//input[@type='password']"));
		pasTxt.sendKeys("ac");
		WebElement idnTxt = driver.findElement(By.id("continue"));
		idnTxt.click();
		
		
		
		
		
		
		
		
		
	}

}
