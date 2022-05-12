package com.org.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\azara\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement bestseller=driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		
		Actions ac=new Actions(driver);
		
		ac.contextClick(bestseller).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		ac.contextClick(mobile).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement cus=driver.findElement(By.linkText("Customer Service"));
		
		ac.contextClick(cus).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		String parentid=driver.getWindowHandle();
		
	     System.out.println(parentid);
		
	     String title=driver.switchTo().window(parentid).getTitle();
	     
	     System.out.println(title);
	     
	     Set<String> allid=driver.getWindowHandles();
	     
	     for(String data:allid)
	     {
	    	 System.out.println(allid);
	    	 
	    	 String alltitle=driver.switchTo().window(data).getTitle();
	    	 
	    	 System.out.println(alltitle);
	     }
	     
	     
		
		
		
		
		
		
	}

}
