package org.tneb.pages;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.tneb.base.tnebbase;
import org.tneb.properties.Readproperties;

public class loginpage extends tnebbase {
	
	public void login()
	{
		driver.findElement(By.cssSelector("input#userName")).sendKeys(Readproperties.username);
		driver.findElement(By.cssSelector("#password")).sendKeys(Readproperties.password);
		driver.findElement(By.cssSelector("input[name='submit']")).click();
	}
		/*WebElement we = driver.findElement(By.xpath("//span[contains(text(),'Welcome')]"));
		File src = ((TakesScreenshot)we).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("G:\\screen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String accountName = we.getText();
		return accountName;
		
	}

	public int loginlinks()
	{
		String urllink=driver.findElement(By.xpath("//a[@name='login']")).getAttribute("href");
		
		try {
			URL aa = new URL(urllink);
			try {
				URLConnection bb=aa.openConnection();
			 HttpURLConnection cc=((HttpURLConnection)bb);
			 cc.setRequestMethod("HEAD");
			 cc.connect();
			return cc.getResponseCode();
			
			 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}*/
	
	public void my()
	{
		List<WebElement> gg = driver.findElements(By.xpath("//e"));
		System.out.println(gg.size());
		
		

		
		
		
	}
}