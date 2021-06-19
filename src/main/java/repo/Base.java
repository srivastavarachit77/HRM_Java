package repo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilities.CommonFunctions;


public class Base {
	public static WebDriver driver;
	
	public WebDriver InitializeBrowser() throws IOException
	{
		String browser = CommonFunctions.getValue("browser");
		String url = CommonFunctions.getValue("url");
	if (browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Rachit\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Chrome Browser Launched");
	}
	
	else if (browser.equalsIgnoreCase("edge"))
	{

		System.setProperty("webdriver.chrome.driver", "D:\\\\Rachit\\\\Selenium\\\\Drivers\\\\msedgedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Edge Browser Launched");

		
	}
	else if (browser.equalsIgnoreCase("firefox"))
	{

		System.setProperty("webdriver.chrome.driver", "D:\\\\Rachit\\\\Selenium\\\\Drivers\\\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Edge Browser Launched");

		
	}
	
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	return driver;
	
	
	}
	
	
}
