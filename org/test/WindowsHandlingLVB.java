package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingLVB {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-17\\Desktop\\pradeepa\\Example\\dri\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		
		driver.findElement(By.xpath("//a[contains(@href,'forgetPassword')]")).click();
		
		Thread.sleep(5000);
		
		String parentWinHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			
			if(!parentWinHandle.equals(x))
			{
				driver.switchTo().window(x);
			}
			
			
		}
		
		driver.findElement(By.xpath("//a[text()='Reset Login password']")).click();
		
		driver.findElement(By.name("fldUId")).sendKeys("asdffdsdfa");
		driver.findElement(By.xpath("//a[@onclick='return userSubmit();']")).click();
		
		String text = driver.findElement(By.xpath("//td[@class='ColHeadingLeftAlignedBold']")).getText();
		System.out.println(text);
		
		driver.quit();
		
		
		
		
		
		
	}
}
