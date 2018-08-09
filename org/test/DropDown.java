package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-17\\Desktop\\pradeepa\\Example\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.google.co.in/");
		
		for(int i=0;i<=20;i++){
			for(int j=i%2;j<=i-5;j++){
				System.out.println(j);
			}
		}
}
	}