package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BobCatWaitClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-17\\Desktop\\pradeepa\\Example\\dri\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Wait implicitly for 10 seconds before finding each of the web element
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.bobcat.com/safety-training/resources/courses");
		
		driver.findElement(By.linkText("Accept and Close")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-sort'])[2]")).click();
		driver.findElement(By.linkText("Utility Vehicles")).sendKeys("Utility Vehicles", Keys.ENTER);

		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[contains(@alt,'Rental Condition')]"))));
		
		driver.findElement(By.xpath("//img[contains(@alt,'Rental Condition')]")).click();
		
		WebElement textElement = driver.findElement(By.xpath("//h3[@class='light-title']"));
		wait.until(ExpectedConditions.visibilityOf(textElement));
		
		System.out.println(textElement.getText());
		
	}

}
