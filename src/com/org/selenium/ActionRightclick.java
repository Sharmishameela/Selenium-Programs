package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightclick {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\azara\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement mail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions ac=new Actions(driver);
		
		ac.contextClick(mail).perform();
		
		
		
		
	}

}
