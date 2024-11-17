package com.testing.org;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing3 {
	
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("This is my alert!");
		alert3.accept();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Textbox']/p")));
		System.out.println(driver.findElement(By.xpath("//div[@id='Textbox']/p")).getText());
		driver.close();
	}

}
