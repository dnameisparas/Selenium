package com.crypto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWriteProperties {

	public static void main(String[] args) throws InterruptedException, IOException {

		Properties pr = new Properties();
		FileInputStream in = new FileInputStream(
				"C:\\Users\\ParaS\\Selenium_\\SeleniumTraining\\src\\test\\resources\\testdata.properties");
		pr.load(in);
		System.out.println(pr.getProperty("name"));
		System.out.println(pr.getProperty("url"));

		FileOutputStream out = new FileOutputStream(
				"C:\\Users\\ParaS\\Selenium_\\SeleniumTraining\\src\\test\\resources\\testdata.properties");
		pr.setProperty("output", "completed");
		pr.store(out, "this is completed");

	}

}
