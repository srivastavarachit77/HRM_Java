package TestSuites;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login;
import repo.Base;
import utilities.CommonFunctions;

public class LoginTest extends Base {
	
	public WebDriver driver;
	
	@Test
	public void Login() throws IOException, InterruptedException
	{
		driver=InitializeBrowser();
	
		Login l=new Login(driver);
		l.getUserName().sendKeys(CommonFunctions.getValue("username"));
		l.getPassword().sendKeys(CommonFunctions.getValue("password"));
		l.getLogin().click();		
		Actions lAct=new Actions(driver);
		lAct.click(l.getWelcomeOptions()).build().perform();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(l.getLogoutButton()));
		lAct.click(l.getLogoutButton()).build().perform();
		System.out.println("Test1");
		
		
		
	}
	
	
}
