package com.testing.org;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testing2 {
	@Test
	public void testing()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Haripriya");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Andavar");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("4567787665");
		driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("msdd")).click();
		List<WebElement> lang = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		lang.get(7).click();
		lang.get(11).click();
		WebElement skill = driver.findElement(By.id("Skills"));
		Select sel1 = new Select(skill);
		sel1.selectByVisibleText("C++");
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		WebElement ele = driver.findElement(By.xpath("//input[@role='textbox']"));
		ele.sendKeys("India");
		ele.sendKeys(Keys.ENTER);
		WebElement yr = driver.findElement(By.id("yearbox"));
		Select sel2 = new Select(yr);
		sel2.selectByValue("1933");
		WebElement mn = driver.findElement(By.cssSelector("select[ng-model='monthbox']"));
		Select sel3 = new Select(mn);
		sel3.selectByVisibleText("May");
		WebElement dy = driver.findElement(By.id("daybox"));
		Select sel4 = new Select(dy);
		sel4.selectByVisibleText("15");
		driver.findElement(By.id("firstpassword")).sendKeys("Hari123");
		driver.findElement(By.id("secondpassword")).sendKeys("Hari123");
		driver.findElement(By.id("Button1")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='First Name']")));
		String actual = driver.findElement(By.cssSelector("input[placeholder='First Name']")).getText();
		if(actual.equals(""))
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
