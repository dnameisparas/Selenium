package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Browser Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();;
	    ChromeDriver driver= new ChromeDriver();
	 
	 driver.get("http://www.amazon.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
	 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	 driver.quit();
	}

}
