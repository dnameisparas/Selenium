package com.crypto;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Duplication;

public class Waits {

	public void Implicit() throws InterruptedException {

		System.out.println("Performing Implicit wait");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // For whole function and page
		WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Samsung')]")).click();
		System.out.println("Implicit wait complete");

	}

	public void Explicit() throws InterruptedException {

		System.out.println("Performing Explicit wait");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Samsung')]"))).click();

		// driver.findElement(By.xpath("//a[contains(text(),'Samsung')]")).click();

		System.out.println("Explicit wait complete");

	}

	public void Fluent() throws InterruptedException {

		System.out.println("Performing Fluent wait");

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		Wait<WebDriver> waits = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Samsung')]"))).click();
		

		System.out.println("Fluent wait complete");
	}

	public static void main(String[] args) throws InterruptedException {

		Waits ma = new Waits();
		ma.Fluent();
	}

}
