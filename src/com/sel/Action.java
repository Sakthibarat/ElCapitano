package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://www.greenstechnologys.com/selenium-training-in-chennai.html";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement core = driver.findElement(By.xpath("//a[text()=' Core JAVA  material']"));
		core.click();
		WebElement cliClo = driver.findElement(By.className("close"));
		cliClo.click();
		
	}

}
