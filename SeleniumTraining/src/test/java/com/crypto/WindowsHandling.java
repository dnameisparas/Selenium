package com.crypto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement win= driver.findElement(By.id("openwindow"));
		win.click();
		
		Set<String> handles= driver.getWindowHandles();
		System.out.println(handles);
		
		Iterator <String> windowHandles= handles.iterator();
		String Parent= windowHandles.next();
		String Child= windowHandles.next();
		
		
		driver.switchTo().window(Child);
		System.out.println("Window is Switched to Child");
		driver.manage().window().maximize();
		
		System.out.println("Window is maximized");
		driver.switchTo().defaultContent();
		System.out.println("Window is Switched to parent");
	}

}
