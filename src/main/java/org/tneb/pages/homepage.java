package org.tneb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.tneb.base.tnebbase;

public class homepage extends tnebbase {
	
	public void logout()
	{
		WebElement logout = driver.findElement(By.xpath("//span[text()='Logout']"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(logout).click().perform();
		System.out.println("more");
	}
}


