package com.divya.automationcucumber.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.divya.automationcucumber.page.FbSignUpPage;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import static org.testng.Assert.assertEquals;
import static com.divya.automationcucumber.AutomationConstants.*;

public class StepDefinition {

	private final static Logger LOGGER = Logger.getLogger(StepDefinition.class);
	
	
	private WebDriver driver;
	private FbSignUpPage loginPage;
	private Person person;

	@Given("^I am in Facebook login page$")
	public void i_am_in_Facebook_login_page() {

		LOGGER.info("Testing sign up step started");
		System.setProperty(CHROME_WEB_DRIVER,CHROME_WEB_DRIVER_PATH);

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(FB_SIGNUP_URL);
		driver.manage().window().fullscreen();

		Fairy fairy = Fairy.create();
		person = fairy.person();		
		loginPage = new FbSignUpPage();
		PageFactory.initElements(driver, loginPage);
		assertEquals(driver.getCurrentUrl(), FB_SIGNUP_URL);
	}

	@When("^I enter user details$")
	public void i_enter_user_details() throws Throwable {

		LOGGER.info("Entering user details");
		loginPage.getFirstName().sendKeys(person.firstName());
		loginPage.getSurName().sendKeys(person.lastName());
		loginPage.getEmail().sendKeys(person.email());
		loginPage.getEmailReEnter().sendKeys(person.email());
		loginPage.getPassword().sendKeys(person.password());

	}

	@When("^select the date of birth$")
	public void select_the_date_of_birth() throws Throwable {
		LOGGER.info("Entering Date of birth");
		DateTime dob = person.dateOfBirth();
		loginPage.getDayDropDown().sendKeys(DateTimeFormat.forPattern("dd").print(dob));
		loginPage.getMonthDropDown().sendKeys(DateTimeFormat.forPattern("MMM").print(dob));
		loginPage.getYearDropDown().sendKeys(DateTimeFormat.forPattern("yyyy").print(dob));

	}

	@When("^select gender$")
	public void select_gender() throws Throwable {
		LOGGER.info("Entering user gender");
		if (person.sex().equals("Female")) {
			loginPage.getGenderList().get(FB_SIGNUP_FEMALE).click();

		} else {
			loginPage.getGenderList().get(FB_SIGNUP_MALE).click();
		}
	}

	

	@When("^I click on Sign up$")
	public void i_click_on_Sign_up() throws Throwable {
		loginPage.getSubmitButton().click();
		LOGGER.info(" user details submitted");
	}

	@Then("^user is registered$")
	public void user_is_registered() throws Throwable {
		String URL = "https://www.facebook.com/r.php";
		assertEquals(driver.getCurrentUrl(), URL);
		driver.close();
		LOGGER.info("Sign up successful");
	}

}
