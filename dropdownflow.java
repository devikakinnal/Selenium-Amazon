package com.automation.spacejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class Dropdownflow {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/Users/devik/Documents/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			WebElement staticDropdown=driver.findElement(By.class("css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73"));
			org.openqa.selenium.support.ui.Select dropdown =new Select(StaticDropdown);
			dropdown.selectByIndex(3);
		    System.out.println("pull request");
			
	}
}
