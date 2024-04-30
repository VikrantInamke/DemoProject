package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JbkLogin {
	
	@Test
	public void verifyLogin(){
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		driver.get("file:///D:/JAVA/SELENIUM/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
}
