package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\azara\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		
		driver.manage().window().maximize();
		
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(course).perform();
		
		WebElement dotnet= driver.findElement(By.xpath("//a[text()='.NET Training ']"));
		
		ac.moveToElement(dotnet).perform();
		
		driver.findElement(By.xpath("//a[text()='WCF Training']")).click();
		
	  
		
		
		
		
		
	}


}
