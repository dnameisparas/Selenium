package com.crypto;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTutorial {
	public static String driverName = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		
		if(driverName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.quit();
	}

}
