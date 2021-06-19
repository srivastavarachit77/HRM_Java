package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	
	public WebDriver driver;
	
	By adminButton=By.xpath("//b[text()='Admin']");
	By userName=By.xpath("//input[@id='searchSystemUser_userName']");
	By searchButton=By.xpath("//input[@id='searchBtn']");
	By userRole=By.xpath("//select[@id='searchSystemUser_userType']");
	By employeeHints=By.xpath("//input[@id='searchSystemUser_employeeName_empName']");
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getAdminButton()
	{
		return driver.findElement(adminButton);
	}
	public WebElement getUsername()
	{
		return driver.findElement(userName);
	}
	public WebElement getSearchButton()
	{
		return driver.findElement(searchButton);
	}
	public Select getUserRole()
	{
		WebElement getUserRole = driver.findElement(userRole);
		Select userRoleDropDown=new Select(getUserRole);
		return userRoleDropDown;
	}
}
