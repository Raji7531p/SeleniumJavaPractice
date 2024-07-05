package com.SeleniumJavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementFindingStrategies {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(4000);
		highlight(driver, driver.findElement(By.id("login_field")));
		Thread.sleep(4000);
		highlight(driver,driver.findElement(By.name("password")));
		Thread.sleep(4000);
		highlight(driver,driver.findElement(By.className("header-logo")));
		Thread.sleep(4000);
		highlight(driver,driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(4000);
		highlight(driver,driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(4000);
		highlight(driver,driver.findElement(By.tagName("h1")));
		Thread.sleep(4000);
		highlight(driver,driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(4000);
		highlight(driver,driver.findElement(By.cssSelector("input[name='commit']")));
	     Thread.sleep(4000);
	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

}
