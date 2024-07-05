package com.SeleniumJavaPractice;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExplicitWait {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().setSize(new Dimension(1000, 1000));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20, 5000));
		
		//FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	//	wait.withTimeout((Duration.ofSeconds(10)));

		
				
		driver.get("https://latenode.com/?utm_source=google&utm_medium=cpc&utm_campaign=dg_Google_Search_NB_High-intent_IN_engaged_11-06-2024&utm_content=workflow_automation&utm_device=c&utm_placement=&utm_term=automation%20testing%20workflow&utm_creative=702056002260&roistat=google1_g_164278385478_702056002260_automation%20testing%20workflow&roistat_referrer=&roistat_pos=&gad_source=1&gclid=Cj0KCQjwsuSzBhCLARIsAIcdLm411xj35bP74_q1b5KjI8vgG-NGAduDu2-Y3zrY6GqupNyVxR1TYPoaAtq5EALw_wcB");
		String parentWindow = driver. getWindowHandle();
		driver.findElement(By.linkText("Log in")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle :windowHandles) {
		if(!windowHandle.equals(parentWindow)) {
			driver.switchTo().window(windowHandle);
			/* Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
				
				@Override
				public Boolean apply(WebDriver webDriver) {
					
					return webDriver.findElement(By.name("email")).isDisplayed();
				}
			}; */
			
		//	wait.until(f);
			
			wait.until(d->d.findElement(By.name("email")).isDisplayed());
			
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			driver.findElement(By.name("email")).sendKeys("hjujhh@gmail.com");
			//driver.quit();
		}
		
		

	}

}
}