package com.Demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucuPr {

	WebDriver driver;
	@Given("display welcome page")
	public void display_welcome_page() {
	    System.out.println("Welcome");
	}

	@When("user opens tour application in browser")
	public void user_opens_tour_application_in_browser() {
      System.setProperty("webdriver.chrome.driver", "C:\\New_NextGen_Testing_Software\\SeleniumDriver\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://newtours.demoaut.com");
	}

	@When("user entering username as {string} And password as {string} in field")
	public void user_entering_username_as_And_password_as_in_field(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@When("registered user clicks login")
	public void registered_user_clicks_login() {
		driver.findElement(By.name("login")).click();
	}

	@Then("verify login page")
	public void verify_login_page() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();
	}

	@When("user opens tour app in browser")
	public void user_opens_tour_app_in_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\New_NextGen_Testing_Software\\SeleniumDriver\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("http://newtours.demoaut.com");
	}

	@When("user entering invalid username as {string} And password as {string} in field")
	public void user_entering_invalid_username_as_And_password_as_in_field(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}

	@When("clicks login")
	public void clicks_login() {
		driver.findElement(By.name("login")).click();

	}

	@Then("verify login application")
	public void verify_login_application() {
		Assert.assertTrue(driver.getTitle().contains("Flight"));
		driver.close();
	}

}





