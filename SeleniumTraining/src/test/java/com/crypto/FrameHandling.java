package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement name= driver.findElement(By.xpath("//legend[contains(text(),'iFrame Example')]"));
		System.out.println(name);
		WebElement frameId = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(frameId);
		System.out.println("Frame swiched");
		Thread.sleep(2000);
		WebElement crsText = driver.findElement(
				By.xpath("//a[@href='https://courses.rahulshettyacademy.com/courses'][normalize-space()='Courses']"));
		System.out.println("course clicked");
/*		driver.findElement(By.xpath("(//a[text()='Practice'])[1]")).click();
		//driver.findElement(By.xpath("//a[@href='#/practice-project']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Your Name*']")).sendKeys("Paras");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Your Email*']")).sendKeys("Parastaneja@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='agreeTerms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='form-submit']")).click();*/
	}

}
