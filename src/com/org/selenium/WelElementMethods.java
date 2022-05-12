package com.org.selenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelElementMethods {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\azara\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.name("btnK"));
		
		boolean status=ele.isDisplayed();
		
		System.out.println(status);
		
		boolean status1=ele.isEnabled();
		System.out.println(status1);
		
		boolean status2=ele.isSelected();
		System.out.println(status2);
		
		org.openqa.selenium.Point point=ele.getLocation();
		System.out.println(point.x + point.y);
		
		String text=ele.getText();
		System.out.println(text);
		
		System.out.println(ele.getCssValue("name"));
		
		
		System.out.println(ele.getTagName());
		
		String attribute=ele.getAttribute("name");
		System.out.println(attribute);
		
		
		Dimension dimention=ele.getSize();
		System.out.println(dimention.height + dimention.width);
	}

}
