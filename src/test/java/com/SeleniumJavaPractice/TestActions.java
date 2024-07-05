package com.SeleniumJavaPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 
 
*How to perform below operations using selenium webdriver?
*MoveToElement or MouseHover,
*Click,
*Double Click,
*Right click or Context click
*/

		

public class TestActions {

	public static void main(String[] args) throws Exception {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Actions actions = new Actions(driver);
	
/*	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	//driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
//	driver.findElement(By.name(" Login")).click();   */
	
	
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[.='Edit']")).click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	
	
	
	}
	

}
