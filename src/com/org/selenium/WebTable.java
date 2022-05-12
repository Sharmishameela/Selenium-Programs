package com.org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\azara\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		 System.out.println("$$$$$$$$$ All Data $$$$$$$$");
		
		for(WebElement data:alldata)
		{
			System.out.println(data.getText());
		}
	   
	
	  List<WebElement> partirow= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
	  
	  System.out.println("$$$$$$$$ Particular row $$$$$$$$$$");
	
	  for(WebElement data1:partirow)
	  {
		System.out.println(data1.getText());
	  }
	  
	 
		
		WebElement data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[3]"));
		
		 System.out.println("$$$$$$$$$ Particular Column $$$$$$$");
		 
		System.out.println(data.getText());

}
}
