package com.SeleniumJavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJavaScriptExecutor {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?locale2=en_GB&_rdr");
		
//		driver.get("https://www.hyrtutorials.com/");
		
		//findelements
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	// WebElement element = (WebElement)jsExecutor.executeScript("return document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;");
	//  element.sendKeys("XPath");	
		
		//How to enter text
		
	/*	jsExecutor.executeScript("document.getElementById('email').value='id';");
		Thread.sleep(2000);
		jsExecutor.executeScript("document.getElementsByName('email')[0].value='Name';");
		Thread.sleep(2000);
		jsExecutor.executeScript("document.getElementsByClassName('inputtext')[0].value='ClassName';");
		Thread.sleep(2000);
		jsExecutor.executeScript("document.getElementsByTagName('input')[2].value='TagName';");
		Thread.sleep(2000);
		jsExecutor.executeScript("document.querySelector('#email').value='CSS';");
		Thread.sleep(2000);
		jsExecutor.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='XPath';");
		Thread.sleep(2000);   */
		
		//click operation
//		jsExecutor.executeScript("document.getElementsByName('login')[0].click();");
		
		//How to highlight webelements --border,background, border+background
		
//		jsExecutor.executeScript("document.getElementById('email').style.border='5px black solid';");
//    	Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementById('email').style.background='red';");


//		jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow');");
		
		//Scroll Operations -- scroll/scrollTo, ScrollBy, ScrollintoView
		
	//	jsExecutor.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
    //	jsExecutor.executeScript("window.scrollBy(0,500)");
   // 	jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView();");  // for using screenshot capture
    	
    	WebElement username = driver.findElement(By.id("email"));
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');", username);
		
		
		
		
		
		
	}

}
