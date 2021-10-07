package com.crypto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name=\"courses\"]//tbody//tr"));
		int rowsize = rows.size();
		System.out.println(rowsize);

		List<WebElement> columns = driver.findElements(By.xpath("//table[@name=\"courses\"]//tbody//tr/th"));
		int columnsize = columns.size();
		System.out.println(columnsize);

		for (int i = 1; i <= rowsize; i++) {
			for (int j = 1; j <= columnsize; j++) {

				if (i == 1) {

					System.out.print(
							driver.findElement(By.xpath("//table[@name='courses']//tbody/tr[" + i + "]/th[" + j + "]"))
									.getText() + "   ");
				} else {
					System.out.print(
							driver.findElement(By.xpath("//table[@name='courses']//tbody/tr[" + i + "]/td[" + j + "]"))
									.getText() + "   ");
				}
			}
			System.out.println();
		}
		driver.close();

	}

}
