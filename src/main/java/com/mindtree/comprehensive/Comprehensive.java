package com.mindtree.comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;

public class Comprehensive {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	driver.get("https://tide.com/en-us");
	//Thread.sleep(20000);
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("powder");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//button[@class='sticker_close']")).click();
	driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
    driver.findElement(By.xpath("//button[@class='active-tab']")).click();
	driver.findElement(By.xpath("(//a[@class='product-preview-tittle'])[1]")).click();

	
	
	}

}
