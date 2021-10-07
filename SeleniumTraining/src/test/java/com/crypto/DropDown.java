package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement drop= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select= new Select(drop);
		
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("option1");
		
		
		
	
	}

}
