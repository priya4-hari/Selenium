package com.Testing.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterPage {
	@Test
	public void testcase()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Haripriya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Andavar");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7645567632");
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		WebElement ele = driver.findElement(By.id("Skills"));
		Select sel1 = new Select(ele);
		sel1.selectByVisibleText("C");
		WebElement ele1 = driver.findElement(By.id("yearbox"));
		Select sel2 = new Select(ele1);
		sel2.selectByValue("1941");
		WebElement ele2 = driver.findElement(By.xpath("//*[@ng-model='monthbox']"));
		Select sel3 = new Select(ele2);
		sel3.selectByValue("August");
		WebElement ele3 = driver.findElement(By.id("daybox"));
		Select sel4 = new Select(ele3);
		sel4.selectByVisibleText("15");
		driver.findElement(By.id("firstpassword")).sendKeys("Hari123");
		driver.findElement(By.id("secondpassword")).sendKeys("Hari123");
		driver.findElement(By.id("Button1")).click();
		String actual = driver.findElement(By.xpath("//input[@placeholder='First Name']")).getText();
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
