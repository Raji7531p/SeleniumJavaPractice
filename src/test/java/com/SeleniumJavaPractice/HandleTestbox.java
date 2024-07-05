package com.SeleniumJavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTestbox {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(4000);
		WebElement userNameTxt = driver.findElement(By.id("login_field"));
		Thread.sleep(4000);
		if(userNameTxt.isDisplayed()) {
			if(userNameTxt.isEnabled()) {
			userNameTxt.sendKeys("Raaji");
			String enteredText = userNameTxt.getAttribute("value");
			System.out.println(enteredText);
			Thread.sleep(4000);
     		userNameTxt.clear();
			userNameTxt.sendKeys("Eshwarii");
		}
		else 
			System.err.println("Username textbox is not enabled");
		}	
		
		else 
			
			System.err.println("username textbox is not Displayed");
			
		}
		
		

	}


