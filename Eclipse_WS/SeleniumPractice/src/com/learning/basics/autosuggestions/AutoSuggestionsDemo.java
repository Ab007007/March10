package com.learning.basics.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("launching application ");
		//Launching http://formy-project.herokuapp.com/form App
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@role='presentation']"));
		
		System.out.println("total suggestions displayed - " + suggestions.size());
		
		for(int i= 0; i<suggestions.size();i++)
		{
			WebElement ele = suggestions.get(i);
			System.out.println(ele.getText());
			
		}
		
	}
}
