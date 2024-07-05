package com.SeleniumJavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//"How to handle alerts in a web page using Selenium WebDriver"

public class Alerts {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		Thread.sleep(3000);
		
		
		//Alert box
		
		//System.out.println(driver.findElement(By.id("simple_result")).getText()); //Space
		//Thread.sleep(3000);
		/*driver.findElement(By.id("j_idt88:j_idt91")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("simple_result")).getText());
		Thread.sleep(3000);
		// driver.quit(); */
		
		//confirm box
		
	/*	System.out.println(driver.findElement(By.id("result")).getText());
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);
		
		//dismiss
		
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(3000);
		driver.quit(); */
		
		
		//prompt box
		
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Hi I am Raajii");
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		Thread.sleep(3000);
		
		//dismiss
		
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		

	}

}
