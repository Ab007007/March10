package com.learning.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedDropDownDemo
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("launching application ");
		//Launching http://formy-project.herokuapp.com/form App
		driver.get("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("navbarDropdownMenuLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkbox")).click();
	}
}
