package com.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/prabhashsaxena/Downloads/FireFoxDriver");
		WebDriver driver = new FirefoxDriver();
		String baseUrl ="http://CNN.com";
		driver.get(baseUrl);
		driver.manage ().window().maximize();
		driver.findElement(By.name("userID")).sendKeys("Test");
		
		
		try
		{
		Thread.sleep(4000);
		} catch(InterruptedException e) 
		{
			System.out.println("got error while processin");
		}
		
		// thread is nothing but the process

	driver.close();
	}
}