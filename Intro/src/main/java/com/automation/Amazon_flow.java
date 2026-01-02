package com.automation;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Amazon_flow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/devik/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.id("twotabsearchtextbox")));
		driver.findElement(By.id("twotabsearchtextbox"))
        .sendKeys("casio watch women" + Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.cssSelector("img.s-image")
		));

		
		driver.findElements(By.cssSelector("img.s-image")).get(0).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.linkText("Go to Cart")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Proceed')]")).click(); 
		driver.findElement(By.name("email")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.name("email")));
		driver.findElement(By.name("email")).sendKeys("+91xxxxxxxxxx"+Keys.ENTER);
		driver.findElement(By.id("ap_password")).sendKeys("Password"+Keys.ENTER);
		System.out.println(driver.findElement(By.className("a-alert-content")).getText());
	}
	}
