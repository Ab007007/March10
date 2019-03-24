package com.learning.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo
{

	public static void main(String[] args) throws InterruptedException
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
		
		/*
		 * 1. Create an object to select Class by passing WebElement to Select class
		 * 		constructor...
		 * 2. inside select class obj -> use the required method to select a value 
		 * 		from the dropdown
		 */
		
		WebElement menuElement = driver.findElement(By.id("select-menu"));
		
		Select sel =  new Select(menuElement);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);

		sel.selectByValue("4");
		Thread.sleep(2000);

		sel.selectByVisibleText("0-1");
		Thread.sleep(2000);
		
		
		
	}
}
