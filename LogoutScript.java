package com.assessment.autometionScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LogoutScript {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		WebElement ele = driver.findElement(By.xpath("//span[@class=\"header-icon-link user-profile-icon\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.partialLinkText("Log In")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class=\"popup-text text-center vert large-6 columns\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"email required input_authentication\"]")).sendKeys("akashbhalerao051@gmail.com");
		driver.findElement(By.xpath("//input[@class=\"required input_authentication\"]")).sendKeys("Akash@12");
		driver.findElement(By.xpath("//input[@class=\"button primary\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class=\"header__topBarIconList_profile-icon\"]")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

}
}
