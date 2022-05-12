package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azara\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		/*WebElement single=driver.findElement(By.name("SingleFrame"));//frame name
		
		driver.switchTo().frame(single);
		
		System.out.println("single frame");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sharmila");//textbox xpath then pass a key
		
		driver.switchTo().defaultContent();
		
		System.out.println("Move out from the frame");*/
		
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		
		driver.switchTo().frame(frame);
		
		System.out.println("1 st frame");
		
		WebElement frame2=driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		
		driver.switchTo().frame(frame2);
		
		
		System.out.println("2nd frame");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sharmila");
		
        driver.switchTo().parentFrame();
		
		System.out.println("parent frame");
		
		
		
		
		
		
		
	}

}
