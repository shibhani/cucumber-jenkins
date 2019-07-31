package com.Demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class File3{
	WebDriver driver;
	
	@Given("Welcome message")
	public void welcome_message() {
	    System.out.println("HIIIIIIIII");
	}
	
	@When("user clicks chrome browser and opens application")
	public void user_clicks_chrome_browser_and_opens_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\New_NextGen_Testing_Software\\SeleniumDriver\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.get("http://newtours.demoaut.com");
	}

	@When("user entering username as {string} And  password in {string}")
	public void user_entering_username_as_And_password_in(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);

		driver.findElement(By.name("password")).sendKeys(string2);

	}

	@When("user logs in by clicking on signin button")
	public void user_logs_in_by_clicking_on_signin_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("login is verified")
	public void login_is_verified() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();

	}
	
	

}