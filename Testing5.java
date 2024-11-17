package com.testing.org;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testing5 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		// handle one new window
//		driver.findElement(By.id("newWindowBtn")).click();
//		String parent = driver.getWindowHandle();
//		System.out.println(parent);
//		Set<String> windows1 = driver.getWindowHandles();
//		for(String s1:windows1)
//		{
//			if(!s1.equals(parent))
//			{
//				driver.switchTo().window(s1);
//				if(driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html"))
//				{
//					System.out.println(driver.getTitle());
//				}
//				driver.close();
//			}
//		}
//		driver.switchTo().window(parent);

		// handle one new tab
//		driver.findElement(By.id("newTabBtn")).click();
//		String parent = driver.getWindowHandle();
//		System.out.println(parent);
//		Set<String> windows2 = driver.getWindowHandles();
//		for(String s2:windows2)
//		{
//			if(!s2.equals(parent))
//			{
//				driver.switchTo().window(s2);
//				if(driver.getTitle().equals("AlertsDemo - H Y R Tutorials"))
//				{
//					driver.findElement(By.id("alertBox")).click();
//					Alert alert = driver.switchTo().alert();
//					alert.accept();
//				}
//				driver.close();
//			}
//		}
//		driver.switchTo().window(parent);

		// open multiple windows
//		driver.findElement(By.id("newWindowsBtn")).click();
//		String parent = driver.getWindowHandle();
//		System.out.println(parent);
//		Set<String> windows3 = driver.getWindowHandles();
//		for (String s3 : windows3) {
//			if (!s3.equals(parent)) {
//				driver.switchTo().window(s3);
//				if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html")) {
//					System.out.println(driver.getTitle());
//				}
//				if (driver.getTitle().equals("XPath Practice - H Y R Tutorials")) {
//					String str = driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();
//					System.out.println(str);
//				}
//				driver.close();
//			}
//		}
//		driver.switchTo().window(parent);

		// handle multiple tabs
//		driver.findElement(By.id("newTabsBtn")).click();
//		String parent = driver.getWindowHandle();
//		System.out.println(parent);
//		Set<String> windows4 = driver.getWindowHandles();
//		for (String s4 : windows4) {
//			if (!s4.equals(parent)) {
//				driver.switchTo().window(s4);
//				if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html")) {
//					System.out.println(driver.getTitle());
//				}
//				if (driver.getTitle().equals("AlertsDemo - H Y R Tutorials")) {
//					driver.findElement(By.id("alertBox")).click();
//					Alert alert = driver.switchTo().alert();
//					alert.accept();
//				}
//				driver.close();
//			}
//		}
//		driver.switchTo().window(parent);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1600)");
		//Handle multiple tabs and windows
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> windows5 = driver.getWindowHandles();
		for(String s5:windows5)
		{
			if(!s5.equals(parent))
			{
				driver.switchTo().window(s5);
				if (driver.getTitle().equals("XPath Practice - H Y R Tutorials")) {
					String str = driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();
					System.out.println(str);
				}
				if(driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/contactus.html"))
				{
					System.out.println(driver.getTitle());
				}
				if (driver.getTitle().equals("Basic Controls - H Y R Tutorials")) {
					System.out.println(driver.getTitle());
				}
				if (driver.getTitle().equals("AlertsDemo - H Y R Tutorials")) {
					System.out.println(driver.getTitle());
					driver.findElement(By.id("alertBox")).click();
					Alert alert = driver.switchTo().alert();
					alert.accept();
				}
				driver.close();	
			}
		}
		driver.switchTo().window(parent);
		driver.close();
	}

}
