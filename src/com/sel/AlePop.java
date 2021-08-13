package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlePop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement userTxt = driver.findElement(By.xpath("//input[@title='Login using User ID and password']"));
		userTxt.sendKeys("BaratBaru");
		WebElement goAh = driver.findElement(By.xpath("(//img[@class='goahead'])[1]"));
		goAh.click();
		WebElement sigIn = driver.findElement(By.xpath("(//input[@class='cta'])[1]"));
		sigIn.click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
