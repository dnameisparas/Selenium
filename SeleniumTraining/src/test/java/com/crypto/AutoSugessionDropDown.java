package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugessionDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Pak");
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys(Keys.ENTER);
	
	}

}
