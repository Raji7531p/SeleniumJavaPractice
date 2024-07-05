package com.SeleniumJavaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		//File 
		
	/*	File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/img1.jpg");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot Saved Successfully");
		driver.close(); */
		
		
		//Byte array
		/* byte[]  byteArr = driver.getScreenshotAs(OutputType.BYTES);
		File destFile = new File("./Screenshots/img2.jpg");
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(byteArr);
		System.out.println("Screenshot Saved Successfully");
		driver.close(); */
		
		//Base64
		
		String  base64code = driver.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(base64code);
		Thread.sleep(4000);
		File destFile = new File("./Screenshots/img3.jpg");    ///class file
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(byteArr);
		System.out.println("Screenshot Saved Successfully");
		driver.close();
		
		
		

	}

}
