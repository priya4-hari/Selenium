package com.Testing.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage1 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Haripriya");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Andavar");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6567789865");
		driver.findElement(By.xpath("(//input[@ng-model='radiovalue'])[2]")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("msdd")).click();
		List<WebElement> li = driver.findElements(By.xpath("(//li[@class='ng-scope'])/a"));
		li.get(7).click();
		li.get(12).click();
		WebElement ele1 = driver.findElement(By.id("Skills"));
		Select sel1 = new Select(ele1);
		sel1.selectByVisibleText("APIs");
		WebElement ele2 = driver.findElement(By.xpath("//span[@role='combobox']"));
		ele2.click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement ele6 = driver.findElement(By.xpath("//input[@role='textbox']"));
		ele6.sendKeys("India");
		ele6.sendKeys(Keys.ENTER);
		WebElement ele3 = driver.findElement(By.id("yearbox"));
		Select sel2 = new Select(ele3);
		sel2.selectByValue("1933");
		WebElement ele4 = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select sel3 = new Select(ele4);
		sel3.selectByVisibleText("April");
		WebElement ele5 = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select sel4 = new Select(ele5);
		sel4.selectByVisibleText("19");
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Hari123");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Hari123");
		driver.findElement(By.id("Button1")).click();
		String actual = driver.findElement(By.xpath("//input[@ng-model='FirstName']")).getText();
		String expected = "";
		if(actual.equals(expected))
		{
			System.out.println("Page refreshed!");
		}
		else
		{
			System.out.println("Page not refreshed!");
		}
		driver.close();
	}

}
