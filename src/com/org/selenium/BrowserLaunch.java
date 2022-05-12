package com.org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\azara\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();	
	    
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.manage().window().fullscreen();
	    Thread.sleep(2500);
	    driver.manage().window().minimize();
	    driver.navigate().to("https://www.amazon.in");
	    driver.manage().window().maximize();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(1000);
	    driver.navigate().refresh();
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    String title=driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    driver.quit();
	   
	}

}
