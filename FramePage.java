package com.Testing.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramePage {
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("((//div[@class='col-xs-6 col-xs-offset-5'])[1])/input")).sendKeys("WELCOME!");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement ele = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(ele);
		WebElement ele1 = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(ele1);
		driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("WELCOME!");
		driver.switchTo().defaultContent();
		driver.close();
	
	}

}
