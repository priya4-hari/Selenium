package com.testing.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing1 {
	
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("j2ee");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("j2eeee");
		driver.findElement(By.name("signon")).click();
		String str = driver.findElement(By.xpath("//ul[@class='messages']/li")).getText();
		System.out.println(str);
		driver.findElement(By.linkText("Register Now!")).click();
		driver.findElement(By.name("username")).sendKeys("Haripriya");
		driver.findElement(By.name("password")).sendKeys("mani");
		driver.findElement(By.name("repeatedPassword")).sendKeys("mani");
		driver.findElement(By.name("account.firstName")).sendKeys("Haripriya");
		driver.findElement(By.name("account.lastName")).sendKeys("Andavar");
		driver.findElement(By.name("account.email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("5676879865");
		driver.findElement(By.name("account.address1")).sendKeys("abc");
		driver.findElement(By.name("account.address2")).sendKeys("def");
		driver.findElement(By.name("account.city")).sendKeys("Erode");
		driver.findElement(By.name("account.state")).sendKeys("Tamil Nadu");
		driver.findElement(By.name("account.zip")).sendKeys("345567");
		driver.findElement(By.name("account.country")).sendKeys("India");
		WebElement ele1 = driver.findElement(By.name("account.languagePreference"));
		Select sel1 = new Select(ele1);
		sel1.selectByVisibleText("japanese");
		WebElement ele2 = driver.findElement(By.name("account.favouriteCategoryId"));
		Select sel2 = new Select(ele2);
		sel2.selectByValue("CATS");
		driver.findElement(By.name("account.listOption")).click();
		driver.findElement(By.name("account.bannerOption")).click();
		driver.findElement(By.name("newAccount")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("mani");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("mani");
		driver.findElement(By.name("signon")).click();
		String txt = driver.findElement(By.id("WelcomeContent")).getText();
		System.out.println(txt);
		
		
		}

}
