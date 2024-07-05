package com.SeleniumJavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//"How to handle links, Buttons, Radio Buttons, Checkboxes in Selenium WebDriver"

public class HandleBasicHtmlControls {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html#google_vignette");
		Thread.sleep(4000);
		driver.findElement(By.id("femalerb")) .click();
		Thread.sleep(4000);
		driver.findElement(By.id("englishchbx")) .click();
		Thread.sleep(4000);
		WebElement chineseChk = driver.findElement(By.id("chinesechbx"));
		chineseChk.click(); //check
		Thread.sleep(4000);
		if(chineseChk.isSelected())
		chineseChk.click(); //uncheck
		Thread.sleep(4000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
		
		
		
		
		

	}

}
