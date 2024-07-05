package com.SeleniumJavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=c8KHV8Ospf4&list=PLacgMXFs7kl_7BbV1p_KqDYM65Zm4L_HU&index=8");

	}

}
