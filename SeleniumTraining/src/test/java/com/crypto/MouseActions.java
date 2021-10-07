package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	
	public void RightClick() throws InterruptedException{

		System.out.println("Performing Right Click");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);

		WebElement right= driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.contextClick(right).perform();
		Thread.sleep(4000);

		System.out.println("Right Click complete");

	}
	
	public void DoubleClick() throws InterruptedException{

		System.out.println("Performing Double Click");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.cssSelector("div.demo>:first-child"));
		driver.switchTo().frame(frame);

		System.out.println("Frame switched");
		
		WebElement doublecl= driver.findElement(By.xpath("//span[contains(text(),'Double click the block')]//parent::body/div"));
		Actions action = new Actions(driver);
		action.doubleClick(doublecl).perform();
		
		Thread.sleep(4000);

		System.out.println("double Click complete");

	}

	public static void main(String[] args) throws InterruptedException {

		MouseActions ma= new MouseActions();
		 ma.RightClick();
	}

}
