 package org.tneb.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.tneb.properties.Readproperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tnebbase extends Readproperties {
	protected static WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void base(String Browser)
	{
		
		switch(Browser)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "ie":
		    WebDriverManager.iedriver().setup();
		    driver = new InternetExplorerDriver();
		    break;
		
		default:
			driver = null;
			break;
	}
		
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(Readproperties.url);
	}

}
