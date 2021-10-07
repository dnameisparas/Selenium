package com.crypto;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("enter-name")).sendKeys("Paras");
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		/*Thread.sleep(2000);
		String alert= driver.switchTo().alert().getText();
		
		System.out.println(alert);*/
	
	}

}
