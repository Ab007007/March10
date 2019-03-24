package com.learning.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulitSelectDropDownDemo
{
 
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("launching application ");
		driver.get("file:///D:/Intellipaat/html/dropDown.html");
		
		WebElement msDropDown = driver.findElement(By.tagName("select"));
		
		Select sel = new Select(msDropDown);
		
		Thread.sleep(2000);
		sel.selectByIndex(0);
		
		Thread.sleep(2000);
		sel.selectByValue("saab");
		
		Thread.sleep(2000);
		sel.selectByVisibleText("Mercedes");
		
		Thread.sleep(2000);
		sel.selectByIndex(3);
		
		sel.deselectByIndex(3);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		sel.deselectByValue("saab");
		
		Thread.sleep(2000);
		sel.deselectByVisibleText("Mercedes");
		
		
	}
}
