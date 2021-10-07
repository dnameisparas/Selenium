package com.crypto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSLErrors {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions co= new ChromeOptions();
		co.merge(dc);

		ChromeDriver driver = new ChromeDriver(co);
		
		driver.get("http://expired.badssl.com");
		driver.manage().window().maximize();
		
		
	
	}

}
