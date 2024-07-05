package com.SeleniumJavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrames {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Frames1"); //Main Document
		Thread.sleep(4000);
		
		driver.switchTo().frame("frm1"); //Frame1
		
		Select courseName = new Select(driver.findElement(By.id("course")));
		courseName.selectByVisibleText("Python"); //Python
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();//Main Document
		
		driver.switchTo().frame("frm2"); //frame2
		
		driver.findElement(By.id("firstName")).sendKeys("IRaajii");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//Main Document
		driver.switchTo().frame("frm1"); 
		Thread.sleep(3000);
		
		courseName.selectByVisibleText("Dot Net"); // frame1
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//Main Document
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Iframes2");
		Thread.sleep(3000);
		
		
		

	}

}
