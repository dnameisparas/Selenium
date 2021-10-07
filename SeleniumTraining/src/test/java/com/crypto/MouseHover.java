package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		WebElement hover = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		action.moveToElement(hover).perform();

		boolean result = driver.findElement(By.linkText("Top")).isDisplayed();

		if (result == true) {
			System.out.println("Hover is working");
		} else {

			System.out.println("Not working");
		}

	}

}
