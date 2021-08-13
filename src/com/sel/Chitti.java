package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chitti {
	
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement nameTxt = driver.findElement(By.id("email"));
		nameTxt.sendKeys("BaratBaru");
		Actions ac = new Actions(driver);
		ac.doubleClick(nameTxt).contextClick(nameTxt).build().perform();
		Robot rb = new Robot();
		for (int i = 0; i < 2; i++) {
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			}
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		
		
		
	}

}
