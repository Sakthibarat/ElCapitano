package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoHo {
	
public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url = "https://www.flipkart.com/";
	driver.get(url);
	driver.manage().window().maximize();
	WebElement cancel = driver.findElement(By.xpath("button//[text()='X']"));
	cancel.click();
	WebElement hPage = driver.findElement(By.xpath("//img[contains(@alt,'Home')]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(hPage).perform();
	Thread.sleep(5000);
	WebElement secDd = driver.findElement(By.xpath("//a[text()='Living Room']"));
	ac.moveToElement(secDd).perform();
	WebElement thiDd = driver.findElement(By.xpath("//a[text()='Dining Sets']"));
	thiDd.click();
}

}
