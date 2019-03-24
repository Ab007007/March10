package com.learning.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium
{
	/**
	 * Program to perform 
	 * 1 . launch
	 * 2 . login 
	 * @param args
	 * @author ahb
	 */
	public static void main(String[] args)
	{
		//setting driver executable location
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		//session obj
		//Creating object to Chrome browser
		WebDriver driver =  new ChromeDriver();
		
		//launching the application 
		driver.get("http://localhost:8080/login.do");
		
		//entering username
		driver.findElement(By.id("username")).sendKeys("admin");

		//entering password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//clicking on login button
		driver.findElement(By.id("loginButton")).click();
		//driver.close();

	}
}
