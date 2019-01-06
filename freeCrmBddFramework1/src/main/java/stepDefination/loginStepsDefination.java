package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginStepsDefination 
{
	WebDriver driver;
	
	@Given("^The user is on a login page$")
	public void The_user_is_on_a_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "/home/thato/Documents/Selenium_cucumber/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
	}
	@When("^Title is free CRM$")
	public void Title_is_free_CRM()
	{
		String aTitl=driver.getTitle();
		System.out.println(aTitl);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", aTitl);
	}
	@Then("^User enter \"(.*)\" and \"(.*)\"$")
	public void User_enter_username_and_password(String uname, String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
	}
	@Then("^User click login button$")
	public void User_click_login_button()
	{		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@type='submit']")));
	}
	@Then("^User must be on home page$")
	public void User_must_be_on_home_page()
	{
		String hTitl=driver.getTitle();
		System.out.println(hTitl);
		Assert.assertEquals("CRMPRO", hTitl);
	}

}
