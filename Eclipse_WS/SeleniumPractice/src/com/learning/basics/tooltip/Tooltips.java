package com.learning.basics.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltips
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("launching application ");
		//Launching http://formy-project.herokuapp.com/form App
		driver.get("https://www.google.com/");
		
		String toolTipMessage = driver.findElement(By.xpath("//a[contains(@href,'products') and @role='button']")).getAttribute("title");
		
		System.out.println(toolTipMessage);
		
		if(toolTipMessage.equals("Google apps"))
		{
			System.out.println("Tool Tip matched successfully...");
		}
		else
		{
			System.out.println("tool tip not found");
		}
		
		
	}

}
