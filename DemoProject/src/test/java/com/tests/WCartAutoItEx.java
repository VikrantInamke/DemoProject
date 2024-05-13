package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WCartAutoItEx {

	@Test
	public void verifyImageUpload() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\AutoIT\\chromedriverAutoIT.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ingecnotechnologies.com/other/Wcart/customer/site/login");
		driver.manage().window().maximize();

		driver.findElement(By.id("loginform-username")).sendKeys("Vikrant");
		driver.findElement(By.id("loginform-password")).sendKeys("Vikrant@#88");
		driver.findElement(By.id("savebutton")).click();

		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[text()='My Account']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();

		driver.findElement(By.xpath("//a[text()='Person']")).click();

		WebElement element1 = driver.findElement(By.xpath("//*[@id='person-profile_image']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", element1);

		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\JAVA\\AutoIT\\FileUploadWCart.exe");

	}
}
