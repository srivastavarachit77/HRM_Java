package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}	
	
	By username=By.xpath("//input[@id='txtUsername']");
	By password=By.xpath("//input[@id='txtPassword']");
	By login=By.xpath("//input[@id='btnLogin']");
	By welcomeOptions=By.xpath("//a[@id='welcome']");
	By logoutButton=By.xpath("//a[@href='/index.php/auth/logout']");
	
	public WebElement getUserName()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	public WebElement getWelcomeOptions()
	{
		return driver.findElement(welcomeOptions);
	}
	
	public WebElement getLogoutButton()
	{
		return driver.findElement(logoutButton);
	}
}
