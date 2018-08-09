package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LifeTimeWaitClass {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-17\\Desktop\\pradeepa\\Example\\dri\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.lifetime.life/");
	
	driver.findElement(By.linkText("Locations")).click();
	driver.findElement(By.linkText("All Locations")).click();
	
	driver.findElement(By.id("locationInput")).sendKeys("texas",Keys.ENTER);
	
	WebDriverWait wait = new WebDriverWait(driver, 10);

	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Austin - North']"))));
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(@href,'clubId=149')]"))));
	driver.findElement(By.xpath("//a[contains(@href,'clubId=149')]")).click();
		
}
}