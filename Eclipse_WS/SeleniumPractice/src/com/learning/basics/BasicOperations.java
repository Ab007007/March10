package com.learning.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("launching application ");
		//Launching http://formy-project.herokuapp.com/form App
		driver.get("http://formy-project.herokuapp.com/form");
		
		System.out.println("entering user first name");
		driver.findElement(By.id("first-name")).sendKeys("Formy-FN1");
		
		System.out.println("entering user last name");
		driver.findElement(By.id("last-name")).sendKeys("Formy-LN1");
		
		System.out.println("entering user job title");
		driver.findElement(By.xpath("//input[@placeholder='Enter your job title']")).sendKeys("Trainer");
		
		System.out.println("Selecting Education ");
		driver.findElement(By.id("radio-button-1")).click();
		
		System.out.println("Selecting Sex");
		driver.findElement(By.id("checkbox-1")).click();
		
		
		
	}
}
