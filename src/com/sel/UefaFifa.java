package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UefaFifa {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://www.greenstechnologys.com/oracle-training.html";
		driver.get(url);
		driver.manage().window().maximize();
		 WebElement para = driver.findElement(By.xpath("//h3[text()='Greens Technology Oracle Trainers:']"));
		 String oracle = para.getText();
		 System.out.println(oracle);
		 
		
	}

}
