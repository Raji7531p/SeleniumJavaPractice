package com.SeleniumJavaPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

//"How to handle Dropdowns in Selenium WebDriver"
public class Dropdowns {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(1000);
		
		//Single selection
		
		/*WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		
		List<WebElement> courseNameDropdownoptions = courseNameDropdown.getOptions();
		for(WebElement option: courseNameDropdownoptions) {
			System.out.println(option.getText());
			
		}
		Thread.sleep(4000);
		courseNameDropdown.selectByIndex(1); //Java
		Thread.sleep(4000);
		courseNameDropdown.selectByValue("net"); //netBeans
		Thread.sleep(4000);
		courseNameDropdown.selectByVisibleText("Javascript"); //Javascript
		Thread.sleep(4000);
		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected Visible Text--" + selectedText);
		driver.close();  */
		
		
		// Multi Select options
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		
		List<WebElement> ideDropdownoptions = ideDropdown.getOptions();
		for(WebElement option: ideDropdownoptions) {
			System.out.println(option.getText());
			
		}
		Thread.sleep(2000);
		ideDropdown.selectByIndex(0); //Eclipse
		Thread.sleep(4000);
		ideDropdown.selectByValue("ij"); //IntelliJ IDEA
		Thread.sleep(4000);
		ideDropdown.selectByVisibleText("Visual Studio"); //Visual Studio
		Thread.sleep(4000);
		ideDropdown.deselectByVisibleText("Visual Studio");
		
		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for(WebElement selectedOption : selectedOptions) {
		System.out.println("Selected Visible Text--" + selectedOption.getText());
		//driver.close();
		
		
		
		
		

	}

}
}
