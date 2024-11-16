package com.Testing.org;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowPage {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> windows1 = driver.getWindowHandles();
		for(String id1:windows1)
		{
			if(!id1.equals(parent))
			{
				driver.switchTo().window(id1);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windows2 = driver.getWindowHandles();
		for(String id2:windows2)
		{
			if(!id2.equals(parent))
			{
				driver.switchTo().window(id2);
				if(driver.getTitle().equals("AlertsDemo - H Y R Tutorials"))
				{
					driver.findElement(By.id("alertBox")).click();
					Alert alert = driver.switchTo().alert();
					alert.accept();
				}
			}
		}
		driver.switchTo().window(parent);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> windows3 = driver.getWindowHandles();
		for(String id3:windows3)
		{
			if(!id3.equals(parent))
			{
				driver.switchTo().window(id3);
				if(driver.getTitle().equals("XPath Practice - H Y R Tutorials"))
				{
					String actual = driver.findElement(By.xpath("//div[@class='post-head']")).getText();
					System.out.println(actual);
					//driver.close();
				}
				if(driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html"))
				{
					String actual =driver.findElement(By.xpath("//div[@class='post-head']")).getText();
					System.out.println(actual);
					//driver.close();
				}
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,1800)");
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String> windows4 = driver.getWindowHandles();
		for(String id4:windows4)
		{
			if(!id4.equals(parent))
			{
				driver.switchTo().window(id4);
				if(driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText().equals("Basic Controls"))
				{
					driver.findElement(By.id("firstName")).sendKeys("Haripriya");
					driver.findElement(By.id("lastName")).sendKeys("Andavar");
//					JavascriptExecutor js1 = (JavascriptExecutor)driver;
//					js1.executeScript("window.scrollBy(0,100)");
//					driver.findElement(By.id("frenchchbx")).click();
				}
				if(driver.getTitle().equals("AlertsDemo - H Y R Tutorials"))
				{
					driver.findElement(By.id("alertBox")).click();
					Alert alert1 = driver.switchTo().alert();
					alert1.accept();
				}
			}
		}
		driver.switchTo().window(parent);
//		JavascriptExecutor js5 = (JavascriptExecutor) driver;
//		js5.executeScript("window.scrollBy(0,1800)");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String> windows5 = driver.getWindowHandles();
		for (String id5 : windows5) {
			if (!id5.equals(parent)) {
				driver.switchTo().window(id5);
				if (driver.getTitle().equals("AlertsDemo - H Y R Tutorials")) {
					String actual = driver.findElement(By.xpath("//div[@class='post-head']")).getText();
					System.out.println(actual);
					driver.findElement(By.id("alertBox")).click();
					Alert alert1 = driver.switchTo().alert();
					alert1.accept();

				}
				if (driver.getTitle().equals("XPath Practice - H Y R Tutorials")) {
					String actual = driver.findElement(By.xpath("//div[@class='post-head']")).getText();
					System.out.println(actual);
					// driver.close();
				}
				if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html")) {
					String actual = driver.findElement(By.xpath("//div[@class='post-head']")).getText();
					System.out.println(actual);
					// driver.close();
				}
				if (driver.getTitle().equals("Contact Me - H Y R Tutorials")) {
					String actual = driver.findElement(By.xpath("//div[@class='post-head']")).getText();
					System.out.println(actual);
				}
			}
		}
		driver.switchTo().window(parent);
	}

}
