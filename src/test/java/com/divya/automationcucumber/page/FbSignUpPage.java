
package com.divya.automationcucumber.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.divya.automationcucumber.AutomationConstants.*;

import java.util.List;


public class FbSignUpPage {

	@FindBy(xpath = FB_SIGNUP_TITLE)
	private WebElement title;

	@FindBy(xpath = FB_SIGNUP_PAGE_HEADER)
	private WebElement pageHeader;

	@FindBy(name = FB_SIGNUP_FIRST_NAME)
	private WebElement firstName;
	
	@FindBy(name = FB_SIGNUP_LAST_NAME)
	private WebElement surName;

	@FindBy(name = FB_SIGNUP_EMAIL)
	private WebElement email;
	
	@FindBy(name = FB_SIGNUP_EMAIL_RE_ENTER)
	private WebElement emailReEnter;
	
	@FindBy(name = FB_SIGNUP_PASSWORD)
	private WebElement password;

	@FindBy(name = FB_SIGNUP_BIRTH_DAY)
	private WebElement dayDropDown;

	@FindBy(name = FB_SIGNUP_BIRTH_MONTH)
	private WebElement monthDropDown;

	@FindBy(name = FB_SIGNUP_BIRTH_YEAR)
	private WebElement yearDropDown;
	
	@FindBy(name = FB_SIGNUP_SUBMIT)
	private WebElement submitButton;
	
	@FindBy(name = FB_SIGNUP_SEX) 
	private List<WebElement> genderList;


	public FbSignUpPage() {
	}


	/**
	 * @return the title
	 */
	public WebElement getTitle() {
		return title;
	}


	/**
	 * @return the pageHeader
	 */
	public WebElement getPageHeader() {
		return pageHeader;
	}


	/**
	 * @return the firstName
	 */
	public WebElement getFirstName() {
		return firstName;
	}


	/**
	 * @return the surName
	 */
	public WebElement getSurName() {
		return surName;
	}


	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}


	/**
	 * @return the emailReEnter
	 */
	public WebElement getEmailReEnter() {
		return emailReEnter;
	}


	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}


	/**
	 * @return the dayDropDown
	 */
	public WebElement getDayDropDown() {
		return dayDropDown;
	}


	/**
	 * @return the monthDropDown
	 */
	public WebElement getMonthDropDown() {
		return monthDropDown;
	}


	/**
	 * @return the yearDropDown
	 */
	public WebElement getYearDropDown() {
		return yearDropDown;
	}


	/**
	 * @return the submitButton
	 */
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
	/**
	 * @return the genderList
	 */
	public List<WebElement> getGenderList() {
		return genderList;
	}
	
	
}