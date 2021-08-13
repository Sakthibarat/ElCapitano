package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browlau {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
	    WebElement userNameTxt = driver.findElement(By.id("email"));
	    userNameTxt.sendKeys("BaratBaru");
	    WebElement passTxt = driver.findElement(By.name("pass"));
	    passTxt.sendKeys("abcd");
	    WebElement logButton = driver.findElement(By.name("login"));
	    logButton.click();
		
	}

}
