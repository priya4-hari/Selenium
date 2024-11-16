package com.Testing.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPage {
	
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		System.out.println(driver.findElement(By.id("demo")).getText());
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("This is my alert!");
		alert3.accept();
		System.out.println(driver.findElement(By.id("demo1")).getText());
		driver.close();
	}

}
