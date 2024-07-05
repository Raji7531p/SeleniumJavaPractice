package com.SeleniumJavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestImplicitWaitTimeout {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().setSize(new Dimension(1000, 1000));
	
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	driver.findElement(By.id("btn2")).click();
	driver.findElement(By.id("txt2")).sendKeys("Tutorials");
	driver.quit();

	}

}
