package com.SeleniumJavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// "How to get URL, Title, PageSource using Selenium WebDriver"
public class TestApplicationProperties {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		
		
		//URL
	/*	String currentUrl = driver.getCurrentUrl();
		System.out.println("current URL - " + currentUrl);
		
		//Title
		String title = driver.getTitle();
		System.out.println("Title -" + title);
		// driver.quit();  */
		
		
		//Html PageSource
		String pageSource = driver.getPageSource();
		System.out.println("Page SOurce -" + pageSource);
		


	}

}
