package com.learning.basics.dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo2
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
		
		
		List<WebElement> options = sel.getOptions();
		System.out.println("***** Printing Options of a Dropdown ******" );
//		for (WebElement ele : options)
//		{
//			System.out.println(ele.getAttribute("value") + "---" + ele.getText());
//		}
//	
		
		/*Iterator<WebElement> it = options.iterator();
		
		while(it.hasNext())
		{
			WebElement ele = it.next();
			System.out.println(ele.getAttribute("value") + "---" + ele.getText());
		}
		*/
		
		for(int i= 0; i<options.size();i++)
		{
			WebElement ele = options.get(i);
			System.out.println("Basic For " + ele.getAttribute("value") + "---" + ele.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
