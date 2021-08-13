package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanAlert {
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://netbanking.hdfcbank.com/netbanking/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement quitS = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		quitS.click();
		Alert a = driver.switchTo().alert();
		a.accept();
}

}
