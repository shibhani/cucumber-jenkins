package com.pr;

 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.interactions.Actions;
 
import org.openqa.selenium.support.ui.Select;

 
import cucumber.api.java.en.Given;
 
import cucumber.api.java.en.Then;

 
public class Case1 {
 
WebDriver driver;

 
@Given("user opens signup page in testmeapp")
 
public void user_opens_signup_page_in_testmeapp() {
 
System.setProperty("webdriver.chrome.driver","C:\\\\New_NextGen_Testing_Software\\\\SeleniumDriver\\\\chromedriver.exe");
 
driver= new ChromeDriver();
 
driver.get("http://10.232.237.143:443/TestMeApp/");
 
driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();

}

 
@Then("enter the valid username as {string}")
 
public void enter_the_valid_username_as(String string) {
 
driver.findElement(By.name("userName")).sendKeys("kshflkndsfnksnh");

}

 
@Then("enter the first name as {string} and lastname as {string}")
 
public void enter_the_first_name_as_and_lastname_as(String string, String string2) {
 
driver.findElement(By.name("firstName")).sendKeys("Chan");
 
driver.findElement(By.name("lastName")).sendKeys("Cibi");

}

@Then("enter the password as {string} And  reenter to confirm the password as {string}")
public void enter_the_password_as_And_reenter_to_confirm_the_password_as(String string, String string2) {

driver.findElement(By.name("password")).sendKeys("Cibi123");
 
driver.findElement(By.name("confirmPassword")).sendKeys("Cibi123");

}

 
@Then("select the gender as male")
 
public void select_the_gender_as_male() {
 
Actions act1=new Actions(driver);

act1.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"))).click().build().perform();

}

 
@Then("enter the valid email {string} And  mobile number as {string}")
public void enter_the_valid_email_And_mobile_number_as(String string, String string2) {
 
driver.findElement(By.name("emailAddress")).sendKeys("chancibi007@gmail.com");
 
driver.findElement(By.name("mobileNumber")).sendKeys("8939633617");

}

 
@Then("select the date of birth as {string}")
 
public void select_the_date_of_birth_as(String string) {
 
driver.findElement(By.name("dob")).sendKeys("18/08/1998");
}
@Then("enter the complete address {string}")
 
public void enter_the_complete_address(String string) {
 
driver.findElement(By.name("address")).sendKeys("Perungalathur");

}

 

@Then("select the security question as birthplace And enter the answer as {string}")
public void select_the_security_question_as_birthplace_And_enter_the_answer_as(String string) {
 
Select birthplace = new Select(driver.findElement(By.name("securityQuestion")));
 
birthplace.selectByVisibleText("What is your Birth Place?");
 
driver.findElement(By.name("answer")).sendKeys("Chennai");



}

 
@Then("click on Register button")
 
public void click_on_Register_button() {
 
driver.findElement(By.name("Submit")).click();

}


}
 

