package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumRadioAndCheck {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	
		// RADIO BUTTON

		WebElement radio2= driver.findElement(By.xpath("//*[@value='radio2']"));
		radio2.click();
		System.out.println(radio2.isSelected());
		System.out.println(driver.findElements(By.xpath("//*[@name='radioButton']")).size());

		// CHECKBOXES

		WebElement Check3 = driver.findElement(By.xpath("//*[@id='checkBoxOption3']"));
		Check3.click();
		WebElement Check2 = driver.findElement(By.xpath("//*[@id='checkBoxOption2']"));
		Check2.click();
		WebElement Check1 = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));

		System.out.println(Check3.isSelected());
		System.out.println(Check2.isSelected());
		System.out.println(Check1.isSelected());

	}

}
