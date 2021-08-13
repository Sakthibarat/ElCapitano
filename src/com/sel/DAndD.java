package com.sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DAndD {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
		WebElement s1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(s1, target2).perform();
		WebElement s2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(s2, target3).perform();
		WebElement s3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(s3, target4).perform();
		WebElement s4 = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		s4.click();
		
		
	}

}
