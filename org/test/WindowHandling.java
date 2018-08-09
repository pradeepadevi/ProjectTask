package org.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-17\\Desktop\\pradeepa\\Example\\dri\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 6",Keys.ENTER);
		driver.findElement(By.xpath("//h2[contains(text(),'Apple iPhone 6 (Space Grey, 32GB)')]")).click();
		
		Thread.sleep(5000);
		
		String parentWinHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			
			if(!parentWinHandle.equals(x))
			{
				driver.switchTo().window(x);
			}
			
			
		}
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='a-row a-spacing-micro']//span//span//following-sibling::span//span"));
		System.out.println(findElements.get(0).getText());
		
		driver.quit();
		
		
		
		
		
		
	}
}
