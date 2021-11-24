package org.tneb.pages;

import org.openqa.selenium.By;
import org.tneb.base.tnebbase;
import org.tneb.properties.Readproperties;

public class loginpage extends tnebbase {
	
	public String login()
	{
		driver.findElement(By.cssSelector("input#userName")).sendKeys(Readproperties.username);
		driver.findElement(By.cssSelector("#password")).sendKeys(Readproperties.password);
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		String accountName = driver.findElement(By.xpath("//span[contains(text(),'Welcome')]")).getText();
		return accountName;
		
	}

}