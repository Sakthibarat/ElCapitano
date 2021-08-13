package com.sel;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DaySix {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://www.greenstechnologys.com/selenium-training-in-chennai.html";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cogCl = driver.findElement(By.xpath("(//a[text()=' CTS INTERVIEW QUESTIONS'])[2]"));
		cogCl.click();
		Thread.sleep(3000);
		WebElement intCl = driver.findElement(By.className("modal-body"));
		Actions ac = new Actions(driver);
		ac.doubleClick(intCl).contextClick(intCl).build().perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_P);
		

		
	}


}
