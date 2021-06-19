package TestSuites;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.AdminPage;
import pageObjects.Login;
import repo.Base;
import utilities.CommonFunctions;

public class AdminPageTest extends Base {
	
	public WebDriver driver;

	@Test(enabled=false)
	public void SearchWithUserName() throws IOException, InterruptedException
	{
		driver=InitializeBrowser();
		Login lgn=new Login(driver);
		lgn.getUserName().sendKeys(CommonFunctions.getValue("username"));
		lgn.getPassword().sendKeys(CommonFunctions.getValue("password"));
		lgn.getLogin().click();
		
		AdminPage adm=new AdminPage(driver);
		adm.getAdminButton().click();
        Thread.sleep(1000);
		adm.getUsername().sendKeys("Aravind");
		adm.getSearchButton().click();
		String ExpectedUserName="Aravind";	
		String ActualUserName=adm.getUsername().getAttribute("value");
		Assert.assertEquals(ActualUserName, ExpectedUserName);	
		driver.close();
	}
	
	@Test
	public void SearchWithAllFilters() throws IOException
	{
		driver=InitializeBrowser();
		Login lgn=new Login(driver);
		lgn.getUserName().sendKeys(CommonFunctions.getValue("username"));
		lgn.getPassword().sendKeys(CommonFunctions.getValue("password"));
		lgn.getLogin().click();
		//Logged In
		AdminPage adm=new AdminPage(driver);
		adm.getAdminButton().click();  	
		//Landed on Admin Page
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeSelected(adm.getUsername()));
		adm.getUsername().sendKeys("Admin"); //Entered on Username
		adm.getUserRole().selectByVisibleText("Admin");;									// Entered User Role
		adm.getSearchButton().click();
		
	}
}
