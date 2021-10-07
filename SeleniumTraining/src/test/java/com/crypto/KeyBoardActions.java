package com.crypto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);

		WebElement select1 = driver.findElement(By.cssSelector("ol.ui-selectable>:nth-child(4)"));
		WebElement select2 = driver.findElement(By.cssSelector("ol.ui-selectable>:first-child"));
		WebElement select3 = driver.findElement(By.cssSelector("ol.ui-selectable>:last-child"));

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(select1).click(select2).click(select3).build().perform();
		Thread.sleep(3000);
		driver.close();

		System.out.println("Selection complete");

	}

}
