package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSci {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement useTxt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement passTxt = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		WebElement logCli = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','sakthibarat21@gmail.com')", useTxt);
		js.executeScript("arguments[0].setAttribute('value','Baratbaru')", passTxt);
		Object o = js.executeScript("return arguments[0].getAttribute('value')", useTxt);
		System.out.println(o);
		js.executeScript("arguments[0].click()", logCli );
		
		
	}

}
