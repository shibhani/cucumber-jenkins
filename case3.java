package com.pr;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3 {

	WebDriver driver;
	
	@Given("user opens testmeapp")
	public void user_opens_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\\\New_NextGen_Testing_Software\\\\SeleniumDriver\\\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
	}

	@When("user gives username as {string} and password as {string}")
	public void user_gives_username_as_and_password_as(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		 driver.findElement(By.name("password")).sendKeys("Password123");
		
	}

	@When("clicks on Login button")
	public void clicks_on_Login_button() {
	    
		 driver.findElement(By.name("Login")).click();
		
	}

	@Then("displays Home page")
	public void displays_Home_page() {
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}

	@Then("user clicks on find details tab")
	public void user_clicks_on_find_details_tab() {
		WebElement search=driver.findElement(By.id("myInput"));

		search.sendKeys("h");
		 
		search.sendKeys("e");
		 
		search.sendKeys("a");
		 
		search.sendKeys("d");
		 
		Actions act1=new Actions(driver);
		 
		act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Headphone')]"))).click().build().perform();
		 
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		
	}

}















